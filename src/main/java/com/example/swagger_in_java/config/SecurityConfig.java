package com.example.swagger_in_java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
//currently not working as setup incomplete
public class SecurityConfig {

    //if you have authentication/authorization setup
    //add these urls to exceptions

    private static final String[] SWAGGER_WHITELIST = {
            "/swagger-ui/**",
            "/v3/api-docs/**",
            "/swagger-resources/**",
            "/swagger-resources"
    };

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)                          //replacement of csrf()
                .authorizeHttpRequests(auth ->                                  //replacement of authorizeRequests()
                    auth.requestMatchers(SWAGGER_WHITELIST).permitAll()         //replacement of antMatchers()
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());                          //replacement of httpBasic()

        return http.build();
    }

}

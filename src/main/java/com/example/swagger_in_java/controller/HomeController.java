package com.example.swagger_in_java.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getHome(){
        return new ResponseEntity<>("get home", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> postHome(){
        return new ResponseEntity<>("post home", HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<String> patchHome(){
        return new ResponseEntity<>("patch home", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteHome(){
        return new ResponseEntity<>("delete home", HttpStatus.OK);
    }

}

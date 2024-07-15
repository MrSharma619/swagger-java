package com.example.swagger_in_java.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/navy")
public class NavyController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getNavy(){
        return new ResponseEntity<>("get Navy", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> postNavy(){
        return new ResponseEntity<>("post Navy", HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<String> patchNavy(){
        return new ResponseEntity<>("patch Navy", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteNavy(){
        return new ResponseEntity<>("delete Navy", HttpStatus.OK);
    }

}

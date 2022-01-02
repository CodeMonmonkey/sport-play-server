package com.example.sport.sportplay.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http:localhost: 8080")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "Test my TestController";
    }
}

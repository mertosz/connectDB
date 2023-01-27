package com.example.connectDB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @GetMapping("/test")
    public String Test()
    {
        return "Hello World";
    }
}

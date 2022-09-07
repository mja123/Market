package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestConnection {
    @GetMapping("/message")
    public String printMessage() {
        return "Testing the connection in different ports";
    }
}

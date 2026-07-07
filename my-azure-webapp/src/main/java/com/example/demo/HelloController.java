package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "<h1>Hello from my Java Web App!</h1><p>Successfully running on Azure.</p>";
    }

    @GetMapping("/health")
    public String health() {
        return "App is running fine!";
    }
}

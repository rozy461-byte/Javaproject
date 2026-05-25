package com.example.javaproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/health")
    public String index() {
        return "Healthcheck:OK";
    }
}

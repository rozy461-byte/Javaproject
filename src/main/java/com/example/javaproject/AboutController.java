package com.example.javaproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {
    @GetMapping("/about")
    public String index() {
        return "This is about controller";
    }
}

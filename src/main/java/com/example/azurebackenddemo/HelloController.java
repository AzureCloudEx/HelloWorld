package com.example.azurebackenddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/")
    public Map<String, String> hello() {
        return Map.of("message", "Hello from Azure Backend with Spring Boot!");
    }
}
package com.example.cicdtestback.controller;

import java.time.LocalDateTime;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @GetMapping("/")
    public String now() {
        final LocalDateTime now = LocalDateTime.now();

        return now.toString();
    }
}

package com.example.spring_rest_api_messaging_app.controller;

import com.example.spring_rest_api_messaging_app.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // UC1
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
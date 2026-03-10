package com.example.spring_rest_api_messaging_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    // UC1
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // UC2
    @GetMapping("/hello/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC3
    @GetMapping("/hello/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
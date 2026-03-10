package com.example.spring_rest_api_messaging_app.controller;

import com.example.spring_rest_api_messaging_app.dto.UserDTO;
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

    // UC4
    @PostMapping("/hello/post")
    public String sayHelloPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    // UC5
    @PutMapping("/hello/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName,
                              @RequestParam String lastName) {

        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
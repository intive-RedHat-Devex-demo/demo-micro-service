package com.intive_redhat_demo.demo_microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(
            @RequestParam(required = false, defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
}

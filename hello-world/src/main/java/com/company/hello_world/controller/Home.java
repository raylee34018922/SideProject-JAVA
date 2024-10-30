package com.company.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String helloOne() {
        return "Hello, World!";
    }

    @GetMapping("/hello")
    public String helloTwo() {
        return "Hello, World!";
    }

    @GetMapping(path = { "/helloA", "/helloB" })
    public String helloThree() {
        return "Hello, World!";
    }

}

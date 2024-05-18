package com.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {
    @GetMapping("/hello")
    String sayHello(){
        return "hello Spring boot 3,again";
    }
}

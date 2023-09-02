package com.ilka.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello world";
    }

    @GetMapping("/")
    public String redirectToHello(){
        return "redirect: /hello";
    }

    @GetMapping("/secret")
    public String showSecret(){
        return "You've found a secret! I love you";
    }
}

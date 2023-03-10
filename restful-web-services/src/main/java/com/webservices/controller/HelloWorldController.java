package com.webservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/sagar")
    public String helloworld(){
        return "Redmi Note 7 Pro";
    }
}

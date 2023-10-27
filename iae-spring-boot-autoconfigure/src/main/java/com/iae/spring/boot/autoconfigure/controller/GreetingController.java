package com.iae.spring.boot.autoconfigure.controller;

import com.iae.spring.boot.autoconfigure.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @GetMapping("/iae/greeting/{name}")
    public String greeting(@PathVariable String name) {
        return greetingService.greeting(name);
    }
}

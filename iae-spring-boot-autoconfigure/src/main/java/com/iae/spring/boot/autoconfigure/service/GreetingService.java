package com.iae.spring.boot.autoconfigure.service;

import com.iae.spring.boot.autoconfigure.properties.GreetingProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Autowired
    GreetingProperties greetingProperties;

    public String greeting(String name) {
        return greetingProperties.getPrefix() + name + greetingProperties.getSuffix();
    }
}

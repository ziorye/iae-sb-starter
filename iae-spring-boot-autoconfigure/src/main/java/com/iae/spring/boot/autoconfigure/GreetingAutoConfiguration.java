package com.iae.spring.boot.autoconfigure;

import com.iae.spring.boot.autoconfigure.controller.GreetingController;
import com.iae.spring.boot.autoconfigure.properties.GreetingProperties;
import com.iae.spring.boot.autoconfigure.service.GreetingService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties(GreetingProperties.class)
@Import({GreetingController.class, GreetingService.class})
public class GreetingAutoConfiguration {
}

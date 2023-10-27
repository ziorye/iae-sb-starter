package com.iae.spring.boot.autoconfigure.annotation;

import com.iae.spring.boot.autoconfigure.GreetingAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(GreetingAutoConfiguration.class)
public @interface EnableIaeGreeting {
}

package com.iae.spring.boot.autoconfigure.controller;

import com.iae.spring.boot.autoconfigure.GreetingAutoConfiguration;
import com.iae.spring.boot.autoconfigure.properties.GreetingProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest(classes = GreetingAutoConfiguration.class)
@AutoConfigureMockMvc
public class GreetingControllerTest {
    @Autowired
    MockMvc mvc;

    @Autowired
    GreetingProperties greetingProperties;

    @Test
    void testGreeting() throws Exception {
        String name = "John";
        String expectedContent = greetingProperties.getPrefix() + name + greetingProperties.getSuffix();
        mvc.perform(MockMvcRequestBuilders.get("/iae/greeting/" + name))
                .andExpect(MockMvcResultMatchers.content().string(expectedContent))
        ;
    }
}

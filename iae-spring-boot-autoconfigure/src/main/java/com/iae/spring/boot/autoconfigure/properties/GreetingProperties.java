package com.iae.spring.boot.autoconfigure.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "iae.greeting")
public class GreetingProperties {
    /**
     * Greeting prefix.
     */
    private String prefix = "Hi ";

    /**
     * Greeting suffix.
     */
    private String suffix = ", welcome back";

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}

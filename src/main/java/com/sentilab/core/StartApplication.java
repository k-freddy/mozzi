package com.sentilab.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan(basePackages={"com.sentilab.*"})
public class StartApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}

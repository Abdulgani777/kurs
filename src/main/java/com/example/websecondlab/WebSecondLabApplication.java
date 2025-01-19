package com.example.websecondlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WebSecondLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSecondLabApplication.class, args);
    }

}
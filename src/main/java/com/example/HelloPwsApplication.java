package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloPwsApplication {

    @RequestMapping("/")
    String hello() {
        return "Hello from " + System.getenv("CF_INSTANCE_ADDR");
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloPwsApplication.class, args);
    }
}

package com.vinay.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApplicationdpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationdpApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Applicationdp Backend!";
    }
}

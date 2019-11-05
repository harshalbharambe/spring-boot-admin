package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BasicDemo1 {

    public static void main(String[] args) {
        SpringApplication.run(BasicDemo1.class, args);
    }
}


@RestController
class MyController {

   
    @RequestMapping("/message")
    String getMessage() {
        return "Hello from app 1";
    }
}

package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }
}

/*
 * @RestController class SampleController {
 * 
 * @RequestMapping("/message") String getMessage() { return
 * "Hello Sample .................................. !!"; } }
 */

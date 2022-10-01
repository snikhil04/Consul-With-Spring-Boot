package com.consul.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Launcher {

    @Autowired
    private MyConfig config;

    @GetMapping("/get")
    public String getConfiguration() {
        return config.getMessage();
    }


    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

}

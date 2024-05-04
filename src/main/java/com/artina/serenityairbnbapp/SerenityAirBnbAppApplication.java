package com.artina.serenityairbnbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EntityScan(basePackages = "com.artina.serenityairbnbapp.model")
public class SerenityAirBnbAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SerenityAirBnbAppApplication.class, args);
    }

}

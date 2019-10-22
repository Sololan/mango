package com.sololan.mango;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sololan.mango"})
public class MangoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MangoApplication.class, args);
    }

}

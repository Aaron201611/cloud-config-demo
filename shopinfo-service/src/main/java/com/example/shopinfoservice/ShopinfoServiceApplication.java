package com.example.shopinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ShopinfoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopinfoServiceApplication.class, args);
    }

}

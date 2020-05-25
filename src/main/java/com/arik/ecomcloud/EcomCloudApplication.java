package com.arik.ecomcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EcomCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcomCloudApplication.class, args);
    }

}

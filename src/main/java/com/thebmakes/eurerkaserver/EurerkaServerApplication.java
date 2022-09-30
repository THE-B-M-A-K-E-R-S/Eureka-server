package com.thebmakes.eurerkaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurerkaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurerkaServerApplication.class, args);
    }

}

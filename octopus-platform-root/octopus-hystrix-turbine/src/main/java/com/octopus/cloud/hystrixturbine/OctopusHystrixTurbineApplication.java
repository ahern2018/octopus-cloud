package com.octopus.cloud.hystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@EnableDiscoveryClient
@SpringBootApplication
@EnableTurbineStream
public class OctopusHystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(OctopusHystrixTurbineApplication.class, args);
    }
}

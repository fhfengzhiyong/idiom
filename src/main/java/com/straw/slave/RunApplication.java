package com.straw.slave;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class RunApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(RunApplication.class, args);
    }
}

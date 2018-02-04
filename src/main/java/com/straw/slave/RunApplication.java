package com.straw.slave;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.straw.slave.dao")
public class RunApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(RunApplication.class, args);
    }
}

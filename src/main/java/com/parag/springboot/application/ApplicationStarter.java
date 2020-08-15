package com.parag.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.parag.springboot")
public class ApplicationStarter {
    public static void main(String[] args){
        SpringApplication.run(ApplicationStarter.class,args);
    }
}

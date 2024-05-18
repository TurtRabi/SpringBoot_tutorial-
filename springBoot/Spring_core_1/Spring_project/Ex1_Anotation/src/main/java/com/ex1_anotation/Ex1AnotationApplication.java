package com.ex1_anotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ex1AnotationApplication {

    public static void main(String[] args) {

        SpringApplication.run(Ex1AnotationApplication.class, args);
    }
    @Bean
    public String name(){
        return "minhle";
    }

}

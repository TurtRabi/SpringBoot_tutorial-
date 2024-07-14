package org.example.spring_core_ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Person persion(){
        return new Person("minh",21);
    }
}

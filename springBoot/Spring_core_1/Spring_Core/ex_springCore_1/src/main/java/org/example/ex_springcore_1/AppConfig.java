package org.example.ex_springcore_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public GreetiongService greetService() {
        GreetiongService greetiongService = new GreetiongService();
        greetiongService.setMessager("hello world");
        return greetiongService;
    }
}

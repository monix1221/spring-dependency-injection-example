package com.example.demo.config;

import com.example.demo.services.HelloWorldService;
import com.example.demo.services.HelloWorldServiceEngImpl;
import com.example.demo.services.HelloWorldServiceEsImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEng() {
        return new HelloWorldServiceEngImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceEs() {
        return new HelloWorldServiceEsImpl();
    }

}

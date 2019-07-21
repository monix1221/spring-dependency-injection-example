package com.example.demo.config;

import com.example.demo.services.HelloWorldFactory;
import com.example.demo.services.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEng(HelloWorldFactory factory) {
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceEs(HelloWorldFactory factory) {
        return factory.createHelloWorldService("es");
    }

    @Bean
    @Profile("polish")
    public HelloWorldService helloWorldServicePl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("pl");
    }

    @Bean
    @Profile("german")
    public HelloWorldService helloWorldServiceDe(HelloWorldFactory factory) {
        return factory.createHelloWorldService("de");
    }
}

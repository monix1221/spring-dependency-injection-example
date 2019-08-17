package com.example.demo.config;

import com.example.demo.services.HelloWorldFactory;
import com.example.demo.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory() {
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    @Primary
    public HelloWorldService helloWorldServiceEng(HelloWorldFactory factory) {
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    @Primary
    public HelloWorldService helloWorldServiceEs(HelloWorldFactory factory) {
        return factory.createHelloWorldService("es");
    }

    @Bean
    public HelloWorldService helloWorldServicePl(HelloWorldFactory factory) {
        return factory.createHelloWorldService("pl");
    }

    @Bean
    @Qualifier("helloWorldServiceGerman")
    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory) {
        return factory.createHelloWorldService("de");
    }
}

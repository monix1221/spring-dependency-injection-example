package com.example.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class HelloWorldServiceEsImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hola";
    }
}

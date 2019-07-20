package com.example.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class HelloWorldServiceEngImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hello";
    }
}

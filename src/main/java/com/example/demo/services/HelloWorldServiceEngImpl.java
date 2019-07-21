package com.example.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("default") // default profile is running when no active profile is set; active profile overrides default
// when no active profile is set, and no default profile, then context cant resolve which bean to use
@Profile({"default", "english"}) // we mark it as both english and default
public class HelloWorldServiceEngImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hello";
    }
}

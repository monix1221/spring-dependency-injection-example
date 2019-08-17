package com.example.demo.controllers;

import com.example.demo.services.HelloWorldService;
import com.example.demo.services.HelloWorldServiceGermanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    private HelloWorldService helloWorldServiceGerman;


    @Autowired
    private void setHelloWorldServiceGerman(HelloWorldServiceGermanImpl helloWorldServiceGerman) { //TODO why doens't work on some runs?
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();

        System.out.println(greeting);
        System.out.println(helloWorldServiceGerman.getGreeting());

        return greeting;
    }
}

package com.example.demo.controllers;

import com.example.demo.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // it will be wired up and created as spring bean
public class GreetingController {

    private HelloWorldService helloWorldService;

    /**
     * setter based dependency injection
     * @param helloWorldService
     */
    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String greeeting = helloWorldService.getGreeting();
        System.out.println(greeeting);
        return greeeting;
    }
}

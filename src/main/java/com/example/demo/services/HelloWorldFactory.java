package com.example.demo.services;

public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String lang) {
        HelloWorldService service = null;

        switch (lang) {
            case "en":
                service = new HelloWorldServiceEngImpl();
                break;
            case "es":
                service = new HelloWorldServiceEsImpl();
                break;
            case "pl":
                service = new HelloWorldServicePolishImpl();
                break;
            case "de":
                System.out.println("********** creating german impl *****************");
                service = new HelloWorldServiceGermanImpl();
                break;
            default:
                new HelloWorldServiceEngImpl();
        }

        return service;
    }

}

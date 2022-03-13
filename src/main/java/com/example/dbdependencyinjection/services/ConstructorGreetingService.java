package com.example.dbdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World - constructor";
    }
}

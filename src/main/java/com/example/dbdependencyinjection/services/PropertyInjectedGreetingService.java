package com.example.dbdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hello World - property";
    }
}
package com.example.dbdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
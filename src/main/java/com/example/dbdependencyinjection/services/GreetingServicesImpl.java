package com.example.dbdependencyinjection.services;

public class GreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}

package com.example.dbdependencyinjection.services;


public class I18SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World from Spanish service";
    }
}

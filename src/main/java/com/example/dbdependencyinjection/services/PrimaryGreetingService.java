package com.example.dbdependencyinjection.services;


public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
            return "Hello World from PRIMARY Bean";
    }
}

package com.example.dbdependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingServices{
    @Override
    public String sayGreeting() {
            return "Hello World from PRIMARY Bean";
    }
}

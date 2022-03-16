package com.example.dbdependencyinjection.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"EN", "default"})
@Qualifier("i18Service")
@Service
public class I18EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from English service";
    }
}

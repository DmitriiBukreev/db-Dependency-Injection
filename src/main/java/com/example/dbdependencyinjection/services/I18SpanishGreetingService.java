package com.example.dbdependencyinjection.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("SP")
@Qualifier("i18Service")
@Service
public class I18SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from Spanish service";
    }
}

package com.example.dbdependencyinjection.controllers;

import com.example.dbdependencyinjection.services.GreetingService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18Controller {
    private final GreetingService greetingService;

    public I18Controller(@Qualifier("i18Service") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){


        return greetingService.sayGreeting();
    }
}

package com.example.dbdependencyinjection.Controllers;

import com.example.dbdependencyinjection.services.GreetingServices;

public class ConstructorInjectedController {
    private final GreetingServices greetingServices;

    public ConstructorInjectedController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }
    public String getGreeting() {
        return greetingServices.sayGreeting();
    }
}

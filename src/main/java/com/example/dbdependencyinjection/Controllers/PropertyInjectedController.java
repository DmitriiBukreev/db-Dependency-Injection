package com.example.dbdependencyinjection.Controllers;

import com.example.dbdependencyinjection.services.GreetingServices;

public class PropertyInjectedController {
    public GreetingServices greetingServices;

    public String getGreeting() {
        return greetingServices.sayGreeting();
    }

}

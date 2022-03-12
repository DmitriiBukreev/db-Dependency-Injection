package com.example.dbdependencyinjection.Controllers;

import com.example.dbdependencyinjection.services.GreetingServices;

public class SetterInjectedController {
    private GreetingServices greetingServices;

    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting() {
        return greetingServices.sayGreeting();
    }



}

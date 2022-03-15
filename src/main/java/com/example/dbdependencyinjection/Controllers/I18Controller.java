package com.example.dbdependencyinjection.Controllers;

import com.example.dbdependencyinjection.services.GreetingServices;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18Controller {
    private final GreetingServices greetingServices;

    public I18Controller(@Qualifier("i18Service") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }
    public String sayHello(){


        return greetingServices.sayGreeting();
    }
}

package com.example.dbdependencyinjection.Controllers;

import com.example.dbdependencyinjection.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingServices = new GreetingServicesImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
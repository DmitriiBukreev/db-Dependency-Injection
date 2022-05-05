package com.example.dbdependencyinjection;

import com.example.dbdependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com.example.dbdependencyinjection","pets"})
@SpringBootApplication
public class DbDependencyInjectionApplication {

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(DbDependencyInjectionApplication.class, args);



     PetController petController = ctx.getBean("petController", PetController.class);
     System.out.println("--- The Best Pet is ---");
     System.out.println(petController.whichPetIsTheBest());

        I18Controller i18Controller= (I18Controller) ctx.getBean("i18Controller");
        System.out.println(i18Controller.sayHello());

        MyController myController= (MyController) ctx.getBean("myController");

        System.out.println("--------Primary bean");

        System.out.println(myController.sayHello());

        System.out.println("------Property");
        PropertyInjectedController propertyInjectedController= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------Constructor");
        ConstructorInjectedController constructorInjectedController= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());



    }

}

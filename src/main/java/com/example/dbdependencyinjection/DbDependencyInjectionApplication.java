package com.example.dbdependencyinjection;

import com.example.dbdependencyinjection.Controllers.MyController;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DbDependencyInjectionApplication {

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(DbDependencyInjectionApplication.class, args);

        MyController myController= (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);
    }

}

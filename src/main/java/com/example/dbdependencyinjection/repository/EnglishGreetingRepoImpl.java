package com.example.dbdependencyinjection.repository;

public class EnglishGreetingRepoImpl implements EnglishGreetingRepo {


    @Override
    public String getGreeting() {
        return "Hello World from English service";
    }
}

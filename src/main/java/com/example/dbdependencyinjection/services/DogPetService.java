package com.example.dbdependencyinjection.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;



@Service
@Profile("dog")
public class DogPetService implements PetService {

    public String getPetType(){
        return "Dogs are the best!";
    }
}

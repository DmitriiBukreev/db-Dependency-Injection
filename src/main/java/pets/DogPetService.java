package pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;



@Service
@Profile("dog")
public class DogPetService implements PetService {

    public String getPetType(){
        return "Dogs are the best!";
    }
}

package controller;

import java.time.LocalDate;
import java.util.Scanner;

import data.Animals;
import data.TypeAnimal;
import service.AnimalService;

public class Controller {
     Scanner in = new Scanner(System.in, "ibm866");
    private final AnimalService animalService = new AnimalService();
    public Animals getAnimalById(int id){
        return animalService.getAnimalById(id);

    }

    
    public void createCamel(String name, LocalDate birthday){
        animalService.createPackAnimals(name, birthday, TypeAnimal.CAMEL);

    }
    public void createCat(String name, LocalDate birthday){
        System.out.println("Введите доступные команды");
        String command = in.next();
        animalService.createPets(name, birthday,command, TypeAnimal.CAT);
        
    }
    public void createDog(String name, LocalDate birthday){
        System.out.println("Введите доступные команды");
        String command = in.next();
        animalService.createPets(name, birthday,command, TypeAnimal.DOG);
        
    }
    public void createHamster(String name, LocalDate birthday){
        animalService.createPackAnimals(name, birthday, TypeAnimal.HAMSTER);
        
    }
    public void createHorse(String name, LocalDate birthday){
        animalService.createPackAnimals(name, birthday, TypeAnimal.HORSE);
        
    }
    public void getAllAnimals(){
        System.out.println(AnimalService.getAnimalList());
    }


}

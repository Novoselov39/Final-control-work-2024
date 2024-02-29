package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.AncestorEvent;
import javax.swing.text.Caret;

import data.Animals;
import data.Camel;
import data.Cat;
import data.Dog;
import data.Hamster;
import data.Horse;
import data.Pets;
import data.TypeAnimal;

public class AnimalService {
    private static List<Animals> animalList = new ArrayList<>();
    public void createPets(String name, LocalDate birthday,String command, TypeAnimal type){

        switch (type) {
            case CAT:
                Cat cat = new Cat(getAnimalId(), name, birthday, command, TypeAnimal.CAT);
                animalList.add(cat);
                break;
            case DOG:
                Dog dog = new Dog(getAnimalId(), name, birthday, command, TypeAnimal.DOG);
                animalList.add(dog);                
                break;        
            default:
                System.out.println("Такого варианта нет");
                break;
           
        }
    
    }
    public void createPackAnimals(String name, LocalDate birthday,TypeAnimal type){

        switch (type) {
            
            case CAMEL:
                Camel camel = new Camel(getAnimalId(), name, birthday, TypeAnimal.CAMEL);
                animalList.add(camel);
                break;
            case HAMSTER:
                Hamster hamster = new Hamster(getAnimalId(), name, birthday, TypeAnimal.HAMSTER);
                animalList.add(hamster);
                break;
            case HORSE:
                Horse horse = new Horse(getAnimalId(), name, birthday, TypeAnimal.HORSE);
                animalList.add(horse);
                break;
            default:
                System.out.println("Такого варианта нет");
                break;
           
        }
    
    }

    public Animals getAnimalById(int id){
        for (Animals animals : animalList) {
            if (animals.getAnimalId()==id){
                return animals;
            }            
            
        }
        return null;
    }


    public static List<Animals> getAnimalList() {
        return animalList;
    }
    public static void setAnimalList(List<Animals> animalList) {
        AnimalService.animalList = animalList;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return animalList.toString();
    }

    private int getAnimalId(){
        int resultId=1;

        for (Animals animals : animalList) {
            if (animals.getAnimalId()>=resultId){
                resultId=animals.getAnimalId()+1;
            }
            
        }  

        return resultId;
    }
    

}

package data;

import java.time.LocalDate;

public class Hamster extends PackAnimals {
    private TypeAnimal type;     


    public Hamster(int animalId, String name, LocalDate birthday, TypeAnimal type) {
        super(animalId, name, birthday);
        this.type = type;
    }

    @Override
    public int getAnimalId() {
        // TODO Auto-generated method stub
        return super.getAnimalId();
    }

    @Override
    public LocalDate getBirthday() {
        // TODO Auto-generated method stub
        return super.getBirthday();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public void setAnimalId(int animalId) {
        // TODO Auto-generated method stub
        super.setAnimalId(animalId);
    }

    @Override
    public void setBirthday(LocalDate birthday) {
        // TODO Auto-generated method stub
        super.setBirthday(birthday);
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Animals [animalId=" + this.getAnimalId() + 
                            ", name=" + this.getName() + 
                            ", birthday=" + this.getBirthday() +                             
                            ", TypeAnimal=" +this.type+"]";
    }

}

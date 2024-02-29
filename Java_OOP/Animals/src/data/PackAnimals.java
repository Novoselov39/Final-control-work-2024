package data;

import java.time.LocalDate;

public class PackAnimals extends Animals {

    public PackAnimals(int animalId, String name, LocalDate birthday) {
        super(animalId, name, birthday);
        //TODO Auto-generated constructor stub
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
        // TODO Auto-generated method stub
        return super.toString();
    }
    

}

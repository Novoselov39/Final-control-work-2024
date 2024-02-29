package data;

import java.time.LocalDate;

public class Dog extends Pets {
    private TypeAnimal type;     


    public Dog(int animalId, String name, LocalDate birthday, String command, TypeAnimal type) {
        super(animalId, name, birthday, command);
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
    public String getCommand() {
        // TODO Auto-generated method stub
        return super.getCommand();
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
    public void setCommand(String command) {
        // TODO Auto-generated method stub
        super.setCommand(command);
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Animals [animalId=" + this.getAnimalId() + 
        ", name=" + this.getName() + 
        ", birthday=" + this.getBirthday() + 
        ", command=" + this.getCommand()+ 
        ", TypeAnimal=" +this.type+"]";
    }

}

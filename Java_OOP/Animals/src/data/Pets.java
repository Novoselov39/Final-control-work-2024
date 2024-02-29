package data;

import java.time.LocalDate;

public class Pets extends Animals {
    private String command;

    

    public Pets(int animalId, String name, LocalDate birthday, String command) {
        super(animalId, name, birthday);
        this.command = command;
    }



    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
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

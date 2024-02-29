package data;
import java.time.LocalDate;

public abstract class Animals {
    private int animalId;
    private String name;
    private LocalDate birthday;

    
    public Animals(int animalId, String name, LocalDate birthday) {
        this.animalId = animalId;
        this.name = name;
        this.birthday = birthday;
    }
    public int getAnimalId() {
        return animalId;
    }
    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return "Animals [animalId=" + animalId + ", name=" + name + ", birthday=" + birthday + "]";
    }
   
    
    
   
  






}

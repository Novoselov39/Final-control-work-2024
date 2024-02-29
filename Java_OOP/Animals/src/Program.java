import java.security.Provider.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.Controller;
import data.Animals;
import data.Cat;
import data.TypeAnimal;
import service.AnimalService;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in, "ibm866");
        Controller controller = new Controller();
       // controller.createCat("kot", LocalDate.parse("2024-02-29"));
      
        

        boolean flag = true;
            int id;
            while (flag) {

                System.out.println(
                        "\n1 - Список всех животных\n2 - Завести новое животное\n3 - Изменить данные о животном\n4 - Что умеет животное\n0 - Выход");
                String key = in.next();
                switch (key) {
                    case "1":
                
                        controller.getAllAnimals();
                        break;
                    case "2":
                        TypeAnimal type = menuChoice(in);
                        System.out.println("Введи имя:");
                        String name = in.next();
                        System.out.println("Введи дату рождения:");
                        LocalDate birthday = LocalDate.parse(in.next());
                        switch (type) {
                            case CAT:
                                controller.createCat(name, birthday);                                
                                break;
                            case DOG:
                                controller.createDog(name, birthday);  
                                break;
                            case CAMEL:
                                controller.createCamel(name, birthday);
                                break;
                            case HAMSTER:
                                controller.createHamster(name, birthday);                                
                                break;
                            case HORSE:
                                controller.createHorse(name, birthday);
                                
                                break;
                        
                            default:
                                break;
                        }

                        
                        break;
                    case "3":
                            System.out.println("введи id животного");
                            id = Integer.parseInt(in.next());
                            controller.getAnimalById(id);
                        
                        break;
                    case "4":
                        while (true) {
                            System.out.println("введи id животного");
                            id = Integer.parseInt(in.next());
                            System.out.println(controller.getAnimalById(id));
                            break;
                        }
                        break;
                
                    case "0":
                        flag = false;
                        break;
                    default:
                        System.out.println("такого варианта нет");
                        break;
                }
            }
        
    }
    private static TypeAnimal menuChoice(Scanner in) {
        System.out.println("Какое животное добавить:\n1 - Кошка\n2 - Собака\n3 - Хомяк\n4 - Верблюд\n5 - Лошадь\n0 - Возврат в основное меню");

        while (true) {
            String key = in.next();
            switch (key) {
                case "1":
                    return TypeAnimal.CAT;
                case "2":
                    return TypeAnimal.DOG;
                case "3":
                    return TypeAnimal.HAMSTER;
                case "4":
                    return TypeAnimal.CAMEL;
                case "5":
                    return TypeAnimal.HORSE;
                case "0":
                    return null;
                default:
                    System.out.println("Такого варианта нет, введите число от 0 до 3");
                    break;
            }
        }
    }
}

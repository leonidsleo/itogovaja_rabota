package Programm.MODEL;

import Programm.VIEW.View;


public interface DatabaseOperations {

    void addComands(Animal animal, String comands);

    void addAnimal(Counter id, View view);

    String showComands(Animal animal);

}
package Programm.VIEW;

import java.util.Date;

public interface IView {

    int mainMenu();

    int animalTypeMenu();

    void showComands(String comands);

    int whichAnimal();

    String enterName();
    String enterComands();

    Date enterDate();

    void alert(String s);

}
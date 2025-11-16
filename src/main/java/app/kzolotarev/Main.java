package app.kzolotarev;

import app.kzolotarev.animals.*;
import app.kzolotarev.house.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(3, 5, "Жучка");
        Animal dirtyAnimal = new Animal(3, 5, "Свинка Пеппа");

        House house = new House(animal);
        House dirtyPigHouse = new House(dirtyAnimal);

        System.out.println("В доме живет " + house.getOwnerName());
        System.out.println("В сыинарнике живет " + dirtyPigHouse.getOwnerName());
    }
}

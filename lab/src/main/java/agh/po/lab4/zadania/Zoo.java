package agh.po.lab4.zadania;

import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Parrot;
import agh.po.lab4.animals.Snake;

import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];

    public Zoo() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int animalIndex = random.nextInt(1, 4);
            switch (animalIndex) {
                case 1:
                    animals[i] = new Parrot();
                    break;
                case 2:
                    animals[i] = new Snake();
                    break;
                case 3:
                    animals[i] = new Dog();
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        int legsSum = 0;
        for (int i = 0; i < 100; i++) {
            legsSum+=zoo.animals[i].getLegs();
            System.out.println(zoo.animals[i].getDescription());
        }
        System.out.println(legsSum);
    }
}

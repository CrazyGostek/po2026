package agh.po.lab4.animals;

import java.util.Set;

public class Dog extends Animal {
    public Dog() {
        name = "Pies";
        legs = 4;
    }

    @Override
    public String getDescription(){
        if (legs==1)
            return String.format("Pies ma %s nogę", legs);
        if (Set.of(2,3,4).contains(legs)) {
            return String.format("Pies ma %s nogi", legs);
        }
        return String.format("Pies ma %s nóg", legs);
    }
}

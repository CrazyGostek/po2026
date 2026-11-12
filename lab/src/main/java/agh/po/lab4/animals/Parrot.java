package agh.po.lab4.animals;

import java.util.Set;

public class Parrot extends Animal {
    public Parrot() {
        name = "Papuga";
        legs = 2;
    }

    @Override
    public String getDescription(){
        if (legs==1)
            return String.format("Papuga ma %s nogę", legs);
        if (Set.of(2,3,4).contains(legs)) {
            return String.format("Papuga ma %s nogi", legs);
        }
        return String.format("Papuga ma %s nóg", legs);
    }
}

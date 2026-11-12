package lab4.animals;

import java.util.Set;

public class Snake extends Animal {
    public Snake() {
        name = "Wąż";
        legs = 0;
    }

    @Override
    public String getDescription(){
        if (legs==1)
            return String.format("Wąż ma %s nogę", legs);
        if (Set.of(2,3,4).contains(legs)) {
            return String.format("Wąż ma %s nogi", legs);
        }
        return String.format("Wąż ma %s nóg", legs);
    }
}

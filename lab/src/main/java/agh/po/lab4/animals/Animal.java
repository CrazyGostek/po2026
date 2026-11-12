package agh.po.lab4.animals;

import java.util.Set;

public abstract class Animal {
    protected String name;
    protected int legs;

    public int getLegs() {
        return legs;
    }

    public abstract String getDescription();
}

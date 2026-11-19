package agh.po.symulator;

import java.math.BigDecimal;

public abstract class Component {
    public Component(String name, String model, String manufacturer, int weight, BigDecimal price) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.price = price;
    }

    protected String name, model, manufacturer;
    protected int weight;
    protected BigDecimal price;

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

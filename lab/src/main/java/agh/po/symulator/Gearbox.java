package agh.po.symulator;

import java.math.BigDecimal;

public class Gearbox extends Component {
    public Gearbox(String name, String model, String manufacturer, int weight, BigDecimal price, int currentGear, int gearsAmount, int currentTransmission, Clutch clutch) {
        super(name, model, manufacturer, weight, price);
        this.currentGear = currentGear;
        this.gearsAmount = gearsAmount;
        this.currentTransmission = currentTransmission;
        this.clutch = clutch;
        weight += clutch.getWeight();
    }

    private int currentGear, gearsAmount, currentTransmission;
    Clutch clutch;

    void gearUp() {
        if (currentGear < 5)
            ++this.currentGear;
    }

    void gearDown() {
        if (currentGear > 0)
            --this.currentGear;
    }

    void setNeutral() {
        this.currentGear = 0;
    }

    public int getCurrentGear() {
        return this.currentGear;
    }

    public int getCurrentTransmission() {
        return this.currentTransmission;
    }
}

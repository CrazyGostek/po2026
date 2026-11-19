package agh.po.symulator;

import java.math.BigDecimal;

public class Clutch extends Component {
    public Clutch(String name, String model, String manufacturer, int weight, BigDecimal price, boolean clutchesState) {
        super(name, model, manufacturer, weight, price);
        this.clutchesState = clutchesState;
    }

    private boolean clutchesState;

    void engageClutch() {
        this.clutchesState = true;
    }

    void disengageClutch() {
        this.clutchesState = false;
    }

    boolean getClutchesState(){
        return this.clutchesState;
    }
}

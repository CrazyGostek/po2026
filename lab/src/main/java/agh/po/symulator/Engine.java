package agh.po.symulator;

public class Engine extends Component {
    private int maxRpm, minRpm, rpm;

    void runEngine() {
        this.rpm = 900;
    }

    void stopEngine() {
        this.rpm = 0;
    }

    void increaseRpm(int rpm) {
        if (this.rpm + rpm <= maxRpm)
            this.rpm += rpm;
    }

    void lowerRpm(int rpm) {
        if (this.rpm - rpm >= minRpm)
            this.rpm -= rpm;
    }

    public int getRpm() {
        return rpm;
    }
}

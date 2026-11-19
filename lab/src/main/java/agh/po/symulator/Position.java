package agh.po.symulator;

public class Position {
    private double x, y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Position() {
        this.x = 0;
        this.y = 0;
    }

    void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    String getPosition() {
        return String.format("%s, %s", x, y);
    }
}

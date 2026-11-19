package agh.po.symulator;

public class Car {
    public Car(boolean ignitionState, int regNumber, int maxSpeed, String model, int weight, Position position, Engine engine, Gearbox gearbox, Clutch clutch) {
        this.ignitionState = ignitionState;
        this.regNumber = regNumber;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.weight = weight;
        this.position = position;
        this.engine = engine;
        this.gearbox = gearbox;
    }

    boolean ignitionState;
    int regNumber, maxSpeed;
    String model;
    int weight;

    Position position = new Position();
    Engine engine = new Engine();
    Gearbox gearbox = new Gearbox();

    String carInfo(){
        return String.format("RPM: %s, Obecny bieg: %s, Stan sprzęgła: %s", engine.getRpm(), gearbox.getCurrentGear(), gearbox.clutch.getClutchesState()?"Wciśnięte":"Zwolnione");
    }

    void startCar() {
        engine.runEngine();
    }

    void stopCar() {
        engine.stopEngine();
        gearbox.setNeutral();
    }

    void goTo(double x, double y) {
        position.setPosition(x, y);
    }

    public int getWeight() {
        return this.weight + engine.getWeight() + gearbox.getWeight();
    }

    public int getCurrentSpeed() {
        return 0;
    }
}

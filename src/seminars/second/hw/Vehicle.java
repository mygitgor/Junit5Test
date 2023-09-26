package seminars.second.hw;

import java.util.function.IntPredicate;

public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public abstract IntPredicate testDrive();

    public abstract void park();
}

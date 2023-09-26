package seminars.second.hw;

import java.util.function.IntPredicate;

public class Motorcycle extends Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public Motorcycle (String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = 2;
        this.speed = 0;
    }
    public IntPredicate testDrive() { this.speed = 75;
        return null;
    }
    public void park() { this.speed = 0; }
    public String getCompany() { return company; }
    public String getModel() { return model; }
    public int getYearRelease() { return yearRelease; }
    public int getNumWheels() { return numWheels; }
    public int getSpeed() { return speed; }
    public String toString() { return "This motorcycle is a “ + year + “ “ + make + “ “ + model + “;"; }
}
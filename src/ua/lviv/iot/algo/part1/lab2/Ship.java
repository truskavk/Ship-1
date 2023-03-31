package ua.lviv.iot.algo.part1.lab2;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public abstract class Ship {

    private double id = 10.4;
    private String name;
    private String captain;
    private String currentPort;
    private double maxSpeed;
    private double maxCapacity;
    private double currentLoad = 0;

    public abstract int getTotalPeopleCount();

    public abstract int calculateLoadTime();

    public void dock(String port) {
        currentPort = port;
    }

    public void setSpeed(double speed) {
        if (speed > maxSpeed) {
            System.out.println("Cannot set speed higher than max speed");
        } else {
            System.out.println("Setting speed to " + speed + " knots");
        }
    }

    public void load(double weight) {
        if (currentLoad + weight > maxCapacity) {
            System.out.println("Cannot load more than max capacity");
        } else {
            currentLoad += weight;
            System.out.println("Loaded " + weight + " tons of cargo");
        }
    }

    public void unload(double weight) {
        if (currentLoad - weight < 0) {
            System.out.println("Cannot unload more than current load");
        } else {
            currentLoad -= weight;
            System.out.println("Unloaded " + weight + " tons of cargo");
        }
    }

}
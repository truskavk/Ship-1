package ua.lviv.iot.algo.part1.lab2;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
class CruiseShip extends Ship {

    private int passengersCount;
    private int crewCount;
    private int auxiliaryPersonnelCount;

    public CruiseShip(double id, String name, String captain, String currentPort,
                      double maxSpeed, double maxCapacity, double currentLoad,
                      int passengersCount, int crewCount, int auxiliaryPersonnelCount) {
        super(id, name, captain, currentPort, maxSpeed, maxCapacity, currentLoad);
        this.passengersCount = passengersCount;
        this.crewCount = crewCount;
        this.auxiliaryPersonnelCount = auxiliaryPersonnelCount;
    }

    @Override
    public int getTotalPeopleCount() {
        return passengersCount + crewCount + auxiliaryPersonnelCount;
    }

    @Override
    public int calculateLoadTime() {
        return passengersCount * 5;
    }

}
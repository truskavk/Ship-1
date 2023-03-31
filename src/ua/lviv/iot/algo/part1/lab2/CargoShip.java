package ua.lviv.iot.algo.part1.lab2;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
class CargoShip extends Ship {

    private double tonnage;
    private String cargoType;
    public CargoShip(double id, String name, String captain, String currentPort,
                     double maxSpeed, double maxCapacity, double currentLoad, double tonnage, String cargoType) {
        super(id, name, captain, currentPort, maxSpeed, maxCapacity, currentLoad);
        this.tonnage = tonnage;
        this.cargoType = cargoType;
    }



    @Override
    public int getTotalPeopleCount() {
        return 0;
    }

    @Override
    public int calculateLoadTime() {
        return (int) Math.ceil(tonnage / 20) * 60;
    }

}

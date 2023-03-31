package ua.lviv.iot.algo.part1.lab2;


import java.util.ArrayList;
import java.util.List;
public class ShipManager {

    public static void main(String[] args) {

        List <Ship> ships = new ArrayList<>();

        ships.add (new CruiseShip(10.4, "Victory", "Vrungel", "Odesa", 33, 500, 0, 100, 20, 5);
        ships.add (new CargoShip(10.5, "CargoMaster", "Captain Jack", "Rotterdam", 25, 1000, 0, 1000, "Oil"));
        ships.add (new CruiseShip());
        ships.add (new CargoShip());

        for (Ship ship : ships) {
            System.out.println(ship);
            System.out.println("Total people count: " + ship.getTotalPeopleCount());
            System.out.println("Load time: " + ship.calculateLoadTime() + " minutes\n");
        }
    }

}

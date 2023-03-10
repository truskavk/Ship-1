package ua.lviv.iot.algo.part1.lab1;
import lombok.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ship {

    private static Ship instance=new Ship();
    private double id = 10.4;
    private String name;
    private String captain;
    private String currentPort;
    private double maxSpeed;
    private double maxCapacity;
    private double currentLoad = 0;

    Ship getInstance(){
        return instance;
    }

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

    public static void main(String[] args) {

        Ship[] ships = new Ship[3];

        ships[0] = new Ship(10.4, "Victory", "Vrungel",   //присвоюємо значення об'єкта,створеного через конструктор з аргумегами
                "Odesa", 33, 500, 0);        //елементу масиву

        ships[1] = instance.getInstance();  //присвоюємо значення об'єкту викликаного статичним полем елементу масиву
        ships[2] = new Ship();    //через конструктор по замовчуванню
        for (int i = 0; i < 3; i++) {             //Виводимо масив через цикл
            System.out.println(ships[i]);
        }
    }

}
package Task_1_2.app;

import Task_1_2.vehicles.Car;
import Task_1_2.vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Person_1", 1999, "V-6");
        ElectricCar electricCar = new ElectricCar("Person_2", 2015, 100);

        System.out.println("Владелец машины: " + car.getOwnerName());
        System.out.println("Владелец электрокара: " + electricCar.getOwnerName());

        System.out.println("Батарея: " + electricCar.getBatteryCapacity());
    }
}

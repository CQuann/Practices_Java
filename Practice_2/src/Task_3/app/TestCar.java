package Task_3.app;

import Task_3.vehicles.Car;
import Task_3.vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Person_1", "Subaru", 2000, "USA", "#011001", 111111, "V-6");
        ElectricCar electricCar = new ElectricCar("Person_2", "Tesla", 2021, "USA", "#1111111", 2222222, "V-4",  100);


        System.out.println(electricCar.toString());
        System.out.println(car.toString());


        electricCar.IncreaseBatteryCapacity();
        electricCar.IncreaseBatteryCapacity();
        car.setModel("Honda");

        System.out.println(electricCar.toString());
        System.out.println(car.toString());

        System.out.println(electricCar.vehicleType());
        System.out.println(car.vehicleType());
    }
}

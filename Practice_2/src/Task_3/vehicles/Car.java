package Task_3.vehicles;

import Task_3.vehicles.Vehicle;

public class Car extends Vehicle {


    public Car(String name, String model, int year, String license, String color, int number, String type) {
        this.ownerName = name;
        this.insuranceNumber = number;
        this.engineType = type;
        this.color = color;
        this.model = model;
        this.license = license;
    }


    @Override
    public String vehicleType() {
        return "Car";
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", license='" + license + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", ownerName='" + ownerName + '\'' +
                ", engineType='" + engineType + '\'' +
                ", insuranceNumber=" + insuranceNumber +
                '}';
    }
}

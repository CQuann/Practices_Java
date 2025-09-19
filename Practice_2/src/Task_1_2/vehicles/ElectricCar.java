package Task_1_2.vehicles;

public class ElectricCar extends Car {


    protected int batteryCapacity;

    public ElectricCar(String name, int number, int battery) {
        super(name, number, "Electric");
        this.batteryCapacity = battery;
    }


    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
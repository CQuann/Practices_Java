package Task_3.vehicles;


public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String name, String model, int year, String license, String color, int number, String type, int battery) {
        super(name, model, year, license, color, number, type);
        this.batteryCapacity = battery;
        this.engineType = "Electric";
    }

    public void IncreaseBatteryCapacity() {
        this.batteryCapacity += 1;
    }

    public void DecreaseBatteryCapacity() {
        this.batteryCapacity -= 1;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", model='" + model + '\'' +
                ", license='" + license + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", ownerName='" + ownerName + '\'' +
                ", engineType='" + engineType + '\'' +
                ", insuranceNumber=" + insuranceNumber +
                '}';
    }



}
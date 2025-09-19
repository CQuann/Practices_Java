package Task_1_2.vehicles;

public class Car {
    private String ownerName;
    private int insuranceNumber;

    protected String engineType;

    public Car(String name, int number, String type) {
        this.ownerName = name;
        this.insuranceNumber = number;
        this.engineType = type;
    }



    public String getOwnerName() {
        return this.ownerName;
    }
    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getEngineType() {
        return this.engineType;
    }
    public void setEngineType(String type) {
        this.engineType = type;
    }

    public int getInsuranceNumber() {
        return this.insuranceNumber;
    }
    public void setInsuranceNumber(int number) {
        this.insuranceNumber = number;
    }


}

package Task3;

public class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    public Car() {
        this.model = "Unknown";
        this.license = "А000АА";
        this.color = "White";
        this.year = 2020;
    }

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car(String model, String license) {
        this.model = model;
        this.license = license;
        this.color = "Black";
        this.year = 2023;
    }

    public void To_String() {
        System.out.printf("%s %s %s %d%n", this.model, this.color, this.license, this.year);
    }

    public int calcAge() {
        final int YEAR_TODAY = 2025;
        return YEAR_TODAY - this.year;
    }

    //    Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


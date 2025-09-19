package Task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota Camry", "В123ВС", "Red", 2022);
        Car car3 = new Car("BMW X5", "С555СС");

        car1.To_String();
        car2.To_String();
        car3.To_String();

        System.out.println(car1.calcAge());
        System.out.println(car2.calcAge());
        System.out.println(car3.calcAge());

        car1.setYear(1995);
        car1.setModel("Porsche");

        car1.To_String();
        System.out.println(car1.calcAge());
    }
}

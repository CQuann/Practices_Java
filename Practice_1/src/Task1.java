import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;

        Scanner input = new Scanner(System.in);

        System.out.println("How many yuans u wanna buy?");
        yuan = input.nextInt();

        roubles = ROUBLES_PER_YUAN * yuan;
        System.out.println("You have to pay " + roubles + " roubles");
    }
}
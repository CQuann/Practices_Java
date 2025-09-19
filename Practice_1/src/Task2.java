import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;

        Scanner input = new Scanner(System.in);

        System.out.println("How many yuans u wanna buy?");

        yuan = input.nextInt();
        int digit = yuan % 10;

        if (digit == 1) {
            System.out.println(yuan + " юань");
        }
        else if (digit < 5) {
            System.out.println(yuan + " юаня");
        }
        else {
            System.out.println(yuan + " юаней");
        }

        roubles = ROUBLES_PER_YUAN * yuan;
        System.out.println("You have to pay " + roubles + " roubles");
    }
}

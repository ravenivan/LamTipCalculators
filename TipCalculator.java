import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator! ");
        System.out.print("What is your name? ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + "!" + "How many people are in your group today?:  ");
        int people = sc.nextInt();

        System.out.println("What tip percentage would you like to give? (0-100): ");
        int tip = sc.nextInt();

        double costItem = 0;

        while (costItem != -1) {
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            costItem = sc.nextDouble();

        }


    }
}
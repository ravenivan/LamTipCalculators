import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        String[] itemList;
        int[] costs;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator! ");
        System.out.print("What is your name? ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + "!" + "How many people are in your group today?:  ");
        int people = sc.nextInt();

        System.out.println("What tip percentage would you like to give? (0-100): ");
        int tip = sc.nextInt();

        String item;
        double costItem = 0;
        double totalCost = 0;

        while (costItem != -1) {
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            costItem = sc.nextDouble();
            if (costItem != -1) {
                totalCost += costItem;
                System.out.println("Enter the item: ");
                String item = sc.nextLine();
                itemList.add(item);
            } else {
                break;
            }
        }

        System.out.println(totalCost);


    }
}
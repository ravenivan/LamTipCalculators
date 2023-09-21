import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TipCalculator {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {

        String[] itemList = new String[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator! ");
        System.out.print("What is your name? ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + "!" + " How many people are in your group today?:  ");
        int people = sc.nextInt();

        System.out.println("What tip percentage would you like to give? (0-100): ");
        int tip = sc.nextInt();

        String item;
        double costItem = 0;
        double totalCost = 0;

        for (int i = 0 ; costItem != -1; i++) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            costItem = sc.nextDouble();
            sc.nextLine();
            if (costItem != -1) {
                totalCost += costItem;
                System.out.print("Enter the item: ");
                item = sc.nextLine();
                itemList[i] = item;
            } else {
                continue;
            }
        }

        double costAfterTip = totalCost * ((tip/100.0) + 1);
        double totalTip = costAfterTip - totalCost;
        double perCost1 = totalCost / people;
        double tipPer = totalTip / people;
        double perCost2 = costAfterTip / people;

        System.out.println("----------------------------------");
        System.out.println("Total bill before tip: $" + totalCost);
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip : $" + df.format(totalTip));
        System.out.println("Total bill with tip: $" + df.format(costAfterTip));
        System.out.println("Per person cost before tip: $" + df.format(perCost1));
        System.out.println("Tip per person: $" + df.format(tipPer));
        System.out.println("Total cost per person: $" + df.format(perCost2));
        System.out.println("----------------------------------");

        System.out.println("Items ordered: ");
        for (String j: itemList) {
            System.out.println(j);
        }



    }
}
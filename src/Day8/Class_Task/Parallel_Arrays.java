package Day8.Class_Task;

import java.util.Scanner;

class Parallel_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] drinks = {"pepsi", "sprite", "miranda", "campa", "cola"};
        int[] prices = {40, 35, 50, 10, 45};

        System.out.println("Available drinks: pepsi, sprite, miranda, campa, cola");

        System.out.print("Enter the name of the Drink: ");
        String name = sc.nextLine();

        System.out.print("Enter the quantity: ");
        int qty = sc.nextInt();

        boolean found = false;
        int total = 0;

        for (int i = 0; i < drinks.length; i++) {
            if (name.equalsIgnoreCase(drinks[i])) {
                total = qty * prices[i];
                System.out.println("You ordered: " + drinks[i]);
                System.out.println("Price per unit: " + prices[i]);
                System.out.println("Quantity: " + qty);
                System.out.println("Total amount: " + total);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Sorry, the drink you entered is not available.");
        }

        sc.close();
    }
}

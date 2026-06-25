import java.util.Scanner;

class Atmworking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        double balance = 10000.0;

        System.out.print("Enter ATM PIN: ");
        int pin = sc.nextInt();

        if (pin == correctPin) {
            System.out.println("PIN Verified!");

            System.out.println("\n1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your Balance: " + balance);
            } else {
                if (choice == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();

                    if (amount <= balance) {
                        balance = balance - amount;
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Remaining Balance: " + balance);
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                } else {
                    System.out.println("Invalid Option!");
                }
            }

        } else {
            System.out.println("Incorrect PIN!");
        }

        sc.close();
    }
}
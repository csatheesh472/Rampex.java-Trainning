import java.util.Scanner;
class Atmmachine {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int correctpin = 1234;
        double balance = 10000.0;

        System.out.print("Enter the pin:");
        int pin = sc.nextInt();

        if (pin == correctpin) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Money");
            System.out.println("Choose an Option");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Available Balance:" + balance);
            }

            else if (choice == 2) {
                System.out.println("Enter amount to withdraw:");
                double amount = sc.nextDouble;

                if (amount <= balance) {
                    balance = balance-amount;
                    System.out.println("Withdraw Sucessfull!");
                    System.out.println("Available Balance:" + balance);
                }
                else {
                    System.out.println("Insufficient Balance!");
                }
            }

            else if (choice == 3) {
                System.out.println("Enter the Deposit Amount:");
                double amount = sc.nextDouble();

                if (amount > 0) {
                    balance = amount + balance;
                    System.out.println("Deposit Sucessfully!");
                    System.out.println("Available Balance:" + balance);
                }
                else {
                    System.out.println("Insufficient Amount!");
                }
            }

            else {
                System.out.println("Invalid Choice! Try Again");
            }
        } else {
            System.out.println("wrong Pin! Try Again!");
        }
        sc.close();
    }
}
             
    

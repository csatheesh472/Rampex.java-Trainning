import java.util.Scanner;
class AtmMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        double balance = 10000.0;

        System.out.print("Enter ATM PIN: ");
        int pin = sc.nextInt();

        if (pin == correctPin) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Money");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Available Balance: " + balance);
            }
            else {
                if (choice == 2) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = sc.nextDouble();

                    if (amount <= balance) {
                        balance = balance - amount;
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Remaining Balance: " + balance);
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                }
                else {
                    if (choice == 3) {
                        System.out.print("Enter deposit amount: ");
                        double amount = sc.nextDouble();

                        if (amount > 0) {
                            balance = balance + amount;
                            System.out.println("Deposit Successful!");
                            System.out.println("Updated Balance: " + balance);
                        } else {
                            System.out.println("Invalid Deposit Amount!");
                        }
                    }
                    else {
                        System.out.println("Invalid Choice! Try Again!");
                    }
                }
            }

        } else {
            System.out.println("Incorrect PIN! Try Again.");
        }

        sc.close();
    }
}
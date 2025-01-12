import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000.0; // Initial account balance
        boolean exit = false;

        System.out.println("Welcome to the ATM!");

        while (!exit) {
            // Display the menu
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Check balance
                    System.out.println("Your current balance is: ₹" + balance);
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter the amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("₹" + depositAmount + " has been deposited successfully.");
                        System.out.println("Updated balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid amount! Please enter a valid amount to deposit.");
                    }
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter the amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("₹" + withdrawAmount + " has been withdrawn successfully.");
                        System.out.println("Updated balance: ₹" + balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance! You cannot withdraw more than ₹" + balance);
                    } else {
                        System.out.println("Invalid amount! Please enter a valid amount to withdraw.");
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    exit = true;
                    break;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }

        scanner.close();
    }
}

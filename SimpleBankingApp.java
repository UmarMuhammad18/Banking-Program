import java.util.Scanner;
public class SimpleBankingApp {

    // Setting the initial balance to 0.0
    private static double balance = 0.0;
    
    // To get the user's input.
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Deposits a specified amount into the account.
     * @param amount The amount to be deposited.  //param amount is the amount to be deposited into the account, it is also a double data type.
     */
    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited £" + String.format("%.2f", amount));
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * Withdraws an amount from the account, with validation to prevent a negative balance.
     * @param amount The amount to be withdrawn.  
     */
    public static void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Successfully withdrew £" + String.format("%.2f", amount));
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

    
    // Prints the current balance of the account, formatted to two decimal places.
    public static void checkBalance() {
        System.out.println("\nCurrent Balance: £" + String.format("%.2f", balance) + "\n");
    }

    // The main method, which runs the interactive menu loop.
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Simple Banking App!");
        int choice;

        // A while loop to keep the menu running
        while (true) {
            // Display the menu to the user
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");

            // Read the user's choice and handle potential non-integer input
            try {
                choice = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number from 1 to 4.");
                scanner.next();      // Clear the invalid input from the scanner
                continue;       // Skip the rest of the loop and show the menu again
            }

            // A switch statement to process the choice
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: £");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: £");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the Simple Banking App. Goodbye! :)");
                    scanner.close();       // Close the scanner to release system resources
                    return;        // Exit the main method and terminate the program
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
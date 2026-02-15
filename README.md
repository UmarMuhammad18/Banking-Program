Simple Banking App

A lightweight console-based banking application written in Java.

It allows users to check their balance, deposit money, withdraw money (with insufficient funds protection), and exit – all through an interactive menu.


✨ Features

- Check Balance – displays current balance formatted to two decimal places.
- Deposit – add a positive amount to the account.
- Withdraw – remove money if sufficient funds exist (prevents negative balance).
- Input Validation – handles non‑numeric menu choices and ensures deposit/withdrawal amounts are positive.
- Continuous Menu Loop – returns to the main menu after each operation until the user chooses to exit.
- Clean Console Output – uses String.format("%.2f") for proper currency formatting.


🛠️ Technologies Used

- Java – core language (version 8 or higher recommended).
- java.util.Scanner – for reading user input from the console.
- No external libraries – pure Java, runs anywhere with a JVM.


🚀 How to Run

1. Compile the program:
   javac SimpleBankingApp.java
2. Run the compiled class:
   java SimpleBankingApp

Make sure you have Java Development Kit (JDK) installed on your system.

📖 Usage Example

Welcome to the Simple Banking App!

--- Main Menu ---
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Please enter your choice: 1

Current Balance: £0.00

--- Main Menu ---
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Please enter your choice: 2

Enter amount to deposit: £50.75

Successfully deposited £50.75

--- Main Menu ---
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Please enter your choice: 3

Enter amount to withdraw: £20.00

Successfully withdrew £20.00

--- Main Menu ---
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Please enter your choice: 1

Current Balance: £30.75

--- Main Menu ---
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Please enter your choice: 4

Thank you for using the Simple Banking App. Goodbye! :)


📁 Project Structure

SimpleBankingApp/

├── SimpleBankingApp.java   # Main source code

└── README.md               # This file


⚙️ How It Works

- The program starts with a balance of 0.0.
- Inside an infinite while loop, a menu is displayed and the user’s choice is read.
- A try-catch block catches InputMismatchException if the user enters non‑numeric input for the menu.
- Based on the choice:
  - Check Balance – calls checkBalance().
  - Deposit – reads a double, validates it’s positive, and adds to balance.
  - Withdraw – reads a double, checks it’s positive and that balance >= amount, then subtracts.
  - Exit – closes the Scanner and terminates the program.
- The loop continues until the user selects option 4.


📝 Notes

- The program uses String.format("%.2f", amount) to always display monetary values with two decimal places.
- The Scanner is closed before exiting to prevent resource leaks.
- Deposit and withdrawal amounts must be positive numbers; otherwise an error message is shown.


📄 License

This project is open source and available under the MIT License.

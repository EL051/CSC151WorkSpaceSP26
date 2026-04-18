package main;

import java.util.Scanner;

/**
 * The TradeOne brokerage CLI.
 *
 * This is the entry point of the program. It displays a menu in a loop
 * and lets the user interact with the Ledger.
 *
 * YOUR TASK: Implement each menu option marked with TODO below.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ledger ledger   = new Ledger();

        int choice = 0;
        while (choice != 6) {

            System.out.println("\n--- TradeOne Brokerage ---");
            System.out.println("1. Create Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit / Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Bank Audit");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter initial balance: ");
                double balance = scanner.nextDouble();
                ledger.createAccount(balance);
                System.out.println("Account created with ID: " + (ledger.size() - 1));

            } else if (choice == 2) {
                System.out.print("Enter account ID: ");
                int id = scanner.nextInt();
                Account acc = ledger.getAccount(id);
                if (acc == null) {
                    System.out.println("Invalid Account ID");
                } else {
                    System.out.println("Current balance: " + acc.getBalance());
                }

            } else if (choice == 3) {
                System.out.print("Enter account ID: ");
                int id = scanner.nextInt();
                Account acc = ledger.getAccount(id);
                if (acc == null) {
                    System.out.println("Invalid Account ID");
                } else {
                    System.out.print("1. Deposit or 2. Withdraw? ");
                    int action = scanner.nextInt();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    
                    if (action == 1) {
                        acc.deposit(amount);
                    } else if (action == 2) {
                        acc.withdraw(amount);
                    }
                }

            } else if (choice == 4) {
                System.out.print("Enter From ID: ");
                int fromId = scanner.nextInt();
                System.out.print("Enter To ID: ");
                int toId = scanner.nextInt();
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                ledger.processTransfer(fromId, toId, amount);

            } else if (choice == 5) {
                System.out.println("Total Bank Assets: " + ledger.getTotalAssets());
                System.out.println("Total Transactions: " + ledger.getTransactionCount());

            } else if (choice == 6) {
                System.out.println("Goodbye");

            } else {
                System.out.println("Invalid option. Please enter 1–6.");
            }
        }

        scanner.close();
    }
}

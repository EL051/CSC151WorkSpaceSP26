package main;

import java.util.ArrayList;

/**
 * The TradeOne brokerage ledger.
 *
 * This class manages all customer accounts. It is the central system
 * that stores accounts in an ArrayList, coordinates transfers between
 * them, and tracks how many transactions have taken place.
 *
 * YOUR TASK: Implement every method marked with TODO below.
 * Read the assignment spec (A3_CollectionsAndTesting.pdf) before starting.
 */

public class Ledger {
    private ArrayList<Account> accounts;
    private int transactionCount;

    public Ledger() {
        accounts = new ArrayList<>();
		transactionCount = 0;
			
    }

    public Account createAccount(double initialBalance) {
        Account newAccount = new Account(initialBalance);
        accounts.add(newAccount);
        return newAccount;
    }

    public Account getAccount(int id) {
        if (id >= 0 && id < accounts.size()) {
            return accounts.get(id);
        }
        return null;
    }

    public double getTotalAssets() {
        double total = 0.0;
        for (Account acc : accounts) {
            total += acc.getBalance();
        }
        return total;
    }

    public void processTransfer(int sourceId, int destId, double amount) {
        Account source = getAccount(sourceId);
        Account dest = getAccount(destId);

        if (source == null || dest == null) {
            System.out.println("Invalid Account ID");
            return;
        }

        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (source.getBalance() < amount) {
            System.out.println("Insufficient Funds");
            return;
        }

        if (sourceId == destId) {
            return;
        }

        source.withdraw(amount);
        dest.deposit(amount);
        transactionCount++;
        System.out.println("Transfer successful.");
    }

    public int size() {
        return accounts.size();
    }

    public int getTransactionCount() {
        return transactionCount;
    }
}
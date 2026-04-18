package test;

import main.Ledger;
import main.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Your test file for Assignment 3.
 *
 * All four test methods below are REQUIRED. Fill in each one following
 * the Arrange / Act / Assert pattern described in the assignment spec.
 *
 * Run these tests using:
 *   Eclipse  → right-click this file → Run As → JUnit Test
 *   Terminal → run compile.sh then test.sh  (see scripts in project root)
 *
 * A green bar (all passing) is required before submitting.
 */

public class LedgerTest {

    Ledger ledger;

    @BeforeEach
    void setUp() {
        ledger = new Ledger();   
    }

    @Test
    void testLedgerSizeIncreases() {
        ledger.createAccount(100);
        ledger.createAccount(100);
        ledger.createAccount(100);

        assertEquals(3, ledger.size(), "Ledger should contain 3 accounts after 3 createAccount() calls.");
    }

    @Test
    void testTotalAssets() {
        ledger.createAccount(100.0);   
        ledger.createAccount(200.0);   

        assertEquals(300.0, ledger.getTotalAssets(), 0.001);
    }

    @Test
    void testTransferSuccess() {
        ledger.createAccount(100.0);   
        ledger.createAccount(0.0);     

        ledger.processTransfer(0, 1, 50.0);

        assertEquals(50.0, ledger.getAccount(0).getBalance(), 0.001);
        assertEquals(50.0, ledger.getAccount(1).getBalance(), 0.001);
        assertEquals(1, ledger.getTransactionCount());
    }

    @Test
    void testTransferInsufficientFunds() {
        ledger.createAccount(10.0);    
        ledger.createAccount(0.0);     

        ledger.processTransfer(0, 1, 100.0);

        assertEquals(10.0, ledger.getAccount(0).getBalance(), 0.001);
        assertEquals(0.0, ledger.getAccount(1).getBalance(), 0.001);
        assertEquals(0, ledger.getTransactionCount());
    }
} 


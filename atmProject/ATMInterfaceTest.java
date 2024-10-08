package atmProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ATMInterfaceTest {

    private Account[] accounts;
    private int accountCount;

    @BeforeEach
    public void setUp() {
        accounts = new Account[100];
        accountCount = 0;
    }

    @Test
    public void testCreateCheckingAccount() {
        accounts[accountCount] = new CheckingAccount(accountCount, 100);
        assertNotNull(accounts[accountCount]);
        assertEquals("Checking Account", accounts[accountCount].getType());
        assertEquals(100, accounts[accountCount].getBalance());
        accountCount++;
    }

    @Test
    public void testCreateSavingsAccount() {
        accounts[accountCount] = new SavingsAccount(accountCount, 100);
        assertNotNull(accounts[accountCount]);
        assertEquals("Savings Account", accounts[accountCount].getType());
        assertEquals(100, accounts[accountCount].getBalance());
        accountCount++;
    }

    @Test
    public void testDeposit() {
        accounts[accountCount] = new CheckingAccount(accountCount, 100);
        accounts[accountCount].deposit(50);
        assertEquals(150, accounts[accountCount].getBalance());
    }

    @Test
    public void testWithdraw() {
        accounts[accountCount] = new CheckingAccount(accountCount, 100);
        accounts[accountCount].withdraw(30);
        assertEquals(70, accounts[accountCount].getBalance());
    }

    @Test
    public void testOverdraftLimit() {
        accounts[accountCount] = new CheckingAccount(accountCount, 50);
        accounts[accountCount].withdraw(200);
        assertEquals(50, accounts[accountCount].getBalance()); // Overdraft Limit is 100
    }
    
    @Test
    public void testWithdrawlExceedsBalance() {
        accounts[accountCount] = new SavingsAccount(accountCount, 50);
        accounts[accountCount].withdraw(100);
        assertEquals(50, accounts[accountCount].getBalance()); // No overdraft on Savings
    }

    @Test
    public void testAccessExistingAccount() {
        accounts[accountCount] = new CheckingAccount(accountCount, 100);
        assertEquals(accountCount, accounts[accountCount].getId());
    }

    @Test
    public void testAccountLimit() {
        for (int i = 0; i < 100; i++) {
            accounts[i] = new CheckingAccount(i, 100);
        }
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            accounts[100] = new CheckingAccount(100, 100); // Exceeding limit
        });
    }
}
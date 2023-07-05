 /*
 Imagine you are designing a custom exception for handling insufficient funds during a transaction.
 How would you define and handle this custom exception in your code? Additionally, provide an example 
 of how you would use this custom exception to handle a scenario where a user attempts to withdraw an 
 amount greater than their account balance.
 
 */
 //code:
 
 // Custom exception class for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class with withdraw() method
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in the account.");
        }
        balance -= amount;
        System.out.println("Successfully withdrew $" + amount);
    }
}

// Example usage of the custom exception
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        try {
            double amountToWithdraw = 1500.0;
            account.withdraw(amountToWithdraw);
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}

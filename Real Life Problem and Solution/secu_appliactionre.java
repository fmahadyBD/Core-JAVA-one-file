/*
 You are working on developing a secure banking application that allows multiple
 users to perform transactions simultaneously. However, a security issue arises 
 when two or more users attempt to access the same account concurrently, potentially
 leading to incorrect balance updates and security vulnerabilities. Your task is to assess the problem 
 and propose a solution using Java's thread modifiers to ensure thread safety and data integrity.

code:
*/
//Author: Mahady Hasan Fahim:


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private double balance;
    private Lock accountLock;

    public BankAccount(double balance) {
        this.balance = balance;
        accountLock = new ReentrantLock();
    }

    public void deposit(double amount) {
        accountLock.lock();
        try {
            // Simulating a delay in processing the deposit
            Thread.sleep(100);

            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            accountLock.unlock();
        }
    }

    public void withdraw(double amount) {
        accountLock.lock();
        try {
            if (amount <= balance) {
                // Simulating a delay in processing the withdrawal
                Thread.sleep(100);

                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient funds. Balance: " + balance);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            accountLock.unlock();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        // Create multiple threads to perform transactions on the account
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(() -> {
                // Simulating concurrent transactions
                account.deposit(100);
                account.withdraw(200);
            });
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}

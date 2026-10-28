package org.example;

import java.util.ArrayList;

public class Main {
    static class BankAccount {
        String name;
        double balance;
        ArrayList<String> transactions = new ArrayList<>();

        BankAccount(String name, double balance) {
            this.name = name;
            this.balance = balance;
            transactions.add("Account opened with Rs. " + balance);
        }

        void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid deposit amount");
                return;
            }
            balance += amount;
            transactions.add("Deposited Rs. " + amount);
        }

        void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount");
            } else if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance -= amount;
                transactions.add("Withdrawn Rs. " + amount);
            }
        }

        void displayBalance() {
            System.out.println("Account Holder: " + name);
            System.out.println("Current Balance: Rs. " + balance);
        }

        void showTransactions() {
            System.out.println("\nTransaction History:");
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Anish", 5000);

        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(7000);
        account.displayBalance();
        account.showTransactions();
    }
}
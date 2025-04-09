/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atm.atmsystem;

/**
 *
 * @author bhuva
 */
import java.util.Scanner;

public class ATM {
    private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();
        Account acc = bank.getAccount(accNum);

        if (acc != null) {
            System.out.println("Welcome " + acc.getAccountNumber());
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + acc.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    double depAmount = scanner.nextDouble();
                    new Deposit(acc, depAmount).execute();
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    double wdAmount = scanner.nextDouble();
                    new Withdrawal(acc, wdAmount).execute();
                    break;
            }
        } else {
            System.out.println("Account not found.");
        }

        scanner.close();
    }
}


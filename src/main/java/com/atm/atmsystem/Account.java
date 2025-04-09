/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atm.atmsystem;

/**
 *
 * @author bhuva
 */
public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String number, String holder, double balance) {
        this.accountNumber = number;
        this.accountHolder = holder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}


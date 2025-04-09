/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atm.atmsystem;

/**
 *
 * @author bhuva
 */
public class Withdrawal extends Transaction {

    public Withdrawal(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Insufficient balance and account number.");
        }
    }
}

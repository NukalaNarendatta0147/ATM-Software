/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atm.atmsystem;

/**
 *
 * @author bhuva
 */
public class Deposit extends Transaction {

    public Deposit(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        account.deposit(amount);
        System.out.println("Deposit successful: " + amount);
    }
}


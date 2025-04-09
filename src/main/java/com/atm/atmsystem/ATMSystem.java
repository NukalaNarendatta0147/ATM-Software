/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.atm.atmsystem;

/**
 *
 * @author bhuva
 */
public class ATMSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("Global Bank");

        Account acc1 = new Account("1001", "Alice", 5000.0);
        Account acc2 = new Account("1002", "Bob", 3000.0);
        
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        ATM atm = new ATM(bank);
        atm.start();
    }
}


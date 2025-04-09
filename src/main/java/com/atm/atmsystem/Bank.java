/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atm.atmsystem;

/**
 *
 * @author bhuva
 */
import java.util.HashMap;

public class Bank {
    private String bankName;
    private HashMap<String, Account> accounts;

    public Bank(String name) {
        this.bankName = name;
        this.accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public String getBankName() {
        return bankName;
    }
}


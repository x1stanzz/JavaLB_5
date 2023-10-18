package org.example;

import org.exceptions.AccountNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {
    private List <BankAccount> accounts = new ArrayList<>();
    public void createAccount(String accountName, double initialDeposit){
        int accountNumber = generateAccountNumber();
        BankAccount account = new BankAccount(accountNumber, accountName, initialDeposit);
        accounts.add(account);
    }
    public BankAccount findAccount(int accountNumber){
        for(BankAccount account : accounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        throw new AccountNotFoundException("Account not found!");
    }

    public void transferMoney(int fromAccountNumber, int toAccountNumber, int amount){
        BankAccount fromAccount = findAccount(fromAccountNumber);
        BankAccount toAccount = findAccount(toAccountNumber);
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
    public int generateAccountNumber(){
        long currentTime = System.currentTimeMillis();
        Random random = new Random();
        int accountNumber = 10000000 + random.nextInt(90000000);
        return accountNumber;
    }
}

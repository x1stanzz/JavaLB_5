package org.Tests;

import org.example.Bank;
import org.example.BankAccount;
import org.exceptions.InsufficientFundsException;
import org.exceptions.NegativeAmountException;

public class WithdrawSuccess {
    public static void main(String args[]){
        Bank bank = new Bank();

        BankAccount account2 = bank.createAccount(19238473, "Diana Taylor", 720.0);

        System.out.println(account2.getAccountSummary());

        try {
            account2.withdraw(50);
        } catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        } catch(NegativeAmountException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operation completed/failed");
        }
        System.out.println(account2.getAccountSummary());
    }
}

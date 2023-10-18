package org.Tests;

import org.example.Bank;
import org.example.BankAccount;
import org.exceptions.AccountNotFoundException;
import org.exceptions.InsufficientFundsException;
import org.exceptions.NegativeAmountException;

public class DepositNegativeAmountException {
    public static void main(String args[]){
        Bank bank = new Bank();

        BankAccount account1 = bank.createAccount(72831803,"Dan Johnson", 350.0);

        System.out.println(account1.getAccountSummary());

        try {
            account1.deposit(-50);
        } catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        } catch(NegativeAmountException e){
            System.out.println(e.getMessage());
        } catch(AccountNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Operation completed/failed");
        }
        System.out.println(account1.getAccountSummary());
    }
}

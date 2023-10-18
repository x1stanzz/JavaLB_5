package org.example;
import org.exceptions.InsufficientFundsException;
import org.exceptions.NegativeAmountException;



public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;
    public BankAccount(int accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    public void deposit(double deposit){
        if(deposit < 0){
            throw new NegativeAmountException("Deposit cannot be a negative number!");
        }
        balance += deposit;
    }
    public void withdraw(double withdraw){
        if(withdraw < 0){
            throw new NegativeAmountException("Withdraw cannot be a negative number!");
        }
        if(withdraw > balance){
            throw new InsufficientFundsException("Insufficient funds in your account!");
        }
        balance -= withdraw;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountSummary(){
        return "Account number: " + accountNumber + ", Account name: " + accountName + ", Balance: " + balance;
    }

}

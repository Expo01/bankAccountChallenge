package com.company;

public class BankAccount {

    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int depositAmount) {
        accountBalance += depositAmount;
        System.out.println("your account balance is now " + accountBalance + " after deposit amount of " + depositAmount);
    }

    public void withdrawalFunds(int withdrawalAmount) {
        if (withdrawalAmount > accountBalance) {
            System.out.println("insufficient funds to withdraw " + withdrawalAmount + "dollars");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("your account balance is now " + accountBalance + " after withdrawal of " + withdrawalAmount + " dollars");
        }
    }

}

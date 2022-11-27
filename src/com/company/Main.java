package com.company;

public class Main {


    public static void main(String[] args) {

        BankAccount savings = new BankAccount();
        savings.setAccountBalance(100);
        System.out.println(savings.getAccountBalance());
        savings.depositFunds(100);
        savings.withdrawalFunds(200);
        savings.withdrawalFunds(  1);

    }

}

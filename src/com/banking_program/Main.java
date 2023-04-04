package com.banking_program;

public class Main {
    public static void main(String[] args) {

        Bank customer1 = new Bank("John Doe", 1234, 1_000_000);
        Bank customer2 = new Bank("Jane Smith", 5678, 5_000);
        Bank customer3 = new Bank("Keith Johnson", 9876, 9_000);
        Bank customer4 = new Bank();

        /*customer1.displayBalance(customer1.getBalance());
        customer1.welcome(customer1.getCustomerName());
        customer1.withdraw(customer1.getBalance());*/


        //customer4.userInfo();
        customer1.run();

    }
}


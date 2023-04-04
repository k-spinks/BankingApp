package com.banking_program;

import java.util.Scanner;

public class Bank {

    private String customerName;
    private int accountNumber;
    private double balance;
    private double amount;
    private final Scanner input = new Scanner(System.in);

    //Default constructor (no args)
    public Bank(){

    }

    public void run(){
        menu();
    }

    //Defined constructor
    public Bank(String customerName, int accountNumber, double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void menu(){
        System.out.println("""
                1) Check balance
                2) Deposit
                3) Withdraw
                4) Quit
                Input option:\s""");
        byte menuOption = input.nextByte();

        while(menuOption < 1 || menuOption > 4){
            System.out.println("Option does not exist");
            System.out.println("Input option: ");
            menuOption = input.nextByte();
        }

        while(menuOption != 4) {
        switch (menuOption) {
            case 1:
                displayBalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                welcome(getCustomerName());
                return;
            default:
                System.out.println("Error");
                return;
        }
            System.out.println("""
                1) Check balance
                2) Deposit
                3) Withdraw
                4) Quit
                Input option:\s""");
            menuOption = input.nextByte();
        }
    }

    //Welcome message to user
    public void welcome(String customerName){
        System.out.println("Thank you for your service " + customerName + "!");
    }

    public void userInfo(){
        System.out.print("Enter your name: ");
        setCustomerName(input.nextLine());
        System.out.println("You entered: " + this.getCustomerName());
    }

    //Displays user's balance
    public void /*double*/ displayBalance(){//double balance){
        System.out.println("Current balance : " + this.balance);
        //return this.balance;

    }


    //Method to withdraw money from account
    public void /*double*/ withdraw(){//double balance){
        System.out.print("Enter amount you wish to withdraw: ");
        this.amount = input.nextDouble();
        while(this.amount <= 0 || (this.balance - this.amount) < 0){
            System.out.println("Insufficient funds! Please try again");
            System.out.print("Enter amount you wish to withdraw: ");
            this.amount = input.nextDouble();
        }

        this.balance = this.balance - this.amount;

        System.out.println("New balance is: " + this.balance);
        //return balance - amount;

    }

    //Method to deposit money into account
    public void deposit(){
        System.out.print("Enter amount you wish to deposit: ");
        this.amount = input.nextDouble();
        while(this.amount <= 0){
            System.out.println("Deposit must be more than $0");
            System.out.print("Enter amount you wish to deposit: ");
            this.amount = input.nextDouble();
        }
        this.balance += this.amount;
        System.out.println("New balance is: " + this.balance);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


package com.adriankskaftun;

public class BankAccountInfo {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String emailAdress;
    private String phoneNumber;


    public BankAccountInfo(){
        this("567890", 0.00, "Default name", "Default adress", "Default phone");
        System.out.println("Empty constructor called");
    }
    public BankAccountInfo(String accountNumber, double balance, String customerName, String emailAdress, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAdress = emailAdress;
        this.phoneNumber = phoneNumber;
    }

    public BankAccountInfo(String customerName, String emailAdress, String phoneNumber) {
        this("99999", 100.55, customerName, emailAdress, phoneNumber);
        this.customerName = customerName;
        this.emailAdress = emailAdress;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdrawal(double withdrawal){
        if(this.balance - withdrawal < 0){
            System.out.println("Withdrawal of " + withdrawal + " is not processed. Current balance is " + this.balance);
        }else{
            this.balance -= withdrawal;
            System.out.println("Withdrawal of " + withdrawal + " processed. Remaining balance is: " + this.balance);
        }
    }
}

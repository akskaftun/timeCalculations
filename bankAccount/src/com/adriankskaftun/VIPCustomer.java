package com.adriankskaftun;

public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String emailAdress;

    public VIPCustomer(){
        this("Default name",0.00, "Default@mail.com");
    }

    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@mail.com");
    }

    public VIPCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}

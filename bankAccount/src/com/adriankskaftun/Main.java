package com.adriankskaftun;

public class Main {
    public static void main(String[] args) {
        BankAccountInfo firstAccount = new BankAccountInfo("12345", 2.50, "Tim", "Tim@mail.com", "1234588");
        System.out.println(firstAccount.getEmailAdress());
        firstAccount.setBalance(501);
        firstAccount.withdrawal(0.44);
        System.out.println(firstAccount.getBalance());
        BankAccountInfo secondAccount = new BankAccountInfo("Tim", "Tommy@mail.com", "1208372");
        System.out.println(secondAccount.getAccountNumber() + " name " + secondAccount.getCustomerName());
        VIPCustomer person1 = new VIPCustomer();
        System.out.println(person1.getName());

        VIPCustomer person2 = new VIPCustomer("Bob", 2300);

        System.out.println(person2.getName());

        VIPCustomer person3 = new VIPCustomer("Hon", 100, "eimrm@gmialc.om");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAdress());
    }
}

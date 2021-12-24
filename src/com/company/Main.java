package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("ING");

        bank.addBranch("Amsterdam");
        bank.addCustomer("Amsterdam", "Gersom", 100.00);
        bank.addCustomer("Amsterdam", "Mino Raiola", 50000000.00);
        bank.addBranch("Utrecht");
        bank.addCustomer("Utrecht", "Henkie", 12.50);

        bank.addCustomerTransaction("Amsterdam", "Gersom", 25.00);

        bank.listCustomers("Amsterdam", true);
    }
}

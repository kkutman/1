package java8.classes;

import java8.enums.Bank;

public class BankAccount {
    private Bank bankName;
    private double balance;
    private String cardNumber;
    private String password;

    public BankAccount(Bank bankName, double balance, String cardNumber, String password) {
        this.bankName = bankName;
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.password = password;
    }

    public Bank getBankName() {
        return bankName;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankName=" + bankName +
                ", balance=" + balance +
                ", cardNumber='" + cardNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

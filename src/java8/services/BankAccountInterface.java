package java8.services;

import java8.classes.BankAccount;
import java8.classes.Person;
import java8.enums.Bank;

public interface BankAccountInterface {
    String createBankAccount(BankAccount... bankAccount);
     BankAccount[] getAllBankAccount();
    double credit(Person person, Bank bank, double deposit, double summa) ;
}

package java8.services;

import java8.classes.BankAccount;
import java8.classes.Person;
import java8.classes.Terminal;
import java8.enums.Bank;

public interface TerminalInterface {
    String creatTerminal(Terminal... terminal);
    Terminal[] getAllTerminal();
    String transferToCard(Person person, String cardNumber, double summa);
    String transferToPhoneNumber(Person person, String phoneNumber, double summa);
}

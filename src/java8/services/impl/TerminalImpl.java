package java8.services.impl;

import java8.classes.Person;
import java8.classes.Terminal;
import java8.services.TerminalInterface;
/*
                people1 = new Person[person.length+getPeople().length];
                int index = 0;
                int index2 = 0;
                for (int i = 0; i < people1.length; i++) {
                    if (i<getPeople().length){
                        people1[i]=getPeople()[index];
                        index++;
                    }else {
                        people1[i]=getAllPeople()[index2];
                        index2++;
                    }
                }setPeople(people1);

 */

public class TerminalImpl implements TerminalInterface {
    private Terminal[] terminals;

    public Terminal[] getTerminals() {
        return terminals;
    }

    public void setTerminals(Terminal[] terminals) {
        this.terminals = terminals;
    }

    @Override
    public String creatTerminal(Terminal... terminal) {
        Terminal [] terminals;
        for(Terminal terminal1:terminal){
            if(getTerminals()==null){
                this.terminals=terminal;
            }else {
                terminals=new Terminal[terminal.length+ getTerminals().length];
                int index = 0;
                int index2 = 0;
                for (int i = 0; i < terminals.length; i++) {
                    if(i< getTerminals().length){
                        terminals[i]=getTerminals()[index];
                        index++;
                    }else {
                        terminals[i]=getTerminals()[index2];
                        index2++;
                    }

                }setTerminals(terminals);
            }

        }return "great";
    }

    @Override
    public Terminal[] getAllTerminal() {
        return getTerminals();
    }

    @Override
    public String transferToCard(Person person, String cardNumber, double summa) {
        if(cardNumber.equals(person.getBankAccount().getCardNumber())){
            return "Ваш баланс :"+(person.getBankAccount().getBalance()+summa);
        }
        return null;
    }

    @Override
    public String transferToPhoneNumber(Person person, String phoneNumber, double summa) {

        if (phoneNumber.equals(person.getPhoneNumber())){
            return "Ваш баланс :"+(person.getBankAccount().getBalance()+summa);
        }return null;
    }
}

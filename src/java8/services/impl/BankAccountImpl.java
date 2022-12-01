package java8.services.impl;

import java8.classes.BankAccount;
import java8.classes.Person;
import java8.enums.Bank;
import java8.services.BankAccountInterface;

public class BankAccountImpl implements BankAccountInterface {
    private BankAccount[] bankAccount;

    public BankAccountImpl() {

    }

    public BankAccount[] getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount[] bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String createBankAccount(BankAccount... bankAccount) {

        BankAccount [] bancAccountsQ;
        if(getBankAccount()==null){
            this.bankAccount=bankAccount;
        } else  {
            bancAccountsQ=new BankAccount[bankAccount.length+getBankAccount().length];
            int index = 0;
            int index2 = 0;
            for (int i = 0; i < bancAccountsQ.length; i++) {
                if(i<getBankAccount().length){
                    bancAccountsQ[i]=getBankAccount()[index];
                    index++;
                }else {
                    index = 0;
                    bancAccountsQ[i]=bankAccount[index2];
                    index2++;
                }
            }setBankAccount(bancAccountsQ);
        }return "Операция прошла успешно!";
    }

    @Override
    public BankAccount[] getAllBankAccount() {
        return getBankAccount();
    }

    @Override
    public double credit(Person person, Bank bank, double deposit, double summa) {
        double rezult = summa*deposit/summa;
        if(bank==Bank.AIYL_BANK){
            deposit = summa/10;
            return summa+deposit;
        } else if (bank==Bank.BAKAY_BANK) {
            deposit = summa/5;
            return summa+deposit;

        }else if (bank==Bank.KYRGYZSTAN_BANK) {
            deposit = summa/7;
            return summa+deposit;

        }else if (bank==Bank.OPTIMA_BANK) {
            deposit = summa/15;
            return summa+deposit;

        }else if (bank==Bank.RSK_BANK) {
            deposit = summa/20;
            return summa+deposit;
        }
        return 0;
    }
}

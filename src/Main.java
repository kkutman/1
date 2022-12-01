import java8.classes.BankAccount;
import java8.classes.Person;
import java8.classes.Terminal;
import java8.enums.Bank;
import java8.enums.Mobile;
import java8.services.impl.BankAccountImpl;
import java8.services.impl.PersonImpl;
import java8.services.impl.TerminalImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(Bank.AIYL_BANK,1000,"1","1");
        BankAccount bankAccount2 = new BankAccount(Bank.BAKAY_BANK,1000,"2","2");
        BankAccount bankAccount3 = new BankAccount(Bank.KYRGYZSTAN_BANK,1000,"3","3");
        BankAccount bankAccount4 = new BankAccount(Bank.RSK_BANK,1000,"4","4");
        BankAccount bankAccount5 = new BankAccount(Bank.OPTIMA_BANK,10000000,"5","5");
        BankAccount [] bankAccounts = {bankAccount1,bankAccount2,bankAccount3,bankAccount4,bankAccount5};

        Person person1 = new Person("K1","kutman","kkutman18%","7775","1",bankAccount1);
        Person person2 = new Person("K2","kutman","kkutman18%","777","1",bankAccount2);
        Person person3 = new Person("K3","kutman","kkutman18%","7776","1",bankAccount3);
        Person person4 = new Person("K4","kutman","kkutman18%","77","1",bankAccount4);
        Person person5 = new Person("K5","kutman","kkutman18%","7","1",bankAccount5);

        Terminal terminal1 = new Terminal(Mobile.BEELINE,"red");
        Terminal terminal2 = new Terminal(Mobile.MEGACOM,"red");
        Terminal terminal3 = new Terminal(Mobile.O,"red");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1:
                BankAccountImpl bankAccount = new BankAccountImpl();
                bankAccount.createBankAccount(bankAccount1,bankAccount2,bankAccount3);
                bankAccount.createBankAccount(bankAccount4,bankAccount5);
                System.out.println(Arrays.toString(bankAccount.getAllBankAccount()));
                System.out.print("kredit: ");
                double summa = scanner.nextDouble();
                System.out.println("vash kredit : "+bankAccount.credit(person1, Bank.AIYL_BANK, 0, summa));
                break;
            case 2:
                PersonImpl personImp = new PersonImpl();
                personImp.createPerson(person1,person2,person3);
                System.out.println(Arrays.toString(personImp.getAllPeople()));
                break;
            case 3:

                TerminalImpl terminal = new TerminalImpl();
                String name  = scanner.nextLine();
                System.out.println("card number");
                String cardNumber = scanner.nextLine();
                System.out.println("summa");
                double sum = scanner.nextDouble();
                System.out.println(terminal.transferToCard(person1, cardNumber, sum));
                break;
            default:
                System.err.println("ERROR");

        }



    }
}
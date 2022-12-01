package java8.classes;

public class Person {
    private String firstName;
    private String lastName;
    private String gmail;
    private String phoneNumber;
    private String password;
    private BankAccount bankAccount;

    public Person(String firstName, String lastName, String gmail, String phoneNumber, String password, BankAccount bankAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gmail = gmail;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.bankAccount = bankAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGmail() {
        return gmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gmail='" + gmail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", bankAccount=" + bankAccount +
                '}';
    }
}

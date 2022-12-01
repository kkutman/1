package java8.services;

import java8.classes.Person;

public interface PersonInterface {
    String createPerson(Person... person);
    Person[] getAllPeople();
}

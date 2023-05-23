package com.cbfacademy;
public class Person {
    final static String SPECIES = "Human";

    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getDetails() {
        return String.format(
            "My name is %s %s and I'm %s and %s", this.firstName, this.lastName, this.age, SPECIES
        );
    }
}

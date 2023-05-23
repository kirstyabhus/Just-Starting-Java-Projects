package com.cbfacademy;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // making a Person object using the Person class from our OTHER file !
        Person kirsty = new Person("Kirsty", "Abhus", 21);

        // Using the getDetails method we created in  the Person class (in our other file)
        System.out.println(kirsty.getDetails());
    }
}
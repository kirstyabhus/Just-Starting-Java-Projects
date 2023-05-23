package com.cbfacademy.Test;

import com.cbfacademy.Person;

public class Hello {
    public static void main(String[] args) {
        // created Person obejct, using Person class (its a different file)
        Person kirstyAbhus = new Person("Kirsty", "Abhus", 21);

        String kirstyAbhusDetails = kirstyAbhus.getDetails();

        System.out.println(kirstyAbhusDetails);
    }
}

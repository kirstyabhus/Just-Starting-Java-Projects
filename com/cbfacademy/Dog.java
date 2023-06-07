package com.cbfacademy;

public class Dog {
    String breed;
    int sizeCm;
    int age;
    String colour;

    public Dog(String breed, int sizeCm, int age, String colour) {
        this.breed = breed;
        this.sizeCm = sizeCm;
        this.age = age;
        this.colour = colour;
    }

    public static void main(String[] args) {
        Dog levi = new Dog("Doberman", 90, 5, "Black");
        System.out.println(levi.breed);
    }
}

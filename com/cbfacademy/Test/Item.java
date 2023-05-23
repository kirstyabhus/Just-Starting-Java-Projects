package com.cbfacademy.Test;

public class Item {
    double price;
    String name;

    // Constructor method
    public Item (double price, String name) {
        this.price = price;
        this.name = name;
    }

    public static void main(String[] args) {
        Item lemonade = new Item(0.65, "lemonade");
        Item orangeJuice = new Item(0.36, "orange juice");

        System.out.println(lemonade.name + " is £" + lemonade.price);
        System.out.println(orangeJuice.name);
    }
}

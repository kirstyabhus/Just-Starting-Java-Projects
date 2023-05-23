package com.cbfacademy.Test;

public class Store {
    String item;
    double price;

    public void set_value() {
        item = "coke";
        price = 0.5; 
    }

    public void get_value() {
        System.out.println(item + " is £" + price);
    }

    public static void main(String[] args) {
        Store coke = new Store();

        coke.set_value();
        coke.get_value();
        System.out.println(coke.item);
    }
}

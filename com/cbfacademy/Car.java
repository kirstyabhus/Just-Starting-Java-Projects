package com.cbfacademy;


/**
 * Car
 */
public class Car {
    String make;
    String model;
    int year;

    // constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    public static void main(String[] args) {
        Car volvo = new Car("volvo", "v40", 2012);
        Car porsche = new Car("porsche", "panamera", 2009);
        Car audi = new Car("audi", "A3", 2017);

        System.out.println(volvo.getYear());
    }
}
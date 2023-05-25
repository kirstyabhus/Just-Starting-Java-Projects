package com.cbfacademy.Test;
import java.util.HashMap;


public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Double> fruitStoreHashMap = new HashMap<>();

        fruitStoreHashMap.put("apple",4.2);
        fruitStoreHashMap.put("banana",2.7);
        fruitStoreHashMap.put("orange",1.73);
        fruitStoreHashMap.put("pineapple",9.32);

        // using containsKey()
        System.out.println("Apples are in stock: " + fruitStoreHashMap.containsKey("apple"));

        // using get() with if-else
        System.out.println("Bananas cost £" + fruitStoreHashMap.get("banana"));
        System.out.println("I have £3");
        if (fruitStoreHashMap.get("banana") > 3) {
            System.out.println("So I can't by a banana.");
        }else{
            System.out.println("So I can by a banana.");
        }

        // using isEmpty()
        boolean isStoreEmpty = fruitStoreHashMap.isEmpty();
        if (isStoreEmpty) {
            System.out.println("The store is empty");
        }else{
            System.out.println("The store is NOT empty");
        }
    }
}

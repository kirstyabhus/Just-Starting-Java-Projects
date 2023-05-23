package com.cbfacademy.Test;
import java.util.ArrayList;

/**
 * CollectionsTest
 */
public class CollectionsTest {

    public static void main(String[] args) {
        // create an empty list of strings Array List
        ArrayList<String> fruitList = new ArrayList<>();

        System.out.println(fruitList.size());
        fruitList.add("apple");
        System.out.println(fruitList.size());
        System.out.println(fruitList.get(0));

        fruitList.set(0,"orange");
        System.out.println(fruitList.get(0));

    }
}
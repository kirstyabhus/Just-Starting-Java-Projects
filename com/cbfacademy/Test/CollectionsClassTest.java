package com.cbfacademy.Test;
import java.util.Collections;
import java.util.ArrayList;

public class CollectionsClassTest {
    public static void main(String[] args) {
        ArrayList<Integer> integerArray = new ArrayList<>();

        integerArray.add(6);
        integerArray.add(7);
        integerArray.add(2);
        integerArray.add(0);
        integerArray.add(4);

        System.out.println(integerArray.toString());
        // sort ArrayList
        Collections.sort(integerArray);
        System.out.println(integerArray.toString());

        // min and max
        System.out.println(Collections.min(integerArray));
        System.out.println(Collections.max(integerArray));
    }
}

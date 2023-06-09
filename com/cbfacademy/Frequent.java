package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;


public class Frequent {
    public static void main(String[] args) {
        String[] names = new String[] {"Bob", "Alice", "Bob"};
        List<String> namesList = Arrays.asList(names);

        System.out.println(namesList);
        if (namesList.size() == 0) {
            System.out.println("");
        }

        HashMap<String, Integer> stringCount = new HashMap<>();

        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String.
        for (String s : namesList) {
            stringCount.compute(s, (key, val) -> (val == null) ? 1 : val+1);
        }
        
        // store the max value from the values in the count Map
        ArrayList<Integer> mapValues = new ArrayList<>(stringCount.values());
        // Integer maxValue = Collections.max(stringCount.values());
        Integer maxValue = Collections.max(mapValues);

        for (String s : namesList) {
            if (stringCount.get(s) == maxValue) {
                System.out.println(s);
                break;
            }
        }

        System.out.println(namesList.get(0));
    }
}

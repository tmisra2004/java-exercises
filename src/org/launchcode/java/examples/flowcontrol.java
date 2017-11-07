package org.launchcode.java.examples;


import java.util.HashMap;

public class flowcontrol {

    public static void main(String[] args)
    {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Tavish", 31);
        ages.put("Mike", 29);
        ages.put("LC", 4);
        System.out.println(ages);
        System.out.println(ages.get("Tavish"));
        System.out.println(ages.values());
    }
}

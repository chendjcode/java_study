package com.study;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Map<DataKey, Integer> hm = getAllData();
        DataKey dk = new DataKey("Pankaj", 1);
        System.out.println(dk.hashCode());
        Integer value = hm.get(dk);
        System.out.println(value);

        String s1 = new String("hello");
        System.out.println(s1.hashCode());
        String s2 = new String("hello");
        System.out.println(s2.hashCode());

    }

    private static Map<DataKey, Integer> getAllData() {
        Map<DataKey, Integer> hm = new HashMap<>();
        DataKey dk = new DataKey("Pankaj", 1);
        System.out.println(dk.hashCode());
        hm.put(dk, 10);
        return hm;
    }
}

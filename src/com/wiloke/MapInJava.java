package com.wiloke;

import java.util.*;

public class MapInJava {
    public static void list() {
        List<String> listUsers = new ArrayList<>();
        listUsers.add("Hello");
        listUsers.add("World");


        Collection<String> additionalUsers = new ArrayList<>();
        additionalUsers.add("Nguyen");
        additionalUsers.add("Duong");

        System.out.println(listUsers);
    }

    public static void asArrayListing() {
         List<String> list = Arrays.asList("Hello", "World");

        System.out.println(list);
    }

    public static void hashMap() {
        Map<String, String> myString = new HashMap<>();
        myString.put("hello", "Hello");
        myString.put("world", "World");

        Map<String, String> myList = new HashMap<>(myString);
        System.out.print("HashMap: ");
        System.out.println(myList);
        System.out.println(myList.get("hello"));
    }
}

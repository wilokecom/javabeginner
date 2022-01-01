package com.wiloke;

import java.util.*;

public class LearnAboutSet {
    public static void setBasic() {

        Collection<String> list1 = new ArrayList<>();
        list1.add("blue");
        list1.add("green");


        Collection<String> list2 = new ArrayList<>();
        list1.add("blue");
        list1.add("black");

        Collections.addAll(list2);

        Set<String> items = new HashSet<>(list1);

        System.out.println("This is my test:" + items);

        Set<String> items2 = new HashSet<>(Arrays.asList("blue", "green", "blue"));
        System.out.println("This is my second test: " + items2);
    }

    public static void intersection() {
        Set<String> item = new HashSet<>(Arrays.asList("green", "blue"));
        Set<String> item2 = new HashSet<>(Arrays.asList("green", "black"));

        item2.retainAll(item);

        System.out.println("Intersection with Set " + item2);
    }

    public static void union() {
        Set<String> item = new HashSet<>(Arrays.asList("green", "blue"));
        Set<String> item2 = new HashSet<>(Arrays.asList("green", "black"));

        item2.addAll(item);

        System.out.println("Union with Set " + item2);
    }
}

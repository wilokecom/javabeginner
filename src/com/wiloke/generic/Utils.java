package com.wiloke.generic;

public class Utils {
    // constraint
    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) > 0 ? first : second;
    }

    public static <K,V> void keyValue(K key, V value) {
        System.out.println(key+"="+value);
    }


    // class CAP#1 extends School{}
    public static void printStudent(GenericList<? super School> list) {
       list.addItem(new School("123"));
    }
}

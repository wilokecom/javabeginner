package com.wiloke.generic;

// Type Erasure
public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void addItem(T item) {
        this.items[count++] =  item;
    }

    public T getItem(int index) {
        return this.items[index];
    }
}

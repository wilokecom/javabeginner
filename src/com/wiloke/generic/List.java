package com.wiloke.generic;

public class List {
    public Object[] items = new Object[10];
    public int count;

    public void addItem(Object item) {
        // primitive || reference
        this.items[this.count++] = item;
    }

    public Object getItem(int index) {
        return this.items[index];
    }
}

package com.simplewrapper;

import java.util.LinkedHashSet;

public class LinkedHashSetWrapper<T> {

    // Internal LinkedHashSet
    private LinkedHashSet<T> set;

    // Constructor
    public LinkedHashSetWrapper() {
        set = new LinkedHashSet<>();
    }

    // Add element
    public boolean add(T element) {
        return set.add(element);
    }

    // Remove element
    public boolean remove(T element) {
        return set.remove(element);
    }

    // Check if element exists
    public boolean contains(T element) {
        return set.contains(element);
    }

    // Get size
    public int size() {
        return set.size();
    }

    // Check if empty
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Clear all elements
    public void clear() {
        set.clear();
    }

    // Display elements (maintains insertion order)
    public void display() {
        for (T item : set) {
            System.out.println(item);
        }
    }
}
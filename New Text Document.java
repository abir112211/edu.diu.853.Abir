package edu.diu.853.abir;

import java.util.LinkedHashSet;

public class LinkedHashSetWrapper<T> {

    
    private LinkedHashSet<T> set;

    
    public LinkedHashSetWrapper() {
        set = new LinkedHashSet<>();
    }

    
    public boolean add(T element) {
        return set.add(element);
    }

    
    public boolean remove(T element) {
        return set.remove(element);
    }

    
    public boolean contains(T element) {
        return set.contains(element);
    }

    
    public int size() {
        return set.size();
    }

    
    public boolean isEmpty() {
        return set.isEmpty();
    }

    
    public void clear() {
        set.clear();
    }

    
    public void display() {
        for (T item : set) {
            System.out.println(item);
        }
    }
}
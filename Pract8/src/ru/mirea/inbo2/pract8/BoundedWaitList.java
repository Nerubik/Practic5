package ru.mirea.inbo2.pract8;

import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    BoundedWaitList(Collection<E> c) {
        content.addAll(c);
    }

    int getCapacity() {
        return this.capacity;
    }

    public void add(E element) {
        if (content.size() <= capacity) {
            content.add(element);
        }
    }

    public String toString() {
        return "BoundedWaitList{" +
                "content=" + content +
                '}';
    }
}
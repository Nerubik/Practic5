package ru.mirea.inbo2.pract8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    WaitList() {
        content = new ConcurrentLinkedQueue();
    }

    WaitList(Collection<E> c) {
        content.addAll(c);
    }

    public void add(E element) {
        content.add(element);
    }

    public void remove(E element) {
        content.remove(element);
    }

    public boolean contains(E element) {
        return content.contains(element);
    }

    public boolean containsAll(Collection<E> element) {
        return content.contains(element);
    }

    public boolean isEmpty() {
        return content.peek() == null;
    }
}

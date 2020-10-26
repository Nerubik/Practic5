package ru.mirea.inbo2.pract8;

import java.util.Collection;

public class UnfairWaitList<E> extends WaitList<E> {

    UnfairWaitList() {

    }

    UnfairWaitList(Collection<E> c) {
        content.addAll(c);
    }

    public void remove(E element) {
        if (content.element() == element) {
            content.remove(element);
        }
    }

    public void add(E element) {
        content.add(element);
    }

    public void moveToBack(E element) {
        if (contains(element)) {
            remove(element);
            content.add(element);
        }
    }

    public String toString() {
        return "UnfairWaitList{" +
                "content=" + content +
                '}';
    }
}
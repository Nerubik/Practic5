package ru.mirea.inbo2.pract8;

import java.util.Collection;

public interface IWaitList<E> {
    void add(E element);

    void remove(E element);

    boolean contains(E element);

    boolean containsAll(Collection<E> element);

    boolean isEmpty();
}
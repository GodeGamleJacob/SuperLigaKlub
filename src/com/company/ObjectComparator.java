package com.company;

import java.util.Comparator;

public class ObjectComparator<E extends Comparator<E>> {
    public <E extends Comparable<E>> int compare(E e, E e1) {
        return e.compareTo(e1);
    }
}


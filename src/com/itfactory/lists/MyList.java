package com.itfactory.lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Ce ar insemna sa implementez eu lista din Java?
 * NU ESTE INDICAT!!!!! Folositi resursele din Java oferite
 * @param <K>
 */
public class MyList<K> implements List<K> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<K> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(K k) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends K> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends K> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public K get(int index) {
        return null;
    }

    @Override
    public K set(int index, K element) {
        return null;
    }

    @Override
    public void add(int index, K element) {

    }

    @Override
    public K remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<K> listIterator() {
        return null;
    }

    @Override
    public ListIterator<K> listIterator(int index) {
        return null;
    }

    @Override
    public List<K> subList(int fromIndex, int toIndex) {
        return null;
    }
}

package com.ds.collection.linkedlist;

import java.util.Iterator;

public class LinkedListM<E> implements Iterable<E> {
    private Node<E> first;
    private Node<E> last;
    private Integer length = 0;

    public void addAtIndex(Integer index, E value) {
        Node<E> result = geteNodePrevIndex(index);
        createNodeAfter(result, value);
        length++;
    }

    private Node<E> geteNodePrevIndex(Integer index) {
        Node<E> result = first;
        if (index < 0 || index > length) {
            throw new IllegalStateException();
        }
        if (index.equals(0)) {
            result = first;
        } else if (index.equals(length)) {
            result = last;
        } else {
            result = geteNodeBeforeIndex(index);
        }
        return result;
    }

    public void removeAtIndex(int index) {
        Node<E> result = geteNodePrevIndex(index);
        result.next = result.next.next;
        length--;
    }

    protected static class Node<E> {
        Node(E value) {
            this.value = value;
        }

        E value;
        Node<E> next;
    }

    public void add(E e) {
        createNode(e);
        length++;
    }

    public void addAtStart(E e) {
        createNodeAtStart(e);
        length++;
    }

    public Integer getLength() {
        return length;
    }

    private void createNode(E e) {
        Node<E> eNode = new Node<E>(e);
        if (first == null) {
            first = eNode;
            last = eNode;
        } else {
            last.next = eNode;
            last = eNode;
        }
    }

    private void createNodeAfter(Node<E> result, E e) {
        Node<E> eNode = new Node<E>(e);
        eNode.next = result.next;
        result.next = eNode;
    }

    private Node<E> geteNodeBeforeIndex(Integer index) {
        Node<E> result = first;
        while (index > 1) {
            index--;
            result = result.next;
        }
        return result;
    }

    private void createNodeAtStart(E e) {
        Node<E> eNode = new Node<E>(e);
        if (first == null) {
            first = eNode;
            last = eNode;
        } else {
            eNode.next = first;
            first = eNode;
        }
    }

    protected class ListIterator implements Iterator<E> {
        Node<E> nextNode = first;

        @Override
        public boolean hasNext() {
            return nextNode != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new IllegalStateException();
            }
            E value = nextNode.value;
            nextNode = nextNode.next;
            return value;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }
}

package com.ds.stack;

import com.ds.queue.DSFullException;

public class MyStackArrayImpl<E> implements MyStack<E> {
    private final E[] array;
    private int top = -1;

    public MyStackArrayImpl(int size) {
        array = (E[]) new Object[size];
    }

    @Override
    public E pop() {
        if(top == -1){
            return null;
        }
        return array[top--];
    }

    @Override
    public void push(E value) {
        if(top == array.length - 1){
            throw new DSFullException(" No space stack full");
        }
        array[++top] = value;
    }

    @Override
    public E peek() {
        if(top <= 0){
            return null;
        }
        return array[top];
    }
}

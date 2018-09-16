package com.ds.queue;

public class MyQueueArrayImpl<E> implements MyQueue<E>{
    private final E[] array;
    private int start = 0;
    private int end = 0;
    private int size = 0;

    public MyQueueArrayImpl(Integer size) {
        array = (E[]) new Object[size];
    }

    @Override
    public void enQueue(E element) {
        if(size >= array.length){
            throw new DSFullException(" No More space, DS is full");
        }
        array[end] = element;
        end = ++end % array.length;
        size++;
    }

    @Override
    public E deQueue() {
        if(size <=0 ){
            return null;
        }
        E element = array[start];
        start = ++start % array.length;
        size--;
        return element;
    }

    @Override
    public E peek() {
        if(size <=0 ){
            return null;
        }
        return array[start];
    }

}

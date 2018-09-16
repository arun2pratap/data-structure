package com.ds.queue;

public interface MyQueue<E> {
    void enQueue(E element);
    E deQueue();
    E peek();
}

package com.ds.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueArrayImplTest {

    @Test
    public void queueTest() {
        MyQueueArrayImpl<Integer> myQueueArray = new MyQueueArrayImpl(4);
        myQueueArray.enQueue(1);
        myQueueArray.enQueue(2);
        myQueueArray.enQueue(3);
        myQueueArray.enQueue(4);
        assertEquals(1, myQueueArray.deQueue().intValue());
        assertEquals(2, myQueueArray.peek().intValue());
        assertEquals(2, myQueueArray.deQueue().intValue());
        myQueueArray.enQueue(5);
        myQueueArray.enQueue(6);
        assertEquals(3, myQueueArray.peek().intValue());
        myQueueArray.deQueue();
        assertEquals(4, myQueueArray.peek().intValue());
        myQueueArray.deQueue();
        assertEquals(5, myQueueArray.peek().intValue());
        assertEquals(5, myQueueArray.deQueue().intValue());
        assertEquals(6, myQueueArray.deQueue().intValue());
        assertEquals(null, myQueueArray.deQueue());

    }
}
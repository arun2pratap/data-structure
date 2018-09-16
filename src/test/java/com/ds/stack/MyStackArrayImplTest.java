package com.ds.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackArrayImplTest {

    @Test
    public void testStack() {
        MyStackArrayImpl<Integer> stack = new MyStackArrayImpl(4);
        assertEquals(null, stack.pop());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(4, stack.pop().intValue());
        assertEquals(3, stack.peek().intValue());
    }
}
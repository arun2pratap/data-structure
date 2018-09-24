package com.ds.series;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacci() {
        int fibonacci = Fibonacci.fibonacci(3);
        System.out.println(fibonacci);
    }

    @Test
    public void fibonacciArr() {
        int[] fibonacci = Fibonacci.fibArray(7);
        System.out.println(fibonacci);
    }
}
package com.ds.search.binary;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchImplTest {

    @Test
    public void testBinarySearch(){
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(2, BinarySearchImpl.binarySearch(integers, 3));
        assertEquals(8, BinarySearchImpl.binarySearch(integers, 9));
        assertEquals(0, BinarySearchImpl.binarySearch(integers, 1));
        assertEquals(-1, BinarySearchImpl.binarySearch(integers, 11));
    }
}

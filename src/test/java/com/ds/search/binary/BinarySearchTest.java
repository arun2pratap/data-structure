package com.ds.search.binary;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearch(){
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(2, BinarySearch.binarySearch(integers, 3));
        assertEquals(8, BinarySearch.binarySearch(integers, 9));
        assertEquals(0, BinarySearch.binarySearch(integers, 1));
        assertEquals(-1, BinarySearch.binarySearch(integers, 11));

        assertEquals(2, BinarySearch.binarySearchLoop(integers, 3));
        assertEquals(8, BinarySearch.binarySearchLoop(integers, 9));
        assertEquals(0, BinarySearch.binarySearchLoop(integers, 1));
        assertEquals(-1, BinarySearch.binarySearchLoop(integers, 11));
    }
}

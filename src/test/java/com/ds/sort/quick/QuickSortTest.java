package com.ds.sort.quick;

import org.junit.Test;

import static java.util.Arrays.*;

/**
 * Created by Neo on 7/2/2017.
 */
public class QuickSortTest {
    @Test
    public void testBubbleSort() throws Exception {
        Integer[] integers = new Integer[]{2,9,-4,0,73,42,3,32,3,99,76,12,123,111,91,34,89,8,1,34,23,33,11,4,67};
        QuickSort.sort(integers);
        stream(integers).forEach(integer -> System.out.println(integer));
    }
}

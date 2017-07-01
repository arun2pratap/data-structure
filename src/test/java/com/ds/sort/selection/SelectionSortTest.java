package com.ds.sort.selection;

import org.junit.Test;

/**
 * Created by Neo on 7/2/2017.
 */
public class SelectionSortTest {
    @Test
    public void testSelectionSort(){
        Integer[] integers = new Integer[]{2,3,4,9,1,5,7,9,2,1};
        SelectionSort.sort(integers);
        System.out.println(integers);
    }
}

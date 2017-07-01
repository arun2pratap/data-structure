package com.ds.search.binary;

/**
 * Created by Neo on 7/1/2017.
 */
public class BinarySearchImpl {

    private static <E extends Comparable<E>,
            F extends E> int binarySearch( E[] sortedValues,
                                           F valueToSearch, int start, int end) {
        if(start >= end){
            return -1;
        }
        int midIndex = (start + end )/2;
        int comparison = valueToSearch.compareTo(sortedValues[midIndex]);
        if(comparison == 0){
            return midIndex;
        }else if(comparison > 0){
            return binarySearch(sortedValues, valueToSearch, midIndex + 1, end);
        }else {
            return binarySearch(sortedValues, valueToSearch,start, midIndex);
        }
    }

    public static <E extends Comparable<E>, F extends E> int binarySearch(
            E[] sortedValues, F valueToSearch) {
        return binarySearch(sortedValues, valueToSearch, 0, sortedValues.length);
    }
}

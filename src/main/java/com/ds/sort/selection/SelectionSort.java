package com.ds.sort.selection;

/**
 * Created by Neo on 7/2/2017.
 */
public class SelectionSort {

    public static <E extends Comparable<E>> E[] sort(E[] valuesToSort) {
        sort(valuesToSort, 0);
        return valuesToSort;
    }

    private static <E extends Comparable<E>> void sort(E[] valuesToSort, int start) {
        if (valuesToSort.length - 1 == start) {
            return;
        }
        int indexMin = findMin(valuesToSort, start);
        swap(valuesToSort, start, indexMin);
        sort(valuesToSort, start + 1);
    }

    private static <E extends Comparable<E>> void swap(E[] valuesToSort, int start, int indexMin) {
        if(start == indexMin){
            return;
        }
        E temp = valuesToSort[start];
        valuesToSort[start] = valuesToSort[indexMin];
        valuesToSort[indexMin] = temp;
    }

    private static <E extends Comparable<E>> int findMin(E[] valuesToSort, int start) {
        if (valuesToSort.length - 1 == start) {
            return start;
        }
        int indexRest = findMin(valuesToSort, start + 1);
        return valuesToSort[indexRest].compareTo(valuesToSort[start]) < 0 ? indexRest : start;
    }
}

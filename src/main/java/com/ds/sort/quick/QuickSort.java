package com.ds.sort.quick;

public class QuickSort {

    public static<E extends Comparable<E>> void sort(E[] elements) {
        sort(elements,0,elements.length-1);
    }

    private static<E extends Comparable<E>> void sort(E[] elements, int start, int end) {
        if(start>=end){
            return;
        }
        int pivot = pivot(elements, start, end, 1);
        sort(elements,pivot+1,end);
        sort(elements,start,pivot-1);
    }

    private static<E extends Comparable<E>> int pivot(E[] elements, int start, int end,int direction) {
        if (start>=end){
            return start;
        }
        if(elements[start].compareTo(elements[end]) > 0){
            swap(elements,start,end);
            direction = direction*-1;
        }
        if(direction > 0) {
            start++;
        }else {
            end--;
        }
        return pivot(elements, start, end, direction);
    }

    private static<E extends Comparable<E>> void swap(E[] elements, int start, int end) {
        if(start == end){
            return;
        }
        E temp = elements[start];
        elements[start] = elements[end];
        elements[end] = temp;
    }
}

package com.ds.collection.linkedlist;

import org.junit.Test;

/**
 * Created by Neo on 7/6/2017.
 */
public class LinkedListTest {
    @Test
    public void testLinkedListInsertion() {
        LinkedListM<Integer> linkedListM = new LinkedListM<>();
        linkedListM.addAtStart(1);
        linkedListM.addAtStart(2);
        linkedListM.addAtStart(3);
        linkedListM.addAtStart(4);
        linkedListM.addAtStart(5);
        linkedListM.addAtStart(6);
        linkedListM.addAtStart(7);
        for (Integer integer : linkedListM) {
            System.out.println(integer);
        }
    }

    @Test
    public void testInsertAtArbitraryIndex() {
        LinkedListM<Integer> linkedListM = new LinkedListM<>();
        linkedListM.addAtStart(1);
        linkedListM.addAtStart(2);
        linkedListM.addAtStart(3);
        linkedListM.addAtStart(4);
        linkedListM.addAtStart(5);
        linkedListM.addAtStart(6);
        linkedListM.addAtStart(7);
        linkedListM.addAtIndex(3,99);
        linkedListM.addAtIndex(8,777);
        for (Integer integer : linkedListM) {
            System.out.println(integer);
        }
    }

    @Test
    public void testRemoveAtIndex() {
        LinkedListM<Integer> linkedListM = new LinkedListM<>();
        linkedListM.addAtStart(1);
        linkedListM.addAtStart(2);
        linkedListM.addAtStart(3);
        linkedListM.addAtStart(4);
        linkedListM.addAtStart(5);
        linkedListM.addAtStart(6);
        linkedListM.addAtStart(7);
        linkedListM.removeAtIndex(4);
        for (Integer integer : linkedListM) {
            System.out.println(integer);
        }
    }
}

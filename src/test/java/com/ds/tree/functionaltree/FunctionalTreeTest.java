package com.ds.tree.functionaltree;

import com.ds.collection.linkedlist.LinkedListM;
import org.junit.Test;

/**
 * Created by Neo on 7/8/2017.
 */
public class FunctionalTreeTest {
    @Test
    public void testDepthFirstTraverse() {
        String s= "aa";
        System.out.println("s" + s.hashCode());
        s = s + "bb";
        System.out.println("s" + s.hashCode());

        FunctionalTree<Integer> functionalTree0 = new FunctionalTree<>(null, 0);
        FunctionalTree<Integer> functionalTree1 = new FunctionalTree<>(null, 1);
        LinkedListM<FunctionalTree<Integer>> children1 = new LinkedListM<>();
        children1.add(functionalTree0);children1.add(functionalTree1);
        FunctionalTree<Integer> functionalTree2 = new FunctionalTree<>(children1, 2);
        FunctionalTree<Integer> functionalTree3 = new FunctionalTree<>(null, 3);
        LinkedListM<FunctionalTree<Integer>> children2 = new LinkedListM<>();
        children2.add(functionalTree2);children2.add(functionalTree3);
        FunctionalTree<Integer> functionalTree4 = new FunctionalTree<>(children2, 4);
        FunctionalTree<Integer> functionalTree5 = new FunctionalTree<>(null, 5);
        LinkedListM<FunctionalTree<Integer>> children3 = new LinkedListM<>();
        children3.add(functionalTree4);children3.add(functionalTree5);
        FunctionalTree<Integer> functionalTree6 = new FunctionalTree<>(children3, 6);
        functionalTree6.traverseDepthFirst();
    }
}

package com.ds.tree.functionaltree;

import com.ds.collection.linkedlist.LinkedListM;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Neo on 7/8/2017.
 */
public class FunctionalTree<T> {
    private T value;
    private LinkedListM<FunctionalTree<T>> children;
    public FunctionalTree(LinkedListM<FunctionalTree<T>> children, T value){
        this.children = children;
        this.value = value;
    }

    public void traverseDepthFirst(){
        System.out.println(value);
        if(children == null){return;}
        for (FunctionalTree<T> child : children) {
            child.traverseDepthFirst();
        }
    }
}

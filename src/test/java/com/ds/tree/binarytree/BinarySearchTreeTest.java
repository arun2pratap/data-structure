package com.ds.tree.binarytree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Neo on 7/13/2017.
 */
public class BinarySearchTreeTest {
    @Test
    public void testBinarySearchTree() throws Exception {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.addNode(23);
        binarySearchTree.addNode(33);
        binarySearchTree.addNode(13);
        binarySearchTree.addNode(3);
        binarySearchTree.addNode(9);
        binarySearchTree.addNode(6);
        binarySearchTree.addNode(30);
        binarySearchTree.addNode(33);
        binarySearchTree.inOrderTraverse(binarySearchTree.getRoot());
    }

    @Test
    public void testBinarySearchTreeSearch() throws Exception {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.addNode(23);
        binarySearchTree.addNode(33);
        binarySearchTree.addNode(13);
        binarySearchTree.addNode(3);
        binarySearchTree.addNode(9);
        binarySearchTree.addNode(6);
        binarySearchTree.addNode(30);
        binarySearchTree.addNode(33);
        BinaryTree.Node<Integer> node = binarySearchTree.search(33);
        assertEquals(33, node.value.intValue());
    }
}

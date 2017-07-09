package com.ds.tree.binarytree;

import org.junit.Test;

/**
 * Created by Neo on 7/9/2017.
 */
public class BinaryTreeTest {
    @Test
    public void testBinaryTree() throws Exception {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.addRoot(1);
        BinaryTree.Node<Integer> root = binaryTree.getRoot();
        BinaryTree.Node<Integer> node3 = binaryTree.addChild(root, 3, true);
        BinaryTree.Node<Integer> node2 = binaryTree.addChild(root, 2, false);
        binaryTree.addChild(node3, 7, true);
        binaryTree.addChild(node3, 6, false);
        BinaryTree.Node<Integer> node5 = binaryTree.addChild(node2, 5, true);
        BinaryTree.Node<Integer> node4 = binaryTree.addChild(node2, 4, false);
        binaryTree.addChild(node5, 10, false);
        binaryTree.addChild(node4, 9, true);
        binaryTree.addChild(node4, 8, false);
        binaryTree.preOrderTraverse(binaryTree.getRoot());
        System.out.println("  -preOrderTraversal");
        binaryTree.inOrderTraverse(binaryTree.getRoot());
        System.out.println("  -InOrderTraversal");
        binaryTree.postOrderTraverse(binaryTree.getRoot());
        System.out.println("  -postOrderTraversal");


        binaryTree.traverseOnlyLeft(binaryTree.getRoot());
        System.out.println("  -postOrderTraversal");
    }
}

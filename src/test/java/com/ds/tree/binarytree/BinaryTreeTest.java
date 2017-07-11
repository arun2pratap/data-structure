package com.ds.tree.binarytree;

import org.junit.Test;

/**
 * Created by Neo on 7/9/2017.
 */
public class BinaryTreeTest {
    @Test
    public void testBinaryTreeTraversalRecursive() throws Exception {
        BinaryTree<Integer> binaryTree = getIntegerBinaryTree();
        binaryTree.preOrderTraverse(binaryTree.getRoot());
        System.out.println("  -preOrderTraversal");
        binaryTree.inOrderTraverse(binaryTree.getRoot());
        System.out.println("  -InOrderTraversal");
        binaryTree.postOrderTraverse(binaryTree.getRoot());
        System.out.println("  -postOrderTraversal");

        binaryTree.traverseOnlyLeft(binaryTree.getRoot());
        System.out.println("  -traverseOnlyLeft");
    }

    @Test
    public void testBinaryTreeTraversalNonRecursive(){
        BinaryTree<Integer> integerBinaryTree = getIntegerBinaryTree();
        integerBinaryTree.preOrderTraverseNonRecursive(integerBinaryTree.getRoot());
        System.out.println("  -preOrderTraversal Non-recursive");
        integerBinaryTree.inOrderTraverseNonRecursive(integerBinaryTree.getRoot());
        System.out.println("  -IN_OrderTraversal Non-recursive");
        integerBinaryTree.postOrderTraverseNonRecursive(integerBinaryTree.getRoot());
        System.out.println("  -IN_OrderTraversal Non-recursive");
    }

    private BinaryTree<Integer> getIntegerBinaryTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.addRoot(1);
        BinaryTree.Node<Integer> root = binaryTree.getRoot();
        BinaryTree.Node<Integer> node3 = root.right = new BinaryTree.Node<>(3);
        BinaryTree.Node<Integer> node2 = root.left = new BinaryTree.Node<>(2);
        node3.right = new BinaryTree.Node<>(7);
        node3.left = new BinaryTree.Node<>(6);
        BinaryTree.Node<Integer> node5 = node2.right = new BinaryTree.Node<>(5);
        BinaryTree.Node<Integer> node4 = node2.left = new BinaryTree.Node<>(4);
        node5.left = new BinaryTree.Node<>(10);
        node4.right = new BinaryTree.Node<>(9);
        node4.left = new BinaryTree.Node<>(8);
        return binaryTree;
    }

}

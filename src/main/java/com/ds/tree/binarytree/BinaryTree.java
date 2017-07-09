package com.ds.tree.binarytree;

public class BinaryTree<T> {

    private Node<T> root;

    public void inOrderTraverse(Node<T> node) {
        if(node == null){
            return;
        }
        inOrderTraverse(node.left);
        System.out.print("  " + node.value);
        inOrderTraverse(node.right);
    }

    public void preOrderTraverse(Node<T> node) {
        if(node == null){
            return;
        }
        System.out.print("  " + node.value);
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    public void postOrderTraverse(Node<T> node) {
        if(node == null){
            return;
        }
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.print("  " + node.value);
    }

    public static class Node<T> {
        T value;
        private Node<T> left;
        private Node<T> right;
        private Node<T> parent;
        private BinaryTree<T> containerTree;

        public Node(Node<T> parent, BinaryTree<T> containerTree, T value) {
            this.parent = parent;
            this.containerTree = containerTree;
            this.value = value;
        }
    }

    public void addRoot(T value) {
        root = new Node<>(null, this, value);
    }

    public Node<T> getRoot() {
        return root;
    }

    public Node<T> addChild(Node<T> parent, T value, boolean isRight) {
        if(parent == null){
            throw new NullPointerException("Cannot add node to null parent");
        }else if(parent.containerTree != this){
            throw new IllegalArgumentException
                    ("Parent does not belong to this tree");
        }
        Node<T> node = new Node<>(parent,this,value);
        if(isRight) parent.right = node; else parent.left = node;
        return node;
    }

    public Node<T> addChildLeft(Node<T> parent, T value){
        return addChild(parent, value, true);
    }

    public Node<T> addChildRight(Node<T> parent, T value){
        return addChild(parent, value, false);
    }

}

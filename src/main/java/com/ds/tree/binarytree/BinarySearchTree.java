package com.ds.tree.binarytree;

/**
 * Created by Neo on 7/13/2017.
 */
public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
    public void addNode(T value) {
        Node<T> root = getRoot();
        if (root == null) {
            addRoot(value);
            return;
        }
        addNode(value, root);
    }

    private void addNode(T value, Node<T> node) {
        int compareTo = node.value.compareTo(value);
        if (compareTo > 0) {
            if (node.left == null) {
                node.left = new Node<>(value);
            } else {
                addNode(value, node.left);
            }
        } else {
            if (node.right == null) {
                node.right = new Node<>(value);
            } else {
                addNode(value, node.right);
            }
        }
    }

    public Node<T> search(T value) {
        Node<T> root = getRoot();
        if (root == null) {
            return null;
        }
        return search(value, root);
    }

    private Node<T> search(T value, Node<T> node) {
        if(node == null){
            return null;
        }
        int compareTo = node.value.compareTo(value);
        if(compareTo == 0){
            return node;
        }else if(compareTo > 0){
            return search(value,node.left);
        }else {
            return search(value,node.right);
        }
    }
}

package com.task.solution;

public class BST {
    public Boolean isBST(Node root, Integer minVal, Integer maxVal) {
        if (null == root)
            return true;
        if (root.data <= minVal || root.data >= maxVal) return false;

        return isBST(root.left, minVal, root.data) && isBST(root.right, root.data, maxVal);
    }
}

class Node {
    int data;
    Node left, right, next;

    public Node(int data) {
        this.data = data;
    }
}

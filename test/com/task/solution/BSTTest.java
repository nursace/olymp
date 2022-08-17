package com.task.solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class BSTTest {

    @Test
    public void isBST() {
        var solver = new BST();
        var root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        assertTrue(solver.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

    }
}
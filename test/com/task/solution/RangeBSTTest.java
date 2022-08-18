package com.task.solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class RangeBSTTest {

    @Test
    public void dfs() {
        int[] res = {8, 10, 12, 15, 16, 18, 19, 20, 25, 30};
        Node node = new Node(15);
        node.left = new Node(10);
        node.left.left = new Node(8);
        node.left.right = new Node(12);
        node.right = new Node(20);
        node.right.left = new Node(18);
        node.right.right = new Node(25);
        node.right.left.left = new Node(16);
        node.right.left.right = new Node(19);
        node.right.right.right = new Node(30);

        var solver = new RangeBST();

        solver.dfs(node, 8, 30);

        assertEquals(res.length, solver.list.size());
        solver.list.forEach(it -> System.out.print(it + " "));
        System.out.println();

        for (int i = 0; i < solver.list.size(); i++) {
            assertEquals(res[i], solver.list.get(i));
        }
    }
}
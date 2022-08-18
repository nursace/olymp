package com.task.solution;

import org.junit.Test;

import static org.junit.Assert.*;


public class LinkedListSumTest {

    @Test
    public void sum_ok() {
        var solver = new LinkedListSum();
        int[] res = {0, 3, 5, 8};
        var l1 = new Node(6);
        l1.next = new Node(7);
        l1.next.next = new Node(8);

        var l2 = new Node(4);
        l2.next = new Node(5);
        l2.next.next = new Node(6);
        l2.next.next.next = new Node(7);

        var sum = solver.sum(l1, l2);

        for (int i = 0; i < 4; i++) {
            assertEquals(res[i], sum.data);
            sum = sum.next;
        }
    }
}
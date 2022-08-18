package com.task.solution;

public class LinkedListSum {

    public Node sum(Node l1, Node l2) {

        var dummyHead = new Node(0);
        var curr = dummyHead;

        int carry = 0;
        while (null != l1 || null != l2 || carry != 0) {

            int x = null == l1 ? 0 : l1.data;
            int y = null == l2 ? 0 : l2.data;

            int sum = carry + x + y;
            carry = sum / 10;

            curr.next = new Node(sum % 10);
            curr = curr.next;

            if (null != l1)
                l1 = l1.next;
            if (null != l2)
                l2 = l2.next;
        }
        return dummyHead.next;
    }

}

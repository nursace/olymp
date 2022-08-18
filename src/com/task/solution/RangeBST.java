package com.task.solution;

import java.util.ArrayList;
import java.util.List;

public class RangeBST {

    List list = new ArrayList<Integer>();
    public void dfs(Node root, int lo, int hi) {

        if (null == root) return;

        if (lo < root.data) {
            dfs(root.left, lo, hi);
        }

        if (lo <= root.data && hi >= root.data) {
            list.add(root.data);
        }

        if (hi > root.data) {
            dfs(root.right, lo, hi);
        }


    }
}

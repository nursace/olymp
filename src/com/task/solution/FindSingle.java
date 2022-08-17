package com.task.solution;

public class FindSingle {
    int arr[];

    public FindSingle(int[] arr) {
        this.arr = arr;
    }

    public int solve() {
        int single = arr[0];
        for (int i = 1; i < arr.length; i++) {
            single ^= arr[i];
        }
        return single;
    }
}

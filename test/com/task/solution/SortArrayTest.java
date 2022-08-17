package com.task.solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayTest {

    @Test
    public void sort() {
        int[] arr = {3, 0, 3, 3, 2, 1, 2, 1, 0};
        int[] sortedArr = {0, 0, 1, 1, 2, 2, 3, 3, 3};

        var solver = new SortArray(arr, 4);
        solver.sort();

        for (int i = 0; i < arr.length; i++) {
            assertEquals(sortedArr[i], arr[i]);
        }
    }
}
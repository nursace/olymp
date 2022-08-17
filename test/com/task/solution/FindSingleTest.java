package com.task.solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindSingleTest {

    @Test
    public void solve() {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        var solver = new FindSingle(arr);

        assertEquals(3, solver.solve());
    }
}
package com.task.solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedParenthesesTest {

    @Test
    public void solve() {
        var solver = new BalancedParentheses();

        assertTrue(solver.solve("((()))"));
        assertFalse(solver.solve("(()"));
        assertFalse(solver.solve("((("));
        assertFalse(solver.solve(")))"));
        assertTrue(solver.solve(""));
    }
}
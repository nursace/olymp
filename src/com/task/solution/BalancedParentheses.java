package com.task.solution;

import java.util.Stack;

public class BalancedParentheses {
    public boolean solve(String s) {
        Stack<Character> stack = new Stack<>();
        for (var c : s.toCharArray()) {
            if (stack.empty() || c == '(') {
                stack.push(c);
            } else if (c == ')' && stack.peek().equals('(')) {
                stack.pop();
            }
        }
        return stack.empty();
    }
}

package com.example.mvc_demo.algorithm.stack;

import java.util.Stack;

/**
 * 有效的括号
 *
 * @author zhangkun.d
 */
public class ValidParentTheses {

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if ((s.length() & 1) == 1) {
            return false;
        }

        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.empty()) {
                stack.push(arr[i]);
            } else {
                if (arr[i] == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(arr[i]);
                    }
                } else if (arr[i] == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.push(arr[i]);
                    }
                } else if (arr[i] == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.push(arr[i]);
                    }
                } else {
                    stack.push(arr[i]);
                }
            }
        }

        return stack.empty();
    }
}

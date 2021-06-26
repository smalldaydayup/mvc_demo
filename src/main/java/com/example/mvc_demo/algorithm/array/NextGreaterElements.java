package com.example.mvc_demo.algorithm.array;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author zhangkun.d
 */
public class NextGreaterElements {
    public static void main(String[] args) {
        int[] arr = {1,2,1};

        int[] ret = nextGreaterElements(arr);
        System.out.println();
    }

    public static int[] nextGreaterElements(int[] nums) {
        if (nums == null) {
            return null;
        }

        int[] ret = new int[nums.length];
        Arrays.fill(ret, -1);

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> indexStack = new Stack<>();

        stack.push(nums[0]);
        indexStack.push(0);

        for (int i = 1; i < nums.length * 2; i++) {
            int idx = i % nums.length;
            while (!stack.empty() && nums[idx] > stack.peek()) {
                stack.pop();
                int needK = indexStack.pop();
                ret[needK] = nums[idx];
            }

            stack.push(nums[idx]);
            indexStack.push(idx);
        }

        return ret;
    }


}

package com.example.mvc_demo.algorithm.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ValidBST {

    public static void main(String[] args) {
        ValidBST va =  new ValidBST();
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(1);
        node.left = node1;

        System.out.println(Integer.MIN_VALUE);

        System.out.println(va.isValidBST(node));
    }

    public boolean isValidBST(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        Stack<Integer> stack =  new Stack<>();
        middSort(root, stack);

        int f = stack.pop();
        while (!stack.empty()) {
            int s = stack.pop();
            if (f <= s) {
                return false;
            }
            f = s;
        }

        return true;
    }

    public void middSort(TreeNode root, Stack<Integer> stack ) {
        if (root == null) {
            return;
        }

        middSort(root.left, stack);

        stack.push(root.val);

        middSort(root.right, stack);
    }
}

class TreeNode {
    public int val;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode left;
    public TreeNode right;

    public static TreeNode buildTreeNode(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        TreeNode head = new TreeNode(arr[0]);
        List<TreeNode> highLevel = new LinkedList<>();
        highLevel.add(head);
        List<TreeNode> lowLevel = new LinkedList<>();
        for (int i = 1; i < arr.length; i += 2) {
            TreeNode cur = highLevel.remove(0);
            if (cur == null) {
                lowLevel.add(null);
                lowLevel.add(null);
            } else {
                if (arr[i] != null) {
                    cur.left = new TreeNode(arr[i]);
                    lowLevel.add(cur.left);
                }else {
                    lowLevel.add(null);
                }
                if (i < (arr.length -1) && arr[i+ 1] != null ) {
                    cur.right = new TreeNode(arr[i + 1]);
                    lowLevel.add(cur.right);
                } else {
                    lowLevel.add(null);
                }
            }

            if (highLevel.size() == 0) {

                List<TreeNode> tmp = highLevel;
                highLevel = lowLevel;
                lowLevel = tmp;
            }
        }

        return head;

    }
}

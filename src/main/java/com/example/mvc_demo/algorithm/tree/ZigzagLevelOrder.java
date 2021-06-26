package com.example.mvc_demo.algorithm.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

/**
 * @author zhangkun.d
 */
public class ZigzagLevelOrder {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.left = node2;
        node1.right = node3;

        node3.left = node4;
        node3.right = node5;

        List<List<Integer>> ret = zigzagLevelOrder(node1);

        System.out.println(ret.size());
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> allList = new LinkedList<>();


        if (root == null) {
            return allList;
        }

        Stack<TreeNode> cur = new Stack<>();
        cur.push(root);
        int curLevel = 1;

        while (!cur.empty()) {
            List<Integer> tmp = new LinkedList<>();

            Stack<TreeNode> suc = new Stack<>();

            while (!cur.empty()) {
                TreeNode node = cur.pop();
                tmp.add(node.val);

                if ((curLevel % 2) == 0) {
                    Optional.ofNullable(node.right).ifPresent(suc::push);
                    Optional.ofNullable(node.left).ifPresent(suc::push);
                } else {
                    Optional.ofNullable(node.left).ifPresent(suc::push);
                    Optional.ofNullable(node.right).ifPresent(suc::push);
                }
            }

            curLevel ++;

            allList.add(tmp);

            cur = suc;
        }

        return allList;
    }


}

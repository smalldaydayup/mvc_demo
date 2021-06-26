package com.example.mvc_demo.algorithm.tree;

/**
 * 二叉树的最大路径和
 *
 * @author zhangkun.d
 */
public class MaxPathSum {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{-10,9,20,null,null,15,7};
        TreeNode node = TreeNode.buildTreeNode(arr);
        System.out.println(new MaxPathSum().maxPathSum(node));
    }

    public int maxValue = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        deepPath(root);

        return maxValue;
    }

    public int deepPath(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(deepPath(root.left), 0);
        int right = Math.max(deepPath(root.right), 0);

        int cur = root.val + left + right;
        maxValue = Math.max(cur, maxValue);
        return root.val + Math.max(left, right);
    }


}

package com.example.mvc_demo.algorithm.base;

import java.math.BigDecimal;

/**
 * @author zhangkun.d
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public static void main(String[] args) {

        System.out.println(getNum(80));
        String str = getNum(80);
        char[] arr = str.toCharArray();
        int cur = arr.length -1;
        int sum = 0;

        while (cur >= 0 && arr[cur] == '0') {
            sum ++;
            cur --;
        }

        System.out.println(sum);
    }

    public static String getNum(int n) {
        BigDecimal bigDecimal = new BigDecimal(1);
        for (int i = 1; i<= n ; i++) {
            bigDecimal = bigDecimal.multiply(new BigDecimal(i));
        }

        return bigDecimal.toPlainString();
    }

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode buildNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;

        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
        }

        return head;
    }
}

package com.example.mvc_demo.algorithm.list;

import com.example.mvc_demo.algorithm.base.ListNode;

/**
 * @author zhangkun.d
 */
public class ReverseKGroup {

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }

        int curIndex = 1;

        ListNode cur = head;
        ListNode next = head;
        ListNode root = new ListNode();
        ListNode real = root;
        while (cur != null) {
            
            while (next != null && (curIndex % k) != 0) {
                curIndex ++;
                next = next.next;
            }
            
            if (next != null) {
                ListNode cur1 = next.next;
                next.next = null;

                ListNode t = reverseList(cur);
                root.next = t;
                root = cur;

                cur = cur1;
                next = cur;
                curIndex ++;
            } else {
                root.next = cur;
                cur = null;
            }
        }

        return real.next;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode q = p.next;


        while (q != null && q.next != null) {
            ListNode r = q.next;
            q.next = p;
            p = q;
            q = r;
        }

        if (q != null) {
            q.next = p;
            head.next = null;
            return q;
        }

        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode node =  reverseKGroup(node1, 3);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }
}

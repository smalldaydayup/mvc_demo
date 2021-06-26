package com.example.mvc_demo.algorithm.list;

import com.example.mvc_demo.algorithm.base.ListNode;

import java.util.Arrays;

/**
 * @author zhangkun.d
 */
public class MergeKLists {
    public static void main(String[] args) {
        int[] arr1 =  {1,4,5};
        int[] arr2 =  {1,3,4};
        int[] arr3 =  {2,6};
        int[] arr4 = {3,8};
        ListNode[] listNodes = new ListNode[4];
        listNodes[0] = ListNode.buildNode(arr1);
        listNodes[1] = ListNode.buildNode(arr2);
        listNodes[2] = ListNode.buildNode(arr3);
        listNodes[3] = ListNode.buildNode(arr4);
        
        ListNode head = new MergeKLists().mergeKListsV2(listNodes);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        
    }

    public ListNode mergeKListsV2(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        if (lists.length == 1) {
            return lists[0];
        }

        if (lists.length == 2) {
            return mergeTwo(lists[0], lists[1]);
        }
        
        int mid = (lists.length -1) / 2;



        
        return mergeTwo(mergeKListsV2(Arrays.copyOfRange(lists, 0, mid + 1)),mergeKListsV2(Arrays.copyOfRange(lists, mid + 1, lists.length)) );
    }

    public ListNode mergeTwo(ListNode node1, ListNode node2) {
        ListNode head = new ListNode();
        ListNode cur = head;

        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                cur.next = node1;
                node1 = node1.next;
            } else {
                cur.next = node2;
                node2 = node2.next;
            }
            cur = cur.next;
        }

        if (node1 != null) {
            cur.next = node1;
        }

        if (node2 != null) {
            cur.next = node2;
        }

        return head.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        
        ListNode head = new ListNode();
        ListNode cur = head;

        while (!allEmpty(lists)) {
            int index = findMinIndex(lists);
            ListNode node = lists[index];
            lists[index] = node.next;
            node.next = null;

            cur.next = node;
            cur = cur.next;
        }

        return head.next;
    }

    public boolean allEmpty(ListNode[] lists) {
        for (ListNode node: lists) {
            if (node != null) {
                return false;
            }
        }

        return true;
    }

    public int findMinIndex(ListNode[] lists) {
        int index = -1;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null && lists[i].val < min) {
                min = lists[i].val;
                index = i;
            }
        }

        return index;
    }
}

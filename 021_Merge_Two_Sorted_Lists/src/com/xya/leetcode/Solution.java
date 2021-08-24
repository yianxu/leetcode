package com.xya.leetcode;

public class Solution {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node4 = new ListNode(4);

        ListNode node11 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node44 = new ListNode(4);


        node1.next = node2;
        node2.next = node4;
        node4.next = null;

        node11.next = node3;
        node3.next = node44;
        node44.next = null;

        mergeTwoLists(node1,node11);
    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            int a = l1.val;
            int b = l2.val;
            ListNode head;

            if (a <= b) {
                head = l1;
                l1 = l1.next;
            } else {
                head = l2;
                l2 = l2.next;
            }
            ListNode afterNode = head;
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    afterNode.next = l1;
                    l1 = l1.next;
                } else {
                    afterNode.next = l2;
                    l2 = l2.next;
                }
                afterNode = afterNode.next;
            }
            if (l1 != null) {
                afterNode.next = l1;
            }
            if (l2 != null) {
                afterNode.next = l2;
            }
            return head;
        }
        if (null != l1) {
            return l1;
        }
        if(null != l2){
            return l2;
        }
       return null;
    }
}

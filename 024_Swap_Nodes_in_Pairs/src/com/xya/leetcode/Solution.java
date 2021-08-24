package com.xya.leetcode;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 * 示例 2：
 * <p>
 * 输入：head = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：head = [1]
 * 输出：[1]
 */
public class Solution {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        swapPairs(node1);

    }


    public static ListNode swapPairs(ListNode head) {
        if (null == head || head.next == null) {
            return head;
        }
        ListNode node1 = head;
        ListNode node2 = head.next;
        ListNode node = node2;

        while (null != node1 && node2 != null) {
            node1.next = node2.next;
            node2.next = node1;

            ListNode temp = node1;

            node1 = node1.next;
            if (node1 != null) {
                node2 = node1.next;
                if (node2 != null) {
                    temp.next = node2;
                } else {
                    temp.next = node1;
                }
            }
        }
        return node;
    }
}

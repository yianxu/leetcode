package com.xya.leetcode;
/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 *
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 *
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) throws Exception {
        ListNode node = head;
        ListNode startNode = head;
        int len = 0 ;
        while(startNode!=null){
            len ++ ;
            startNode = startNode.next;
        }
        if(n > len){
            throw new Exception("");
        }

        int index = len - n + 1;

        if(index == 1){
            node = node.next;
            head.next = null;
        }else{
            ListNode curNode = head;
            int num = 0;
            while(num < (index-1)){
                curNode = curNode.next;
                num ++;
            }
            curNode.next = curNode.next.next;
        }
        return node;
    }
}

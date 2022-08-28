package com.LinkedList;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 19
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //设预先指针 pre 的下一个节点指向 head
        ListNode prev = new ListNode(0);
        prev.next = head;
        //让快慢指针指向prev
        ListNode fast = prev,slow = prev;
        //快指针先移动n步
        while(n != 0){
            fast=fast.next;
            n--;
        }
        //快慢指针共同移动，此时两者之间的距离为n,当快指针到链表尾部时，慢指针恰好
        //在倒数第n个节点，因为要删除该节点，所以要移动到该节点的前一个才能删除，
        //所以循环结束条件为 start.next != null
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        //因为 head 有可能是被删掉的点，所以删除后返回 pre.next，
        return prev.next;

    }
}

package com.LinkedList;

import com.LC206.ListNode;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 2
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);//预先指针
        ListNode cur = pre;
        int carry = 0;//进位
        while(l1 != null || l2 != null){
            int x = l1 == null ? 0 :l1.val;
            int y = l2 == null ? 0 :l2.val;
            int sum = x + y + carry;

            carry = sum / 10 ;
            sum = sum % 10;
            cur.next = new ListNode(sum);//添加单个节点
            cur = cur.next;//cur后移
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry == 1){
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}

package main.java.com.反转链表;

import main.java.com.util.ListNode;

public class main {

    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head.next;
        ListNode temp = null;
        while (cur != null){
            temp = cur.next;
            cur = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}

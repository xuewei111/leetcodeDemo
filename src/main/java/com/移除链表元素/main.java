package main.java.com.移除链表元素;

import main.java.com.util.ListNode;

public class main {

    public static void main(String[] args) {
//        [1,2,6,3,4,5,6]
//        6
        int [] arr = new int[]{1,2,6,3,4,5,6};
        ListNode head = new ListNode();
        // 保留头节点
        ListNode copyHead = null;

        for (int i = 0; i < arr.length-1; i++) {
            ListNode curListNode = new ListNode();

            head.val = arr[i];
            head.next = curListNode;
            if(i == 0) {
                copyHead = head;
            }
            head = curListNode;
        }
        ListNode node = removeElements(copyHead, 6);
        System.out.println(node.val);

    }

    public static ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return head;
        }

        // 设置一个虚拟头节点
        ListNode dummy = new ListNode(-1, head);

        ListNode per = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                per.next = cur.next;
            } else {
                per = cur;
            }

            cur = cur.next;
        }
        return dummy.next;
    }
}

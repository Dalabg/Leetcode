package Coding_Caprice.linkedlist;

import Coding_Caprice.linkedlist.getlinkedlist.ListNode;

public class desc_node_delete_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 1;
        ListNode right = head;
        while(right.next!=null){
            if(i==n){
                break;
            }
            i++;
            right=right.next;
        }
        if(right.next==null&&i==n){
            head = head.next;
            return head;
        }
        ListNode left = head;
        ListNode temp = left;
        while(right.next!=null){
            temp = left;
            left = left.next;
            right= right.next;
        }
        temp.next = left.next;
        return head;
    }
}

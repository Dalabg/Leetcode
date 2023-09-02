package Coding_Caprice.linkedlist;

import Coding_Caprice.linkedlist.getlinkedlist.ListNode;

public class desc_node_delete_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 1;
        ListNode right = head;
        if(n==1){
            ListNode temp = right;
            while(right.next!=null){
                temp = right;
                right=right.next;
            }
            temp.next=null;
            return head;
        }
        while(right.next!=null&&i<n){
            i++;
            right=right.next;
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

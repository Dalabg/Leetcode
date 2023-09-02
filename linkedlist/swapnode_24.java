package Coding_Caprice.linkedlist;


import Coding_Caprice.linkedlist.getlinkedlist.ListNode;

public class swapnode_24 {
    public static ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode left = head;
        head = left.next;
        left.next = head.next;
        head.next = left;
        while(left.next != null && left.next.next !=null){
            ListNode right = left.next.next;
            ListNode temp = left.next;
            left.next = right;
            temp.next = right.next;
            right.next = temp;
            left = temp;
        }
        return head;
    }
}

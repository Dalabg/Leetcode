package Coding_Caprice.linkedlist.getlinkedlist;

public class listconstructor {
    public static ListNode linkedlist(int[] a){
        ListNode head = new ListNode();
        if(a.length!=0){
            head.val=a[0];
            ListNode tail = head;
            if(a.length>1){
                for (int i = 1; i < a.length; i++) {
                    ListNode temp = new ListNode(a[i]);
                    tail.next=temp;
                    tail=temp;
                }
            }
        }
        return head;
    }
}

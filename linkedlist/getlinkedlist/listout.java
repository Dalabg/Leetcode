package Coding_Caprice.linkedlist.getlinkedlist;

public class listout {
    public static void lout(ListNode head) {
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}

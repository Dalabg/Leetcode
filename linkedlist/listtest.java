package Coding_Caprice.linkedlist;

import Coding_Caprice.linkedlist.getlinkedlist.*;

import java.util.Scanner;

public class listtest {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        // 构建list
        int[]a={1,2,3,4,5,6};
        ListNode head = listconstructor.linkedlist(a);

        // 题
        ListNode res = swapnode_24.swapPairs(head);


        // 输出结果
        listout.lout(res);
    }
}

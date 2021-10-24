package com.company.circularLL;

import com.company.linkedlists.LinkedListUtility;

public class DeleteKthNode {

    public static CircularLLNode deleteFirstNode(CircularLLNode head){
        return DeleteHead.deleteFirst(head);
    }

    public static CircularLLNode deleteKthNode(CircularLLNode head, int position){
        if (position == 1){
            return deleteFirstNode(head);
        }
        CircularLLNode headNew = head;
        for (int i = 0; i < position - 2; i++){
            headNew = headNew.getNext();
        }
        System.out.println(headNew);
        headNew.setNext(headNew.getNext().getNext());
        return head;
    }

    public static void main(String[] args) {
        CircularLLNode head = CLLUtility.createCLL(new int[]{1, 2, 3, 4, 5});
        head = deleteKthNode(head, 5);
        TraverseCLL.traverseCLL(head);
        System.out.println(head);
        System.out.println(head.getNext());
        System.out.println(head.getNext().getNext());
        System.out.println(head.getNext().getNext().getNext());
        System.out.println(head.getNext().getNext().getNext().getNext());
        System.out.println(head.getNext().getNext().getNext().getNext().getNext());
    }

}

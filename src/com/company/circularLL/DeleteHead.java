package com.company.circularLL;

public class DeleteHead {

    public static CircularLLNode deleteFirst(CircularLLNode head){
        if (head == null || head.getNext() == head){
            return null;
        }
        CircularLLNode temp = head.getNext();
        head.setNext(temp.getNext());
        head.setData(temp.getData());
        return head;
    }

    public static void main(String[] args) {
        CircularLLNode head = CLLUtility.createCLL(new int[]{1, 2});
        head = deleteFirst(head);
        TraverseCLL.traverseCLL(head);
    }

}

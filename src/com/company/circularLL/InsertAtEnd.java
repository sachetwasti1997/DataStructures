package com.company.circularLL;

public class InsertAtEnd {

    public static CircularLLNode insertAtEnd(CircularLLNode head, int data){
        if (head == null){
            return new CircularLLNode(data);
        }
        CircularLLNode temp = new CircularLLNode(data);
        temp.setNext(head.getNext());
        head.setNext(temp);
        int t = temp.getData();
        temp.setData(head.getData());
        head.setData(t);
        return temp;
    }

    public static void main(String[] args) {
        CircularLLNode head = CLLUtility.createCLL(new int[]{1, 2, 3, 4, 5});
        head = insertAtEnd(head, 45);
        TraverseCLL.traverseCLL(head);
    }

}

package com.company.circularLL;

public class InsertAtBegin {

    public static CircularLLNode insertAtBegin(CircularLLNode head, int data){
        if (head == null){
            return new CircularLLNode(data);
        }
        CircularLLNode newNode = new CircularLLNode(data);
        newNode.setNext(head.getNext());
        head.setNext(newNode);
        int t = newNode.getData();
        newNode.setData(head.getData());
        head.setData(t);
        return head;
    }

    public static void main(String[] args) {
        CircularLLNode node = CLLUtility.createCLL(new int[]{1, 2, 3, 4, 5});
        node = insertAtBegin(node, 33);
        TraverseCLL.traverseCLL(node);
    }

}

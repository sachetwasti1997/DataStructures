package com.company.linkedlists;

public class InsertAtBeginning {

    public static LinkedListNode insertAtStart(int data, LinkedListNode head){
        LinkedListNode node = new LinkedListNode(data);
        node.setNext(head);
        return node;
    }

    public static void main(String[] args) {
        LinkedListNode head = null;/*LinkedListUtility.createLinkedList(new int[]{1, 5, 2, 7});*/
        head = insertAtStart(12, head);
        head = insertAtStart(10, head);
        TraverseLinkedList.traverseLinkedList(head);
    }

}

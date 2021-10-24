package com.company.doublylinkedlist;

public class InsertAtBegin {

    public static DoublyLinkedListNode insertAtBegin(int data, DoublyLinkedListNode head){
        if (head == null){
            head = new DoublyLinkedListNode(data);
            return head;
        }
        DoublyLinkedListNode temp = new DoublyLinkedListNode(data);
        temp.setNext(head);
        head.setPrevious(temp);
        return temp;
    }

    public static void main(String[] args) {
        DoublyLinkedListNode head = DoublyLinkedListUtility.createDLL(new int[]{1, 23, 4, 3, 2});
        head = insertAtBegin(0, head);
        TraverseDLL.traverseDLL(head);
    }

}

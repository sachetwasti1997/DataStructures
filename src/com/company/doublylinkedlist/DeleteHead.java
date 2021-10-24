package com.company.doublylinkedlist;

public class DeleteHead {

    public static DoublyLinkedListNode deleteHead(DoublyLinkedListNode head){
        if (head == null||head.getNext() == null){
            return null;
        }
        DoublyLinkedListNode temp = head;
        head = head.getNext();
        temp.setNext(null);
        head.setPrevious(null);
        return head;
    }

    public static void main(String[] args) {
        DoublyLinkedListNode head = DoublyLinkedListUtility.createDLL(new int[]{1, 2, 3, 4, 5});
        head = deleteHead(head);
        TraverseDLL.traverseDLL(head);
    }

}

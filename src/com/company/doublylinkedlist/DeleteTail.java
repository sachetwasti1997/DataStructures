package com.company.doublylinkedlist;

import com.company.linkedlists.LinkedListNode;

public class DeleteTail {

    public static DoublyLinkedListNode deleteLast(DoublyLinkedListNode head){
        if (head == null || head.getNext() == null){
            return null;
        }
        while (head.getNext().getNext() != null){
            head = head.getNext();
        }
        DoublyLinkedListNode temp = head.getNext();
        temp.setPrevious(null);
        head.setNext(null);
        return head;
    }

    public static void main(String[] args) {
        DoublyLinkedListNode head = DoublyLinkedListUtility.createDLL(new int[]{1, 2, 3, 4, 5});
        deleteLast(head);
        TraverseDLL.traverseDLL(head);
    }

}

package com.company.linkedlists;

public class DeleteLast {

    public static LinkedListNode deleteLast(LinkedListNode head){
        if (head == null || head.getNext() == null){
            return null;
        }
        LinkedListNode temp = head;
        while (temp.getNext().getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(null);
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode head = null/*LinkedListUtility.createLinkedList(new int[]{1})*/;
        head = deleteLast(head);
        TraverseLinkedList.traverseLinkedList(head);
    }

}

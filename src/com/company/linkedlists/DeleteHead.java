package com.company.linkedlists;

public class DeleteHead {

    public static LinkedListNode deleteHead(LinkedListNode head){
        if (head == null || head.getNext() == null){
            head = null;
        }
        else {
            head = head.getNext();
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode head = LinkedListUtility.createLinkedList(new int[]{1, 56, 12, 4, 5});
        head = deleteHead(head);
        TraverseLinkedList.traverseLinkedList(head);
    }

}

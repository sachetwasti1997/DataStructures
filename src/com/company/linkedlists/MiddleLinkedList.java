package com.company.linkedlists;

public class MiddleLinkedList {

    public static LinkedListNode findMiddle(LinkedListNode head){
        if (head == null){
            return null;
        }
        if (head.getNext() == null){
            return head;
        }
        LinkedListNode temp = head, next = head;
        while (next != null && next.getNext() != null){
            temp = temp.getNext();
            next = next.getNext().getNext();
        }
        return temp;
    }

    public static void main(String[] args) {
        LinkedListNode head = LinkedListUtility.createLinkedList(new int[]{1, 2, 3, 4, 6});
        LinkedListNode middleNode = findMiddle(head);
        System.out.println(middleNode);
    }

}

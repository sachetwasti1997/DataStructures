package com.company.doublylinkedlist;

public class ReverseDLL {

    public static DoublyLinkedListNode reverseDll(DoublyLinkedListNode head){
        if (head == null){
            return null;
        }
        DoublyLinkedListNode temp = head.getNext(), beforeHead = null;
        while (temp != null){
            head.setNext(beforeHead);
            head.setPrevious(temp);
            beforeHead = head;
            head = head.getPrevious();
            temp = temp.getNext();
        }
        head.setNext(beforeHead);
        head.setPrevious(null);
        return head;
    }

    public static void main(String[] args) {
        DoublyLinkedListNode head = DoublyLinkedListUtility.createDLL(new int[]{10, 12, 14, 56, 2});
        head = reverseDll(head);
        TraverseDLL.traverseDLL(head);
    }

}

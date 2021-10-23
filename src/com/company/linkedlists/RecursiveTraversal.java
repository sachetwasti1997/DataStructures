package com.company.linkedlists;

public class RecursiveTraversal {

    public static void traverseLinkedList(LinkedListNode head){
        if (head == null){
            System.out.print("null");
            return;
        }
        System.out.print(head.getData()+" @-->");
        traverseLinkedList(head.getNext());
    }

    public static void main(String[] args) {
        LinkedListNode head = LinkedListUtility.createLinkedList(new int[]{12, 3, 5, 17, 18});
        traverseLinkedList(head);
    }

}

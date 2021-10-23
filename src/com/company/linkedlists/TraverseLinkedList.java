package com.company.linkedlists;

public class TraverseLinkedList {

    public static void traverseLinkedList(LinkedListNode head){
        while (head != null){
            System.out.print(head.getData()+" @-->");
            head = head.getNext();
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 4, 13, 14};
        LinkedListNode head = LinkedListUtility.createLinkedList(arr);
        traverseLinkedList(head);
    }

}

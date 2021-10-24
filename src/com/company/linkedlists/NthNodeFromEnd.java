package com.company.linkedlists;

public class NthNodeFromEnd {

    public static LinkedListNode nthNodeFromEnd(LinkedListNode head, int position){
        LinkedListNode temp = head;
        for (int i = 0; i < position ; i++){
            temp = temp.getNext();
        }
        while (temp != null){
            head = head.getNext();
            temp = temp.getNext();
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode node = LinkedListUtility.createLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7});
        node = nthNodeFromEnd(node, 3);
        System.out.println(node);
    }

}

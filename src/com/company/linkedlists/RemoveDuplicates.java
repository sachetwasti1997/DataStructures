package com.company.linkedlists;

public class RemoveDuplicates {

    public static LinkedListNode removeDuplicates(LinkedListNode head){
        if (head == null || head.getNext() == null){
            return head;
        }
        LinkedListNode curr = head;
        while (curr != null && curr.getNext() != null){
            if (curr.getData() == curr.getNext().getData()){
                curr.setNext(curr.getNext().getNext());
            }else {
                curr = curr.getNext();
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode head = LinkedListUtility.createLinkedList(new int[]{1, 2, 3, 3, 3, 4, 5});
        head = removeDuplicates(head);
        TraverseLinkedList.traverseLinkedList(head);
    }

}

package com.company.linkedlists;

import com.company.linkedlists.LinkedListNode;
import com.company.linkedlists.LinkedListUtility;

public class SortedInsert {

    public static LinkedListNode sortedInsert(LinkedListNode head, int data){
        if(head == null){
            return new LinkedListNode(data);
        }
        LinkedListNode node = new LinkedListNode(data);
        LinkedListNode headNew = head;
        while (head.getNext() != null){
            if (head.getNext().getData() >= data){
                node.setNext(head.getNext());
                head.setNext(node);
                break;
            }
            head = head.getNext();
        }
        if (head.getNext() == null){
            node.setNext(null);
            head.setNext(node);
        }
        return headNew;
    }

    public static void main(String[] args) {
        LinkedListNode head = LinkedListUtility.createLinkedList(new int[]{1, 2, 3, 4, 6});
        head = sortedInsert(head, 5);
        head = sortedInsert(head, 7);
        TraverseLinkedList.traverseLinkedList(head);
    }

}

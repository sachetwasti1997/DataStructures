package com.company.doublylinkedlist;

public class InsertAtEnd {

    public static DoublyLinkedListNode insertAtEnd(DoublyLinkedListNode node, int data){
        if (node == null){
            node = new DoublyLinkedListNode(data);
            return node;
        }
        DoublyLinkedListNode head = node;
        while (node.getNext() != null){
            node = node.getNext();
        }
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        newNode.setPrevious(node);
        node.setNext(newNode);
        return head;
    }

    public static void main(String[] args) {
        DoublyLinkedListNode head = DoublyLinkedListUtility.createDLL(new int[]{1, 2, 3, 4, 5});
        insertAtEnd(head, 17);
        TraverseDLL.traverseDLL(head);
    }

}

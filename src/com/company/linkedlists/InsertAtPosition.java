package com.company.linkedlists;

public class InsertAtPosition {

    public static LinkedListNode insertAtPosition(LinkedListNode head, int data, int position){
        if (head == null){
            return null;
        }
        LinkedListNode temp = new LinkedListNode(data);
        if (position == 1){
            temp.setNext(head);
            head = temp;
        }else {
            LinkedListNode str = head;
            int i;
            for (i = 0; i < position - 2 && str != null; i++) {
                str = str.getNext();
            }
            if (str == null){
                return head;
            }
            temp.setNext(str.getNext());
            str.setNext(temp);
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode head = LinkedListUtility.createLinkedList(new int[]{12, 3, 44, 5, 15});
        head = insertAtPosition(head, 2, 6);
        TraverseLinkedList.traverseLinkedList(head);
    }

}

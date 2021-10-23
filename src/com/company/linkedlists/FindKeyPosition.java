package com.company.linkedlists;

public class FindKeyPosition {

    public static int findPosition(int key, LinkedListNode head){
        if (head == null){
            return -1;
        }
        int i = 1;
        while (head != null){
            if (head.getData() == key){
                return i;
            }
            i++;
            head = head.getNext();
        }
        return -1;
    }

    public static void main(String[] args) {

        LinkedListNode head = LinkedListUtility.createLinkedList(new int[]{12, 14, 7, 8, 9});
        int position = findPosition(14, head);
        System.out.println(position);
    }

}

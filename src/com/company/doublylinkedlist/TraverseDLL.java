package com.company.doublylinkedlist;

public class TraverseDLL {

    public static void traverseDLL(DoublyLinkedListNode head){
        DoublyLinkedListNode temp = null ;
        while (head != null){
            System.out.print(head.getData()+" @<-->");
            if (head.getNext() == null)temp = head;
            head = head.getNext();
        }
        System.out.print("null");
        System.out.println();
        while (temp!= null){
            System.out.print(temp.getData()+" @<-->");
            temp = temp.getPrevious();
        }
        System.out.println("null");
    }

}

package com.company.doublylinkedlist;

public class DoublyLinkedListUtility {

    public static DoublyLinkedListNode createDLL(int[] arr){
        DoublyLinkedListNode temp = null, head = null;
        for (int i=0; i< arr.length; i++){
            if (i == 0){
                head = new DoublyLinkedListNode(arr[i]);
                temp = head;
            }else{
                DoublyLinkedListNode newNode = new DoublyLinkedListNode(arr[i]);
                temp.setNext(newNode);
                newNode.setPrevious(temp);
                temp = newNode;
            }
        }
        return head;
    }

}

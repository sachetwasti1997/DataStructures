package com.company.linkedlists;

public class LinkedListUtility {

    public static LinkedListNode createLinkedList(int[] arr){
        LinkedListNode node=null, temp = null;
        for (int i=0; i< arr.length; i++){
            if (i == 0){
                node = new LinkedListNode(arr[i]);
                temp = node;
            }else{
                temp.setNext(new LinkedListNode(arr[i]));
                temp = temp.getNext();
            }
        }
        return node;
    }

}

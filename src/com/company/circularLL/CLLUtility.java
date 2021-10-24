package com.company.circularLL;

public class CLLUtility {

    public static CircularLLNode createCLL(int[] arr){
        CircularLLNode head = null, temp = null;
        for (int i=0; i< arr.length; i++){
            if (head == null){
                head = new CircularLLNode(arr[i]);
                temp = head;
            }else {
                CircularLLNode newNode = new CircularLLNode(arr[i]);
                temp.setNext(newNode);
                newNode.setNext(head);
                temp = newNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        CircularLLNode head = createCLL(new int[]{1, 2, 3, 4, 5});
        System.out.println(head);
        System.out.println(head.getNext());
        System.out.println(head.getNext().getNext());
        System.out.println(head.getNext().getNext().getNext());
        System.out.println(head.getNext().getNext().getNext().getNext());
        System.out.println(head.getNext().getNext().getNext().getNext().getNext());
        System.out.println(head.getNext().getNext().getNext().getNext().getNext().getNext());
        System.out.println(head.getNext().getNext().getNext().getNext().getNext().getNext().getNext());
        System.out.println(head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext());
        System.out.println(head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext());
    }

}

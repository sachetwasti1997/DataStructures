package com.company.circularLL;

public class TraverseCLL {

    public static void traverseCLL(CircularLLNode head){
        if (head == null) {
            System.out.println("null");
            return;
        }
        CircularLLNode temp = head;
        System.out.print(head.getData()+" --> ");
        head = head.getNext();
        while (!temp.equals(head)){
            System.out.print(head.getData()+" --> ");
            head = head.getNext();
        }
    }

}

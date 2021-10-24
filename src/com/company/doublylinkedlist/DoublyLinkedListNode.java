package com.company.doublylinkedlist;

public class DoublyLinkedListNode {

    private int data;
    private DoublyLinkedListNode next;
    private DoublyLinkedListNode previous;

    public DoublyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedListNode next) {
        this.next = next;
    }

    public DoublyLinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLinkedListNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "DoublyLinkedListNode{" +
                "data=" + data +
                '}';
    }
}

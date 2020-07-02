package com.akua._02_linkedlist_bidirectional;

public class Node {
    Object value;
    Node prev;
    Node next;

    public Node(Object value){
        this.value = value;
    }

    public Node(Node prev, Object value, Node next){
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

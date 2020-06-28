package com.akua._02_linked_list;

public class Node {

    private Object value;
    private Node next;

    public Node(Object value, Node node){
        this.value = value;
        this.next = node;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

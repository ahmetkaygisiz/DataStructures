package com.akua._02_linkedlist_uni;

public class CustomLinkedList<T>{
    Node head; // başlangıç node
    int count;

    public CustomLinkedList(){
        this.head = null;
        this.count = 0;
    }

    public void add(Object value){
        Node newNode = new Node(value, null);

        if(head == null){
            this.head = newNode;
            count++;
            return ;
        }

        Node currentItem = head;

        while(currentItem.getNext() != null){
            currentItem = currentItem.getNext();
        }

        currentItem.setNext(newNode);
        count++;
    }

    public void print(){
        if(head != null){
            Node tmp1  = head;
            String output = "List : [ ";

            while(tmp1 != null){
                output += tmp1.getValue() + " ";
                tmp1 = tmp1.getNext();
            }
            output += "]";

            System.out.println(output);
        }
    }

    public void delete(){
        if (head != null) {
            Node tmp = head;

            while ( tmp.getNext().getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(null);
            count--;
        }
    }
    public void updateValueByIndex(int index, Object value){
        Node current = head ;
        int i = 1;

        if(index <= count && index > 0){
            while(i != index ){
                current = current.getNext();
                i++;
            }

            current.setValue(value);
        }
    }

    public void deleteByIndex(int index){
        if(head != null){
            Node current = head;

            if( index <= 1 ){
                if(head.getNext() != null) // if exists the next value
                    this.head = head.getNext();
                 else
                    this.head = null;
                count--;
            }else if(index == count && index > count){
                delete();
            }else{
                int tmp = 1;

                while(tmp != (index - 1)){
                    current = current.getNext();
                    tmp++;
                }

                current.setNext(current.getNext().getNext());
                count--;
            }
        }
    }

    public int getCount() {
        return count;
    }

    public Node getHead(){
        return head;
    }

    public void setHead(Node head){
        this.head = head;
    }

}

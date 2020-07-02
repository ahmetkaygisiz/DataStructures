package com.akua._05_hash_table;

public class HashTableImpl {
    private Node[] hashArr;
    private int size;

    public HashTableImpl(int size){
        this.size = size;
        hashArr = new Node[size];

        for(int i = 0 ; i < size; i++){
            hashArr[i] = new Node();
        }
    }

    public int generateKey(Object value){
        return Math.abs(value.toString().hashCode() % size);
    }

    public void add(Object value){
        int key = generateKey(value);

        if (isHeadEmpty(key)) {
           hashArr[key].setValue(value);
        }else{
            Node currentNode = hashArr[key];            // Start with headNode
                                                        // Link the other nodes.
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node(value));
        }
    }

    public boolean isHeadEmpty(int key){
        return (hashArr[key].getValue() == null);
    }

    public void printHashTable(){
        for(int i = 0; i < size ; i++){
            Node tmpNode = hashArr[i];
            System.out.print("i : " + i + " Values : ");

            while(tmpNode != null){
                System.out.print(tmpNode.getValue() + " -> ");
                tmpNode = tmpNode.getNext();
            }

            System.out.println();
        }
    }

    public void removeValue(Object value){
        int key = generateKey(value);
        Node current = hashArr[key];

        // Abicim park etme oraya aracını kod gelecek.
    }
}

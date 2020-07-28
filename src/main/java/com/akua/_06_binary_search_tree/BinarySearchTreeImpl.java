package com.akua._06_binary_search_tree;

import java.sql.SQLOutput;

/**
 *  What is Binary Search Tree?
 *  Also called Ordered/Sorted Binary Tree
 *
 *  I did it some way but it must be developed in better way.
 */
public class BinarySearchTreeImpl {
    private Node root;

    public void addNode(int value){
        if( root == null){
            root = new Node(value);
        }else{
            Node current = root;
            getLeaf(current,value);
        }
    }

    public Node getLeaf(Node node, int value){
        if(node == null){
            return new Node(value);
        }

        if ( node.getValue() <= value ) {
            node.setLeft(getLeaf(node.getLeft(), value));
        }else {
            node.setRight(getLeaf(node.getRight(), value));
        }

        return node;
    }

    public Node getNode(int value) {
        Node current = root;

        while (current != null){
            if(current.getValue() == value) {
                break;
            }else if(current.getValue() > value){
                current = current.getRight();
            }else {
                current = current.getLeft();
            }
        }
        return current;
    }

    public void searchValue(int value){
        if( root != null){
            Node n = getNode(value);

            if (n != null){
                System.out.println(" Founded " + n.getValue());
            }else{
                System.out.println("Not found");
            }
        }
    }

    public Node getParent(Node node){
        if(node != null){
            Node current = root;

            while( current != null){
                if(current.getLeft() != null) {
                    if (current.getLeft().equals(node)) {
                        break;
                    }
                }else{
                    if (current.getRight().equals(node)) {
                        break;
                    }
                }

                if ( current.getValue() > node.getValue()){
                    current = current.getRight();
                }else{
                    current = current.getLeft();
                }
            }

            if ( current != null ){
                return current;
            }
        }
        return null;
    }

    public void deleteNode(int value){
        if( root != null){
            Node n = getNode(value);
            Node parent = getParent(n);

            if(parent != null){
                System.out.println("Parent : " + parent.getValue());

                if ( parent.getLeft() == n ){
                    if ( n.getLeft() != null){
                        parent.setLeft(n.getLeft());
                    }else
                        parent.setLeft(n.getRight());
                    }
                }else{
                    if ( n.getLeft() != null){
                        parent.setRight(n.getLeft());
                    }else
                        parent.setRight(n.getRight());
                     }
            }else {
                System.out.println("Value Not found on List !!");
            }
    }
}

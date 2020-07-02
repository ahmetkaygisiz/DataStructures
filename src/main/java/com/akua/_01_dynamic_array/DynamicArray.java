package com.akua._01_dynamic_array;

import java.util.Arrays;

public class DynamicArray {
    private Object[] array;
    private int size;
    private int capacity;

    public DynamicArray(){
        array = new Object[2];
        size = 0;
        capacity = 2;
    }

    public boolean checkSize(){
        return size == capacity;
    }

    public void add(Object data){
        if (checkSize())
            expandArray(2);
        array[size] = data;
        size++;
    }

    public void expandArray(int rate){
        if (checkSize()){

            Object[] temp = new Object[capacity * rate];
            for (int i = 0 ; i < capacity; i++)
                temp[i] = array[i];

            array = temp;
            capacity *= rate ;
        }
    }

    public void shrinkArray(){
        Object[] temp = null;

        if (size == 0 && size == capacity)
            return ;

        temp = new Object[size];
        for(int i = 0; i < size; i++)
            temp[i] = array[i];

        capacity = size;
        array = temp;
        System.out.println(" ** Shrinked ** ");
    }

    public void addAt(int index, Object data){
        if(checkSize())
            expandArray(2);

        for(int i = index ; i < size + 1 ; i++)
            array[i + 1] = array[i];
        array[index] = data;
        size++;
    }

    public void removeAt(int index) {
        if (index >= 0 && size > index) {
            System.out.println(" ** Removing : " + array[index] + " , count " + index + " ** ");
            for (int i = index; i < size - 1; i++)
                array[i] = array[i + 1];
            array[size - 1] = null;
            size--;
        }else {
            System.out.println("Wrong count");
        }
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void toStringSizeAndCapacity(){
        System.out.println("Size : " + size + " && Capacity : " + capacity);
    }

    public void printArray() {
        System.out.println("Array : " + Arrays.toString(array));
    }
}

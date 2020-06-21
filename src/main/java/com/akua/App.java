package com.akua;

import com.akua._01_dynamic_array.DynamicArray;

public class App {
    public static void main(String[] args){
        DynamicArray dynamicArr = new DynamicArray();

        dynamicArr.add(2);
        dynamicArr.add('A');
        dynamicArr.add(1232L);
        dynamicArr.toStringSizeAndCapacity();
        dynamicArr.add('q');
        dynamicArr.add(11);
        dynamicArr.toStringSizeAndCapacity();
        dynamicArr.shrinkArray();
        dynamicArr.toStringSizeAndCapacity();

        dynamicArr.removeAt(1);
        dynamicArr.toStringSizeAndCapacity();
        dynamicArr.printArray();

        dynamicArr.add(4.3d);
        dynamicArr.add("Ahmet Kaygisiz");
        dynamicArr.add(123.00f);
        dynamicArr.add("Data Structures");

        dynamicArr.toStringSizeAndCapacity();
        dynamicArr.shrinkArray();
        dynamicArr.toStringSizeAndCapacity();
        dynamicArr.printArray();

    }
}

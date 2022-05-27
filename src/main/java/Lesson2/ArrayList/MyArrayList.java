package Lesson2.ArrayList;

import Lesson2.LinkedList.MyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList <T> {

    int size = 0;
    int capacity = 0;

    Object[] arr;

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        arr = new Object[capacity];
    }

    public MyArrayList() {
        this.capacity = 15;
        arr = new Object[capacity];
    }

    public void add(T elem){
        if(size == arr.length){
            Object[] temp = arr.clone();
            capacity = (int)Math.round(capacity * 1.5);
            arr = Arrays.copyOf(temp, capacity);
        }
        arr[size++] = elem;
    }

    public T get(int itemNum){
        if(0>itemNum && itemNum > size){
            return (T)arr[itemNum];
        }
        return null;
    }

    public void set(int index, T item){
        if(0<=index && index <= size){
            arr[index] = item;
        }
    }

    public void remove(int index){
        int newSize = size - 1;
        if(newSize > index){
            System.arraycopy(arr, index + 1, arr, index, newSize - index);
            size --;
        } else {
            arr[index] = null;
            size --;
        }
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
           stringBuilder.append(arr[i]).append(" ");
        }
        return stringBuilder.toString();
    }
}

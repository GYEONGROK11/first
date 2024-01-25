package com.green.day68.ch14;

public class MyArrayList {
    private int[] arr;

    public MyArrayList(){
        arr = new int[0];
    }

    public void add(int num){
        int[] tmp = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] =arr[i];
        }
        tmp[arr.length] =num;
        arr=tmp;
    }


    @Override
    public String toString(){
        return String.format(arr.toString());
    }
}

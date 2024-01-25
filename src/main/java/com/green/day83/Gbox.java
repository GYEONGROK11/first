package com.green.day83;
//제네릭
public class Gbox<T> {//T : 타입변수
    public T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}

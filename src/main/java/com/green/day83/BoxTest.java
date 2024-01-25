package com.green.day83;

public class BoxTest {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setItem(1);
        int intVal = (int)b1.getItem();
        System.out.println(intVal);
        b1.setItem("야야야야양야");
        String sVal1 = (String)b1.getItem();
        System.out.println(sVal1);

        Box b2 = new Box();
        b2.setItem("할로");
        String sVal2 = (String)b2.getItem();
        System.out.println(sVal2);
    }
}

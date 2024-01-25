package com.green.day83;

public class GboxTest {
    public static void main(String[] args) {
        Gbox g1 = new Gbox();
        g1.setItem(1);
        g1.setItem("할로");


        Gbox<Integer> g2 = new Gbox();  //컴파일 시점에 타입을 지정함
        g2.setItem(2);
        int val1 = g2.getItem();

        Gbox<String> g3 = new Gbox();
        g3.setItem("asdaasd");
        String val2 = g3.getItem();


    }
}

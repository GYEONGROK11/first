package com.green.day44;

public class Test {
    public static void main(String[] args){
        MyInfo mi = new MyInfo()
                .title("dd")
                .description("dda");

        mi.description("dddddd");
        
        System.out.println(mi);

        MyOpenAPI moa = new MyOpenAPI().info(mi);


        System.out.println(moa);
    }
}

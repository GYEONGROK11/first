package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest3 {
    public static void main(String[] args) {
        String str1 = "하123";
        String str2 = "하하123";
        String str3 = "하123하하123하";
        String str4 = "123하ㅡ하13  ㅇ23";

        String regexp = "^[ㄱ-ㅎ|ㅏ-ㅣ|가-힣|0-9| ]+[0-9]*$";// + : 1개이상  * : 0개이상

        boolean asd = Pattern.matches(regexp,str1);

        System.out.printf("%s > %b\n",str1,Pattern.matches(regexp,str1));
        System.out.printf("%s > %b\n",str2,Pattern.matches(regexp,str2));
        System.out.printf("%s > %b\n",str3,Pattern.matches(regexp,str3));
        System.out.printf("%s > %b\n",str4,Pattern.matches(regexp,str4));
    }
}

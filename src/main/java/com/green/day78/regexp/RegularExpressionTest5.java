package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest5 {
    public static void main(String[] args) {
        String str1 = "010-6464-4642";
        String str2 = "011-6464-4642";
        String str3 = "016-6464-4642";
        //010   011  016  017  018  019
        String regexp = "^01[0|1|6-9]{1}-[\\d]{3,4}-[\\d]{4}$";

        boolean asd = Pattern.matches(regexp,str1);
        System.out.printf("%s > %b\n",str1,Pattern.matches(regexp,str1));
        System.out.printf("%s > %b\n",str2,Pattern.matches(regexp,str2));
        System.out.printf("%s > %b\n",str3,Pattern.matches(regexp,str3));
    }
}

package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest6 {
    public static void main(String[] args) {
        String str1 = "950222-1765482";
        String str2 = "000503-4765482";
        String str3 = "001222-3765482";
        String str4 = "990229-2765482";
        String str5 = "990331-2765482";

        String regexp = "^[\\d]{2}(02|0[1-9]|[12][0-9])(0[1|3-9]|0[1-9]|[12][0-9]|3[01])-[1-4]{1}[\\d]{6}$";

        boolean asd = Pattern.matches(regexp,str1);
        System.out.printf("%s > %b\n",str1,Pattern.matches(regexp,str1));
        System.out.printf("%s > %b\n",str2,Pattern.matches(regexp,str2));
        System.out.printf("%s > %b\n",str3,Pattern.matches(regexp,str3));
        System.out.printf("%s > %b\n",str4,Pattern.matches(regexp,str4));
        System.out.printf("%s > %b\n",str5,Pattern.matches(regexp,str5));
    }
}

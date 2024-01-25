package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest4 {
    public static void main(String[] args) {
        String str1 = "gpasdf12@naver.com";
        String str2 = "asdg@as123d.co.kr";
        String str3 = "asdg@asad.com";
        String regexp = "^[a-z|A-Z|0-9|_|-]+@([a-z|0-9]{3,}\\.[a-z]{2,}|[a-z|0-9]{3,}\\.[a-z]{2,}\\.[a-z]{2,})$";

        boolean asd = Pattern.matches(regexp,str1);
        System.out.printf("%s > %b\n",str1,Pattern.matches(regexp,str1));
        System.out.printf("%s > %b\n",str2,Pattern.matches(regexp,str2));
        System.out.printf("%s > %b\n",str3,Pattern.matches(regexp,str3));
    }
}

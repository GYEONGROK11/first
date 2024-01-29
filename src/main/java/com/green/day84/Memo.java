package com.green.day84;


import java.util.ArrayList;
import java.util.List;


public class Memo {
    public static void main(String[] args) {
        //배열
        //List 순서
        //Set
        //Map key value 순서가 존재하긴 함 - 빼올 때 순서 상관없이
        //스트림 - 위 4개를 반복문으로 바꿀때 표준화 시켜줌
        // 1.Stream -> 2.중간연산 (n번) -> 3.최종연산 (1번) (최종연산은 보통 리스트로 만들거나 반복문 사용)
        // Stream은 1회용 - 원본은 그대로

        List<String> list = new ArrayList<>();
        list.stream();
    }


}

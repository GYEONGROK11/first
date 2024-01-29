package com.green.day84;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        int[] intArr = {55, 10, 2, 22, 80, 90, 33};
        Integer[] integerArr = {55, 10, 2, 22, 80, 90, 33};
        Stream<Integer> stream0 = Stream.of(integerArr);
        Stream<Integer> stream1 = Arrays.stream(intArr).boxed();
        Stream<Integer> stream2 = IntStream.of(intArr).boxed();
        List<Integer> list = stream1.sorted().limit(3).collect(Collectors.toList()); //sorted(정렬) 후 toList(리스트)로 담기
                                  //중간연산.중간연산(순서 영향 받음).최종연산
        //중간연산은 최종연산이 트리거가 되서 최종연산이 실행되야 중간연산이 실행됨
        //stream은 원본을 그대로 두고, 연산을 읽기만 함
        IntStream.of(intArr).boxed() //.boxed()는 프라모티브 타입을 랩핑해주는 역할
                .sorted() //정렬
                .limit(4)  //4개만 찍기
                .forEach(item -> System.out.print(item + ", "));

        System.out.println();
        System.out.println(list);
        System.out.println(Arrays.toString(intArr));
    }
}

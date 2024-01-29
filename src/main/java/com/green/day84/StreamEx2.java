package com.green.day84;


import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx2 {
    public static void main(String[] args) {
        //무한 스트림
        Random r = new Random();
        IntStream intStream = r.ints();
        intStream.limit(5).forEach(System.out::println);
        System.out.println("------------------");
        r.ints(5).forEach(System.out::println);

        System.out.println("------------------");
        r.doubles(5).forEach(System.out::println);

        System.out.println("---------랜덤한 1-10 숫자 중 5개 추출---------");
        List<Integer> intList = r.doubles()
                                .mapToInt(item -> (int)(item * 10)+1)
                                .boxed() //인트타입 랩핑
                                .distinct() //중복제거
                                .limit(5)  //갯수
                                .collect(Collectors.toList());
        System.out.println(intList);

        System.out.println("---------랜덤한 1-45 숫자 중 6개 추출---------");
        r.ints(1,46)
                        .distinct()
                        .limit(6)
                        .sorted()
                        .forEach( item -> System.out.print(item +" "));

        System.out.println("\n끝");

    }
}

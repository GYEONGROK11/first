package com.green.day84;


import java.io.File;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"), new File("Ex1.bak")
                , new File("Ex2.java"), new File("Ex2")
                , new File("Ex2.txt")
        };
        Stream<File> fileStream = Stream.of(fileArr);
        Stream<String> strStream= fileStream.map(item -> item.getName());
        strStream.forEach(System.out::println);
        System.out.println("------------------------");
        Stream.of(fileArr).map(File::getName)
                .filter(item -> item.indexOf(".") != -1) //점이 있는지 있다면 인덱스번호 없다면 -1임 (아래 예제)
                .map(item -> item.substring(item.indexOf('.') + 1)) //확장자 가져오기
                .map(item -> item.toUpperCase()) //대문자로 바꿈
                .distinct() //중복제거
                .forEach(item -> System.out.println(item));

        ;


        System.out.println("------------------------");
        System.out.println("1234".indexOf('.'));
        System.out.println("12.34".indexOf('.'));
        System.out.println(".1234".indexOf('.'));

    }
}

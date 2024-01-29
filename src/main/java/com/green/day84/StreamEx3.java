package com.green.day84;


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Stream.iterate(0, item -> item + 2)
                .mapToInt(Integer::valueOf)
                //.mapToInt(item -> { return Integer.valueOf(item);});
                .skip(3) //처음 3개 스킵
                .limit(10)
                .boxed()
                //.forEach(System.out::print);
                .forEach(item -> System.out.print(item +" "));
        //return 0 + 2
        //return 2 + 2
        //return 4 + 2
        //return 6 + 2
    }
}

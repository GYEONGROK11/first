package com.green.day84;


import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(new Integer[]{100, 1, 8, 10, 22});
        int sum = intList.stream()
                        .mapToInt(item -> item) //타입변경
                        .sum();

        System.out.println(sum);
        OptionalDouble avg = intList.stream().mapToInt(item -> item).average();
        //널체크
        if(avg.isPresent()){
            System.out.println(avg.getAsDouble());
        }
        double avg2 = Optional.of(avg).map(item -> item.getAsDouble()).orElse(0.0);
        System.out.println(avg2);
    }
}

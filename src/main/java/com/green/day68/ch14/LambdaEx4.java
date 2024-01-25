package com.green.day68.ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i + 10);
        }
        for (Integer val : list) {
            System.out.println(val);
        }
        System.out.println("---------------");

        list.forEach(new MyConsumer<Integer>()); //Consumer인터페이스를 상속받은 구현부가 있는 클래스의 주소값을 넣음

        System.out.println("---------------");

        list.forEach(new Consumer<Integer>() { //컨슈머의 익명 클래스
            @Override
            public void accept(Integer o) {
                System.out.println("MyConsumer(2) : " + o);
            }
        });

        System.out.println("---------------");

        list.forEach(i -> System.out.println("MyConsumer(3) : " + i));

        System.out.println("---------------");

        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer v) {
                return v % 2 == 0;
            }
        });
        list.removeIf(i -> {
            return i % 2 == 0;
        });

        list.removeIf(i -> i % 2 == 0); //true가 리턴되면 삭제함
        //중괄호 생략 시 리턴 메소드 였다면 리턴도 생략해줌
        System.out.println(list);
        System.out.println("---------------");
        list.replaceAll(v -> v <= 15 ? v * 2 : v);
        //15이하는 *2처리 나머지는 그대로
        System.out.println(list);

        Map<String, String> map = new HashMap();
        map.put("name","홍길동");
        map.put("age","23세");
        map.put("height","172cm");

        map.forEach( (k,v) -> System.out.printf("%s :%s\n",k,v));//Bi는 파라미터가 2개임

    }
}

class MyConsumer<T> implements Consumer<T> {  //T라는 타입을 정해놓고 객체화 할때 타입을 주입해줌 (제네릭)

    @Override
    public void accept(T o) {
        System.out.println("MyConsumer(1) : " + o);
    }

}

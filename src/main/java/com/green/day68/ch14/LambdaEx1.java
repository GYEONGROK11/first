package com.green.day68.ch14;

@FunctionalInterface//람다식으로 이용하기전에는 메소드가 두개이상 있으면 안됨 - 메소드가 1개만 있는지 검증하는 에노테이션
interface MyFunction { //abstract 추상클래스 - 객체화안됨

    void run();

}

public class LambdaEx1 {
    public static void main(String[] args) {
        MyFunction mf0 = () -> {System.out.println("mf0 - run!!");
                                System.out.println("asd");
                                System.out.println("asd");}; //람다식 run을 쓰지 않는 이유 : 메소드가 하나라서
        //파라미터가 1개면 () 생략가능
        //{}생략은 문장이 1문장일때 가능
        mf0.run();

        MyFunction mf1 = new MyFunction() { //익명클래스 : 장점 : 클래스 이름을 만드는 불필요한 작업을 안함
                                                      // 단점 : 일회성 그때 그때 작성해야되서 내용바꾸기 편함
            @Override
            public void run() {
                System.out.println("mf1 - run!!");
            }
        };
        mf1.run();

        MyFunction mf2 = new MyFunctionClass();
        mf2.run();
    }
}

class MyFunctionClass implements MyFunction { //익명클래스 대신 클래스를 만들어 객체생성하였음 재사용성이 높음

    @Override
    public void run() {
        System.out.println("class name - run !!");
    }
}

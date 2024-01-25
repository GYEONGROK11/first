package com.green.day15.ch7;

public class Parent extends Object {  //Object는 최상위 객체
    /*  상속
    this.asd   내 클래스 주소값 호출
    this()     내 클래스 생성자 호출
    super.asd  부모의 주소값 호출
    super()    부모의 생성자 호출
    */

    int age;
    public  Parent(int age){this.age = age;}
    public  Parent(){ super(); }
}

class Child extends Parent{ // Child는 Parent를 상속받음 age 이용가능, 단일상속만 가능
    public Child(){
        super(1); //부모의 주소값을 참조하기위해 ()에 주소값 저장

    }
    void play(){
        System.out.printf("나는 %d살이야 같이 놀자~\n",age);
    }
}

class Child2 extends Parent{
    public Child2(){
        super(); //부모의 주소값을 참조하기위해 ()에 주소값 저장
        this.jump();
    }

    void jump(){
        System.out.printf("%d살의 아이가 점프를 하였다\n",age);
    }
}
class Main{
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 9;
        c1.play();

        Parent p =c1; //다형성 부모>자식   부모<자식 x

        Child2 c2 = new Child2();
        c2.age = 7;
        c2.jump();
    }
}
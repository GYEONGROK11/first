package com.green.day7.ch4;

public class BreakContinue3 {
    public static void main(String[] args) {
        abc : //반복문에 이름주기
        for(int i = 0; i<5 ; i++){

            for(int z =10; z<15; z++){
                if(z==13){break abc;}
                System.out.printf("i : %d - z : %d\n",i,z);
            }
        }
        System.out.println("-----------");
        abcd :
        for(int i = 0; i<5 ; i++){

            for(int z =10; z<15; z++){
                if(z==13){continue abcd;}
                System.out.printf("i : %d - z : %d\n",i,z);
            }
        }

    }
}

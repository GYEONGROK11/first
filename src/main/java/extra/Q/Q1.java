package extra.Q;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int num = 0;
        System.out.print("최댓값을 입력하세요 (최대 9999) >>");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        int a, b, c, d;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            d = i % 10;
            i /= 10;
            c = i % 10;
            i /= 10;
            b = i % 10;
            i /= 10;
            a = i % 10;
            i /= 10;
            int d1 = d * d;
            int c1 = c * c;
            int b1 = b * b;
            int a1 = a * a;

            sum +=d1;
            sum +=c1;
            sum +=b1;
            sum +=a1;

            //while (sum )

            //}



        }
    }
}

package extra.Q;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 4};
        int answer = 0;
        int[] temp = new int[numbers.length];

        for(int i =0 ; i<numbers.length;i++){
            for(int j =1 ; j<numbers.length; j++){
                if(numbers[i]>numbers[j])
                    temp[i] = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp[i];
            }
        }

        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j]);
        }

    }


}

class Q2_1 {
    public static void main(String[] args) {
        long n = 12345;
        int cnt=0;
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        for(int i = str.length()-1; i>0;i--){
            answer[cnt++] = Character.getNumericValue(str.charAt(i));

        }
        System.out.println(answer.toString());



    }
}
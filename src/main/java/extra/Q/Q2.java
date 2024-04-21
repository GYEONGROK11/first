package extra.Q;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        for (int i: answer) {
            System.out.print(i);
        }

        char[] str1 = String.valueOf(n).toCharArray();
        Arrays.sort(str1);

        System.out.println(str1);

        String str2 = "hello";
        String[] str3 = str2.split("");
        Arrays.sort(str3, Collections.reverseOrder());
        for (String string : str3) {
            System.out.print(string);
        }

    }
}

class Q2_2 {
    public static void main(String[] args) {

        //String[] input = {"P 300 6\", \"P 500 3\", \"'S 1000 4\", \"P 600 1\", \"S 1200 2"};

        String[] input = {"P 100 4\", \"P 300 9\", \"'S 1000 7\", \"P 1000 8\", \"S 700 7\", \"S 700 3"};
        for (String inputLine : input) {
            int firstSLast = 0;
            int firstPMiddle = 0;
            int firstPLast = 0;

            Pattern patternS = Pattern.compile("'S\\s+(\\d+)\\s+(\\d+)\\s*");
            Pattern patternP = Pattern.compile("P\\s+(\\d+)\\s+(\\d+)\\s*");

            Matcher matcherS = patternS.matcher(inputLine);
            Matcher matcherP = patternP.matcher(inputLine);

            if (matcherS.find()) {
                firstSLast = Integer.parseInt(matcherS.group(2));
            }

            if (matcherP.find()) {
                firstPMiddle = Integer.parseInt(matcherP.group(1));
                firstPLast = Integer.parseInt(matcherP.group(2));
            }

            int secondSLast = firstPLast - firstSLast;
            int result1 = 0;

            if (firstPMiddle > firstSLast) {
                result1 = firstSLast * firstPMiddle;
                result1 += secondSLast * firstPMiddle;
            } else {
                result1 += (firstSLast - firstPMiddle) * secondSLast;
            }

            System.out.println(" 결과: " + result1);
        }
    }

}

class Q2_3 {
    public static void main(String[] args) {
        int n = 500;
        int money =100;
        String[] events = {"10, *2", "5, +100", "20, +200", "100, *3", "80, *2"};
        int result = n; // 초기 결과는 초기 회원의 수입니다.

        for (String event : events) {
            // 이벤트 문자열을 쉼표를 기준으로 분리합니다.
            String[] parts = event.split(", ");
            int price = Integer.parseInt(parts[0]); // 가격을 추출합니다.
            String action = parts[1]; // 동작을 추출합니다.

            // 이벤트를 처리합니다.
            if (action.equals("*2")) {
                result *= 2; // 회원 수를 두 배로 늘립니다.
            } else if (action.equals("+100")) {
                result += 100; // 회원 수를 100만큼 증가시킵니다.
            } else if (action.equals("*3")) {
                result *= 3; // 회원 수를 세 배로 늘립니다.
            } else {
                // 그 외의 경우에는 가격만큼 회원 수를 증가시킵니다.
                result += price;
            }

            // 결과가 음수가 되면 0으로 설정합니다.
            if (result < 0) {
                result = 0;
            }
        }

        System.out.println(result);

    }



}
package extra.Q;

import java.util.ArrayList;
import java.util.List;

public class Q3 {

    public int[] solution(String[] record) {
        List<Integer> fifoCost = new ArrayList<>();
        List<Integer> lifoCost = new ArrayList<>();

        int fifoTotalCost = 0;
        int lifoTotalCost = 0;

        for (String rec : record) {
            String[] parts = rec.split(" ");
            int price = Integer.parseInt(parts[1]);
            int quantity = Integer.parseInt(parts[2]);

            if (parts[0].equals("P")) {
                // Purchase
                for (int i = 0; i < quantity; i++) {
                    fifoCost.add(price);
                    lifoCost.add(price);
                }
            } else {
                // Sale
                int fifoSaleCost = 0;
                int lifoSaleCost = 0;

                for (int i = 0; i < quantity; i++) {
                    fifoSaleCost += fifoCost.remove(0);
                    lifoSaleCost += lifoCost.remove(lifoCost.size() - 1);
                }

                fifoTotalCost += fifoSaleCost;
                lifoTotalCost += lifoSaleCost;
            }
        }

        return new int[] {fifoTotalCost, lifoTotalCost};
    }

}


class Q3_1{
    public static void main(String[] args) {

        if (log == null || log.isEmpty()) {
            errorCount++;
            return;
        }

        // 로그의 길이가 100을 초과하는지 확인
        if (log.length() > 100) {
            errorCount++;
            return;
        }

        // 로그를 공백을 기준으로 분할
        String[] fields = log.split("\\s+");

        // 필드 개수가 4개가 아닌 경우 예외 발생
        if (fields.length != 4) {
            errorCount++;
            return;
        }

        // 각 필드가 조건에 맞는지 확인
        for (String field : fields) {
            // 필드가 공백인 경우 예외 발생
            if (field.isEmpty()) {
                errorCount++;
                return;
            }
            // 필드가 알파벳 대소문자로 이루어진지 확인
            if (!field.matches("[a-zA-Z]+")) {
                errorCount++;
                return;
            }
        }
    }
    }
}
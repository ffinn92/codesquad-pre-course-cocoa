import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandomMember {

    public static void main(String[] args) {
        System.out.print("몇 명인가요? ");

        while (true) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            if (a > 10) {
                System.out.println("입력인원이 수강생보다 많습니다. 다시 입력해주세요");
                continue;
            }

            List<String> members = Arrays.asList("반스", "바트", "엘라", "얀", "쏘니", "콘다", "제리", "한세", "검봉", "티모");
            Collections.shuffle(members);

            String comma = "";

            for (int i = 0; i < a; i++) {
                System.out.print(comma);
                System.out.print(members.get(i));
                comma = ",";
            }

            break;
        }
    }
}
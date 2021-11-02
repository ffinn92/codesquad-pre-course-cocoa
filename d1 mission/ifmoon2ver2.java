import java.util.Scanner;

public class ifmoon2ver2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //시험 점수를 입력받는다.

        int score[] = {90, 80, 70, 60};
        String arr[] = {"A", "B", "C", "D", "F"};
        String grade = "F";

        for (int j = 0; j < 4; j++) {
            if (a >= score[j] && a <= 100) {
                grade = arr[j];
                break;
            }
        }
        System.out.println(grade);
    }
}

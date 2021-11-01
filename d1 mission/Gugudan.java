import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 시작단과 끝단을 입력 받는다.

        int c = sc.nextInt(); // 시작단 입력받을 변수
        int d = sc.nextInt(); // 끝단 입력받을 변수

        for(int i=c; i<=d; i++){
            for(int j=1; j<10; j++){
                System.out.println(i+"x"+j);
            }
        }
    }
}

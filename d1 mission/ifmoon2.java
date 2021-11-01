import java.util.Scanner;

public class ifmoon2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //시험 점수를 입력받는다.

        if(90 <= a & a <= 100){
            System.out.print("A");
        }

        if(80 <= a & a <= 89){
            System.out.print("B");
        }

        if(70 <= a & a <= 79){
            System.out.print("C");
        }

        if(60 <= a & a <= 69){
            System.out.print("D");
        }

        if(0 <= a & a <= 59){
            System.out.print("F");
        }
    }
}

import java.util.Scanner;

public class ifmoon1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();// 두 실수 a,b를 입력받는다.

        if(a>b){
            System.out.print(">");
        }

        if(a<b){
            System.out.print("<");
        }

        if(a==b){
            System.out.print("==");
        }

    }
}

import java.util.Scanner;

public class ifmoon3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //연도를 입력받는다.

        if(a%4 == 0 & a%100 != 0){
            System.out.print("1");
        }
        else if(a%400 ==0){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }

    }
}

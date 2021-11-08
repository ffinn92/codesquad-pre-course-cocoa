import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pname = sc.next();

        System.out.print("플레이어의 이름을 입력해주세요.");
        System.out.print(pname);

        int pnameCapital = 100;
        int rnameCpatial = 120;

        int pCountNum = 0;
        int rCountNum = 0;

        rCountNum = (int)(Math.random()*20)+1;
        System.out.print(rCountNum);

    }
}

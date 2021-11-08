import java.util.Scanner;

import static java.lang.Math.min;
import static java.lang.Math.pow;

public class OddOrEven {
    public static void main(String[] args) {
        OddOrEven oddoreven = new OddOrEven();
        oddoreven.play();
    }

    Scanner sc = inputPlayeName();

    int pnameCapital = 100;
    int rnameCpatial = 120;
    int roundcount = 1;

    private int play() {

        int rCountNum = rCountNum();

        String pInputOddEven = inputOddEven(sc, "홀,짝을 입력해주세요.");
        int bettingNum = inputBetnumover(sc, pnameCapital, rnameCpatial);

        String rOddEven = rCountnumJudge(rCountNum);


        if (pInputOddEven.equals(rOddEven)) {
            rnameCpatial = rBalanceLose(rnameCpatial, bettingNum, "현재 상대방의 잔액은 ");
            pnameCapital = pBalanceWin(pnameCapital, bettingNum, "현재 나의 잔액은 ");
        } else {
            pnameCapital = pBalanceLose(pnameCapital, bettingNum);
            rnameCpatial = rBalanceWin(rnameCpatial, bettingNum, "현재 상대방의 잔액은 ");
        }

        if (roundcount == 8 && rnameCpatial == 0) {
            playerWin(pnameCapital, roundcount);
        } else if (rnameCpatial == 0) {
            roundcount++;
            rnameCpatial = nextLevel(pnameCapital, roundcount);
            return play();
        } else if (pnameCapital == 0) {
            playerlose(pnameCapital, roundcount);
        } else {
            return play();
        }
        return pnameCapital;
    }


    private static int pBalanceWin(int pnameCapital, int bettingNum, String s) {
        pnameCapital += bettingNum;
        System.out.println(s + pnameCapital + "입니다.");
        return pnameCapital;
    }

    private static int rBalanceLose(int rnameCpatial, int bettingNum, String s) {
        rnameCpatial -= bettingNum;
        System.out.println(s + rnameCpatial + "입니다.");
        return rnameCpatial;
    }

    private static int rBalanceWin(int rnameCpatial, int bettingNum, String s) {
        rnameCpatial = pBalanceWin(rnameCpatial, bettingNum, s);
        return rnameCpatial;
    }

    private static int pBalanceLose(int pnameCapital, int bettingNum) {
        pnameCapital = rBalanceLose(pnameCapital, bettingNum, "현재 나의 잔액은 ");
        return pnameCapital;
    }


    private static void playerWin(int pnameCapital, int i) {
        System.out.println("WIN!!");
        System.out.println("당신의 소지금은 " + pnameCapital + " 이며, 총 " + i + "라운드 진행되었습니다.");
    }

    private static int nextLevel(int pnameCapital, int roundcount) {
        int rnameCpatial;
        rnameCpatial = (int) (pnameCapital * pow(1.2, roundcount));
        System.out.println(roundcount + "라운드" + ">>" + "새로운 상대가 등장합니다.");
        return rnameCpatial;
    }

    private static void playerlose(int pnameCapital, int roundcount) {

        System.out.println("당신의 소지금은 " + pnameCapital + " 이며, 총 " + roundcount + "라운드 진행되었습니다.");
        System.out.println("Game Over");
    }

    private static String rCountnumJudge(int rCountNum) {
        String rOddEven;

        if (rCountNum % 2 == 0) {
            rOddEven = "짝";
        } else {
            rOddEven = "홀";
        }
        return rOddEven;
    }

    private static int inputFirstBetnum(Scanner sc) {
        System.out.println("베팅 금액을 입력해주세요.");
        int inputBetNum = sc.nextInt();
        return inputBetNum;
    }

    private static int inputBetnumover(Scanner sc, int pnameCapital, int rnameCpatial) {
        while (true) {

            int betNum = inputFirstBetnum(sc);
            if (betNum > min(pnameCapital, rnameCpatial)) {
                System.out.println("베팅 금액을 초과하였습니다." + "\n" + min(pnameCapital, rnameCpatial) + " " + "보다 낮은 수로 입력해주세요.");
                return inputFirstBetnum(sc);
            } else {
                break;
            }
        }return inputFirstBetnum(sc);
    }


    private static String inputOddEven(Scanner sc, String s) {
        System.out.println(s);
        return sc.next();
    }

    private static int rCountNum() {
        int rCountNum;
        rCountNum = (int) (Math.random() * 20) + 1;
        System.out.println("상대방 숫자" + rCountNum);
        return rCountNum;
    }

    private static Scanner inputPlayeName() {
        Scanner sc = new Scanner(System.in);
        String pname = inputOddEven(sc, "플레이어의 이름을 입력해주세요.");
        System.out.println("플레이어의 이름은 " + pname + " 입니다.");
        return sc;
    }
}

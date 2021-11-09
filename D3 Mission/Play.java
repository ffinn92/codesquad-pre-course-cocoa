import java.util.Scanner;

import static java.lang.Math.min;
import static java.lang.Math.pow;

public class Play {
    Scanner sc = inputPlayerName();

    int playerCapital = 100;
    int computerCapital = 120;
    int stageCount = 1;

    public int inputData() {
        int computerRandomNum = selectComputerRandomNum();

        String playerInputOddEven = inputOddEven(sc, "홀,짝을 입력해주세요.");
        int betMoney = checkBetMoney(sc, playerCapital, computerCapital);

        String computerOddEven = checkOddEven(computerRandomNum);

        if (playerInputOddEven.equals(computerOddEven)) {
            computerCapital = computerLose(computerCapital, betMoney, "현재 상대방의 잔액은 ");
            playerCapital = playerWin(playerCapital, betMoney, "현재 나의 잔액은 ");
        } else {
            playerCapital = playerLose(playerCapital, betMoney);
            computerCapital = computerWin(computerCapital, betMoney, "현재 상대방의 잔액은 ");
        }

        if (stageCount == 8 && computerCapital == 0) {
            playerWin(playerCapital, stageCount);
        } else if (computerCapital == 0) {
            stageCount++;
            computerCapital = nextLevel(playerCapital, stageCount);
            return inputData();
        } else if (playerCapital == 0) {
            playerlose(playerCapital, stageCount);
        } else {
            return inputData();
        }
        return playerCapital;
    }

    private static Scanner inputPlayerName() {
        Scanner sc = new Scanner(System.in);
        String playerName = inputOddEven(sc, "플레이어의 이름을 입력해주세요.");
        System.out.println("플레이어의 이름은 " + playerName + " 입니다.");
        return sc;
    }

    private static int selectComputerRandomNum() {
        int computerRandomNum;
        computerRandomNum = (int) (Math.random() * 20) + 1;
        return computerRandomNum;
    }

    private static String inputOddEven(Scanner sc, String s) {
        System.out.println(s);
        return sc.next();
    }

    private static int checkBetMoney(Scanner sc, int playerCapital, int computerCapital) {
        int validBetMoney = getInputBetMoney(sc);

        while (validBetMoney != 0) {
            if (validBetMoney > min(playerCapital, computerCapital)) {
                System.out.println("베팅 금액을 초과하였습니다." + "\n" + min(playerCapital, computerCapital) + " " + "이하로 입력해주세요.");
                validBetMoney = getInputBetMoney(sc);
            } else {
                break;
            }
        }
        return validBetMoney;
    }

    private static int getInputBetMoney(Scanner sc) {
        System.out.println("베팅 금액을 입력해주세요.");
        int inputBetMoney = sc.nextInt();
        return inputBetMoney;
    }

    private static String checkOddEven(int n) {
        String computerOddEven;

        if (n % 2 == 0) {
            computerOddEven = "짝";
        } else {
            computerOddEven = "홀";
        }
        return computerOddEven;
    }

    private static int computerLose(int computerCapital, int betMoney, String s) {
        computerCapital -= betMoney;
        System.out.println(s + computerCapital + "입니다.");
        return computerCapital;
    }

    private static int playerWin(int playerCapital, int betMoney, String s) {
        playerCapital += betMoney;
        System.out.println(s + playerCapital + "입니다.");
        return playerCapital;
    }

    private static int computerWin(int computerCaptial, int betMoney, String s) {
        computerCaptial = playerWin(computerCaptial, betMoney, s);
        return computerCaptial;
    }

    private static int playerLose(int playerCaptial, int betMoney) {
        playerCaptial = computerLose(playerCaptial, betMoney, "현재 나의 잔액은 ");
        return playerCaptial;
    }


    private static void playerWin(int playerCapital, int i) {
        System.out.println("WIN!!");
        System.out.println("당신의 소지금은 " + playerCapital + " 이며, 총 " + i + "라운드 진행되었습니다.");
    }

    private static int nextLevel(int playerCapital, int roundCount) {
        int computerCapital;
        computerCapital = (int) (playerCapital * pow(1.2, roundCount));
        System.out.println(roundCount + "라운드" + ">>" + "새로운 상대가 등장합니다.");
        return computerCapital;
    }

    private static void playerlose(int playerCaptial, int roundCount) {

        System.out.println("당신의 소지금은 " + playerCaptial + " 이며, 총 " + roundCount + "라운드 진행되었습니다.");
        System.out.println(" - Game Over - ");
    }
}

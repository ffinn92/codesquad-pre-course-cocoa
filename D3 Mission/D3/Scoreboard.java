package D3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Scoreboard {
    //게임오버 시 플레이어의 이름을 입력받는다.
    //a.플레이어의 이름을 배열에 넣고 내림차순 혹은 오름차순으로 정렬한다.
    //랭킹을 출력해준다.

    //랭킹은 소지금이 많을수록, 턴이 작을수록 높아진다.

    //게임 종료될때의 1.플레이어의 이름 2.소지금  3.턴을 각 배열에 입력받는다.
    //플레이어의 이름과 소지금을 오름차순으로 재정렬한다.
    //플레이어의 이름과 턴을 내림차순으로 재정렬한다

    //b.indexof 함수에 a.플레이어의 이름을 하나씩 넣어 소지금 순위 점수와 턴 순위 점수를 더해준다.
    //b에서 구한 총 스코어 점수와 a.플레이어 이름을 내림차순으로 재정렬한다.
    //재정렬된 플레이어 이름과 함께 랭킹을 출력한다.

    //게임 졸료 후 재시작시 이어하기 기능을 구현해본다.

    public void inputPlayerGameData() throws IOException{
        Play play = new Play();
        play.getPlayerCapital();
        play.getStageCount();

        Scanner sc = new Scanner(System.in);
        String playerName = sc.next();
        int playerMoney = sc.nextInt();
        int playerStageCount = sc.nextInt();

        FileWriter fw = new FileWriter("/Users/changhoonsong/Desktop/Java/cocoa/D3 Mission/D3/playerName.txt", true);
        fw.write(playerName+"\n");
        fw.flush();
        fw.close();

        FileWriter fw2 = new FileWriter("/Users/changhoonsong/Desktop/Java/cocoa/D3 Mission/D3/playerMoney.txt",true);
        fw2.write(playerMoney+"\n");
        fw2.flush();
        fw2.close();

        FileWriter fw3 = new FileWriter("/Users/changhoonsong/Desktop/Java/cocoa/D3 Mission/D3/playerStageCount.txt", true);
        fw3.write(playerStageCount+"\n");
        fw3.flush();
        fw3.close();
    }


//    public void inputPlayerName(){
//        Scanner sc = new Scanner(System.in);
//        String playerName = sc.next();
//
//        FileWriter fw = null;
//
//        inputNameToFile(playerName, fw);
//    }
//
//    private void inputNameToFile(String playerName, FileWriter fw) {
//        try {
//            fw = new FileWriter("/Users/changhoonsong/Desktop/Java/cocoa/D3 Mission/D3/playerName.txt", true);
//            fw.write(playerName);
//            fw.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fw != null)
//                    fw.close();
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void inputPlayerMoney(){
//        Scanner sc = new Scanner(System.in);
//        int playerMoney = sc.nextInt();
//
//        FileWriter fw2 = null;
//
//        try {
//            fw2 = new FileWriter("/Users/changhoonsong/Desktop/Java/cocoa/D3 Mission/D3/playerMoney.txt", true);
//            fw2.write(playerMoney);
//            fw2.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fw2 != null)
//                    fw2.close();
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void inputPlayerStageCount(){
//        Scanner sc = new Scanner(System.in);
//        int playerStageCount = sc.nextInt();
//
//        FileWriter fw3 = null;
//
//        try {
//            fw3 = new FileWriter("/Users/changhoonsong/Desktop/Java/cocoa/D3 Mission/D3/playerStageCount.txt", true);
//            fw3.write(playerStageCount);
//            fw3.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fw3 != null)
//                    fw3.close();
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//    }

}



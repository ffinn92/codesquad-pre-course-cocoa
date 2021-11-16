package D4;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ClockRun {
    //글자를 볼드처리 해줄수 있도록 적용할 색과 코드를 선언
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m";

    public void clockRun() {

        Timer RepeatTimer = new Timer();
        TimerTask RepeatTask = new TimerTask() {
            @Override
            public void run() {

                //한글자씩 [6][6] 크기 배열에다 구성
                String[][] boardArr = HangeulBoard();

                //현재 시간에 따른 시간, 분, 분의 십의자리, 분의 일의자리 선언
                LocalTime current = LocalTime.now();
                int nowHour = current.getHour();
                int nowMinute = current.getMinute();
                int nowMinuteTen = nowMinute % 100 / 10;
                int nowMinuteOne = nowMinute % 100 % 10;

                //시간을 숫자 1~12로 표기하기 위해 -12 실행
                if (nowHour >= 12) {
                    nowHour = nowHour - 12;
                }

                //정오는 현재시간+현재분=0 일때를 뜻하고, 자정은 현재시간이 12이고 현재분이 0일때로 셋팅
                if (nowHour + nowMinute == 0) {
                    boardArr[4][0] = WHITE_BOLD_BRIGHT + boardArr[4][0] + ANSI_RESET;
                    boardArr[5][0] = WHITE_BOLD_BRIGHT + boardArr[5][0] + ANSI_RESET;
                } else if (nowHour == 12 && nowMinute == 0) {
                    boardArr[3][0] = WHITE_BOLD_BRIGHT + boardArr[3][0] + ANSI_RESET;
                    boardArr[4][0] = WHITE_BOLD_BRIGHT + boardArr[4][0] + ANSI_RESET;
                } else {
                    //현재시간에 해당하는 케이스로 가서 글자 볼드처리
                    hourCheck(boardArr, nowHour);
                    //현재분(십의자리)에 해당하는 케이스로 가서 글자 볼드처리
                    minuteTenCheck(boardArr, nowMinuteTen);
                    //현재분(일의자리)에 해당하는 케이스로 가서 글자 볼드처리
                    minuteOneCheck(boardArr, nowMinuteOne);
                }
                //볼드 처리된 배열을 출력보드 구성에 맞춰 출력
                outputHangeulClock(boardArr);
           }
        };
        //위 과정을 1분(60000ms)마다 딜레이 없이 반복한다.
        RepeatTimer.scheduleAtFixedRate(RepeatTask, 0,60000);
    }

    private String[][] HangeulBoard() {
        String[][] boardArr = {
                {"한", "두", "세", "네", "다", "섯"},
                {"여", "섯", "일", "곱", "여", "덟"},
                {"아", "홉", "열", "한", "두", "시"},
                {"자", "이", "삼", "사", "오", "십"},
                {"정", "일", "이", "삼", "사", "육"},
                {"오", "오", "칠", "팔", "구", "분"}
        };
        return boardArr;
    }

    private void hourCheck(String[][] boardArr, int nowHour) {
        switch (nowHour) {
            case 0:
            case 12:
                boardArr[2][2] = WHITE_BOLD_BRIGHT + boardArr[2][2] + ANSI_RESET;
                boardArr[2][4] = WHITE_BOLD_BRIGHT + boardArr[2][4] + ANSI_RESET;
                boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                break;
            case 1:
                boardArr[0][0] = WHITE_BOLD_BRIGHT + boardArr[0][0] + ANSI_RESET;
                boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                break;
            case 2:
                boardArr[0][1] = WHITE_BOLD_BRIGHT + boardArr[0][1] + ANSI_RESET;
                boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                break;
            case 3:
                boardArr[0][2] = WHITE_BOLD_BRIGHT + boardArr[0][2] + ANSI_RESET;
                boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                break;
            case 4:
                boardArr[0][3] = WHITE_BOLD_BRIGHT + boardArr[0][3] + ANSI_RESET;
                boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                break;
            case 5:
                boardArr[0][4] = WHITE_BOLD_BRIGHT + boardArr[0][4] + ANSI_RESET;
                boardArr[0][5] = WHITE_BOLD_BRIGHT + boardArr[0][5] + ANSI_RESET;
                boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                break;
            case 6:
                boardArr[1][0] = WHITE_BOLD_BRIGHT + boardArr[1][0] + ANSI_RESET;
                boardArr[1][1] = WHITE_BOLD_BRIGHT + boardArr[1][1] + ANSI_RESET;
                boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                break;
            case 7:
                boardArr[1][2] = WHITE_BOLD_BRIGHT + boardArr[1][2] + ANSI_RESET;
                boardArr[1][3] = WHITE_BOLD_BRIGHT + boardArr[1][3] + ANSI_RESET;
                boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                break;
            case 8:
                boardArr[1][4] = WHITE_BOLD_BRIGHT + boardArr[1][4] + ANSI_RESET;
                boardArr[1][5] = WHITE_BOLD_BRIGHT + boardArr[1][5] + ANSI_RESET;
                boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                break;
            case 9:
                boardArr[2][0] = WHITE_BOLD_BRIGHT + boardArr[2][0] + ANSI_RESET;
                boardArr[2][1] = WHITE_BOLD_BRIGHT + boardArr[2][1] + ANSI_RESET;
                boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                break;
            case 10:
                boardArr[2][2] = WHITE_BOLD_BRIGHT + boardArr[2][2] + ANSI_RESET;
                boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                break;
            case 11:
                boardArr[2][2] = WHITE_BOLD_BRIGHT + boardArr[2][2] + ANSI_RESET;
                boardArr[2][3] = WHITE_BOLD_BRIGHT + boardArr[2][3] + ANSI_RESET;
                boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                break;
        }
    }

    private void minuteTenCheck(String[][] boardArr, int nowMinuteTen) {
        switch (nowMinuteTen) {
            case 1:
                boardArr[3][5] = WHITE_BOLD_BRIGHT + boardArr[3][5] + ANSI_RESET;
                break;
            case 2:
                boardArr[3][1] = WHITE_BOLD_BRIGHT + boardArr[3][1] + ANSI_RESET;
                boardArr[3][5] = WHITE_BOLD_BRIGHT + boardArr[3][5] + ANSI_RESET;
                break;
            case 3:
                boardArr[3][2] = WHITE_BOLD_BRIGHT + boardArr[3][2] + ANSI_RESET;
                boardArr[3][5] = WHITE_BOLD_BRIGHT + boardArr[3][5] + ANSI_RESET;
                break;
            case 4:
                boardArr[3][3] = WHITE_BOLD_BRIGHT + boardArr[3][3] + ANSI_RESET;
                boardArr[3][5] = WHITE_BOLD_BRIGHT + boardArr[3][5] + ANSI_RESET;
                break;
            case 5:
                boardArr[3][4] = WHITE_BOLD_BRIGHT + boardArr[3][4] + ANSI_RESET;
                boardArr[3][5] = WHITE_BOLD_BRIGHT + boardArr[3][5] + ANSI_RESET;
                break;
        }
    }

    private void minuteOneCheck(String[][] boardArr, int nowMinuteOne) {
        switch (nowMinuteOne) {
            case 0:
                boardArr[5][5] = WHITE_BOLD_BRIGHT + boardArr[5][5] + ANSI_RESET;
                break;
            case 1:
                boardArr[4][1] = WHITE_BOLD_BRIGHT + boardArr[4][1] + ANSI_RESET;
                boardArr[5][5] = WHITE_BOLD_BRIGHT + boardArr[5][5] + ANSI_RESET;
                break;
            case 2:
                boardArr[4][2] = WHITE_BOLD_BRIGHT + boardArr[4][2] + ANSI_RESET;
                boardArr[5][5] = WHITE_BOLD_BRIGHT + boardArr[5][5] + ANSI_RESET;
                break;
            case 3:
                boardArr[4][3] = WHITE_BOLD_BRIGHT + boardArr[4][3] + ANSI_RESET;
                boardArr[5][5] = WHITE_BOLD_BRIGHT + boardArr[5][5] + ANSI_RESET;
                break;
            case 4:
                boardArr[4][4] = WHITE_BOLD_BRIGHT + boardArr[4][4] + ANSI_RESET;
                boardArr[5][5] = WHITE_BOLD_BRIGHT + boardArr[5][5] + ANSI_RESET;
                break;
            case 5:
                boardArr[5][1] = WHITE_BOLD_BRIGHT + boardArr[5][1] + ANSI_RESET;
                boardArr[5][5] = WHITE_BOLD_BRIGHT + boardArr[5][5] + ANSI_RESET;
                break;
            case 6:
                boardArr[4][5] = WHITE_BOLD_BRIGHT + boardArr[4][5] + ANSI_RESET;
                boardArr[5][5] = WHITE_BOLD_BRIGHT + boardArr[5][5] + ANSI_RESET;
                break;
            case 7:
                boardArr[5][2] = WHITE_BOLD_BRIGHT + boardArr[5][2] + ANSI_RESET;
                boardArr[5][5] = WHITE_BOLD_BRIGHT + boardArr[5][5] + ANSI_RESET;
                break;
            case 8:
                boardArr[5][3] = WHITE_BOLD_BRIGHT + boardArr[5][3] + ANSI_RESET;
                boardArr[5][5] = WHITE_BOLD_BRIGHT + boardArr[5][5] + ANSI_RESET;
                break;
            case 9:
                boardArr[5][4] = WHITE_BOLD_BRIGHT + boardArr[5][4] + ANSI_RESET;
                boardArr[5][5] = WHITE_BOLD_BRIGHT + boardArr[5][5] + ANSI_RESET;
                break;
        }
    }

    private void outputHangeulClock(String[][] boardArr) {
        System.out.println("--------------");
        for (int k = 0; k < 6; k++) {
            for (int j = 0; j < 6; j++) {
                if (j == 5) {
                    System.out.println(boardArr[k][j]);
                } else {
                    System.out.print(boardArr[k][j] + " ");
                }
            }
        }
        System.out.println("--------------");
    }
}

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Hangeulclock {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE


    public static void main(String[] args) {
        //1.다차원 배열로 한글을 입력하여 출력보드를 만든다.
        //2.현재 시간을 1분 단위로 입력받는다.
        //3.각 시간(숫자)과 한글표기가 일치할때 볼드처리를 해준다.
        //3-1.일치하는지 찾는 방법은 스위치 케이스 문으로 하나씩 확인해본다.
        //2~3번을 반복한다.
        String[][] boardArr = {
                {"한", "두", "세", "네", "다", "섯"},
                {"여", "섯", "일", "곱", "여", "덟"},
                {"아", "홉", "열", "한", "두", "시"},
                {"자", "이", "삼", "사", "오", "십"},
                {"정", "일", "이", "삼", "사", "육"},
                {"오", "오", "칠", "팔", "구", "분"}
        };

        LocalTime current = LocalTime.now();
        System.out.println(current);


        int nowHour = current.getHour();
        int nowMinute = current.getMinute();
        int nowMinuteTen = nowMinute % 100 / 10;
        int nowMinuteOne = nowMinute % 100 % 10;

        if (nowHour >= 12) {
            nowHour = nowHour - 12;
        }

        if (nowHour + nowMinute == 0) {
            boardArr[4][0] = WHITE_BOLD_BRIGHT + boardArr[4][0] + ANSI_RESET;
            boardArr[5][0] = WHITE_BOLD_BRIGHT + boardArr[5][0] + ANSI_RESET;
        } else if (nowHour == 12 && nowMinute == 0) {
            boardArr[3][0] = WHITE_BOLD_BRIGHT + boardArr[3][0] + ANSI_RESET;
            boardArr[4][0] = WHITE_BOLD_BRIGHT + boardArr[4][0] + ANSI_RESET;
        } else {

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

        for (int k = 0; k < 6; k++) {
            for (int j = 0; j < 6; j++) {
                if (j == 5) {
                    System.out.println(boardArr[k][j]);
                } else {
                    System.out.print(boardArr[k][j]);
                }

            }
        }
    }
}










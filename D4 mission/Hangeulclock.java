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


        int nowHour = 1;

        if (nowHour >= 12) {
            nowHour = nowHour - 12;
        }


        String hour = "";
        switch (nowHour) {
            case 0:
                hour = "열두시";
                break;
            case 1:
                hour = "한시";
                break;
            case 2:
                hour = "두시";
                break;
            case 3:
                hour = "세시";
                break;
            case 4:
                hour = "네시";
                break;
            case 5:
                hour = "다섯시";
                break;
            case 6:
                hour = "여섯시";
                break;
            case 7:
                hour = "일곱시";
                break;
            case 8:
                hour = "여덟시";
                break;
            case 9:
                hour = "아홉시";
                break;
            case 10:
                hour = "열시";
                break;
            case 11:
                hour = "열한시";
                break;
            case 12:
                hour = "열두시";
                break;
        }

        int nowMinute = 0;
        String minute = "";
        switch (nowMinute) {
            case 1:
                minute = "일분";
                break;
            case 2:
                minute = "이분";
                break;
            case 3:
                minute = "삼분";
                break;
            case 4:
                minute = "사분";
                break;
            case 5:
                minute = "오분";
                break;
            case 6:
                minute = "육분";
                break;
            case 7:
                minute = "칠분";
                break;
            case 8:
                minute = "팔분";
                break;
            case 9:
                minute = "구분";
                break;
            case 10:
                minute = "십분"; // 여기까지가 1~10분
                break;
            case 11:
                minute = "십일분";
                break;
            case 12:
                minute = "십이분";
                break;
            case 13:
                minute = "십삼분";
                break;
            case 14:
                minute = "십사분";
                break;
            case 15:
                minute = "십오분";
                break;
            case 16:
                minute = "십육분";
                break;
            case 17:
                minute = "십칠분";
                break;
            case 18:
                minute = "십팔분";
                break;
            case 19:
                minute = "십구분";
                break;
            case 20:
                minute = "이십분"; // 여기까지가 11~20분
                break;
            case 21:
                minute = "이십일분";
                break;
            case 22:
                minute = "이십이분";
                break;
            case 23:
                minute = "이십삼분";
                break;
            case 24:
                minute = "이십사분";
                break;
            case 25:
                minute = "이십오분";
                break;
            case 26:
                minute = "이십육분";
                break;
            case 27:
                minute = "이십칠분";
                break;
            case 28:
                minute = "이십팔분";
                break;
            case 29:
                minute = "이십구분";
                break;
            case 30:
                minute = "삽십분"; // 여기까지가 21~30분
                break;
            case 31:
                minute = "삼십일분";
                break;
            case 32:
                minute = "삼십이분";
                break;
            case 33:
                minute = "삼십삼분";
                break;
            case 34:
                minute = "삼십사분";
                break;
            case 35:
                minute = "삼십오분";
                break;
            case 36:
                minute = "삼십육분";
                break;
            case 37:
                minute = "삼십칠분";
                break;
            case 38:
                minute = "삼십팔분";
                break;
            case 39:
                minute = "삼십구분";
                break;
            case 40:
                minute = "사십분"; // 여기까지가 31~40분
                break;
            case 41:
                minute = "사십일분";
                break;
            case 42:
                minute = "사십이분";
                break;
            case 43:
                minute = "사십삼분";
                break;
            case 44:
                minute = "사십사분";
                break;
            case 45:
                minute = "사십오분";
                break;
            case 46:
                minute = "사십육분";
                break;
            case 47:
                minute = "사십칠분";
                break;
            case 48:
                minute = "사십팔분";
                break;
            case 49:
                minute = "사십구분";
                break;
            case 50:
                minute = "오십분"; // 여기까지가 41~50분
                break;
            case 51:
                minute = "오십일분";
                break;
            case 52:
                minute = "오십이분";
                break;
            case 53:
                minute = "오십삼분";
                break;
            case 54:
                minute = "오십사분";
                break;
            case 55:
                minute = "오십오분";
                break;
            case 56:
                minute = "오십육분";
                break;
            case 57:
                minute = "오십칠분";
                break;
            case 58:
                minute = "오십팔분";
                break;
            case 59:
                minute = "오십구분";
                break;
            case 00:
                minute = ""; // 여기까지가 51~60분
                break;
        }

        System.out.println(nowHour);
        System.out.println(hour);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((0 < nowHour && nowHour < 6) && hour.contains(boardArr[i][j])) {
                    boardArr[0][j] = WHITE_BOLD_BRIGHT + boardArr[0][j] + ANSI_RESET;
                    boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                } else if ((5 < nowHour && nowHour < 9) && hour.contains(boardArr[i][j])) {
                    boardArr[1][j] = WHITE_BOLD_BRIGHT + boardArr[1][j] + ANSI_RESET;
                    boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                } else if ((8 < nowHour && nowHour < 13) && hour.contains(boardArr[i][j])) {
                    boardArr[2][j] = WHITE_BOLD_BRIGHT + boardArr[2][j] + ANSI_RESET;
                    boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                }  else if (0 == nowHour && hour.contains(boardArr[i][j])) {
                    boardArr[2][j] = WHITE_BOLD_BRIGHT + boardArr[2][j] + ANSI_RESET;
                    boardArr[2][5] = WHITE_BOLD_BRIGHT + boardArr[2][5] + ANSI_RESET;
                }
            }
        }

        if (nowHour != 12) {
            boardArr[5][0] = ANSI_RESET + boardArr[5][0];
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









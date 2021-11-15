

public class Hangeulclock {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_Gray = "\u001B[37m";

    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE


    public static void main(String[] args) {
        //1.다차원 배열로 한글을 입력하여 출력보드를 만든다.
        //2.현재 시간을 1분 단위로 입력받는다.
        //3.각 시간(숫자)과 한글표기가 일치할때 볼드처리를 해준다.
        //3-1.일치하는지 찾는 방법은 스위치 케이스 문으로 하나씩 확인해본다.
        //2~3번을 반복한다.
        String[][] boardArr = new String[6][6];

        boardArr[0][0] = "한";
        boardArr[0][1] = "두";
        boardArr[0][2] = "세";
        boardArr[0][3] = "네";
        boardArr[0][4] = "다";
        boardArr[0][5] = "섯";

        boardArr[1][0] = "여";
        boardArr[1][1] = "섯";
        boardArr[1][2] = "일";
        boardArr[1][3] = "곱";
        boardArr[1][4] = "여";
        boardArr[1][5] = "덟";

        boardArr[2][0] = "아";
        boardArr[2][1] = "홉";
        boardArr[2][2] = "열";
        boardArr[2][3] = "한";
        boardArr[2][4] = "두";
        boardArr[2][5] = "시";

        boardArr[3][0] = "자";
        boardArr[3][1] = "이";
        boardArr[3][2] = "삼";
        boardArr[3][3] = "사";
        boardArr[3][4] = "오";
        boardArr[3][5] = "십";

        boardArr[4][0] = "정";
        boardArr[4][1] = "일";
        boardArr[4][2] = "이";
        boardArr[4][3] = "삼";
        boardArr[4][4] = "사";
        boardArr[4][5] = "육";

        boardArr[5][0] = "오";
        boardArr[5][1] = "오";
        boardArr[5][2] = "칠";
        boardArr[5][3] = "팔";
        boardArr[5][4] = "구";
        boardArr[5][5] = "분";


        for (int i = 0; i < boardArr.length; i++) {
            for (int j = 0; j < boardArr.length; j++) {
                if (boardArr[i][j].equals("삼")) {
                    System.out.print(WHITE_BOLD_BRIGHT + boardArr[i][j] + ANSI_RESET);
                } else if (j == 5) {
                    System.out.println(ANSI_WHITE + boardArr[i][j] + ANSI_RESET);
                } else {
                    System.out.print(ANSI_WHITE + boardArr[i][j] + ANSI_RESET);
                }

            }
        }

    }
}

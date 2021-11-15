import java.time.LocalDateTime;
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
                {"한","두","세","네","다","섯"},
                {"여","섯","일","곱","여","덟"},
                {"아","홉","열","한","두","시"},
                {"자","이","삼","사","오","십"},
                {"정","일","이","삼","사","육"},
                {"오","오","칠","팔","구","분"}
        };

        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
        String formatted = current.format(formatter);

        System.out.println(formatted.charAt(0));
        System.out.println(formatted.charAt(1));
        System.out.println(formatted.charAt(2));
        System.out.println(formatted.charAt(3));

        System.out.println(formatted.substring(0, 7));

        System.out.println(formatted.substring(0, 1));
        System.out.println(formatted.substring(2, 4));
        System.out.println(formatted.substring(5, 7));

        int nowHour = Integer.parseInt(formatted.substring(0,1));
        String hour = "";
        switch (nowHour) {
            case 1: hour = "한시";
                    break;
            case 2: hour = "한시";
                break;
            case 3: hour = "두시";
                break;
            case 4: hour = "세시";
                break;
            case 5: hour = "네시";
                break;
            case 6: hour = "다섯시";
                break;
            case 7: hour = "여섯시";
                break;
            case 8: hour = "일곱시";
                break;
            case 9: hour = "아홉시";
                break;
            case 10: hour = "열시";
                break;
            case 11: hour = "열한시";
                break;
        }




    }
}

import java.util.Scanner;

public class IndianName {
    public static void main(String[] args) {

        System.out.println("생년월일을 입력해주세요.");

        Scanner sc = new Scanner(System.in);
        int y1 = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        int y2 = y1%10;

        String year[] = {"말 많은","푸른","어두운","조용한","웅크린","백색","지혜로운","용감한","날카로운","욕심많은"};
        String month[] = {"늑대","태양","양","매","황소","불꽃","나무","달빛","말","돼지","하늘","바람"};
        String days[] = {"와 함께 춤을","의 기상","은 그림자속에","","","","의 환생","의 죽음","의 아래에서","을 보라","이 노래하다","의 그림자","의 일격","에게 쫓기는 남자","의 행진","의 왕","의 유령","을 죽인자","는 맨날 잠잔다","처럼","의 고향","의 전사","은 나의친구","의 노래,","의 정령","의 파수꾼","의 악마","와 같은 사나이","를 쓰러트린자","의 혼","은 말이없다"};

        System.out.println("당신의 이름은 "+year[y2]+" "+month[m-1]+days[d-1]);

    }
}

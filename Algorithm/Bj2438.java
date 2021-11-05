import java.util.Scanner;

public class Bj2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String dot = "";

        if (1 <= a && a <= 100) {
            for (int i = 1; i < a + 1; i++) {
                dot = dot + "*";
                System.out.println(dot);
            }
        }
    }
}



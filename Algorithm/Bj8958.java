import java.util.Scanner;

public class Bj8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cas = sc.nextInt();
        String[] casArr = new String[cas];


        for (int i = 0; i < cas; i++) {
            casArr[i] = sc.next();
        }

        for (int i = 0; i < casArr.length; i++) {
            int count = 0;
            int totalSum = 0;

            for (int j = 0; j < casArr[i].length(); j++) {
                if (casArr[i].charAt(j) == 'O') {
                    count++;
                    totalSum = totalSum + count;
                } else {
                    count = 0;
                }
            }
            System.out.println(totalSum);
        }
    }
}





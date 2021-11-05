import java.util.Scanner;

public class Bj2920 {
    private static String OUTPUT = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputArr = new int[8];

        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }

        for (int i = 0; i < inputArr.length-1; i++) {
            if(inputArr[i] - inputArr[i+1] == -1){
                OUTPUT = "ascending"; // 이부분을 원래 System.out.print로 했어서 값+값+값 이런식으로 나왔었다.
            }else if(inputArr[i] - inputArr[i+1] == 1){
                OUTPUT = "descending";
            }else{
                OUTPUT = "mixed";
                break;
            }
        }
        System.out.println(OUTPUT);
    }
}



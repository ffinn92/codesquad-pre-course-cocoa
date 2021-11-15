import javax.swing.*;
import java.awt.*;

public class Hangeulclock {
    public static void main(String[] args) {
        //1.다차원 배열로 한글을 입력하여 출력보드를 만든다.
        //2.현재 시간을 1분 단위로 입력받는다.
        //3.각 시간(숫자)과 한글표기가 일치할때 볼드처리를 해준다.
        //3-1.일치하는지 찾는 방법은 스위치 케이스 문으로 하나씩 확인해본다.
        //2~3번을 반복한다.
        String arr[] = new String[3];
        arr[0] = "가";
        arr[1] = "나";
        arr[2] = "다";

        JFrame frame = new JFrame();
        frame.setLocation(300, 300);
        frame.setPreferredSize(new Dimension(300, 300));
        Container contentPane = frame.getContentPane();

        JPanel panel = new JPanel();
        JLabel label0 = new JLabel(arr[0], SwingConstants.CENTER);
        JLabel label1 = new JLabel(arr[1], SwingConstants.CENTER);
        JLabel label2 = new JLabel(arr[2], SwingConstants.CENTER);
        Font font = new Font("궁서체", Font.BOLD, 40);

        label1.setFont(font);

        panel.add(label0);
        panel.add(label1);
        panel.add(label2);
        contentPane.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}

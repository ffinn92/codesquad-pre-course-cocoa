package D3;

import java.io.IOException;

public class OddOrEven {

    public static void main(String[] args) throws IOException {
        System.out.println("게임을 시작 하겠습니다.");

        Play play = new Play();
        Scoreboard scoreboard = new Scoreboard();

        play.inputData();
        scoreboard.inputPlayerGameData();

    }
}
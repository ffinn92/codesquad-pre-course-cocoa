package TimerProject;

import java.awt.*;
import java.awt.event.*;
import java.beans.EventHandler;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;

public class TitanTimerGuiVer {

    public static int tenCount;
    public static int tempoCount;
    public static int pauseCount;
    public static int restTimeCount;

    public static void main(String[] args) throws InterruptedException {

        Frame f = new Frame("Timer");
        f.setSize(300, 300);
        f.setLayout(null);

        Label setLabel = new Label("Set");
        Label repsLabel = new Label("Reps");
        Label restTimeLabel = new Label("RestTime");
        Label tempoLabel = new Label("Tempo");
        Label pauseLabel = new Label("Pause");

        TextField setField = new TextField(3);
        TextField repsField = new TextField(3);
        TextField restTimeField = new TextField(3);
        TextField tempoField = new TextField(3);
        TextField pauseField = new TextField(3);

        setLabel.setBounds(100, 100, 100, 100);

        f.add(setLabel);
        f.add(setField);

        f.add(repsLabel);
        f.add(repsField);

        f.add(restTimeLabel);
        f.add(restTimeField);

        f.add(tempoLabel);
        f.add(tempoField);

        f.add(pauseLabel);
        f.add(pauseField);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        //목표. 운동 1종목을 Set(S), Reps(R), RestTime(RT), Tempo(T), Pause(P), 5개의 기능을 통해 마무리 하기.

        //1. 셋트 수(Set)를 입력해주세요. **완료**
        //1-1. 셋트 수(Set) 입력(5개의 기능을 총 몇번 반복할것인지 결정) **완료**
        //2. 수행 횟수(Reps)를 입력해주세요. **완료**
        //3. 쉬는 시간(RestTime)을 입력해주세요.(분단위로 못받고 초단위로 받는걸로 수정) **완료**
        //4. 템포(Tempo)를 입력해주세요. (초 단위로 입력 ex) 5T(5초), 사운드 기능 추가) 사운드 기능 미구현
        //5. 퍼즈(Pause)를 입력해주세요. (초 단위로 입력 ex) 2P(2초), 사운드 기능 추가) 사운드 기능 미구현

        //6. 실행 하시겠습니까? 실행 or 재설정 을 입력해주세요. **완료**
        //6-1. 재설정 입력 시 원하는 설정으로 다시 설정 할 수 있게 하기(1.Set 2.Reps 3.RestTime 4.Tempo 5.Pause) **완료**
        //7. 각 세트 시작전에 언렉 후 준비시간으로 10초 카운트 사운드 기능 필요.( ex) 쉬는시간 30초중 마지막 20초 후 10초는 카운트) **완료**

        //8. 실행 선택 시 1회(Reps)로직 예시는 하기와 같다. (각 기능별 사운드 종류는 텍스트로 우선 표기) (예시는 3S / 10R / 1분30초RT / 5초T / 2초P)
        //8-1. 10초 카운트 사운드 (띠 X 9회) 10초일대는 템포 시작의 0초와 같으므로 9초까지만 카운트 (띠 X 9) **완료**
        //8-2. 5초 템포 시작. 8-1에서 0초(삑) 으로 시작 1초(띠) + 2초(띠) + 3초(띠) + 4초(띠) + 5초(띠) (삑 띠 띠 띠 띠 띠) 사운드 기능 미구현
        //8-3. 2초 퍼즈 시작 8-2에서 5초(띠) = 퍼즈 시작 0초 + 1초(띠) + 2초(띠) (띠 띠 띠) 사운드 기능 미구현
        //8-4. 리프팅을 1초로 가정하고 다음 횟수(Reps) 시작할때 0초부터 시작해야 하므로 0초를 의미하면서 다음 횟수(Reps) 시작을 의미하는 사운드 실행 (삑) 사운드 기능 미구현
        //8-5. 10회(Reps) 종료때까지 8-2 ~ 8-4 과정 반복 **완료**
        //8-6. 1Set 종료 후 쉬는시간 시작 **완료**
        //8-7. 쉬는시간 종료 10초 전 8-1 부터 시작하여 8-5까지 반복 **완료**
        //8-8. 마지막 셋트 후 6 으로 돌아가서 실행 or 재설정 선택 후 반복 **완료**

    }
}
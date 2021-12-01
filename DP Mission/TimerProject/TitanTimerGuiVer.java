package TimerProject;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TitanTimerGuiVer extends Frame {

    public static int tenCount = 10;

    public static void main(String[] args) {

        Frame f = new Frame("Timer");
        f.setSize(300, 300);
        f.setLayout(null);

        Label settingLabel = new Label("세트 수",Label.CENTER);
        Label repsLabel = new Label("수행횟수",Label.CENTER);
        Label restTimeLabel = new Label("휴식시간",Label.CENTER);
        Label tempoLabel = new Label("템포",Label.CENTER);
        Label pauseLabel = new Label("퍼즈",Label.CENTER);

        TextField settingField = new TextField(3);
        TextField repsField = new TextField(3);
        TextField restTimeField = new TextField(3);
        TextField tempoField = new TextField(3);
        TextField pauseField = new TextField(3);

        Panel inputPad = new Panel(new GridLayout(5,2));
        inputPad.setSize(150,260);
        inputPad.setLocation(0,35);

        inputPad.add(settingLabel);
        inputPad.add(settingField);
        inputPad.add(repsLabel);
        inputPad.add(repsField);
        inputPad.add(restTimeLabel);
        inputPad.add(restTimeField);
        inputPad.add(tempoLabel);
        inputPad.add(tempoField);
        inputPad.add(pauseLabel);
        inputPad.add(pauseField);

        Label timerLabel = new Label();
        Button startButton = new Button("Start");
        Button resetButton = new Button("Reset");

        String tenCountStr = String.format("%02d",tenCount);
        timerLabel.setBackground(Color.white);
        timerLabel.setBounds(153,35,144,114);
        timerLabel.setText(tenCountStr);
        timerLabel.setFont(new Font("Verdana",Font.BOLD,50));
        timerLabel.setAlignment(Label.CENTER);

        startButton.setBounds(150,150,75,150);
        resetButton.setBounds(225,150,75,150);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String setsText = settingField.getText();
                String repsText = repsField.getText();
                String restTimeText = restTimeField.getText();
                String tempoText = tempoField.getText();
                String pauseText = pauseField.getText();

                int setsInt = Integer.parseInt(setsText);
                int repsInt = Integer.parseInt(repsText);
                int restTimeInt = Integer.parseInt(restTimeText);
                int tempoInt = Integer.parseInt(tempoText);
                int pauseInt = Integer.parseInt(pauseText);
                
            }


        });

        f.add(inputPad);
        f.add(timerLabel);
        f.add(startButton);
        f.add(resetButton);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }

}
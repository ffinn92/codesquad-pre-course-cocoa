package TimerProject;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class CountSound {

    public static void countSound(){

        File file = new File("/Users/changhoonsong/Desktop/Java/cocoa/DP Mission/SoundEffect/tenCount.wav");

        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
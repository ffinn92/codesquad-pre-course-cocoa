import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SoundTest {
    public static void main(String[] args) {

        File file = new File("/Users/changhoonsong/Desktop/Java/cocoa/DP Mission/test.wav");

        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

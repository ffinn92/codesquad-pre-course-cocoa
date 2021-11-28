import java.awt.*;
import java.awt.event.*;

public class GrimPan extends Frame{
    MyCanvas can;
    public GrimPan() {
        super("그림판");
        can = new MyCanvas();
        can.setSize(700,500);
        add(can);
        can.setBackground(Color.white);
        can.setLocation(200,30);

        MyHandler my = new MyHandler();
        can.addMouseMotionListener(my);
    }

    class MyHandler extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            can.x=e.getX();
            can.y=e.getY();
            can.repaint();
        }
    }

    public static void main(String[] args) {

        GrimPan f = new GrimPan();
        f.setSize(1000,500);
        f.setLayout(null);

        Panel p = new Panel();
        p.setSize(200, 200);
        p.setLocation(0, 30);

        p.setLayout(new GridLayout(2, 2));

        p.add(new Button("사각형"));
        p.add(new Button("원"));
        p.add(new Button("직선"));
        p.add(new Button("곡선"));

        MenuBar mb = new MenuBar();
        Menu mFile = new Menu("파일");

        MenuItem miNew = new MenuItem("새로 만들기");
        MenuItem miOpen = new MenuItem("열기");
        Menu mOthers = new Menu("그외");
        MenuItem miExit = new MenuItem("나가기");

        mFile.add(miNew);
        mFile.add(miOpen);
        mFile.add(mOthers);
        mFile.addSeparator();
        mFile.add(miExit);

        MenuItem miPrint = new MenuItem("인쇄");
        MenuItem miPreview = new MenuItem("인쇄 미리보기");
        MenuItem miSetup = new MenuItem("인쇄 설정");
        mOthers.add(miPrint);
        mOthers.add(miPreview);
        mOthers.add(miSetup);

        Menu mEdit = new Menu("설정");
        Menu mView = new Menu("보기");
        Menu mHelp = new Menu("도움말");
        CheckboxMenuItem miStatusbar = new CheckboxMenuItem("상태바");
        mView.add(miStatusbar);

        mb.add(mFile);
        mb.add(mEdit);
        mb.add(mView);
        mb.setHelpMenu(mHelp);

        f.setMenuBar(mb);
        f.add(p);
        f.addWindowListener(new EventHandler());
        f.setVisible(true);
    }
}

class EventHandler implements WindowListener {
    public void windowOpened(WindowEvent e) {
    }

    public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }
}

class MyCanvas extends Canvas {
    int x = 0;
    int y = 0;

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        g.drawString("*", x, y);
    }

}

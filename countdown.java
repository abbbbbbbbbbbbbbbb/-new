package 軟體工程;
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class countdown {
    public static void main(String[] args) {

        JFrame jframe = new JFrame();
        JLabel jLabel = new JLabel();
        jframe.setLayout(new FlowLayout());
        jframe.setBounds(500, 300, 400, 100);

        jframe.add(jLabel);
        jframe.setVisible(true);

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            int x = 60;
                public void run() {

                jLabel.setText("Time left: " + x);
                x--;

                if (x < 0) {
                    timer.cancel();
                    jLabel.setText("Time Over");
                }
            }
        }, 0, 1000);
    }
}

package 軟體工程;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class finishnormal {
	finishnormal()
	{
		JFrame frame = new JFrame("Login KYUTES");
		   frame.setSize(600, 400);
		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   JPanel panel = new JPanel();    // 添加面板
		      frame.add(panel);
		      login(panel);
		      frame.setVisible(true);
	}
	  
	  private static void login(JPanel panel) {
	         panel.setLayout(null);

	         JLabel userLabel = new JLabel("normal");
	         userLabel.setBounds(160,20,80,25);        //setBounds(x, y, width, height)
	         panel.add(userLabel);

	         JButton loginButton = new JButton("返回");       
	         loginButton.setBounds(250, 100, 80, 25);
	         panel.add(loginButton);
	  
	  }
}


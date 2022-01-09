import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class login {
	
	public void identity(JPanel panel_) {
		JFrame frame = new JFrame("Login KYUTES");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();    // 添加面板
		frame.add(panel);
		frame.setVisible(true);
		panel.setLayout(null);	
		
		JLabel Label = new JLabel("選擇登入身份");
		Label.setBounds(250, 20, 100, 25);        //setBounds(x, y, width, height)
		panel.add(Label);
		JButton loginButton1 = new JButton("學生登入");       //登入按鈕
		loginButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginStudent A02 = new loginStudent();
				A02.loginStudent(panel);
				frame.dispose();
			}
		});
		loginButton1.setBounds(135, 70, 96, 23);
		panel.add(loginButton1);

		JButton loginButton2 = new JButton("管理員登入");     //登入按鈕
		loginButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginManager A02 = new loginManager();
				A02.loginManager(panel);
				frame.dispose();
			}
		});
		loginButton2.setBounds(335, 70, 96, 23);
		panel.add(loginButton2);	
	}

}


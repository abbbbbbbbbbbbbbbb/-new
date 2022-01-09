package 軟體工程;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class 選擇群組 {
	
	public 選擇群組() {
		JFrame frame = new JFrame("Login KYUTES");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();    // 添加面板
		frame.add(panel);
		frame.setVisible(true);
		panel.setLayout(null);	
		
		JLabel Label = new JLabel("選擇群組");
		Label.setBounds(250, 20, 100, 25);        //setBounds(x, y, width, height)
		panel.add(Label);
		JButton loginButton1 = new JButton("學科組");       //登入按鈕
		loginButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subject s = new subject();
				s.subject(panel);
				frame.dispose();
			}
		});
		loginButton1.setBounds(135, 70, 96, 23);
		panel.add(loginButton1);

		JButton loginButton2 = new JButton("體育組");     //登入按鈕
		loginButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Function體育();
				frame.dispose();
			}
		});
		loginButton2.setBounds(335, 70, 96, 23);
		panel.add(loginButton2);	
	}

	public void 選擇群組(JPanel panel) {
		// TODO Auto-generated method stub
		
	}

}



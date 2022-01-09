package 軟體工程;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class loginManager{
	public void loginManager(JPanel panel_) {		
		JFrame frame = new JFrame("Login Manager");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();    // 添加面板
		frame.add(panel);
		panel.setLayout(null);
		frame.setVisible(true);


		JLabel userLabel = new JLabel("帳號:");
		userLabel.setBounds(160,20,80,25);                        //setBounds(x, y, width, height)
		panel.add(userLabel);

		JTextField userText = new JTextField(20);                 //輸入帳號
		userText.setBounds(250,20,165,25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("密碼:");   
		passwordLabel.setBounds(160,50,80,25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);     //輸入密碼
		passwordText.setBounds(250,50,165,25);
		panel.add(passwordText);

		JButton registerButton = new JButton("註冊");               //註冊按鈕
		registerButton.setBounds(250, 140, 80, 25);
		panel.add(registerButton);

		JButton loginButton = new JButton("登入");               //登入按鈕
		loginButton.setBounds(250, 100, 80, 25);
		panel.add(loginButton);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager m = new Manager();
				m.Manager(panel);
				frame.dispose();
			}
		});
		
		JButton Button1 = new JButton("上一頁");       
        Button1.setBounds(10, 10, 96, 23);
        panel.add(Button1);
        Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login = new login();
				login.identity(panel);
				frame.dispose();
			}
		});
        
	}

}



import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.*;
import javax.swing.*;

public class loginStudent{
	public static int count;
	public static String []user = new String[100];
	public static String []password = new String[100];
	public static void st() {
		File csv = new File("/Users/shenyuting/Desktop/學生帳密.csv");  // CSV檔案路徑
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(csv));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String line = "";
		String[] everyLine ;
		count = 0;
		try {
			List<String> allString = new ArrayList<>();
			while ((line = br.readLine()) != null){
				everyLine = line.split(",");
				user[count]=everyLine[0];
				password[count]=everyLine[1];	
				count++;
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Object userText;
	public void loginStudent(JPanel panel_) {		
		JFrame frame = new JFrame("Login Student");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();                              // 添加面板
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

		JButton registerButton = new JButton("註冊");             //註冊按鈕
		registerButton.setBounds(250, 140, 80, 25);
		panel.add(registerButton);
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerStudent A02 = new registerStudent();
				A02.registerStudent(panel);
				frame.dispose();
			}
		});
		
		JButton loginButton = new JButton("登入");                //登入按鈕
		loginButton.setBounds(250, 100, 80, 25);
		panel.add(loginButton);


		JButton loginButton1 = new JButton("上一頁");       
		loginButton1.setBounds(10, 10, 96, 23);
		panel.add(loginButton1);
		loginButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login = new login();
				login.identity(panel);
				frame.dispose();
			}
		}); 
		boolean have = false;                                   //用來判斷帳密是否成立

		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				st();
				String User = userText.getText();
				String Password = passwordText.getText();
				boolean have = false;
				for(int i = 0; i < count;i++) {
					if(User.equals(user[i]) && Password.equals(password[i])) {
						have = true;
						break;
					}
				}
				if(have) {
					subject A03 = new subject();
					A03.subject(panel);
					frame.dispose();
				}
				else
					JOptionPane.showMessageDialog(null,"帳密錯誤","error",JOptionPane.YES_NO_OPTION);
			}
		});
	}
}


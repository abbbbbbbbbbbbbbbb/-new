import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class ManyUser {
	public static int count;
	public static String []user = new String[100];
	public static String []password = new String[100];
	public static void ma() {
		//	public static void main(String[] args) {
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
	public static void registerMA(String User,String Password) {
		//		String user = "zoe135790";
		//		String password = "zoe097531";
		try {
			File csv = new File("/Users/shenyuting/Desktop/學生帳密.csv");  // CSV檔案路徑
			BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true));
			//新增一行資料
			bw.newLine();
			bw.write(User + "," + Password);
			bw.close();
		} catch (FileNotFoundException e) {
			//捕獲File物件生成時的異常
			e.printStackTrace();
		} catch (IOException e) {
			//捕獲BufferedWriter物件關閉時的異常
			e.printStackTrace();
		}
	}
	public void ManyUser(JPanel panel_) {		
		JFrame frame = new JFrame("register Manager");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();                              // 添加面板
		frame.add(panel);
		panel.setLayout(null);
		frame.setVisible(true);

		JLabel user1Label = new JLabel("新增開始帳號:");
		user1Label.setBounds(160,20,100,25);                        //setBounds(x, y, width, height)
		panel.add(user1Label);

		JTextField user1Text = new JTextField(20);                 //輸入帳號
		user1Text.setBounds(250,20,165,25);
		panel.add(user1Text);

		JLabel user2Label = new JLabel("新增結束帳號:");
		user2Label.setBounds(160,50,100,25);                        //setBounds(x, y, width, height)
		panel.add(user2Label);

		JTextField user2Text = new JTextField(20);                 //輸入帳號
		user2Text.setBounds(250,50,165,25);
		panel.add(user2Text);

		JLabel passwordLabel = new JLabel("新增密碼:");   
		passwordLabel.setBounds(160,80,80,25);
		panel.add(passwordLabel);

		JTextField passwordText = new JTextField(20);            //輸入密碼
		passwordText.setBounds(250,80,165,25);
		panel.add(passwordText);

		JButton loginButton = new JButton("確認");                //確認按鈕
		loginButton.setBounds(250, 130, 80, 25);
		panel.add(loginButton);


		JButton loginButton1 = new JButton("返回登入頁面");       
		loginButton1.setBounds(10, 10, 120, 23);
		panel.add(loginButton1);
		loginButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager M = new Manager();
				M.Manager(panel);
				frame.dispose();
			}
		});                         

		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ma();                                           //讀取excel
				String Start = user1Text.getText();
				String End = user2Text.getText();
				int start = Integer.parseInt(Start);
				int end = Integer.parseInt(End);
				String Password = passwordText.getText();
				boolean have = false;                           //用來判斷帳密是否成立
				for(int j = start; j <= end; j++) {
					String s = Integer.toString(j);
					for(int i = 0; i < count; i++) {
						if(s.equals(user[i])) {
							have = true;
							break;
						}
					}				
					if(have) {
						break;					
					}
					else {
						registerMA(s,Password);
					}						
				}
				if(!have)
					JOptionPane.showMessageDialog(null,"註冊成功(*´∀`)~","success",JOptionPane.PLAIN_MESSAGE);
				else
					JOptionPane.showMessageDialog(null,"其中包含已被註冊的帳號","error",JOptionPane.WARNING_MESSAGE);

			}
		});
	}

}

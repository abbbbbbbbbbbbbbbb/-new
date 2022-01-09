package 軟體工程;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class subject_easy{
	 
	 public void subject_easy(JPanel panel_) {
		    JFrame frame = new JFrame("KYUTES     ");
			frame.setSize(600, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel panel = new JPanel();    // 添加面板
			frame.add(panel);
			//panel.setLayout(null);
			frame.setVisible(true);
	        panel.setLayout(null);
	        
	        JLabel Label = new JLabel("選擇測驗科目");
	        Label.setBounds(250, 20, 100, 25);              //setBounds(x, y, width, height)
	        panel.add(Label);
	        JLabel Label1 = new JLabel("國文");
	        Label1.setBounds(170, 50, 96, 23);              //setBounds(x, y, width, height)
	        panel.add(Label1);
	        JLabel Label2 = new JLabel("英文");
	        Label2.setBounds(270, 50, 96, 23);              //setBounds(x, y, width, height)
	        panel.add(Label2);
	        JLabel Label3 = new JLabel("數學");
	        Label3.setBounds(370, 50, 96, 23);              //setBounds(x, y, width, height)
	        panel.add(Label3);
	        
	        JButton Button1 = new JButton("國文練習");       //國文練習按鈕
	        Button1.setBounds(135, 100, 96, 23);
	        panel.add(Button1);
	        Button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Function國文practice();
					frame.dispose();
				}
			});
	        JButton Button2 = new JButton("英文練習");       //英文練習按鈕
	        Button2.setBounds(235, 100, 96, 23);
	        panel.add(Button2);
	        Button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Function英文practice();
					frame.dispose();
				}
			});
	        JButton Button3 = new JButton("數學練習");       //數學練習按鈕
	        Button3.setBounds(335, 100, 96, 23);
	        panel.add(Button3);
	        Button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Function數學practice();
					frame.dispose();
				}
			});
	        
	        JButton Button1_ = new JButton("國文測驗");       //國文測驗按鈕
	        Button1_.setBounds(135, 140, 96, 23);
	        panel.add(Button1_);
	        Button1_.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Function國文1();
					frame.dispose();
				}
			});
	        JButton Button2_ = new JButton("英文測驗");       //英文測驗按鈕
	        Button2_.setBounds(235, 140, 96, 23);
	        panel.add(Button2_);
	        Button2_.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Function英文1();
					frame.dispose();
				}
			});
	        JButton Button3_ = new JButton("數學測驗");       //數學測驗按鈕
	        Button3_.setBounds(335, 140, 96, 23);
	        panel.add(Button3_);
	        Button3_.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Function數學1();
					frame.dispose();
				}
			});
	        JButton Buttoncheck = new JButton("查詢成績");       //查詢成績按鈕
	        Buttoncheck.setBounds(450, 300, 96, 23);
	        panel.add(Buttoncheck);
	        Buttoncheck.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new 成績查詢();
					//成績查詢 login = new 成績查詢();
					//login.成績查詢(panel);
					frame.dispose();
				}
			});
	        
	        JButton logout = new JButton("登出");     //登出按鈕
	        logout.setBounds(450, 20, 96, 23);
			panel.add(logout);
			logout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					login login = new login();
					login.identity(panel);
					frame.dispose();
				}
			});
	        /*JMenu menu = new JMenu("J");
	        menu.setBounds(10, 90, 96, 23);
	        panel.add(menu);*/
	        
	        /*JRadioButton radiobutton = new JRadioButton("JRadiobutton");
	        radiobutton.setBounds(114, 90, 96, 23);
	        panel.add(radiobutton);*/
	    }

	}
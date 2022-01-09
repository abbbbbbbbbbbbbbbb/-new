package 軟體工程;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class 成績查詢 {
	//public void 成績查詢(JPanel panel_){
	成績查詢() {
		    JFrame frame = new JFrame("成績查詢     ");
			frame.setSize(600, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel panel = new JPanel();    // 添加面板
			frame.add(panel);
			//panel.setLayout(null);
			frame.setVisible(true);
	        panel.setLayout(null);
		   	 			

	            File getCSVFiles = new File("C:\\Users\\Jacky\\Desktop\\活頁簿1.csv");
	            Scanner sc;
				try {
					sc = new Scanner(getCSVFiles);
					sc.useDelimiter("\n");
										
		          
		            JLabel userLabel = new JLabel(sc.next());
					userLabel.setBounds(300,20,80,25);                        //setBounds(x, y, width, height)
					panel.add(userLabel);

					 JLabel user2Label = new JLabel(sc.next());
						user2Label.setBounds(300,50,80,25);                        //setBounds(x, y, width, height)
						panel.add(user2Label);

						 JLabel user3Label = new JLabel(sc.next());
							user3Label.setBounds(300,80,80,25);                        //setBounds(x, y, width, height)
							panel.add(user3Label);
							
							 sc.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
	     
				
					
					

	        }
		}





package 軟體工程;
import javax.swing.*;

import java.awt.Container;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class finish{
	    finish(){
		JFrame frame = new JFrame("KYUTES     ");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();    // 添加面板
		frame.add(panel);
		frame.setVisible(true);
		panel.setLayout(null);
		JLabel Label = new JLabel("你的成績是：Good");
        Label.setBounds(250, 200, 100, 25);              //setBounds(x, y, width, height)
        panel.add(Label);  
        File ans = new File("C:\\Users\\Jacky\\Desktop\\活頁簿1.csv");
        try {
			FileWriter out = new FileWriter(ans, true);
			out.write(
			   "good\n");
			out.flush();
			out.close();
		} catch (IOException x) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
        
        JButton Return = new JButton("重新選擇科目");     //返回按鈕
		Return.setBounds(10, 10, 120, 23);
		panel.add(Return);
		Return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subject_difficult A03 = new subject_difficult();
				A03.subject_difficult(panel);
				frame.dispose();
			}
		});
		JButton test = new JButton("正式測驗");     //返回按鈕
		test.setBounds(10, 10, 96, 23);
		panel.add(test);
		test.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subject_difficult A03 = new subject_difficult();
				A03.subject_difficult(panel);
				frame.dispose();
			}
		});
        
		}
	}




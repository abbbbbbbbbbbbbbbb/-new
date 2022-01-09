package 軟體工程;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;//声明导入的类

import java.lang.Math;
import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.Timer;
public class renew英文1 {
	renew英文1(){
	//public static void main(String[] args) {
		new E1Frame().launchFrame();
	//}
}
class E1Frame extends Frame{
	TextField question,a,b,c,d,answer;
	Map<String,String> ppt = new HashMap();
	public void launchFrame() {
		question = new TextField(10);
		a = new TextField(15);
		b = new TextField(20);
		c = new TextField(25);
		d = new TextField(30);
		answer = new TextField(35);
		Label a1 = new Label("question");
		Label a2 = new Label("A");
		Label a3 = new Label("B");
		Label a4 = new Label("C");
		Label a5 = new Label("D");
		Label a6 = new Label("answer");
		Button button1 = new Button("input");
		Button button2 = new Button("ouput");
		button1.addActionListener(new Montitor3());
		button2.addActionListener(new Montitor4());
		setLayout(new FlowLayout());
		add(a1);
		add(question);
		add(a2);
		add(a);
		add(a3);
		add(b);
		add(a4);
		add(c);
		add(a5);
		add(d);
		add(a6);
		add(answer);
		add(button1);
		add(button2);
		pack();
		setVisible(true);
		this.addWindowListener(new WindowMonitor());
	}
	private class Montitor3 implements ActionListener{
		public void actionPerformed(ActionEvent g) {
			String s1 = question.getText();
			String s2 = a.getText();
			String s3 = b.getText();
			String s4 = c.getText();
			String s5 = d.getText();
			String s6 = answer.getText();
			ppt.put(s1 + "}\n&&\n"+ "{=A、"+s2+"}\n&&\n"+"{=B、"+s3+"}\n&&\n"+"{=C、"+s4+"}\n&&\n"+"{=D、"+s5+"}\n&&\n{",s6);
			System.out.println(ppt);
			System.out.println(s5);
		}
	}
	private class Montitor4 implements ActionListener{
		public void actionPerformed(ActionEvent k) {
			String filea = "C:\\Users\\Jacky\\Desktop\\ENGLISH1.txt";
			try {
				FileWriter out = new FileWriter(filea, true);
				out.write("\n&&"+"\n");
				out.write(String.valueOf(ppt));
				out.close();
			}catch (IOException g) {
				g.printStackTrace();
			}
			question.setText("");
			a.setText("");
			b.setText("");
			c.setText("");
			d.setText("");
			answer.setText("");
		}
	}
	class WindowMonitor extends WindowAdapter{
		public void windowClosing(WindowEvent g) {
			setVisible(false);
			System.exit(0);
		}
	}
}
}



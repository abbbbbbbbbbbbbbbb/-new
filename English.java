import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

public class English {

	public void subject(JPanel panel_) {
		JFrame frame = new JFrame("KYUTES     ");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();    // 添加面板
		frame.add(panel);
		frame.setVisible(true);
		panel.setLayout(null);
		
		JLabel Label = new JLabel("難度：");
        Label.setBounds(250, 10, 100, 25);              //setBounds(x, y, width, height)
        panel.add(Label);
        
        JButton loginButton = new JButton("交卷");       //交卷按鈕
        loginButton.setBounds(255, 345, 96, 23);
        panel.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score A05 = new score();
				A05.score(panel);
				frame.dispose();
			}
		});
        
        
        JButton Return = new JButton("上一頁");                      //返回按鈕
		Return.setBounds(10, 10, 96, 23);
		panel.add(Return);
		Return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subject A03 = new subject();
				A03.subject(panel);
				frame.dispose();
			}
		});

	}
}

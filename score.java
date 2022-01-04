import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

public class score {
	public void score(JPanel panel_) {
		JFrame frame = new JFrame("KYUTES     ");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();    // 添加面板
		frame.add(panel);
		frame.setVisible(true);
		panel.setLayout(null);
		
		JLabel Label = new JLabel("你的成績是：");
        Label.setBounds(250, 200, 100, 25);              //setBounds(x, y, width, height)
        panel.add(Label);
        
        JButton Return = new JButton("重新選擇科目");     //返回按鈕
		Return.setBounds(10, 10, 120, 23);
		panel.add(Return);
		Return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subject A03 = new subject();
				A03.subject(panel);
				frame.dispose();
			}
		});
		JButton test = new JButton("正式測驗");     //返回按鈕
		test.setBounds(10, 10, 96, 23);
		panel.add(test);
		test.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subject A03 = new subject();
				A03.subject(panel);
				frame.dispose();
			}
		});
        

	}

}

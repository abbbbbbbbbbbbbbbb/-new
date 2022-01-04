import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Manager {

	public void Manager(JPanel panel_) {
		JFrame frame = new JFrame("KYUTES     ");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();    // 添加面板
		frame.add(panel);
		frame.setVisible(true);
		panel.setLayout(null);
		
		JButton Button1 = new JButton("帳號管理");       //帳號管理按鈕
		Button1.setBounds(225, 45, 96, 50);
		panel.add(Button1);
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*A05 A05 = new A05();
				A05.score(panel);
				frame.dispose();*/
			}
		});
		JButton Button2 = new JButton("測驗群組管理");       //測驗群組管理按鈕
		Button2.setBounds(225, 115, 96, 50);
		panel.add(Button2);
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*A05 A05 = new A05();
				A05.score(panel);
				frame.dispose();*/
			}
		});
		JButton logout = new JButton("登出");     //返回按鈕
        logout.setBounds(450, 20, 96, 23);
		panel.add(logout);
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login = new login();
				login.identity(panel);
				frame.dispose();
			}
		});
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"確認登出？","logout",JOptionPane.YES_NO_OPTION);
			}
		});
	}

	
	

}

import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) { 
		login login1 = new login();
		JPanel panel = new JPanel();    // 添加面板		
		login1.identity(panel);		
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteData {
	

	public static void main(String[] args) {
		String user = "zoe135790";
		String password = "zoe097531";
		try {
		File csv = new File("C:\\FakeD\\�j�G\\�n�u����\\userdata.csv");  // CSV�ɮ׸��|
		BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true));
		//�s�W�@����
		bw.newLine();
		bw.write("" + "," + user + "," + password);
		bw.close();
		} catch (FileNotFoundException e) {
		        //����File����ͦ��ɪ����`
		e.printStackTrace();
		} catch (IOException e) {
		        //����BufferedWriter���������ɪ����`
		e.printStackTrace();
		}

	}
	

}

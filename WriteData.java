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
		File csv = new File("C:\\FakeD\\大二\\軟工期末\\userdata.csv");  // CSV檔案路徑
		BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true));
		//新增一行資料
		bw.newLine();
		bw.write("" + "," + user + "," + password);
		bw.close();
		} catch (FileNotFoundException e) {
		        //捕獲File物件生成時的異常
		e.printStackTrace();
		} catch (IOException e) {
		        //捕獲BufferedWriter物件關閉時的異常
		e.printStackTrace();
		}

	}
	

}

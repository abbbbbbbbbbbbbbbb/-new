import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadData {
	public static void main(String[] args) {
	    File csv = new File("C:\\FakeD\\大二\\軟工期末\\userdata.csv");  // CSV檔案路徑
	    BufferedReader br = null;
	    try {
	        br = new BufferedReader(new FileReader(csv));
	    }
	    catch (FileNotFoundException e) {
	    e.printStackTrace();
	    }
	    String line = "";
	    String everyLine = "";
	    try {
	        List<String> allString = new ArrayList<>();
	        while ((line = br.readLine()) != null){
	        everyLine = line;
			System.out.println(everyLine);
			allString.add(everyLine);
			}
	    System.out.println("csv表格中所有行數：" + allString);
	} catch (IOException e) {
	        e.printStackTrace();
	}

	}
}
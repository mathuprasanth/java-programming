package FileProgram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		
		try {
			FileWriter f=new FileWriter("E:\\mathu\\mathu.txt");
			f.write("hello i am mathu prasanth i am from erode"
					+ "i have complete bsc in erode arts and science college");
			f.close();
			System.out.println("write successfully");
			
		}
		catch (IOException e) {
          System.out.println("no write");
			e.printStackTrace();
		}
	}
}

		
			
		
		
		
	



package FileProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		File mathu=new File("C:\\mathu\\prasanth.txt");
		try {
			Scanner s=new Scanner(mathu);
	
			while(s.hasNextLine())
			{
				String name=s.nextLine();
				System.out.println(name);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

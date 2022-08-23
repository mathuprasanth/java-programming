package FileProgram;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreat {

	public static void main(String[] args) {
		File f=new File("C:\\mathu\\logu.txt");
		try {
			if(f.createNewFile())
			{
				System.out.println("file is creat");
			}else
			{
				System.out.println("no file");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}

package FileProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDelete {

	public static void main(String[] args) {
		
		File f=new File("E:\\madhu1\\mathu.txt");
		if(f.delete())
		{
			System.out.println(f.getName() + "file is delete");
		}else
		{
			System.out.println("not delete");
		}
	}
	}

	

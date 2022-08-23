package FileProgram;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		
    File f= new File("C:\\mathu\\mathu.txt");
    if(f.exists())
    {
    	System.out.println("the file is execute?="+f.canExecute());
    	System.out.println("the file is readable?="+f.canRead());
    	System.out.println("the file is write?="+f.canWrite());
    	System.out.println("the file is a file?="+f.isFile());
    	System.out.println("the file path is="+f.getPath());
    	System.out.println("the file name="+f.getName());
    	System.out.println("the file parent is="+f.getParent());
    }else
    {
    	System.out.println("file is not exist");
    }
	}

}

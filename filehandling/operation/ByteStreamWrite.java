package com.jspiders.filehandling.operation;
import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;
public class ByteStreamWrite {
    public static void main(String[] args) throws IOException  {
		File file=new File("Demo3.txt");
		
		if(file.exists()) {
			FileOutputStream  fileOutputStream = new FileOutputStream(file);
			
			fileOutputStream.write(6576);
			
			System.out.println("Data write to the file");
			
			fileOutputStream.close();
		}
		else {
			file.createNewFile();
			System.out.println("file is created");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			
			fileOutputStream.write(6546354);
			System.out.println(" Data write to the file");
			fileOutputStream.close();
		}
	}
}

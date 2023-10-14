package com.jspiders.filehandling.operation;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ByteStreamReader {
   public static void main(String[] args) throws IOException  {
	 File file = new File("Demo2.txt");
	 if(file.exists()) {
		 FileInputStream fileInputStream = new FileInputStream(file);
		 
		 System.out.println(fileInputStream.read());
		 System.out.println("Data is fetched from the file ");
		 
		 fileInputStream.close();
	 }
	 else
	 {
		 System.out.println("file does not exists");
	 }
	 
	 }
}

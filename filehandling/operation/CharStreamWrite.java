package com.jspiders.filehandling.operation;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class CharStreamWrite {
          public static void main(String[] args) throws IOException {
        	  
			File file = new File("Demo3.txt");
			
			if(file.exists()) {
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("Hello DIVYA WHere are you,You are so Busy now, I am Waiting  for you come Fast... ");
				System.out.println(" Data write to the file ");
				fileWriter.close();
			}
			else {
				file.createNewFile();
				System.out.println("FIle is crated");
				FileWriter fileWriter= new FileWriter(file);
				fileWriter.write("Hello DIVYA WHere are you,You are so Busy now, I am Waiting  for you come Fast... ");
				System.out.println("Data write to the file");
				fileWriter.close();
			}
        	  
		}
}

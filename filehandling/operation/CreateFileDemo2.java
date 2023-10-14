package com.jspiders.filehandling.operation;
import java.io.File;
import java.io.IOException;
public class CreateFileDemo2 {
    public static void main(String[] args) {
		File file = new File("C:\\Users\\Swami\\eclipse_workspace\\filehandling\\Demo2.txt");
		
		try {
			file.createNewFile();
			System.out.println("file is created");
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("File is not created");
		}
		
	}   
	
}

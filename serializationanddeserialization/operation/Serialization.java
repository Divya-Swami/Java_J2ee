//Serialization is used to convert java Object into byte Stream data (Network supported Format 

package com.jspiders.serializationanddeserialization.operation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	
	public static void main(String[] args) throws IOException{
		
		File file = new File("Demo.txt");
		
		if(file.exists()) {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(new Student(8,"divya","div@gmail.com",23,7600));
			
			System.out.println("Data stored ");
			
			objectOutputStream.close();
			fileOutputStream.close();
		}
			
			else {
				file.createNewFile();
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
				objectOutputStream.writeObject(new Student(8,"divya","div@gmail.com",23,7600));
				
				System.out.println("Data stored");
				
				objectOutputStream.close();
				fileOutputStream.close();
				
			}
			
		
	}

}

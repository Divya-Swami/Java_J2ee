//Deserialization is used to convert Byte Stream Object(Network supported format ) into Java Object
package com.jspiders.serializationanddeserialization.operation;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Deserialization {

	public static void main(String[] args) throws IOException ,  ClassNotFoundException {
		
		File file = new File("Demo.txt");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		
		Student student =(Student)objectInputStream.readObject();
		System.out.println(student);
		System.out.println("Object fetched from the file");
		fileInputStream.close();
		objectInputStream.close();
	}
}

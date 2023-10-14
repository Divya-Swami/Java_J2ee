package com.jspiders.filehandling.operation;
import java.io.File;
public class FileInfo {
        public static void main(String[] args) {
			File file = new File("Demo2.txt");
			
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());
			
			if(file.canRead()) {
				System.out.println("file is readable");
			}
			else {
				System.out.println("file is not readable");
			}
			
			if(file.canWrite()) {
				System.out.println("file is Writable");
			}
			else {
				System.out.println("File is not Writable");
			}
			
			if(file.canExecute()) {
				System.out.println("file is Executable");
			}
			else {
				System.out.println("file is not Executable");
			}
		}
}

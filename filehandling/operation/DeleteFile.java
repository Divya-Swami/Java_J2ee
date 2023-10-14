package com.jspiders.filehandling.operation;
import java.io.File;

public class DeleteFile {
        public static void main(String[] args) {
			File file = new File("Demo1.txt");
			if(file.exists()) {
				file.delete();
				System.out.println("file is deleted");
			}
			else {
				System.out.println("File is not exists");
			}
		}
}

package org.demo;

import java.io.File;
import java.io.IOException;

public class Files {
	public static void main(String[] args) throws Throwable {
		File f= new File("/Users/sai/Downloads/d");
		
		//boolean directory = f.isDirectory();
		
		//System.out.println(directory);
		/*boolean file = f.isFile();
		System.out.println(file);
		
		String[] list = f.list();
		for (String s : list) {
			System.out.println(s);	
		} */
		
		File[] listFiles = f.listFiles();
		for (File fi : listFiles) {
			System.out.println(fi);
			
		}
		
	}

}

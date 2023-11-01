package org.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FilePractice {
	public static void main(String[] args) throws Throwable {
		
		File f=new File("/Users/sai/Downloads/d/d2.txt");
		/*
		//boolean createNewFile = f.createNewFile();
		
		//System.out.println(createNewFile);
		f.setWritable(true);
		
	    FileUtils.write(f, "java is a programming language"
	    		+ "\n it is a simple"
	    		+ "\nmulti Threading"
	    		+ "\nmore Secure"
	    		+ "\nsupprting OOPS concepts"
	    		+ "\nfreeWare"
	    		+ "\nabstraction"
	    		+ "\ninheritance"
	    		+ "\npolymorphism"
	    		+ "\nencapsulation");*/
	    
		/* 2 File f=new File("/Users/sai/Downloads/c");
		boolean directory = f.isDirectory();
		if (directory==true) {
			System.out.println("ditectory is there");
			
		} else {
			boolean mkdir = f.mkdir();
			System.out.println(mkdir);

		}
		//System.out.println(directory);
	 */
	}

}

package org.demo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Files2 {
	public static void main(String[] args) throws Throwable {
		File f=new File("/Users/sai/Downloads/d/d.txt");
	   
		FileUtils.write(f, "hai sister");
		System.out.println("good practice");
		f.setWritable(true);//allow to write 
		FileUtils.write(f, "brother ");
		FileUtils.write(f, "java language", true);//add previous string+ new sting 
		
        List<String> readLines = FileUtils.readLines(f);
        System.out.println(readLines);
        String readFileToString = FileUtils.readFileToString(f);
        System.out.println(readFileToString);
        System.out.println("welcome");
        
		
	}

}

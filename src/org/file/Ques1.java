package org.file;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Ques1 {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\java\\java.txt");
	boolean a = f.mkdir();
	System.out.println(a);
	
	boolean b = f.createNewFile();
	System.out.println(b);
	
	System.out.println("Rushan 2");
	System.out.println("Rushan 2");
	System.out.println("Rushan 2");
	System.out.println("Rushan 2");
	System.out.println("Rushan 2");
	
	
}
}

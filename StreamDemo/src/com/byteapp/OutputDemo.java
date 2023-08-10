package com.byteapp;
import java.io.*;

public class OutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fs=new FileOutputStream("C:\\Users\\e019816\\Documents\\IOFiles//file.txt");
			String str="Hello world!Welcome";
			byte[] bt=str.getBytes();
			fs.write(bt);
			fs.flush();
			fs.close();
			System.out.println("File created");
		}
		catch(IOException ex) {
			
		}
	}

}

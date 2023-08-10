package com.byteapp;
import java.io.*;
public class ReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader r=new FileReader("C:\\Users\\e019816\\Documents\\IOFiles//Demo.txt");
		char[] cs=new char[50];
		r.read(cs);
		System.out.println(cs);
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
			
		}
		catch(IOException e1) {
			System.out.println(e1);
		}

	}

}

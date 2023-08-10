package com.byteapp;
import java.io.*;
public class InputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\e019816\\Documents\\IOFiles//file.txt");
			byte[] bt=new byte[20];
			fin.read(bt);
			for(byte b:bt) {
				System.out.println((char)b);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

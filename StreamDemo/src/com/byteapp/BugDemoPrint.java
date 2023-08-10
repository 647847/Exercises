package com.byteapp;

import java.io.FileInputStream;

public class BugDemoPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\e019816\\Documents\\IOFiles//buginfo.txt");
			byte[] bt=new byte[fin.available()];
			fin.read(bt);
			for(byte b:bt) {
				System.out.print((char)b);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

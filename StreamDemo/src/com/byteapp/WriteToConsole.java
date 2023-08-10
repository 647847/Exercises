package com.byteapp;

import java.io.PrintStream;

public class WriteToConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		PrintStream pout=System.out;
		pout.write("Hello world".getBytes());
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

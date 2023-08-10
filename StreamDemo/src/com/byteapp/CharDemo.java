package com.byteapp;
import java.io.*;


public class CharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			PrintWriter w=new PrintWriter(new FileWriter("C:\\Users\\e019816\\Documents\\IOFiles//Demo.txt"));
			w.write("Employee Name:Peter Sam Joes");
			 w.write("Department : Sales"); 
			 w.write("Designation : Manager"); 
			 w.write("Salary :35000");
			w.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

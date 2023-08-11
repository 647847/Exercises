package com.byteapp;
import java.io.*;
public class CallRecords {
	public void Call(CallQuality call) {
		try {
			FileOutputStream fileout=new FileOutputStream(call.getcustomerName()+"C:\\Users\\e019816\\Documents\\IOFiles\\file.txt");
			 ObjectOutputStream objectout=new ObjectOutputStream(fileout);
			 objectout.writeObject(call);
			 objectout.flush();
			 objectout.close();
		}
		catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		 catch(IOException e1)
		 {
			 System.out.println(e1);
		 }
	}
	public void displayCall(String name) {
		try {
			FileInputStream filein =new FileInputStream(name+"C:\\Users\\e019816\\Documents\\IOFiles//file.txt");
			ObjectInputStream objectin=new ObjectInputStream(filein);
			CallQuality call =(CallQuality)objectin.readObject();
			
			System.out.println("Customer Name "+call.getcustomerName());
			System.out.println("Customer Address "+call.getcallQualityGrade());
			System.out.println("Customer Address "+call.getcallDuration());
			System.out.println("Customer Address "+call.getcallId());
			
			
		}
		catch(FileNotFoundException e1)
		{
			System.out.println(e1);
		}
		catch(IOException e2)
		{
			System.out.println(e2);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallQuality obj1=new CallQuality(345,67,"A","Peter");

		CallRecords records=new CallRecords();

		records.Call(obj1);
		records.displayCall(obj1.getcustomerName());

	}

}

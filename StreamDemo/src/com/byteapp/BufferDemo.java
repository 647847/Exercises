package com.byteapp;
import java.io.*;

public class BufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name="Teju";
			String bugno="rt567jk";
			String desc="Cannot be resolved";
			FileOutputStream fs=new FileOutputStream("C:\\Users\\e019816\\Documents\\IOFiles//bufferinfo.txt");
			BufferedOutputStream bf=new BufferedOutputStream(fs);
			bf.write(name.getBytes());
		    bf.write(bugno.getBytes());
			bf.write(desc.getBytes());
			bf.flush();
			bf.close();
			
			FileInputStream fin=new FileInputStream("C:\\Users\\e019816\\Documents\\IOFiles//bufferinfo.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			byte[] bt=new byte[bin.available()];
			bin.read(bt);
			System.out.println(new String(bt));
			
			
		}
		catch(Exception e) {
			
		}

	}

}

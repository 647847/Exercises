package thread.com;
class Names implements Runnable {
	String[] names= {"Peter","Sam","Edgar","Mathew","Simond"};

	  public void printArray() 
	 { 
	  for(String s:names) 
	 { 
	 System.out.println(s);
	 } 
	  }
	  synchronized public void run() {
	    	printArray();
	    }
}

public class PrintNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Names n=new Names();
		Thread t1=new Thread(n);
		Thread t2=new Thread(n);
		t1.start();
		t2.start();

	}

}

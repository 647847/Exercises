package thread.com;
class Cab3{
	
}
class Cab1 implements Runnable{
	String CabDriver;
	Cab3 cab;
	Cab1(Cab3 cab,String CabDriver) {
		this.CabDriver=CabDriver;
		this.cab=cab;
	}
	public void run() {
		synchronized(cab) {
		try{
			System.out.println("This is befor wait"+CabDriver);
			cab.wait(3000);
			System.out.println("After wait"+CabDriver);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	}
}
class Cab2 implements Runnable{
	Cab3 cab;
	 Cab2(Cab3 cab) {
		this.cab=cab;
	}
	public void run() {
		synchronized(cab) {
		
		try {
			Thread.sleep(2000);
			cab.notify();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	}
}

public class Cab {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Cab3 c3=new Cab3();
		Cab1 c1=new Cab1(c3,"Monu"); 
		Cab2 c2=new Cab2(c3);
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();
		
		
		

	}

}

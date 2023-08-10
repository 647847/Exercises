package thread.com;
import java.util.*;
class Activity1 implements Runnable{
	public void details() {
		Scanner sc=new Scanner(System.in);
	    String name=sc.next();
	    String mail=sc.next();
	    System.out.println("The user name is"+name+"and his mail id is"+mail);
		Thread th=Thread.currentThread();
		
		}
	public void run() {
		details();
	}
}
class Activity2 implements Runnable{
	public void cal() {
	int p=12000;
	int r=3;
	int t=4;
	int s=(p*t*r)/100;
	System.out.println("The simple interest is"+s);
	}
	public void run() {
		cal();
	}
	
}

public class Activty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity1 a1=new Activity1();
		Activity2 a2=new Activity2();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a2);
		
		t1.start();
		t2.start();
	
		

	}

}

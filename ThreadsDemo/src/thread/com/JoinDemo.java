package thread.com;
import java.util.*;
class Demo extends Thread{
	public void accept() {
		System.out.println("enter details");

		Scanner sc=new Scanner(System.in);
		String  name=sc.next();
		System.out.println("enter details");
	
	}
	public void run() {
		accept();
	}
}

public class JoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		int i=0;
		
		
		try {
			
			
			d.start();
			Thread.currentThread().join(5000);
			System.out.println();
			System.out.println("Hello user");
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}
		
		
	}

}

package thread.com;

class ChildThread extends Thread{
	public void run() {
		Thread th=Thread.currentThread();
		System.out.println("Thread running"+th.getName());
	}
}

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th=Thread.currentThread();
		System.out.println(th.getName());
		ChildThread c=new ChildThread();
		ChildThread c1=new ChildThread();
		c.setName("Thread 1");
		c1.setName("Thread 2");
		
		c.start();
		c1.start();
	}

}

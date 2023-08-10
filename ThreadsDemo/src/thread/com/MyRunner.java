package thread.com;
class RunnerDemo implements Runnable{
	public void run() {
		Thread th=Thread.currentThread();
		System.out.println(th.getName()+"is running");
	}
}

public class MyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnerDemo d=new RunnerDemo();
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		t1.setName("thread 1");
		t2.setName("thread 2");
		t1.start();
		t2.start();

	}

}

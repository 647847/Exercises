import java.util.*;
//import java.io.*;
public class ExceptionHandling {
	
	public void addArray(int[] arr) {
		for(int i=0;i<5;i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		try {
			Scanner sc =new Scanner(System.in);
			String name=sc.next();
			String mail=sc.next();
			int age=sc.nextInt();
		// TODO Auto-generated method stub
		ExceptionHandling h=new ExceptionHandling();
		int[] arr= {11,26,9,90};
		h.addArray(arr);
		}
		catch(InputMismatchException i){
			System.out.println("Enter age in numerics");
			
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Array index out of range");
		}
		finally {
			System.out.println("This is a finally block");
		}

	}

}

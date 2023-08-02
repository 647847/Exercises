
public class Strappln extends Exception {
	String str;
	public Strappln(String s) {
		super("Invalid word"+s);
		//str="Hello world";
		int k=s.length();
		str=s;
	}
	public void printmsg() {
		System.out.println("Length is"+str);
	}
	

}

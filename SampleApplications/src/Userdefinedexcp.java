
public class Userdefinedexcp {
	public void checklen(String str) throws Strappln{
		if(str.length()==0) {
			throw new Strappln(str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userdefinedexcp u=new Userdefinedexcp();
		try {
			u.checklen("");
		}
		catch(Strappln s) {
			s.printmsg();
		}

	}

}

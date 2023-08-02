
public class Interfaceappln implements Square,Color{
	public void draw() {
		System.out.println("drawing.....");
	}
	public void filling() {
		System.out.println("coloring......");
	}
		public static void main(String args[]) {
			
			Interfaceappln i=new Interfaceappln();
			i.draw();
			i.filling();
			
			
		}
}

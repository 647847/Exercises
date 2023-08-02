
public class Order {
	int order_id;
	String book_name;
	int quantity;
	
	public void make_order() {
		System.out.println("Making order......");
	}
	public void view_previous_order() {
		System.out.println("Viewing previous orders..........");
	}
	public void cancel_order() {
		System.out.println("Cancel order");
	}

}

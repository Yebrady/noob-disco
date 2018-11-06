/**
 * The BookstoreItem class is a super class for the items sold in a book store. 
 */
public class BookStoreItem {
	
//	private instance variable, not accessible from outside this class
	protected String title;
	protected double price;
	protected int inventory;
	
//	The default constructor with no argument.
	public BookStoreItem() {
		title = null;
		price = 0.0;
		inventory = 0;
	}
	
//	The default constructor with no argument.
	public BookStoreItem(String title, double price) {
		this.title = title;
		this.price = price;
		inventory = 1;
	}
	
//	 A public method for retrieving the name
	public String getTitle() {
		return title;
	}
	
//	 A public method for retrieving the price 	
	public double getPrice() {
		return price;
	}

//	 A public method for retrieving the inventory 	
	public int getInventory() {
		return inventory;
	}
	
//	 A public method for setting the inventory 	
	public void setInventory(int number) {
		inventory = number;
	}
	
	public void increaseInventory() {
		inventory++;
	}
}

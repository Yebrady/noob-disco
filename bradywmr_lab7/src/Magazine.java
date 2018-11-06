/**
 * The Magazine class is subclass represents a magazine. 
 */

public class Magazine extends BookStoreItem {
	
	private String date;
	
	
	public Magazine(String title, double price, String date) {
		
		this.title = title;
		this.date = date;
		this.price = price;
	}
	
	
	public String getDate() {
		
		return date;
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof Magazine)) return false;
		Magazine that = (Magazine)object;
		
		return this.title.equals(that.title) && this.price == that.price && this.date.equals(that.date);
	}
	
	public String toString() {
		
		return (this.title + " / " + this.date + " / $" + this.price);
	}


}

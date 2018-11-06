/**
 * The Movie class is subclass represents a movie. 
 */
public class Movie extends BookStoreItem{
	
	private String year;

	public Movie(String title, double price, String year) {
		
		this.title = title;
		this.price = price;
		this.year = year;
		
	}
	
	public String getYear() {
		return year;
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof Movie)) return false;
		Movie that = (Movie)object;
		
		return this.title.equals(that.title) && this.price == that.price && this.year.equals(that.year);
	}
	
	public String toString() {
		
		return (this.title + " / " + this.year + " / $" + this.price);

	}
}

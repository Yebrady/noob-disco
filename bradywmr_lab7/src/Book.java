/**
 * The Book class is subclass represents a book. 
 */
public class Book extends BookStoreItem{
	
	private String author;
	
	
	public Book(String title, double price, String author) {
		
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof Book)) return false;
		Book that = (Book)object;
		
		return this.title.equals(that.title) && this.price == that.price && this.author.equals(that.author);
	}

	public String toString() {
		
		return (this.title + " / " + this.author + " / $" + this.price);
	}
}



import static org.junit.Assert.*;


import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BookStoreTest {	
	
	private BookStore store;
	private Book b1 = new Book(1, "Harper Lee", "To Kill a Mockingbird");
	private Book b2 = new Book(2, "Harper Lee", "To Kill a Mockingbird");
	private Book b3 = new Book(3, "Frances Hodgson", "The Secret Garden");
	private Book b4 = new Book(4, "J.K. Rowling",
			"Harry Potter and the Sorcerer's Stone");
	private Book b5 = new Book(5, "Douglas Adams",
			"The Hitchhiker's Guide to the Galaxy");



	/**
	 * setup the store
	 * 
	 */
	@Before
	public void setUpBookStore() {
		store = new BookStore();
		store.addBook(b1);
		store.addBook(b2);
		store.addBook(b3);
		store.addBook(b4);

	}

	/**
	 * tests the addition of book
	 * 
	 */

	@Test
	public void testAddBook() {
		store.addBook(b5);
		assertTrue(store.getBooks().contains(b5));
	}

	/**
	 * tests the deletion of book
	 * 
	 */

	@Test
	public void testDeleteBook() {
		store.deleteBook(b5);
		assertFalse(store.getBooks().contains(b5));
	}

	/**
	 * tests sorting of books by author name
	 * 
	 */

	@Test
	public void testGetBooksSortedByAuthor() {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b3);
		books.add(b1);
		books.add(b2);
		books.add(b4);
		assertEquals(store.getBooksSortedByAuthor(),books);
	}

	/**
	 * tests sorting of books by title
	 * 
	 */

	@Test
	public void testGetBooksSortedByTitle() {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b4);
		books.add(b3);
		books.add(b1);
		books.add(b2);
		assertEquals(store.getBooksSortedByTitle(),books);
	}

	/**
	 * tests the number of copies of book in store
	 * 
	 */

	@Test
	public void testCountBookWithTitle() {
		assertTrue(store.countBookWithTitle("To Kill") == 2);
	}
	

	

}

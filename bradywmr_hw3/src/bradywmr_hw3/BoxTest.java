package bradywmr_hw3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoxTest {
	
	private Box box;
	private FlashCard f1 = new FlashCard("Powerhouse of the cell.", "Mitochondria");
	private FlashCard f2 = new FlashCard("Contains DNA used in cell reproduction.", "Nucleus");
	private FlashCard f3 = new FlashCard("Helps break waste down inside of the cell.", "Lysosome");
	private FlashCard f4 = new FlashCard("Used to store food or water.", "Vacuole");
	
	@Before 
	public void setupBox() {
		box = new Box();
		box.addFlashCard(f1);
		box.addFlashCard(f2);
		box.addFlashCard(f3);
	}
	
	@Test
	public void testAddFlashCard() {
		box.addFlashCard(f4);
		assertTrue(box.getFlashCards().contains(f4));
	}
	
	@Test
	public void testRemoveFlashCard() {
		box.removeFlashCard(f2);
		assertFalse(box.getFlashCards().contains(f2));
	}
}

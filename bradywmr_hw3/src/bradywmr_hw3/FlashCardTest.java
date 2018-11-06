package bradywmr_hw3;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlashCardTest {
	
	FlashCard tester = new FlashCard("Powerhouse of the cell.", "Mitochondria");

	@Test
	public void testSetFront() {
		tester.setFront("Double membrane with the inner layer being folded inward to from layers");
		assertEquals(tester.getFront(), "Double membrane with the inner layer being folded inward to from layers");
	}
	
	@Test
	public void testGetFront() {
		assertEquals(tester.getFront(), "Powerhouse of the cell.");
	}
	
	@Test
	public void testSetBack() {
		tester.setBack("Chondrosome");
		assertEquals(tester.getBack(), "Chondrosome");
	}
	
	@Test
	public void testGetBack() {
		assertEquals(tester.getBack(), "Mitochondria");
	}
}

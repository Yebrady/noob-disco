import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UnitTests {
	VeryLargeInteger n1 = new VeryLargeInteger(0);
	VeryLargeInteger n2 = new VeryLargeInteger(0);
	
	@Test
	public void addTest() {
		n1.setInit("5629");
		n2.setInit("823");
		System.out.println(n1.add(n2));
		assertTrue(n1.add(n2).getInit() == "6452");
	}
	
	@Test
	public void subTest() {
		n1.setInit("2650251");
		n2.setInit("21241");
		System.out.println(n1.sub(n2));
		assertTrue(n1.sub(n2).getInit() == "2629010");
	}
	
	@Test
	public void mulTest() {
		n1.setInit("125");
		n2.setInit("125");
		System.out.println(n1.mul(n2));
		assertTrue(n1.mul(n2).getInit() == "15625");
	}
}

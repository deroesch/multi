package mult;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMult {

	@Test
	public void twoTimesThreeEqualsSix() {

		// 2 * 3 = 6
		assertEquals(6, new Mult().mult(2, 3));
		assertNotEquals(0, new Mult().mult(2, 3));
	}

	@Test
	public void threeTimesTwoEqualsSix() {

		// 3 * 2 = 6
		assertEquals(6, new Mult().mult(3, 2));
		assertNotEquals(0, new Mult().mult(3, 2));
	}

}

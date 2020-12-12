package expo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExpo {

	@Test
	public void twoCubedEqualsEight() {

		// 2 ** 3 = 8
		assertEquals(8, new Expo().expo(2, 3), 0.000001);
		assertNotEquals(9, new Expo().expo(2, 3), 0.000001);
	}

	@Test
	public void threeSquaredEqualsNine() {

		// 3 ** 2 = 9
		assertEquals(9, new Expo().expo(3, 2), 0.000001);
		assertNotEquals(8, new Expo().expo(3, 2), 0.000001);
	}

}

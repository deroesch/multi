package expo;

import static org.junit.Assert.*;

import org.junit.Test;

import expo.Expo;

public class TestExpo {

	@Test
	public void testExpo() {
		assertEquals(9, new Expo().expo(3, 2), 0.000001);
	}

}

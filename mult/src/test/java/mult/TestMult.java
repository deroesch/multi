package mult;

import static org.junit.Assert.*;

import org.junit.Test;

import mult.Mult;

public class TestMult {

	@Test
	public void testMult() {
		assertEquals(4, new Mult().mult(2, 2));
	}

}

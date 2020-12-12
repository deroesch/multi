package mult;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMult {

	@Test
	public void testMult() {
		assertEquals(4, new Mult().mult(2, 2));
		assertNotEquals(0, new Mult().mult(2, 2));
	}

}

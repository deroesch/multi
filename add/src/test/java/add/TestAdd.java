package add;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void onePlusTwoEquals3() {

		// 1 + 2 = 3
		assertEquals(3, new Add().add(1, 2));
		assertNotEquals(0, new Add().add(1, 2)); 
	}

	@Test
	public void twoPlusOneEqualsThree() { 

		// 2 + 1 = 3
		assertEquals(3, new Add().add(2, 1));
		assertNotEquals(0, new Add().add(2, 1));
	}

}

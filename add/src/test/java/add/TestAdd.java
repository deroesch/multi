package add;

import static org.junit.Assert.*;

import org.junit.Test;

import add.Add;

public class TestAdd {

	@Test
	public void testAdd() {
		assertEquals(2, new Add().add(1, 1));
	}

}

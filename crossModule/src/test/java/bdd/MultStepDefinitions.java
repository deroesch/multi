package bdd;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mult.Mult;

public class MultStepDefinitions {

	Long mult1 = 0L;
	Long mult2 = 0L;

	@Given("the multiplicands are {long} and {long}")
	public void the_multiplicands_are_and(Long mult1, Long mult2) {
		this.mult1 = mult1;
		this.mult2 = mult2;
	}

	@Then("the product is {long}")
	public void the_product_is(Long expected) {
		Long product = (long) new Mult().mult(mult1, mult2);
		assertEquals(expected, product);
	}

	@Then("the product is not {long}")
	public void the_product_is_not(Long expected) {
		Long product = (long) new Mult().mult(mult1, mult2);
		assertNotEquals(expected, product);
	}
}

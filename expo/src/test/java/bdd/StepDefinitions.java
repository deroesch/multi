package bdd;

import static org.junit.Assert.*;

import expo.Expo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinitions {

	Long base = 0L;
	Long expo = 0L;

	@Given("the base is {long} and the exponent is {long}")
	public void the_base_is_and_the_exponent_is(Long base, Long expo) {
		this.base = base;
		this.expo = expo;
	}

	@Then("the result is {long}")
	public void the_result_is(Long expected) {
		Long product = (long) new Expo().expo(base, expo);
		assertEquals(expected, product);
	}

	@Then("the result is not {long}")
	public void the_result_is_not(Long actual) {
		Long sum = (long) new Expo().expo(base, expo);
		assertNotEquals(actual, sum);
	}
}

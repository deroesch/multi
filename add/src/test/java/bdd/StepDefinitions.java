package bdd;

import static org.junit.Assert.*;

import add.Add;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinitions {

	Long left = 0L;
	Long right = 0L;

	@Given("addends are {long} and {long}")
	public void addends_are_and(Long left, Long right) {
		this.left = left;
		this.right = right;
	}

	@Then("the result is {long}")
	public void the_result_is(Long actual) {
		Long sum = new Add().add(left, right);
		assertEquals(actual, sum);
	}

	@Then("the result is not {long}")
	public void the_result_is_not(Long actual) {
		Long sum = new Add().add(left, right);
		assertNotEquals(actual, sum);
	}
}

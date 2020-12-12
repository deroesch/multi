package bdd;

import static org.junit.Assert.*;

import add.Add;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinitions {

	Long long1 = 0L;
	Long long2 = 0L;

	@Given("addends are {long} and {long}")
	public void addends_are_and(Long long1, Long long2) {
		this.long1 = long1;
		this.long2 = long2;
	}

	@Then("the result is {long}")
	public void the_result_is(Long long3) {
		Long sum = new Add().add(long1, long2);
		assertEquals(sum, long3);
	}
}

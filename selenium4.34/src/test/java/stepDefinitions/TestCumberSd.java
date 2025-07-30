package stepDefinitions;

import io.cucumber.java.en.*;

public class TestCumberSd {
	@Given("launche the application")
	public void launche_the_application() {
	    System.out.println("launch");
	}
	@When("run the application")
	public void run_the_application() {
	    System.out.println("run");
	}
	@Then("see the result")
	public void see_the_result() {
	    System.out.println("result");
	}

}

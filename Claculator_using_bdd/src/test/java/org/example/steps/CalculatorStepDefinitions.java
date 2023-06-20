package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorStepDefinitions {
    private Calculator calculator;
    private int result;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(int a, int b) {
        result = calculator.add(a, b);
    }

    @When("I subtract {int} from {int}")
    public void i_subtract_from(int a, int b) {
        result = calculator.subtract(b, a);
    }

    @When("I multiply {int} by {int}")
    public void i_multiply_by(int a, int b) {
        result = calculator.multiply(a, b);
    }

    @When("I divide {int} by {int}")
    public void i_divide_by(int a, int b) {
        result = calculator.divide(a, b);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expected) {
        assertEquals(expected, result);
    }
}


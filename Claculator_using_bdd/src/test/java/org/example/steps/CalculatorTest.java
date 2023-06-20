package org.example.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/calculator.feature",
        glue = "org/example/steps/CalculatorStepDefinitions.java"
)
public class CalculatorTest {
}


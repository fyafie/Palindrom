package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src/test/java/module",
	glue="stepdef")
public class RunnerTestNGTestPalindrom extends AbstractTestNGCucumberTests {

}

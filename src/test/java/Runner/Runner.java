package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Java_IntellijIdea\\src\\test\\java\\Features",glue = {"TestSteps"},tags={"registerAndCheckOut"},
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports" }, monochrome = true
)

public class Runner {

}
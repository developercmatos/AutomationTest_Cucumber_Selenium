package tricents.runnerfeature;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", tags = {}, monochrome = true, features = "src/test/resources/feature/", glue = "")

public class RunnerFeature {

}

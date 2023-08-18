package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}, //path to the directory where feature files are
        glue = {"steps"}, //path to the directory where step definitions classes are
        plugin = {"pretty", "junit: Report2"}, // specifies different formatting options for the output reports
        dryRun = true //finds out if there are any scenarios or steps that don't have step definitions associated
)
public class TestRunnerClass {
}

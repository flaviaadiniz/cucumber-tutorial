package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}, //path to the directory where feature files are
        glue = {"steps"}, //path to the directory where step definitions classes are
        plugin = {"pretty", "junit: Report2"} // specifies different formatting options for the output reports
        //dryRun = true - finds out if there are any scenarios or steps that don't have associated step definitions
        //monochrome = true - makes console output for the tests more readable and remove any unreadable character]
        //tags = "@P1 or @P2" - defines which scenarios to run specifying their tags here
        //name = {"Logo"} //runs only the scenarios that contain the keyword given
)
public class TestRunnerClass {
}

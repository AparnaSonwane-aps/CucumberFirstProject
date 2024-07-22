package stepDefHooks;
//need to re-rund as showing errors
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithHooks/Hooks.feature",glue= {"stepDefHooks"},
monochrome=true,
plugin ={"pretty","html:target/HTMLReports/Report.html"}
)

public class TestRunnerHooks {

}

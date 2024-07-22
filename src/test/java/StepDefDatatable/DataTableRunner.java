package StepDefDatatable;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/DataTable",glue= {"StepDefDatatable"},
monochrome=true,
plugin ={"pretty","html:target/HTMLReports/Report.html"}
)
public class DataTableRunner {

}

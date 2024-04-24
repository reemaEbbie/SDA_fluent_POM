package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "stepDefinitions",
        features = "src/test/resources/features/register.feature",
        plugin = {
                "html:target/html-report/report.html",
                "json:target/json-report/report.json",
                "junit:target/xml-report/report.xml",
                "pretty"
        },
        dryRun = false
)
public class runner {

}
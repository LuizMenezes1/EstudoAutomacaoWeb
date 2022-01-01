import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/TesteEstudo.feature/",
        plugin = {"pretty", "html:target/report-html"},
        monochrome = true,
        glue = {"stepDefinitions"},
        snippets = SnippetType.CAMELCASE,
        strict = false,
        dryRun= false
)

public class Runner {

}
package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features= {"src/test/java/features/CreateLeadWithExamples.feature"},glue= {"steps"},monochrome=true)
	
//@CucumberOptions(features= {"src/test/java/features/CreateLeadBackground.feature"},glue= {"steps"},monochrome=true)

//@CucumberOptions(features= {"src/test/java/features/DeleteLeadWithExamples.feature"},glue= {"steps","pages"},monochrome=true)

@CucumberOptions(features= {"src/test/java/features/DeleteLeadWithExamples.feature","src/test/java/features/EditLeadWithExamples.feature"},glue= {"steps","pages"},tags={"@regression or @smoke"},monochrome=true)
public class RunTest {

}

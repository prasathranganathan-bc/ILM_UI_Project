package Runner;

import Base.CutomizeTestNGCucmberRunner;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/Features/",
		glue = { "stepDef", "Hooks" },
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		tags= "@Dos or @GCloud",
		monochrome = true,
//		dryRun = true,
		strict = true
		)

public class Runner extends CutomizeTestNGCucmberRunner {

}
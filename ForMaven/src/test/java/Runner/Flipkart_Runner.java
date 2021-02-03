package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//		format={"pretty"},
//		features="E:\\Chinnan\\For Automation\\Space for Eclipse Projects\\ForMaven\\src\\test\\java\\Features\\itemtocart.feature", // >> this one correct
		features="classpath:Features", // >> this one also correct
		glue="StepDef",
		plugin  = {"pretty", "html:target/Cucumber_HTML_Report"} 
			
		
//		For Pretty Report
//		plugin = { "pretty" }
//
//		
//		Monochrome Mode Reporting
//	    plugin = { "pretty" },
//		monochrome = true
//		
//		Usage Report			
//		plugin = { "usage" }
		
		)
public class Flipkart_Runner {

}

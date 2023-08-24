package Demooblaze_Testruuuuner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Demooblaze_Utilittty.Demooblaze_Baase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features = {"src/test/resources/Demooblaze_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Demooblaze_Steppdeff", tags = {"@Disha2 "})

public class Demooblaze_testrunnn extends AbstractTestNGCucumberTests{

	@BeforeTest
	
	public void Demooblazestarturl () throws Exception {
		Demooblaze_Baase Sturl = new Demooblaze_Baase(); 
		Thread.sleep(5000);
		Sturl.Demooblaze_browser();
	}
	
	@AfterTest
	public void Demooblazecloseurl () {
		Demooblaze_Baase Sturl = new Demooblaze_Baase();
		Sturl.driver.quit();
}
}
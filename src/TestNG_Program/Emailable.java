package TestNG_Program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable {
	@Test
	public void tc1() {
		Reporter.log("Running TC1",true);
	}
	@Test
	public void tc2() {
		Reporter.log("Running TC2",true);
	}
	@Test
	public void tc3() {
		Reporter.log("Running TC3",true);
		
	}

}
/*for emailable report generate
 1. Right click on program (.java) file.
 2. click on TestNG and select Convert to TestNG.
 3. change name in location before .xml (/TestNG/testng.xml) to (/TestNG/emailabe.xml) and hit on finish
 4. it show emailable-report.html file under test_output 
 5. refresh a package by right click on it
 6. right click on emailable-report.html then open with & then web browser
  
 
*/

package TestNG_Program;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A2 {
	
	@Test
	public void TC4() {Reporter.log("Running TC4",true);
			Reporter.log("How are you vinay",true);}

	@Test
	public void TC5() {Reporter.log("Running TC5",true);
	                   Assert.fail();}

	@Test
	public void TC6() {Reporter.log("Running TC6",true);}
	}

package TestNG_Program;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
@BeforeClass
public void openbrowser() {
	Reporter.log("Open the Browser",true);
}
@BeforeMethod
public void loginAPP() {
	Reporter.log("Login to APP",true);
}
@Test
public void verifyID() {
	Reporter.log("Verify user ID",true);
}
@AfterMethod
public void logoutApp() {
	Reporter.log("Logout from App",true);
}
@AfterClass
public void closebrowser() {
	Reporter.log("Close the browser",true);
}
}

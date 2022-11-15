package Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi {
	WebDriver driver=null;
	@Parameters("browsername")
	@Test
	public void TC(String browsername) {
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\DOWNLOAD\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browsername.equals("edge")){
		System.setProperty("webdriver.edge.driver", "E:\\DOWNLOAD\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();    
		}
		driver.get("https://mail.google.com/mail/u/0/#calls");
	}
}


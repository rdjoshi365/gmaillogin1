package login;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class loginpage {
  
  @Test(invocationCount = 3)
  public void f() {
	  
		Reporter.log("Test Started");
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Reporter.log("Browser launched success");
		driver.get("https://www.google.com/");
		Reporter.log("Enter the URL");
		String title=driver.getTitle();
		Reporter.log("Got The title from web");
		String expResult="Google";
		Reporter.log("Verification is started");
		Assert.assertEquals(title, expResult);
		Reporter.log("Verification Success");
		Reporter.log("Test cases is Pass");
		driver.close();
		Reporter.log("Close the browser");
  
  }
}

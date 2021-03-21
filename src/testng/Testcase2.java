package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase2 extends Sample{
	
	@Test
	public void forgotPassword() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("56756778");
		driver.findElement(By.id("did_submit")).click();
		String t=driver.getTitle();
		Reporter.log(t,true);
	}
	
	

}

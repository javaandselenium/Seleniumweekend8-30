package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");

//Title of the application
System.out.println(driver.getTitle());

//url of the application
System.out.println(driver.getCurrentUrl());

//close the application
driver.close();

	}

}

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void logoutbtn() {
		logout.click();
	}
	
	

}

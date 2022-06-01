package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebLibrary;

public class TestClass extends WebLibrary{
	
	public TestClass() {
		launchApplication(BaseURL);
	}
	
	boolean status;
	
	@FindBy(id="abcd") public WebElement abc;

}

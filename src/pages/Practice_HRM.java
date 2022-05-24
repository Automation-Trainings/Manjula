package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebLibrary;

public class Practice_HRM extends WebLibrary {

	public Practice_HRM() {
		launchApplication(BaseURL);
	}

	boolean status;

	@FindBy(id = "logInPanelHeading")
	public WebElement LoginLabel;

	@FindBy(name = "txtUsername")
	public WebElement lgnuserName;

	@FindBy(xpath = "//*[@id='txtPassword']")
	public WebElement lgnpassword;

	@FindBy(xpath = "//*[@id='btnLogin']")
	public WebElement lgnloginBtn;
	
	@FindBy(id = "menu_pim_viewPimModule") 
	public WebElement PimModule;
	
	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmployee;
	
	public void addEmployee() {
		status = ClickElement(addEmployee);
		logEvent(status, "Add Employee click is successfull", "Add Employee click is not successfull");
	}
	
	public void pimModule() {
		try {
		status = moveToElement(PimModule);
		logEvent(status, "Mouse over is success", "Mouse over is not success");
		}
		catch(Exception e) {
			
		}
	}

	public void verifyLabel(Object labelValue) {
		status = validateText(LoginLabel, labelValue.toString());
		logEvent(status, "Text is matching", "Text is not matching");
	}

	public void userName(Object userName) {
		status = SetText(lgnuserName, userName.toString());
		logEvent(status, "User name entered successfully", "User name is not entered successfully");
	}

	public void userPassword(Object password) {
		status = SetText(lgnpassword, password.toString());
		logEvent(status, "Password entered successfully", "Password is not entered successfully");
	}

	public void btnLogin() {
		status = ClickElement(lgnloginBtn);
		logEvent(status, "Login button click is successfull", "Login button click is not successfull");
	}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebLibrary;

public class Practice_HRM1 extends WebLibrary{
	
	public Practice_HRM1() {
		launchApplication(BaseURL);
	}
	
	boolean status;
	
	@FindBy(id = "firstName")
	public WebElement fName;
	
	@FindBy(id = "lastName")
	public WebElement lName;
	
	@FindBy(id = "photofile")
	public WebElement upload;
	
	public void uploadFile() {
		try {
		String path = "C:\\Users\\hp\\Documents\\Test.jpg";
		status = fileUpload(upload, path);
		logEvent(status, "File upload successful", "File upload is not successful");
		Thread.sleep(5000);
		}
		catch(Exception e) {
			
		}
	}
	
	public void firstName(Object fName) {
		status = SetText(this.fName, fName);
		logEvent(status, "First name entered", "First name is not entered");
	}
	
	public void lastName(Object lName) {
		status = SetText(this.lName, lName);
		logEvent(status, "Last name entered", "Last name is not entered");
	}
	
	


}

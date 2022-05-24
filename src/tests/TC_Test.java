package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pages.Practice_HRM;
import pages.Practice_HRM1;

public class TC_Test extends DriverClass{
	
	@Test
	public void Test_TC() {
		Object[] data = ReadRowData(CurrentTestCaseName);
		
		Practice_HRM lp = PageFactory.initElements(driver, Practice_HRM.class);
		Practice_HRM1 lp1 = PageFactory.initElements(driver, Practice_HRM1.class);
		lp.verifyLabel(data[10]);
		lp.userName(data[0]);
		lp.userPassword(data[1]);
		lp.btnLogin();
		lp.pimModule();
		lp.addEmployee();
		
		lp1.firstName(data[2]);
		lp1.lastName(data[3]);
		lp1.uploadFile();	
		
	}
	

}

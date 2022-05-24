package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.DriverClass;
import pages.AddEmployee_HRM;
import pages.AddEntitlements_HRM;
import pages.ApplyLeave_HRM;
import pages.LeaveList_HRM;
import pages.LoginPage_HRM;
import pages.WelcomePage_HRM;

public class TC04_ApproveLeave extends DriverClass {

//	@Test
//	public void TC_04_ApproveLeave() throws Exception {
//		Object[] data = ReadRowData(CurrentTestCaseName);
//		LoginPage_HRM loginPage = PageFactory.initElements(driver, LoginPage_HRM.class);
//		WelcomePage_HRM wp = PageFactory.initElements(driver, WelcomePage_HRM.class);
//		AddEmployee_HRM ap = PageFactory.initElements(driver, AddEmployee_HRM.class);
//		AddEntitlements_HRM ae = PageFactory.initElements(driver, AddEntitlements_HRM.class);
//		ApplyLeave_HRM al = PageFactory.initElements(driver, ApplyLeave_HRM.class);
//		LeaveList_HRM ll = PageFactory.initElements(driver, LeaveList_HRM.class);
//
//		loginPage.UserName(data[0]);
//		loginPage.Password(data[1]);
//		loginPage.Login();
//
//		wp.mouseHoverPIMTab();
//		wp.addEmployeeTab();
//
//		ap.addEmpFirstName(data[2]);
//		ap.addEmpLastName(data[3]);
////		ap.uploadFile("C:\\Users\\hp\\Desktop\\New.png");		
//		ap.addEmployeeCreateLoginDetails();
//		ap.addEmployeeUserName(data[4]);
//		ap.addEmployeePassword(data[5]);
//
//		ap.addEmployeeRePassword(data[6]);
//		ap.addEmployeeSaveBtn();
//		Thread.sleep(7000);
//		wp.mouseHoverLeaveTab();
//		wp.mouseHoverEntitlementsTab();
//		wp.addEntitlementsTab();
//
//		ae.employeeName(data[7]);
//		ae.leaveType(data[8]);
//		ae.addEntitlement(data[9]);
//		ae.clickSaveBtn();
//	}

	@Test
	public void TC_05_ApproveLeave() throws Exception {
		Object[] data = ReadRowData(CurrentTestCaseName);
		LoginPage_HRM loginPage = PageFactory.initElements(driver, LoginPage_HRM.class);
		WelcomePage_HRM wp = PageFactory.initElements(driver, WelcomePage_HRM.class);
		AddEmployee_HRM ap = PageFactory.initElements(driver, AddEmployee_HRM.class);
		AddEntitlements_HRM ae = PageFactory.initElements(driver, AddEntitlements_HRM.class);
		ApplyLeave_HRM al = PageFactory.initElements(driver, ApplyLeave_HRM.class);
		LeaveList_HRM ll = PageFactory.initElements(driver, LeaveList_HRM.class);
		
		loginPage.UserName(data[4]);
		loginPage.Password(data[5]);
		loginPage.Login();

		wp.mouseHoverPIMTab();
		wp.mouseHoverLeaveTab();
		wp.applyLeaveTab();
		
		al.leaveType(data[8]);
		al.fromDate(data[11]);
		al.toDate(data[12]);
		al.clickSaveBtn();
	}
//
//	@Test
//	public void TC_06_ApproveLeave() throws Exception {
//		Object[] data = ReadRowData(CurrentTestCaseName);
//		LoginPage_HRM loginPage = PageFactory.initElements(driver, LoginPage_HRM.class);
//		WelcomePage_HRM wp = PageFactory.initElements(driver, WelcomePage_HRM.class);
//		AddEmployee_HRM ap = PageFactory.initElements(driver, AddEmployee_HRM.class);
//		AddEntitlements_HRM ae = PageFactory.initElements(driver, AddEntitlements_HRM.class);
//		ApplyLeave_HRM al = PageFactory.initElements(driver, ApplyLeave_HRM.class);
//		LeaveList_HRM ll = PageFactory.initElements(driver, LeaveList_HRM.class);
//		
//		loginPage.UserName(data[0]);
//		loginPage.Password(data[1]);
//		loginPage.Login();
//
//		wp.mouseHoverLeaveTab();
//		wp.clickLeaveList();
//
//		ll.searchBtn();
//		ll.searchEmpName(data[4], data[13]);
//
//	}

}

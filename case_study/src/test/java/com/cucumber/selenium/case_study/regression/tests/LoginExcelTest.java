package com.cucumber.selenium.case_study.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.cucumber.selenium.case_study.dao.case_studyDAO;
import com.cucumber.selenium.case_study.dataprovider.*;
import com.cucumber.selenium.case_study.generics.ScreenCapture;
import com.cucumber.selenium.case_study.pom.LoginPOM;
import com.cucumber.selenium.case_study.utility.DriverFactory;
import com.cucumber.selenium.case_study.utility.DriverNames;

public class LoginExcelTest extends DriverFactory {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenCapture screenShot;
	case_studyDAO dao= new case_studyDAO();
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		
		
	}

	@BeforeMethod
	public void setUp() throws Exception {
		System.out.println("Test specific to TestNG Framework starts");
		setDriver(getDriver(DriverNames.CHROME)); 
	    String url=  dao.properties.get("baseURL").toString();
	   
		screenShot = new ScreenCapture(driver);
		// open the browser
		 getDriver().get(url);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		getDriver().quit();
	}

	@Test(dataProvider = "excel-inputs", dataProviderClass = Dataproviders.class)
	public void loginDBTest(String userName, String password) {
		System.out.println(userName);
		System.out.println(password);
		loginPOM=new LoginPOM(getDriver());
		screenShot=new ScreenCapture(getDriver());
		loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot(userName);

	}

}
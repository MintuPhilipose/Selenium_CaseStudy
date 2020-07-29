package com.cucumber.selenium.case_study.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {
 private static WebDriver driver; 
	
	public  WebDriver getDriver(String driverName){

		if(driverName.equals(DriverNames.CHROME)){
			System.setProperty(Driver.CHROME, Driver.CHROME_PATH);
			driver = new ChromeDriver();
		
			
		}else if (driverName.equals(DriverNames.FIREFOX)){
			System.setProperty(Driver.FIREFOX, Driver.FIREFOX_PATH);
			driver = new FirefoxDriver();
			
		}
		else {
			System.out.println("Capability Built only to run on Firefox or Chrome");
			
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
}

	public WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		DriverFactory.driver = driver;
	}
}
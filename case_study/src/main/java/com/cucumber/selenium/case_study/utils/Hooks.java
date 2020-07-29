package com.cucumber.selenium.case_study.utils;

import org.openqa.selenium.WebDriver;
import com.cucumber.selenium.case_study.pom.*;
import com.cucumber.selenium.case_study.utility.*;
import com.cucumber.selenium.case_study.waits.WaitType;
import com.cucumber.selenium.case_study.dao.*;
import com.cucumber.selenium.case_study.dbconnect.*;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends DriverFactory {
	
	case_studyDAO dao = new case_studyDAO();
	HomePOM hmepom;
	WaitType wait;
	Get_Connection con= new Get_Connection();
	@Before
	public void setUp() {
		System.out.println("all setup work can go here... ");
		setDriver(getDriver(DriverNames.CHROME)); 
	    String url=  dao.properties.get("baseURL").toString();
	    getDriver().get(url);
	    
	    
	    
	}
	
	@After
	public void tearDown() {
	getDriver().quit();		
		
	}
	

	
}

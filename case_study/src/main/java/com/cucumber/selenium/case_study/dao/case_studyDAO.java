package com.cucumber.selenium.case_study.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class case_studyDAO {

public Properties properties; 
	
	public case_studyDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("C:\\Users\\MintuPhilipose\\eclipse-oxygen-workspace\\case_study\\src\\main\\resources\\EnvSetUp.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	
}

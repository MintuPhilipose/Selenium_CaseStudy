package com.cucumber.selenium.case_study.bean;

import com.cucumber.selenium.case_study.dao.case_studyDAO;

public class Db_bean {
	case_studyDAO dao = new case_studyDAO();
	
	private String url; 
	private String driver; 
	private String userName; 
	private String password;
	
	
	
	public Db_bean(){
		this.url=dao.properties.getProperty("dburl").toString(); 
		this.driver= dao.properties.getProperty("driver").toString(); 
		this.userName= dao.properties.getProperty("username").toString(); 
		this.password= dao.properties.getProperty("password").toString();
		
	
	}

	public Db_bean(String url, String driver, String userName, String password) {
		super();
		
		this.url = url;
		this.driver = driver;
		this.userName = userName;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}

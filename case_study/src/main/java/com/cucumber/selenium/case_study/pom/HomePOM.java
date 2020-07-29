package com.cucumber.selenium.case_study.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {
	private WebDriver driver;

	public HomePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	} 
	
	@FindBy(xpath="//section[@id='cm-content']//p[1]")
	private WebElement ack_msg;
	
	@FindBy(xpath="//*[@id='navbar']//*//a[@role='button']")
	private WebElement prof_icon;
	
	@FindBy(xpath="//*[@id='navbar']//*//div[@class='text-center']")
	private WebElement prof_info;
	
	@FindBy(xpath="//*[@id='navbar']//*//a[@title='Inbox']")
	private WebElement inbox_lnk;
	
	@FindBy(id="logout_button")
	private WebElement logout_lnk;
	
	public WebElement getProf_icon() {
		return prof_icon;
	}
	
	public WebElement getlogout_lnk() {
		return logout_lnk;
	}

	public String getProf_info() {
		return prof_info.getText();
	}


	public WebElement getInbox_lnk() {
		return inbox_lnk;
	}
	
	public WebElement getacknowledgement() {
		return ack_msg;
	}
	public String getacknowledgement_msg() {
		return ack_msg.getText();
	}
	
	
	
	
}

package com.cucumber.selenium.case_study.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailboxPOM {
	private WebDriver driver;

	public MailboxPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	} 
	
	@FindBy(xpath="//*//img[@title='Compose message']")
	private WebElement compose_img;
	
	@FindBy(xpath="//*//span[@class='selection']//ul//input[@class='select2-search__field']")
	private WebElement sendto_list;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[1]")
	private WebElement sendto_searchresult_list;
	
	@FindBy(xpath="//ul[@class='select2-results__options']/li[@class='select2-results__option select2-results__option--highlighted']")
	private WebElement sendto_searchresult_listselected;
	
	@FindBy(id="compose_message_title")
	private WebElement mailersub_textbox;
	
	@FindBy(xpath="//iframe[@title='Rich Text Editor, content']")
	private WebElement mailerbody_frame;
	
	@FindBy(xpath="/html/body")
	private WebElement mailerbody_textbox;

	@FindBy(id="compose_message_compose")
	private WebElement mailersendmsg_btn;
	
	public WebElement getmailerbody_frame() {
		return mailerbody_frame;
	}

	
	
	
	public WebElement getcompose_img() {
		return compose_img;
	}

	public WebElement getsendto_searchresult_listselected() {
		return sendto_searchresult_listselected;
		
	}
	
	
	public WebElement getMailersendmsg_btn() {
		return mailersendmsg_btn;
	}

	

	public WebElement getSendto_list() {
		return sendto_list;
	}

	public void setSendto_list(WebElement sendto_list) {
		this.sendto_list = sendto_list;
	}

	public WebElement getSendto_searchresult_list() {
		return sendto_searchresult_list;
	}

	public void setSendto_searchresult_list(WebElement sendto_searchresult_list) {
		this.sendto_searchresult_list = sendto_searchresult_list;
	}

	public WebElement getMailersub_textbox() {
		return mailersub_textbox;
	}

	public void setMailersub_textbox(WebElement mailersub_textbox, String subject) {
		this.mailersub_textbox = mailersub_textbox;
		mailersub_textbox.clear();
		mailersub_textbox.sendKeys(subject);
	}

	public WebElement getMailerbody_textbox() {
		return mailerbody_textbox;
	}

	public void setMailerbody_textbox(WebElement mailerbody_textbox, String content) {
		this.mailerbody_textbox = mailerbody_textbox;
		mailerbody_textbox.clear();
		mailerbody_textbox.sendKeys(content);
	}
	
	
}

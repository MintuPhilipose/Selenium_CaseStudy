package com.cucumber.selenium.case_study.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {

	private WebDriver driver;

	public RegisterPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	} 
	
	@FindBy(xpath = "// a[text()=' Sign up! ']")
	private WebElement signup_link; 
	
	@FindBy(id="registration_firstname")
	private WebElement frstname_txtbox;
	
	@FindBy(id="registration_lastname")
	private WebElement lastname_txtbox;
	
	@FindBy(id="registration_email")
	private WebElement email_txtbox;
	
	@FindBy(id="username")
	private WebElement username_txtbox;
	
	@FindBy(id="pass1")
	private WebElement pass_txtbox;
	
	@FindBy(id="pass2")
	private WebElement confirmpass_txtbox;
	
	@FindBy(id="registration_submit")
	private WebElement register_button;
	
	public WebElement getsignup_link() {
		return signup_link;
	}
	
	public WebElement getregister_button() {
		return register_button;
	}
	
	
	public WebElement getFrstname_txtbox() {
		return frstname_txtbox;
	}

	public void setFrstname_txtbox(WebElement frstname_txtbox, String frstname) {
		this.frstname_txtbox = frstname_txtbox;
		frstname_txtbox.clear();
		frstname_txtbox.sendKeys(frstname);
	}

	public WebElement getLastname_txtbox() {
		return lastname_txtbox;
	}

	public void setLastname_txtbox(WebElement lastname_txtbox, String lastname) {
		this.lastname_txtbox = lastname_txtbox;
		lastname_txtbox.clear();
		lastname_txtbox.sendKeys(lastname);
	}

	public WebElement getEmail_txtbox() {
		return email_txtbox;
	}

	public void setEmail_txtbox(WebElement email_txtbox, String email) {
		this.email_txtbox = email_txtbox;
		email_txtbox.clear();
		email_txtbox.sendKeys(email);
	}

	
	public WebElement getUsername_txtbox() {
		return username_txtbox;
	}

	public void setUsername_txtbox(WebElement username_txtbox,String username) {
		this.username_txtbox = username_txtbox;
		username_txtbox.clear();
		username_txtbox.sendKeys(username);
	}

	public WebElement getPass_txtbox() {
		return pass_txtbox;
	}

	public void setPass_txtbox(WebElement pass_txtbox, String password) {
		this.pass_txtbox = pass_txtbox;
		pass_txtbox.clear();
		pass_txtbox.sendKeys(password);
	}

	public WebElement getConfirmpass_txtbox() {
		return confirmpass_txtbox;
	}

	public void setConfirmpass_txtbox(WebElement confirmpass_txtbox, String confrmpwd) {
		this.confirmpass_txtbox = confirmpass_txtbox;
		confirmpass_txtbox.clear();
		confirmpass_txtbox.sendKeys(confrmpwd);
	}


	public void clickRegister_button(WebElement register_button) {
		this.register_button = register_button;
		register_button.click();
	}

	


}

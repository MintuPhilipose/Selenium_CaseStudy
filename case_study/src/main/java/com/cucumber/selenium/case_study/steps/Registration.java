package com.cucumber.selenium.case_study.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.cucumber.selenium.case_study.utils.Hooks;
import com.cucumber.selenium.case_study.utility.*;
import com.cucumber.selenium.case_study.pom.*;
import java.util.Map;
import com.cucumber.selenium.case_study.dbconnect.*;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cucumber.selenium.case_study.waits.*;
import com.cucumber.selenium.case_study.bean.*;

public class Registration extends DriverFactory {
	SoftAssert softAssert = new SoftAssert();
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	RegisterPOM regpom=new RegisterPOM(getDriver());
	HomePOM hmepom= new HomePOM(getDriver());
	MailboxPOM mailpom= new MailboxPOM(getDriver());
	WaitType wait=new WaitType(getDriver());
	Get_Connection dbconnect = new Get_Connection();
	Db_bean db=new Db_bean();
	List<Map<String, String>> listmap;
	String query;
	
	@Test(priority=1)
	@Given("^the browser is launched$")
	public void the_browser_is_launched() throws Throwable {
		getDriver().manage().window().maximize();
		String page_state = ((JavascriptExecutor) getDriver()).executeScript("return document.readyState").toString();
		System.out.println("Browser State "+ page_state);
		if(page_state!="complete")
		{Thread.sleep(2);}
	}

	@When("^the user clicks the signup$")
	public void the_user_clicks_the_signup() throws Throwable {
		wait.elementToBeClickable(regpom.getsignup_link(), 2).click();
		
	}

	@Then("^take the user to \"([^\"]*)\" page$")
	public void take_the_user_to_page(String page) throws Throwable {
	   if(page.equalsIgnoreCase("signup"))
	   {  
		   softAssert.assertEquals((getDriver().getTitle().toString()), "My Organization - My education - Registration");
	}
		   
		
		
	}
	
	


	@Then("^the user enters the mandatory details$")
	public void the_user_enters_the_mandatory_details(DataTable table) throws Throwable {
		//(HashMap<String, String>) table.asMaps(String.class, String.class); 
		 listmap = table.asMaps(String.class, String.class);
		 for (Map<String, String> temp : listmap) {
		regpom.setFrstname_txtbox(regpom.getFrstname_txtbox(),temp.get("Firstname"));
		regpom.setLastname_txtbox(regpom.getLastname_txtbox(),temp.get("LastName").toString());
		regpom.setEmail_txtbox(regpom.getEmail_txtbox(),temp.get("Email").toString());
		regpom.setUsername_txtbox(regpom.getUsername_txtbox(), temp.get("Username").toString());
		regpom.setPass_txtbox(regpom.getPass_txtbox(), temp.get("Pass").toString());
		regpom.setConfirmpass_txtbox(regpom.getConfirmpass_txtbox(), temp.get("Confirm_Password").toString());
		
		
		 }
		
		
	}

	

	@Then("^the user enters the mandatory details and store in DB$")
	public void the_user_enters_the_mandatory_details_storedb(DataTable table) throws Throwable { 
		dbconnect.getMySqlConnection(db);
		listmap = table.asMaps(String.class, String.class);
		 for (Map<String, String> temp : listmap) {
		String fname= temp.get("Firstname").toString();
		String lname= temp.get("LastName").toString();
		String email= temp.get("Email").toString();
		String username= temp.get("Username").toString();
		String pwd=temp.get("Pass").toString();
		
		regpom.setFrstname_txtbox(regpom.getFrstname_txtbox(),fname);
		regpom.setLastname_txtbox(regpom.getLastname_txtbox(),lname);
		regpom.setEmail_txtbox(regpom.getEmail_txtbox(),email);
		regpom.setUsername_txtbox(regpom.getUsername_txtbox(),username );
		regpom.setPass_txtbox(regpom.getPass_txtbox(), pwd);
		regpom.setConfirmpass_txtbox(regpom.getConfirmpass_txtbox(), temp.get("Confirm_Password").toString());
		
		query="Insert Into Registration values ('"+fname+"','"+lname+"','"+email+"','"+username+"','"+pwd+"')";
		System.out.println(query);
		dbconnect.insertqueryexectute(query);
		
		
		
		 }
		 
		 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	@Then("^click on the register button$")
	public void click_on_the_register_button() throws Throwable {
		regpom.getregister_button().click();
	}

	
	
	@Then("^confirm the acknowledgement message$")
	public void confirm_the_acknowledgement_message() throws Throwable {
	  wait.waitForElement(hmepom.getacknowledgement(), 5);
	  String exp_msg= "“Dear "+listmap.get(0).get("Firstname").toString()+", "+  listmap.get(0).get("LastName").toString()+",Your personal settings have been registered. And on the top right corner a dropdown is shown, upon clicking it (shown below)"; 
      if (hmepom.getacknowledgement_msg().equalsIgnoreCase(exp_msg))
      {System.out.println("The acknoweledgement Msg as expected"); }
      else
      {System.out.println("The acknoweledgement Msg not as expected"+exp_msg); }
	  
	  
	}

	@Then("^click the profile icon$")
	public void click_the_profile_icon() throws Throwable {
		wait.elementToBeClickable(hmepom.getProf_icon(), 2).click();
		
	}

	@Then("^Validate the firstname, lastname and email$")
	public void validate_the_firstname_lastname_and_email() throws Throwable {
	String fname=listmap.get(0).get("Firstname").toString();
	String lname=listmap.get(0).get("LastName").toString();
	String email=listmap.get(0).get("Email").toString();
	 if (hmepom.getProf_info().contains(fname)&& hmepom.getProf_info().contains(lname)&&hmepom.getProf_info().contains(email))
     {System.out.println("The Profile Info is as expected"); }
     else
     {System.out.println("The Profile Info is not as expected"); }
	  
		
	}


	@When("^clicks the Inbox link$")
	public void clicks_the_Inbox_link() throws Throwable {
	wait.elementToBeClickable(hmepom.getInbox_lnk(), 2).click();
	}

	@Then("^clicks compose button$")
	public void clicks_compose_button() throws Throwable {
		wait.elementToBeClickable(mailpom.getcompose_img(),2).click();
		
	}

	@Then("^the user is taken to compose mail template$")
	public void the_user_is_taken_to_compose_mail_template() throws Throwable {
	
	List<String> datalist= new ArrayList<String>();	
     query="select * from Registration ORDER BY FirstName DESC LIMIT 1";
     System.out.println(query);
     datalist=dbconnect.selectqueryexectute(query);
			
	String fname=datalist.get(0).toString();
	String mailertext="Hello Mr/Ms. "+ fname+",\n This is for Testing \n\n\nFrom,\n Mintu";	
	Thread.sleep(10000);
	 mailpom.getSendto_list().sendKeys(fname);
	 mailpom.getSendto_list().sendKeys(Keys.ENTER);
	 Thread.sleep(10000);
	 wait.elementToBeClickable(mailpom.getSendto_searchresult_list(),10);
	 mailpom.getsendto_searchresult_listselected().click();
	
	 mailpom.getMailersub_textbox().sendKeys("Hi For Testing");
	 wait.waitForElement(mailpom.getmailerbody_frame(), 3);
	 Thread.sleep(4000);
	 getDriver().switchTo().frame(0);
	 Thread.sleep(4000);
	// getDriver().switchTo().frame();
	 
	 mailpom.getMailerbody_textbox().sendKeys(mailertext);
	 Thread.sleep(4000);
	 getDriver().switchTo().defaultContent();
	 
	 mailpom.getMailersendmsg_btn().click();
	}
	
}

package com.cucumber.selenium.case_study.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitType {

private WebDriver driver;
	
	public WaitType(WebDriver driver) {
	
	this.driver = driver;
}


	public WebElement presenceElementLocated(By locator, int timeout){
		try{
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			WebElement element  = wait.until(
					ExpectedConditions.presenceOfElementLocated(locator)
					);
			System.out.println("Element Located");
			return element;
		}catch(Exception e ){
			System.out.println("Element Not Located " + e);
		}
		return null;
	}

	
	public WebElement presenceElementLocated(String locator, int timeout){
		try{
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			WebElement element  = wait.until(
					ExpectedConditions.presenceOfElementLocated(By.id(locator))
					);
			System.out.println("Element Located");
			return element;
		}catch(Exception e ){
			System.out.println("Element Not Located " + e);
		}
		return null;
	}
	
	
	
	public WebElement waitForElement(By locator, int timeout){
		try{
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			WebElement element  = wait.until(
					ExpectedConditions.visibilityOfElementLocated(locator)
					);
			
			System.out.println("Element Located");
			
			return element;
		}catch(Exception e ){
			System.out.println("Element Not Located " + e);
		}
		return null;
	}
	
	

	public WebElement elementToBeClickable(By locator, int timeout){
		try{
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			WebElement element  = wait.until(
					ExpectedConditions.elementToBeClickable(locator)
					);
			System.out.println("Element Located");
			
			return element;
		}catch(Exception e ){
			System.out.println("Element Not Located " + e);
		}
		return null;
	}
	
	public WebElement elementToBeClickable(WebElement a, int timeout){
		try{
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			WebElement element  = wait.until(
					ExpectedConditions.elementToBeClickable(a)
					);
			System.out.println("Element Located");
			return element;
		
		}catch(Exception e ){
			System.out.println("Element Not Located " + e);
		}
		return null;
	}
	
	public WebElement waitForElement(WebElement a, int timeout){
		try{
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			WebElement element  = wait.until(
					ExpectedConditions.visibilityOf(a)
					);
			
			System.out.println("Element Located");
			
			return element;
		}catch(Exception e ){
			System.out.println("Element Not Located " + e);
		}
		return null;
	}
	
	
}

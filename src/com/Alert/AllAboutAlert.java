package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class AllAboutAlert extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	
		launchChrome();
		BaseUrl();
		NormalJSAlert();
		ConfirmJSAlert();
		PromptJSAlert();
		closeBrowser();

	}
	
	public static void BaseUrl() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	}
	
	public static void NormalJSAlert() throws InterruptedException {
		
		WebElement NormalJSAlertBtn= driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button"));
		NormalJSAlertBtn.click();
		Thread.sleep(3000);
		
		String AlertMsg= driver.switchTo().alert().getText();
		System.out.println(AlertMsg); 
		
		
		//click on Ok
		
		driver.switchTo().alert().accept();
	
	}
	
public static void ConfirmJSAlert() throws InterruptedException {
		
		WebElement ConfirmJSAlertBtn= driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button"));
		ConfirmJSAlertBtn.click();
		Thread.sleep(3000);
		
		String AlertMsg= driver.switchTo().alert().getText();
		System.out.println(AlertMsg); 
		
		//click on Ok
		
		driver.switchTo().alert().dismiss();
	
	}

public static void PromptJSAlert() throws InterruptedException {
	
	WebElement PromptJSAlertBtn= driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button"));
	PromptJSAlertBtn.click();
	Thread.sleep(3000);
	
	String AlertMsg= driver.switchTo().alert().getText();
	System.out.println(AlertMsg); 
	
	String text= "Test Automation";
	
	//click on Ok
	
	driver.switchTo().alert().sendKeys(text);
	Thread.sleep(5000);
	
	driver.switchTo().alert().accept();

}

}

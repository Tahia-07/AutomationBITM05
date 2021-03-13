package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass  {
	
	public static WebDriver driver;
	
	public static void launchChrome() {

		System.setProperty("webdriver.chrome.driver", "F:\\Tools\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static void openHomePage() {
		driver.get("https://demo.opencart.com/");
	}

}

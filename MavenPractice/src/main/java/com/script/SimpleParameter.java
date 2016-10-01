package com.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SimpleParameter {
	
	@Test
	public void launchBrowser()
	{
		System.out.println("Inside First Tesjjkjt:::");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.quit();
	}

}

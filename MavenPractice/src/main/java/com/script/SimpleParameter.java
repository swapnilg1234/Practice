package com.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleParameter {
	
	@Test
	public void launchBrowser()
	{
		System.out.println("Inside First Tesjjkjt:::");
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/MavenPractice/src/test/resources/chromedriver");
		driver.get("http://www.gmail.com");
		driver.quit();
	}

}

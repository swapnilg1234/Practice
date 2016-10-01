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
		System.setProperty("webdriver.chrome.driver", "/Users/swapnil_galande/Documents/Drivers/chromedriver");
		driver.get("http://www.gmail.com");
		driver.quit();
	}

}

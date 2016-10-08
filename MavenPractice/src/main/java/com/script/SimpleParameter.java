package com.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleParameter {
	
	@Test
	public void launchBrowser()
	{
		System.out.println("Inside First Tesjjkjt:::");
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.quit();
	}

}

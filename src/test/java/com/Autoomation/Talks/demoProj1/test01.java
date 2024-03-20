package com.Autoomation.Talks.demoProj1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test01 {
	WebDriver driver;
	
	@BeforeMethod
	
	public void launchBrowser() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test() 
	public void atTest1() {
		driver.navigate().to("https://automationtalks.com/");
		System.err.println("Title 1=" + driver.getTitle());
		
	}
	@Test()
	public void atTest2() {
		driver.navigate().to("https://automationtalks.com/");
		System.err.println("Title 2=" + driver.getTitle());
		
	}
	@Test()
	public void atTest3() {
		driver.navigate().to("https://automationtalks.com/");
		System.err.println("Title 3=" + driver.getTitle());
		
	}
	@AfterMethod
	public void closeBrowser() {
		
		driver.quit();
	}

}

package com.acttitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.actitime.pom.Home_page;
import com.actitime.pom.Login_page;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Basetest implements Autoconstant
{
	public WebDriver driver;
	@BeforeSuite
	public void executionStart()
	{
		System.out.println("Execution started");
	}
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	@BeforeMethod
	public void loginToApp() throws IOException
	{
		Login_page l=new Login_page(driver);
		l.Loginmethod();
	}
	@AfterMethod
	public void logoutFromApp()
	{
		Home_page h=new Home_page(driver);
		h.logoutmethod();
		
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	@AfterSuite
	public void executionComp()
	{
		System.out.println("Execution completed");
	}

}

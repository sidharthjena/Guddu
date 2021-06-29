package com.acttitime.generics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basepage 
{
	public WebDriver driver;
	public void selectVisiblebyText(WebElement element,String text)
	{
	    Select s=new Select(element);
	    s.selectByVisibleText(text);
	}
	public void selectByValue(WebElement element,String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void mouseHovering(WebElement element)
	{
		Actions A=new Actions(driver);
		A.moveToElement(element).perform();
	}
	public void doubleclick(WebElement element)
	{
		Actions A=new Actions(driver);
		A.doubleClick(element).perform();
	}
	public void javascriptClick(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		js.executeScript("arguments[0].click()",element);
		
	}
	public void javascriptScroll()
	{
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		js.executeScript("window.ScrollBy(0,1000)");
	}
	public void Alertpopup()
	{
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	public void NotificationPopup()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		driver=new ChromeDriver(option);
	}
	public void fetchTitle()
	{
		System.out.println(driver.getTitle());
	}
}

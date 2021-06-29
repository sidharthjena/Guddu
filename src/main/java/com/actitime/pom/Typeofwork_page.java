package com.actitime.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acttitime.generics.Autoconstant;
import com.acttitime.generics.Basepage;



public class Typeofwork_page extends Basepage implements Autoconstant
{
	
	@FindBy(xpath="//span[.='Create Type of Work']")
    private WebElement createnewtypeofworkbutton;
	
	@FindBy(xpath="//a[.='Maintenance']/../..//a[contains(text(),'delete')]")
    private WebElement deletetypeofworkbutton;
	
	@FindBy(xpath="//a[.='Maintenance']")
	private WebElement edittypeofworkbutton;
	
	
	public Typeofwork_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createnewtypeofworkmethod()
	{
		javascriptClick(createnewtypeofworkbutton);
	}
	public void edittypeofworkmethod()
	{
		javascriptClick(edittypeofworkbutton);
	}
	public void deletetypeofworkmethod()
	{
		javascriptClick(deletetypeofworkbutton);
		Alertpopup();
		
	}

}

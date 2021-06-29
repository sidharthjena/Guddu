package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acttitime.generics.Autoconstant;
import com.acttitime.generics.Basepage;
import com.acttitime.generics.Excellibrary;


public class createnewtypeofwork_page extends Basepage implements Autoconstant
{
	
	@FindBy(xpath="//input[@name='name']")
    private WebElement nametextfield;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
    private WebElement createtypeofworkbutton ;
	
	
	public createnewtypeofwork_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createtypeofworkmethod() throws IOException
	{
		nametextfield.sendKeys(Excellibrary.getCellValue(3, 1));
		createtypeofworkbutton.click();
	}
}

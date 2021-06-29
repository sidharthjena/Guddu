package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acttitime.generics.Autoconstant;
import com.acttitime.generics.Basepage;
import com.acttitime.generics.Excellibrary;



public class createleavetype_page extends Basepage implements Autoconstant
{
	
	@FindBy(xpath="(//span[.='Create Leave Type'])[1]")
    private WebElement createnewleavetypebutton;
	
	@FindBy(xpath="//input[@placeholder='Leave Type Name']")
    private WebElement leavetypenametextfield;
	
	@FindBy(xpath="(//span[.='Create Leave Type'])[2]")
    private WebElement createleavetypebutton;
	
	@FindBy(xpath="(//span[.='Personal'])[1]")
    private WebElement editleavetypebutton;
	
	@FindBy(xpath="(//div[@class='applyButton'])[2]")
    private WebElement applybutton;
	
	
	@FindBy(xpath="//span[.='Personal']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
    private WebElement deleteleavetypebutton;
	
	public  createleavetype_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createleavetypemethod() throws IOException
	{
		createnewleavetypebutton.click();
		leavetypenametextfield.sendKeys(Excellibrary.getCellValue(4, 1));
		createleavetypebutton.click();
		
	}
	public void editleavetypemethod()
	{
		editleavetypebutton.click();
		applybutton.click();
		
	}
	public void deleteleavetypemethod()
	{
		deleteleavetypebutton.click();
		Alertpopup();
	}
}

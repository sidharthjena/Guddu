package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acttitime.generics.Autoconstant;
import com.acttitime.generics.Basepage;

public class edittypeofwork_page extends Basepage implements Autoconstant
{
	
	@FindBy(xpath="//input[@value='   Save Changes   ']")
    private WebElement savechangesbutton;
	
	public edittypeofwork_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void savechangesmethod()
	{
		savechangesbutton.click();
	}

	
	

}

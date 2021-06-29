package com.actitime.pom;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.acttitime.generics.Autoconstant;
import com.acttitime.generics.Basepage;
import com.acttitime.generics.Excellibrary;

public class Task_page extends Basepage implements Autoconstant
{
	
	@FindBy(xpath="//div[.='Add New']")
    private WebElement addnewbutton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
    private WebElement createnewcustomerbutton;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
    private WebElement createnewprojectbutton;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
    private WebElement createnewtaskbutton;
	
	@FindBy(xpath="//div[@class='item importTasks']")
    private WebElement importntaskbutton;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
    private WebElement entercustomernametextfield;
	
	@FindBy(xpath="//div[.='Create Customer']")
    private WebElement createcustomerbutton;
	
	@FindBy(xpath="//div[.='Sidharth']")
    private WebElement editbutton1;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
    private WebElement searchcustomertextfield;
	
	
	@FindBy(xpath="//div[@title='Sidharth']/..//div[@class='editButton']")
    private WebElement editbutton;
	
	@FindBy(xpath="(//div[@class='action'])[1]")
    private WebElement actionbutton;
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
    private WebElement deletebutton;
	
	@FindBy(xpath="//span[.='Delete permanently']")
    private WebElement deletepermanentlybutton;
	
	@FindBy(xpath="//div[contains(text(),'specified')]")
	private List<WebElement> Errormessage;
	
	
	public Task_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createCustomerMethod() throws InterruptedException, IOException
	{
		addnewbutton.click();
		createnewcustomerbutton.click();
		entercustomernametextfield.sendKeys(Excellibrary.getCellValue(2, 1));
		createcustomerbutton.click();
	}
	public void deleteCustomerMethod() throws InterruptedException, IOException
	{
		
		searchcustomertextfield.sendKeys(Excellibrary.getCellValue(2, 1));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		javascriptClick(editbutton1);
		javascriptClick(editbutton);
		javascriptClick(actionbutton);
		javascriptClick(deletebutton);
		javascriptClick(deletepermanentlybutton);
		
	}
	public void verifyErrormsg()
	{
		int count=Errormessage.size();
		if(count==1)
		{
			System.out.println("Duplicates name are not allowed");
		}
		
	}
	public void verifyErrorByAssert()
	{
		String Actual=Errormessage.get(1).getText();
		System.out.println(Actual);
		String expected="Customer with the specified name already exists";
		Assert.assertEquals(Actual, expected);
	
		
		
			
		
		
				
	}

}

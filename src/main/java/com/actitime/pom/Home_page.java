package com.actitime.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acttitime.generics.Autoconstant;
import com.acttitime.generics.Basepage;



public class Home_page extends Basepage implements Autoconstant
{
	
    @FindBy(xpath="(//div[.='Switch to actiPLANS'])[1]")
    private WebElement switchtoacttimeplanlink;
    
    @FindBy(xpath="//div[@id='container_tasks']")
    private WebElement Taskpagelink;
    
    @FindBy(xpath="//div[@id='container_reports']")
    private WebElement Reportpagelink;
    
    @FindBy(xpath="//div[@id='container_users']")
    private WebElement userpagelink;
    
    @FindBy(xpath="(//div[@class='menu_icon'])[1]")
    private WebElement calenderdropdown;
    
    @FindBy(xpath="//div[.='Corporate Work Schedule']")
    private WebElement corporateworkschedulelink;
    
    
    @FindBy(xpath="(//div[@class='menu_icon'])[2]")
    private WebElement settingsdropdown;
    
    @FindBy(xpath="//div[.='Manage system settings & configure actiTIME']")
    private WebElement generalsettingslink;
    
    
    @FindBy(xpath="//a[.='Workflow Settings']")
    private WebElement workflowsettingslink;
    
    @FindBy(xpath="//a[.='Types of Work']")
    private WebElement typeofworksetingslink;
    
    @FindBy(xpath="//a[.='Leave Types']")
    private WebElement leavetypesetingslink;
    
    @FindBy(xpath="//a[.='Notifications']")
    private WebElement notificationsetingslink;
    
    @FindBy(xpath="//a[.='Logout']")
    private WebElement logoutbutton;
    
    
    public Home_page(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void Taskpagemethod()
    {
    	Taskpagelink.click();
    }
    
    public void typeOfWorkMethod()
    {
    	javascriptClick(typeofworksetingslink);
    	
    }
    
    public void leavetypeMethodd()
    {
    	settingsdropdown.click();
    	leavetypesetingslink.click();
    }
    
    public void logoutmethod()
    {
    	logoutbutton.click();
    }
    
    

}

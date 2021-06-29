package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acttitime.generics.Autoconstant;
import com.acttitime.generics.Basepage;
import com.acttitime.generics.Excellibrary;



public class Login_page extends Basepage implements Autoconstant
{
      
       @FindBy(id="username")
       private WebElement usernametextfield;
       
       @FindBy(xpath="//input[@type='password']")
       private WebElement passwordtextfield;
       
       @FindBy(xpath="//input[@type='checkbox']")
       private WebElement keepmelogincheckbox;
       
       @FindBy(xpath="//div[.='Login ']")
       private WebElement Loginbutton;
       
       @FindBy(xpath="//a[.='Forgot your password?']")
       private WebElement forgottpasswordlink;
       
       @FindBy(xpath="//a[.='actiTIME Inc.']")
       private WebElement actitimeinclink;
       
       
       public Login_page(WebDriver driver)
       {
    	   this.driver=driver;
    	   PageFactory.initElements(driver, this);
       }
       
       public void Loginmethod() throws IOException
       {
    	   usernametextfield.sendKeys(Excellibrary.getCellValue(0, 1));
    	   passwordtextfield.sendKeys(Excellibrary.getCellValue(1, 1));
    	   keepmelogincheckbox.click();
    	   Loginbutton.click();
       }
       public void forgottpasswordmethod()
       {
    	   forgottpasswordlink.click();
       }
       public void actitimeincmethod()
       {
    	   actitimeinclink.click();
       }
}

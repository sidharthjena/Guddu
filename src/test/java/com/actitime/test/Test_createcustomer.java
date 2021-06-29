package com.actitime.test;




import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.pom.Home_page;
import com.actitime.pom.Task_page;
import com.acttitime.generics.Basetest;



public class Test_createcustomer extends Basetest
{
	@Test
	public void createacustomer() throws InterruptedException, IOException
	{
		
		Home_page h=new Home_page(driver);
		h.Taskpagemethod();
		Task_page t=new Task_page(driver);
		t.createCustomerMethod();
		

	}

}

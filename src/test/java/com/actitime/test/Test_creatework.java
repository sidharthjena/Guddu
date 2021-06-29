package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.pom.Home_page;
import com.actitime.pom.Typeofwork_page;
import com.actitime.pom.createnewtypeofwork_page;
import com.acttitime.generics.Basetest;



public class Test_creatework extends Basetest
{
	@Test
	public void createawork() throws IOException
	{
		
		Home_page h=new Home_page(driver);
		h.typeOfWorkMethod();
		Typeofwork_page ty=new Typeofwork_page(driver);
		ty.createnewtypeofworkmethod();
		createnewtypeofwork_page cr=new createnewtypeofwork_page(driver);
		cr.createtypeofworkmethod();
		
	}

}

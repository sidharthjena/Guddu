package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.pom.Home_page;
import com.actitime.pom.Typeofwork_page;
import com.acttitime.generics.Basetest;



public class Test_deletework extends Basetest
{
	@Test
	public void deleteawork()
	{
		
		Home_page h=new Home_page(driver);
		h.typeOfWorkMethod();
		Typeofwork_page ty=new Typeofwork_page(driver);
		ty.deletetypeofworkmethod();
		

}
}
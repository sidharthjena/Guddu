package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.pom.Home_page;
import com.actitime.pom.createleavetype_page;
import com.acttitime.generics.Basetest;


public class Test_editLeave extends Basetest
{
	@Test
	public void editaleave()
	{
		Home_page h=new Home_page(driver);
		h.leavetypeMethodd();
		createleavetype_page cr=new createleavetype_page(driver);
		cr.editleavetypemethod();
		

}
}
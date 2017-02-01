package com.parishta.BestHypnoAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class RegTest {
	public void test(){
		RegistrationPage reg=new RegistrationPage();
		reg.chromeDriver();
		String msg=reg.fillForm();
		Assert.assertEquals(msg, "User already exists");
		reg.driver.quit();
	}

}

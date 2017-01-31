package com.parishta.FirstSelenium;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTest {
	
	//@Test
	/*public void vlidateExistingUser(){
		HomePage homePage = new HomePage();
		RegistrationDetails reg = homePage.regSelect();
		//RegistrationDetails reg = new RegistrationDetails();
		String exp=reg.fillForm();
		System.out.println(exp);
		Assert.assertEquals(exp, "User already exists");
	homePage.driver.quit();
			
	}*/
	
	@Test
	public void validateNewUser() throws ClassNotFoundException, SQLException{
		HomePage homePage = new HomePage();
		RegistrationDetails reg = homePage.regSelect();
		//reg.deleteUser();
		//RegistrationDetails reg = new RegistrationDetails();
		String exp=reg.fillForm();
		System.out.println(exp);
		Assert.assertEquals(exp, "Thank you for registring. To active your account check your email and click on the link.");
		reg.deleteUser();
	homePage.driver.quit();
			
	}
	@Test
	public void login(){
		HomePage homePage=new HomePage();
		homePage.openBrowser();
		homePage.login();
		Assert.assertTrue(homePage.driver.getCurrentUrl().contains("http://qa.besthypnotherapist.com/qa/UserProfile.aspx"), "loginfailed");
		homePage.driver.quit();
	}

}

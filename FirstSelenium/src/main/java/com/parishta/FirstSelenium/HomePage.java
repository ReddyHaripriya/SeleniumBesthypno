package com.parishta.FirstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	//RegistrationDetails reg=new RegistrationDetails();
//	WebDriver driver;
//	HomePage(){
//		super();
//		driver = super.driver;
//	}
private WebElement register(){
	WebElement regLink=driver.findElement(By.id("ctl00_ucLogin_RegisterHyperLink"));
	return regLink;	
}
public RegistrationDetails regSelect(){
	openBrowser();
	register().click();
	return new RegistrationDetails();

	
}

private WebElement getuser(){
	WebElement user=driver.findElement(By.id("ctl00_ucLogin_UserNameTextBox"));
	return user;
	
}
public void setUser(String user){
	getuser().sendKeys(user);
}

private WebElement getPassword(){
	WebElement pwd=driver.findElement(By.id("ctl00_ucLogin_PasswordTextBox"));
	return pwd;
}
public void setPassword(String pwd){
	getPassword().sendKeys(pwd);
}

private WebElement getLoginClick(){
	WebElement loginButton=driver.findElement(By.id("ctl00_ucLogin_LoginButton"));
	return loginButton;
}
public void loginClick(){
	getLoginClick().click();
}

public UserDetails login(){
	setUser("haripriya7");
	setPassword("Hari407#");
	loginClick();
	return new UserDetails();
}
	
}

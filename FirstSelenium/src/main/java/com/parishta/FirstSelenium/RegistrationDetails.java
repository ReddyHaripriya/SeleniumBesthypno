package com.parishta.FirstSelenium;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDetails extends BasePage {
	//WebDriver driver = driver;
//	RegistrationDetails(){
//		super();
//		driver = super.driver;
//	}
	String userId="vin123";
private WebElement getFistName(){
	WebElement fistName = driver.findElement(By.id("ctl00_ContentPlaceHolder1_NameTextBox"));
	return fistName;
}
	
private void setFirstNameUser(String value){
	getFistName().sendKeys(value);
}


private WebElement getLastName(){
	WebElement lastName = driver.findElement(By.id("ctl00_ContentPlaceHolder1_LastNameTextBox"));
	return lastName;
}	
private void setLastName(String value){
	getLastName().sendKeys(value);
}

private WebElement gender(){
	WebElement gender = driver.findElement(By.id("ctl00_ContentPlaceHolder1_SexRadioButtonList_1"));
	return gender;
}	
private void setgender(){
	gender().click();
}

private WebElement dob(){
	WebElement dob = driver.findElement(By.id("ctl00_ContentPlaceHolder1_DOBTextBox"));
	return dob;
}	
private void setDob(String value){
	dob().sendKeys(value);
}

private WebElement street(){
	WebElement street = driver.findElement(By.id("ctl00_ContentPlaceHolder1_StreetTextBox"));
	return street;
}	
private void setStreet(String value){
	street().sendKeys(value);
}

private WebElement city(){
	WebElement city = driver.findElement(By.id("ctl00_ContentPlaceHolder1_CityTextBox"));
	return city;
}	
private void setCity(String value){
	city().sendKeys(value);
}

private WebElement state(){
	WebElement state = driver.findElement(By.id("ctl00_ContentPlaceHolder1_StateDropDownList"));
	
	return state;
}	
private void setState(String value){
	Select select=new Select(state());
	select.selectByVisibleText(value);
}

private WebElement zip(){
	WebElement zip = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ZipCodeTextBox"));
	return zip;
}	
private void setZip(String value){
	zip().sendKeys(value);
}

private WebElement homeNum(){
	WebElement home = driver.findElement(By.id("ctl00_ContentPlaceHolder1_HomeTextBox"));
	return home;
}	
private void setHomeNum(String value){
	homeNum().sendKeys(value);
}

private WebElement email(){
	WebElement email = driver.findElement(By.id("ctl00_ContentPlaceHolder1_EmailTextBox"));
	return email;
}	
private void setEmail(String value){
	email().sendKeys(value);
}

private WebElement userId(){
	WebElement zip = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UserIdTextBox"));
	return zip;
}	
private void setUserId(String value){
	userId().sendKeys(value);
}

private WebElement passWord(){
	WebElement pw = driver.findElement(By.id("ctl00_ContentPlaceHolder1_PasswordTextBox"));
	return pw;
}	
private void setPassWord(String value){
	passWord().sendKeys(value);
}

private WebElement conPassword(){
	WebElement cpw = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RetypePasswordTextBox"));
	return cpw;
}	
private void setConformPassword(String value){
	conPassword().sendKeys(value);
}

private WebElement relativeName(){
	WebElement rName = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RelativeNameTextBox"));
	return rName;
}	
private void setRName(String value){
	relativeName().sendKeys(value);
}

private WebElement rPhone(){
	WebElement phone = driver.findElement(By.id("ctl00_ContentPlaceHolder1_RelativePhoneTextBox"));
	return phone;
}	
private void setRPhone(String value){
	rPhone().sendKeys(value);
}

private WebElement submit(){
	WebElement submit = driver.findElement(By.id("ctl00_ContentPlaceHolder1_SaveButton"));
	return submit;
}	
private void clickSubmit(){
	submit().click();
}

private WebElement msg(){
	WebElement errorMsg=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ErrorMsgLabel"));
	return errorMsg;
}

private String getMsgText(){
	return msg().getText();
	
}

public void deleteUser() throws ClassNotFoundException, SQLException{
	new Database().deleteUser(userId);
}


public String fillForm(){
	this.setFirstNameUser("Hari");
	this.setLastName("Arikela");
	this.setgender();
	this.setDob("06/16/1993");
	this.setStreet("Tufts Drive");
	this.setCity("Manchester");
	this.setState("CONNECTICUT");
	this.setZip("06042");
	this.setHomeNum("7893456789");
	this.setEmail("haripriyaarikela@gmail.com");
	this.setUserId(userId);
	this.setPassWord("Hari1993*");
	this.setConformPassword("Hari1993*");
	this.setRName("Vin");
	this.setRPhone("7897895678");
	//Save()
	this.clickSubmit();
	//return msg;
	return getMsgText();
}

}

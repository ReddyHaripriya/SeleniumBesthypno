package com.parishta.FirstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	static WebDriver driver;
	BasePage(){
	}
	public void openBrowser(){
	 driver=new ChromeDriver();
	driver.get("http://qa.besthypnotherapist.com");

		}
	
}

package com.parishta.BestHypnoAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	static WebDriver driver;
	public void chromeDriver(){
		driver=new ChromeDriver();
		driver.get("http://qa.besthypnotherapist.com/ClientApplication.aspx");
	}

}

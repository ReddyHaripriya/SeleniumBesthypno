package com.parishta.FirstSelenium;

import org.testng.annotations.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
RegistrationDetails reg=new RegistrationDetails();
@Test
public void reg(){
	reg.openBrowser();
	reg.fillForm();
	
}
}

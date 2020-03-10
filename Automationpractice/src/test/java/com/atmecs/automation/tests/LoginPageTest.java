package com.atmecs.automation.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.automation.helpers.CommonHelpers;
import com.atmecs.automation.helpers.PageLocators;

public class LoginPageTest {
	Properties property;
	PageLocators path=new PageLocators();
	@Test
	public void iframes() throws Exception {
		path.getData();
	
		WebDriver driver = null;
		CommonHelpers.moveOver(driver,path.Frameswitch);
		CommonHelpers.clickElement(driver, path.Frame);
	}

}

package com.atmecs.automation.testsuite;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.atmecs.automation.constants.FilePaths;
import com.atmecs.automation.utils.ReadProperties;

public class BaseClass {
	public WebDriver driver;
	Properties property;
	@BeforeTest
	public void invokeBrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", FilePaths.DRIVER);
	    driver=new ChromeDriver();
	    property=ReadProperties.loadProperty(FilePaths.CONFIG_FILE);
	    property.getProperty("application_url");
	    driver.get( property.getProperty("application_url"));
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}


}

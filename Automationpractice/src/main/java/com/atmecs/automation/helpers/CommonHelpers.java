package com.atmecs.automation.helpers;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

	public class CommonHelpers {
		public static WebElement element;

		public static WebElement findElement(WebDriver driver, String locatorType, String locatorValue) {
		try {
		switch (locatorType) {
		case "Xpath":
		element = driver.findElement(By.xpath(locatorValue));
		break;
		case "Id":
		element = driver.findElement(By.id(locatorValue));
		break;
		case "Name":
		element = driver.findElement(By.name(locatorValue));
		break;
		case "CssSeletor":
		element = driver.findElement(By.cssSelector(locatorValue));
		break;
		case "LinkText":
		element = driver.findElement(By.linkText(locatorValue));
		break;
		case "PartialLinkText":
		element = driver.findElement(By.partialLinkText(locatorValue));
		break;
		case "TagName":
		element = driver.findElement(By.tagName(locatorValue));
		break;
		}
		} catch (NullPointerException e) {
		System.out.println("Element is not clicked");
		}
		return element;
		}

		public static List <WebElement> findElements(WebDriver driver, String elementPath) {
		List <WebElement> listOfElements = driver.findElements(By.xpath(elementPath));
		return listOfElements;
		}

		public static void clickElement(WebDriver driver, String element) {
		driver.findElement(By.xpath(element)).click();
		}

		public static void sendKeys(WebDriver driver, WebElement element, String text) {
		element.sendKeys(text);
		}
		public static void moveOver(WebDriver driver,String elementPath)
		{
		       WebElement mouseOver = driver.findElement(By.xpath(elementPath));
		Actions action=new Actions(driver);
		action.moveToElement(mouseOver).perform();
		}
	}
	   





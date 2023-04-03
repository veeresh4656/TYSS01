package com.Generic.Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
public void maximizeWindow(WebDriver driver) {
	driver.manage().window().maximize();
}

public void waitForPageLoadTime(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

public void explicitWait(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(element));
}
}

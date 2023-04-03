package com.Generic.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Options;

public class BaseClass {
	public WebDriver driver;
	DataBaseUtility du=new DataBaseUtility();
FileUtility fu=new FileUtility();
WebDriverUtility wu=new WebDriverUtility();
@BeforeSuite
public void configBS() throws Throwable {
	du.connectToDataBase();
}

@BeforeClass
public void configBC() throws Throwable {
	
	String BROWSER = fu.readPropertyFile("browser");
	if(BROWSER.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disabled-notifications");
		driver=new ChromeDriver(options);
	}
	else if(BROWSER.equalsIgnoreCase("firefox")) {
	WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else {
		System.out.println("driver is not matching");
	}
	String url = fu.readPropertyFile("url");
	wu.maximizeWindow(driver);
	driver.get(url);
	wu.waitForPageLoadTime(driver);
}


@BeforeMethod
public void configBM() {
	System.out.println("Login to the App");
}

@AfterMethod
public void configAM() {
	System.out.println("Logout from the App");
}

@AfterClass
public void configAC() {
	//driver.quit();
}

@AfterSuite()
	public void configAS() throws Throwable {
		du.disconnectFromDataBase();
	}
}


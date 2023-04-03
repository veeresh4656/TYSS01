package com.Flipkart.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement popUp;
	

@FindBy(name="q")
private WebElement searchTxt;

@FindBy(xpath="(//div[text()='in Mobiles'])[2]/preceding-sibling::span")
private WebElement iphoneMob;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getSearchTxt() {
	return searchTxt;
}
public WebElement getIphoneMob() {
	return iphoneMob;
}
public WebElement getPopUp() {
	return popUp;
}

public void searchTextBox() {
	searchTxt.sendKeys("iphone ");
}
public void iphoneMobClick() {
	iphoneMob.click();
}
public void popup() {
	popUp.click();
}

}

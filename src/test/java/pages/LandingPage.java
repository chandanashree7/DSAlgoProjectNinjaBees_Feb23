package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.pageobjects.CheckoutPage;

public class LandingPage {
	
	private WebDriver driver;
	
	//1.By Locators
	private By getStartedLink=By.xpath("//a[@href='/home']");
	
	//Constructor of the page class
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnGetStarted() {
		driver.findElement(getStartedLink).click();
	}
	
	
	public HomePage doClickGetStarted(String str) {
		driver.findElement(getStartedLink).click();
		return new HomePage(driver);
	}
}

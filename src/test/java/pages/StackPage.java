package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StackPage {

	
	WebDriver driver;
	By GetstartStack = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[4]//a");
	By OperationsinStack = By.xpath("//a[text()='Operations in Stack']");
	By Implementation = By.xpath("//a[text()='Implementation']");
	By Applications = By.xpath("//a[text()='Applications']");
	
	public void StackPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnGetStartedStack() {
		driver.findElement(GetstartStack).click();
	}
	public void clickOnOperationsInStack() {
		driver.findElement(OperationsinStack).click();
	}
	public void clickOnImplementation() {
		driver.findElement(Implementation).click();
	}
	public void clickOnApplications() {
		driver.findElement(Applications).click();
	}
}

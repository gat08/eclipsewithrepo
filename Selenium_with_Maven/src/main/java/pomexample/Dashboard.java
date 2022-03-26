package pomexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	WebDriver dbdriver;

	public Dashboard(WebDriver testdriver) {
		this.dbdriver = testdriver;
		PageFactory.initElements(testdriver, this);
	}

	public WebElement getHeading() {
		return dbdriver.findElement(By.xpath("//h1"));// xpath of heading
	}

	@FindBy(xpath = "//h1")
	WebElement header;

	public boolean verifyHeader() {
		return header.isDisplayed();
	}
	@FindBy(xpath ="//span[text()='Users']")
	WebElement userBtn;

	public UserPage userbutton() {
		userBtn.click();
		return new UserPage(dbdriver);
	}
}

package pomexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver loginpagedriver;// global variable

	// constructor
		public Loginpage(WebDriver logtestdriver) {
		this.loginpagedriver = logtestdriver;
		PageFactory.initElements(logtestdriver, this);

	}

	@FindBy(id ="email")
	private WebElement username;
	@FindBy(id ="password")
	private WebElement paswd;
	@FindBy(xpath = "//button")
	private WebElement button;
	@FindBy(partialLinkText ="register")
	private WebElement link;

	public void loginmethod(String uname, String password) {
		username.sendKeys(uname);
		paswd.sendKeys(password);
		button.click();

	}

	public Dashboard validlogin() {
		username.sendKeys("kiran@gmail.com");
		paswd.sendKeys("123456");
		button.click();
		return new Dashboard(loginpagedriver);

	}
	public Register clickregister() {
		link.click();
		return new Register(loginpagedriver);
	}
}

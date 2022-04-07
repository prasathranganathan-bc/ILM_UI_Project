package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.DriverManager;
import Utility.HighlightElement;
import Utility.Util;

public class LoginPage extends DriverManager {

	@FindBy(xpath = "//*[@id='input-email_address']")
	WebElement username;

	@FindBy(xpath = "//*[@id='input-password']")
	WebElement password;

	@FindBy(xpath = "//*[@class='govuk-button']")
	WebElement submit;
	
	public LoginPage() {
		PageFactory.initElements(webDriver.get(), this);
	}

	public void Login(String userName, String passWord) {
		Util.sendText(username, userName);
		HighlightElement.highLighterMethod(webDriver.get(), username);
		Util.sendText(password, passWord);
		HighlightElement.highLighterMethod(webDriver.get(), password);
		HighlightElement.highLighterMethod(webDriver.get(), submit);
		Util.click(submit);

//		return new DashboardPage();
	}

}
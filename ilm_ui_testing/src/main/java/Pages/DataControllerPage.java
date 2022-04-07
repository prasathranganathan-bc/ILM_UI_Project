package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base.DriverManager;
import Utility.CommonElements;
import Utility.HighlightElement;
import Utility.Util;

public class DataControllerPage extends DriverManager  {
		WebDriverWait wait;

		public DataControllerPage() {
			PageFactory.initElements(webDriver.get(), this);
		}

		@FindBy(xpath = "(//*[contains(text(),'DUNS Number')]/following::a)[1]")
		WebElement dunsNo_change;

		public void click_DUNSNumber_Change() throws Exception {
			Util.click(dunsNo_change);
		}
		
		
		@FindBy(xpath = "(//*[text()='Change'])[1]")
		WebElement comp_reg_nam;
		@FindBy(xpath = "(//*[text()='Change'])[2]")
		WebElement comp_reg_no;
		@FindBy(xpath = "(//*[text()='Change'])[4]")
		WebElement comp_reg_address;
		@FindBy(xpath = "//*[@id='input-street']")
		WebElement build_street;
		@FindBy(xpath = "//*[@id='input-city']")
		WebElement town_city;
		@FindBy(xpath = "//*[@id='input-postcode']")
		WebElement postal_code;
		@FindBy(xpath = "//*[@id='input-country']")
		WebElement country_nam;
		
		public void click_CompNameNoReg_Change(String compRegNam, String compRegNo, String street_build, String townCity,String postalCode, String countryNam) throws Exception {
			Util.click(comp_reg_nam);
			CommonElements.Registered_CompanyName(compRegNam);
			CommonElements.Save_Button();
			Util.click(comp_reg_no);
			CommonElements.CompanyHouseNo(compRegNo);
			CommonElements.Save_Button();
			Util.click(comp_reg_address);
			Util.sendText(build_street,street_build );
			Util.sendText(town_city, townCity);
			CommonElements.ScrollView(webDriver.get(), postal_code);
			Util.sendText(postal_code, postalCode);
				HighlightElement.highLighterMethod(webDriver.get(), country_nam);
				country_nam.sendKeys(Keys.chord(Keys.CONTROL, "a"));
				country_nam.sendKeys(Keys.DELETE);
				Thread.sleep(2000);
				Util.sendText(country_nam, countryNam);
				Thread.sleep(1000);
				country_nam.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				CommonElements.Save_Button();
			}

		@FindBy(xpath = "(//*[@class='summary-item-field'])[1]")
		WebElement compRegName;
		@FindBy(xpath = "(//*[@class='summary-item-field'])[2]")
		WebElement compRegNo;
		
		public void Validation_CompanyRegNamandNo(String compRegName_, String compRegNo_) throws Exception {
			CommonElements.Validation(compRegName, compRegName_);
			CommonElements.Validation(compRegNo, compRegNo_);
		}

		@FindBy(xpath = "//*[@class='contact-details-block']")
		WebElement ver_regCompAdr;
		
		public void Validation_CompanyAddress(String buildstreet, String towncity, String postalcode, String countrynam1) throws Exception {
			String str1=ver_regCompAdr.getText();
			Assert.assertEquals(str1.contains(buildstreet), true);
			Assert.assertEquals(str1.contains(towncity), true);
			Assert.assertEquals(str1.contains(postalcode), true);
			Assert.assertEquals(str1.contains(countrynam1), true);
		}
		
			
		}

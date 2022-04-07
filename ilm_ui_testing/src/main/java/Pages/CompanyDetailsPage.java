package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.DriverManager;
import Utility.CommonElements;
import Utility.HighlightElement;
import Utility.Util;

public class CompanyDetailsPage extends DriverManager {
	public CompanyDetailsPage() {
		PageFactory.initElements(webDriver.get(), this);
	}

	@FindBy(xpath = "//*[text()='Your company details']")
	WebElement comp_det;

	public void CompanyDetails() {
		Util.click(comp_det);
	}

	@FindBy(xpath = "(//*[@class='govuk-summary-list__actions']/a)[1]")
	WebElement edit_contNam;
	@FindBy(xpath = "//*[@id='input-contactName']")
	WebElement contNam;
	@FindBy(xpath = "//*[@id='input-email']")
	WebElement contEmail;
	@FindBy(xpath = "//*[@id='input-phoneNumber']")
	WebElement contPhone;
	@FindBy(xpath = "//*[@id='input-description']")
	WebElement contDesc;

	public void Edit_YourCompanyDetails(String cont_nam, String cont_email, String cont_ph, String cont_desc) {
		HighlightElement.highLighterMethod(webDriver.get(), edit_contNam);
		Util.click(edit_contNam);
		Util.sendText(contNam, cont_nam);
		HighlightElement.highLighterMethod(webDriver.get(), contNam);
		Util.sendText(contEmail, cont_email);
		HighlightElement.highLighterMethod(webDriver.get(), contEmail);
		Util.sendText(contPhone, cont_ph);
		HighlightElement.highLighterMethod(webDriver.get(), contPhone);
		Util.sendText(contDesc, cont_desc);
		HighlightElement.highLighterMethod(webDriver.get(), contDesc);
	}

	public void Verify_YourCompanyDetails(String val_cont_nam, String val_cont_email, String val_cont_ph,
			String val_cont_desc) { //
		List<WebElement> elem_list_compContDet = webDriver.get()
				.findElements(By.xpath("//*[@class='govuk-summary-list__value']"));
		Assert.assertEquals(elem_list_compContDet.get(0).getText(), val_cont_nam);
		Assert.assertEquals(elem_list_compContDet.get(1).getText(), val_cont_email);
		Assert.assertEquals(elem_list_compContDet.get(2).getText(), val_cont_ph);
		Assert.assertEquals(elem_list_compContDet.get(3).getText(), val_cont_desc);
	}

	@FindBy(xpath = "//*[contains(text(),'Registered company name')]/ancestor::div[1]//a")
	WebElement reg_compNam;

	public void viewRegisteredCompanyDetails() throws InterruptedException {
		CommonElements.ScrollView(webDriver.get(), reg_compNam);
		HighlightElement.highLighterMethod(webDriver.get(), reg_compNam);
	}

	public void Edit_RegisteredCompanyDetails() throws Exception {
		Thread.sleep(1000);
		Util.click(reg_compNam);
	}

	public void Validatingurl_RegisteredCompanyDetails() {
//		Assert.assertEquals(Util.getURL(),"https://www.sandbox.marketplace.team/suppliers/registered-company-name/edit");
		CommonElements.ValidatingUrl("https://www.sandbox.marketplace.team/suppliers/registered-company-name/edit");
	}

	@FindBy(xpath = "//*[contains(text(),'cloud_digital@crowncommercial.gov.uk')]")
	WebElement mail_verify;
	public void RegisteredDetails_SendMail() throws Exception {
		CommonElements.ScrollView(webDriver.get(), mail_verify);
		HighlightElement.highLighterMethod(webDriver.get(), mail_verify);
		CommonElements.Validation(mail_verify, "cloud_digital@crowncommercial.gov.uk");
	}

	@FindBy(xpath = "//*[@class='govuk-body-m']")
	WebElement msg_verify;
	public void RegisteredDetails_SendMail_Message() throws InterruptedException {
		Thread.sleep(1500);
		HighlightElement.highLighterMethod(webDriver.get(), msg_verify);
		CommonElements.Validation(msg_verify, "Contact cloud_digital@crowncommercial.gov.uk to correct a mistake in your:");
	}

	@FindBy(xpath = "//*[@class='govuk-list govuk-list--bullet']")
	WebElement regcompdet_verify;
	public void RegisteredCompanyDetails_Info() throws Exception {
		HighlightElement.highLighterMethod(webDriver.get(), regcompdet_verify);
		String a[] = { "registered company name", "registration number", "DUNS number" };
		List<WebElement> regcomp_list = webDriver.get()
				.findElements(By.xpath("//*[@class='govuk-list govuk-list--bullet']/li"));
		for (int i = 0; i <= regcomp_list.size()-1; i++) {
			Thread.sleep(1000);
				Assert.assertEquals(regcomp_list.get(i).getText(), a[i]);
				System.out.println("Registered Company Details:::" + regcomp_list.get(i).getText() + " => " + a[i]);
			}
		}
	
	@FindBy(xpath = "//*[contains(text(),'Registered company address')]/ancestor::div[1]//a")
	WebElement edit_reg_compadr;
	@FindBy(xpath = "//*[@id='input-street']")
	WebElement build_street;
	@FindBy(xpath = "//*[@id='input-city']")
	WebElement town_city;
	@FindBy(xpath = "//*[@id='input-postcode']")
	WebElement postal_code;
	@FindBy(xpath = "//*[@id='input-country']")
	WebElement country_nam;
	
	public void Edit_YourFrameworkApp_Address(String street_build, String townCity, String postalCode, String countryNam) throws Exception {
		HighlightElement.highLighterMethod(webDriver.get(), edit_reg_compadr);
		Util.click(edit_reg_compadr);
		
		HighlightElement.highLighterMethod(webDriver.get(), build_street);
		Util.sendText(build_street,street_build );
		
		HighlightElement.highLighterMethod(webDriver.get(), town_city);
		Util.sendText(town_city, townCity);
		
		CommonElements.ScrollView(webDriver.get(), postal_code);
		HighlightElement.highLighterMethod(webDriver.get(), postal_code);
		Util.sendText(postal_code, postalCode);
		
		HighlightElement.highLighterMethod(webDriver.get(), country_nam);
		country_nam.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		country_nam.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		Util.sendText(country_nam, countryNam);
		Thread.sleep(1000);
		country_nam.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		CommonElements.SaveReturn_Button();
	}
	
	@FindBy(xpath = "//*[contains(text(),'Trading status')]/ancestor::div[1]//a")
	WebElement trad_stat;
	public void Edit_YourFrameworkApp_TradingStatus(String tradStat) throws Exception {
		CommonElements.ScrollView(webDriver.get(), trad_stat);
		HighlightElement.highLighterMethod(webDriver.get(), trad_stat);
		Util.click(trad_stat);
		List<WebElement> tradstat_list = webDriver.get().findElements(By.xpath("//*[@class='govuk-label govuk-radios__label']"));
		for(WebElement trad_stat:tradstat_list) {
			String search_sup = trad_stat.getText();
			if(search_sup.equals(tradStat)) {
				Thread.sleep(1000);
				trad_stat.click();
				Assert.assertEquals(search_sup, tradStat);
			}
	}
		CommonElements.SaveReturn_Button();
	}
	
	@FindBy(xpath = "//*[contains(text(),'Company size')]/ancestor::div[1]//a")
	WebElement comp_size;
	public void Edit_YourFrameworkApp_CompanySize(String compSize) throws Exception {
		CommonElements.ScrollView(webDriver.get(), comp_size);
		HighlightElement.highLighterMethod(webDriver.get(), comp_size);
		Util.click(comp_size);
		List<WebElement> compSiz_list = webDriver.get().findElements(By.xpath("//*[@class='govuk-label govuk-radios__label']"));
		for(WebElement comp_size:compSiz_list) {
			String str_comp_size = comp_size.getText();
			if(str_comp_size.equals(compSize)) {
				Thread.sleep(1000);
				comp_size.click();
				Assert.assertEquals(str_comp_size, compSize);
			}
	}
		CommonElements.SaveReturn_Button();
	}
	
	
	@FindBy(xpath = "//*[contains(text(),'Registered company address')]/following::dd[1]")
	WebElement ver_regCompAdr;
	
	public void Verify_EditYourFrameworkApp(String buildstreet, String towncity, String postalcode, String countrynam1) throws Exception {
		String str1=ver_regCompAdr.getText();
		Assert.assertEquals(str1.contains(buildstreet), true);
		Assert.assertEquals(str1.contains(towncity), true);
		Assert.assertEquals(str1.contains(postalcode), true);
		Assert.assertEquals(str1.contains(countrynam1), true);
	}
	
}


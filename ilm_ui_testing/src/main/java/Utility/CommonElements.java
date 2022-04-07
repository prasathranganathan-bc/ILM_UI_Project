package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.DriverManager;

public class CommonElements extends DriverManager {
	
	public CommonElements() {
		PageFactory.initElements(webDriver.get(), this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Save and return')]")
	static
	WebElement saveRet_btn;
	public static void SaveReturn_Button() throws Exception {
		ScrollView(webDriver.get(), saveRet_btn);
		Util.click(saveRet_btn);
		Thread.sleep(1000);
	}

	@FindBy(xpath = "//*[contains(text(),'Log out')]")
	static
	WebElement logout_btn;
	public static void Logout_Button() {
		HighlightElement.highLighterMethod(webDriver.get(), logout_btn);
		Util.click(logout_btn);
	}

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	static
	WebElement Srch_btn;
	public static void Search_Button() {
		HighlightElement.highLighterMethod(webDriver.get(), Srch_btn);
		Util.click(Srch_btn);
	}
	
	@FindBy(xpath = "//button[@name='find_supplier_by_name_search' and contains(text(),'Search')]")
	static
	WebElement Srch_by_nam;
	public static void SearchByName_Button() {
		HighlightElement.highLighterMethod(webDriver.get(), Srch_by_nam);
		Util.click(Srch_by_nam);
	}
	
	@FindBy(xpath = "//*[text()='Your account']")
	static
	WebElement urAcc_link;
	public static void YourAccount_Link() {
		HighlightElement.highLighterMethod(webDriver.get(), urAcc_link);
		Util.click(urAcc_link);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Review service changes')]")
	static
	WebElement review_servChanges_link;
	public static void ReviewServiceChanges_Link() {
		HighlightElement.highLighterMethod(webDriver.get(), review_servChanges_link);
		Util.click(review_servChanges_link);
	}
	
	@FindBy(xpath = "(//*[contains(text(),'View changes')])[1]")
	static
	WebElement viewChanges_link;
	public static void ViewChanges_Link() {
		HighlightElement.highLighterMethod(webDriver.get(), viewChanges_link);
		Util.click(viewChanges_link);
	}
	
	
	
	@FindBy(xpath = "//*[contains(text(),'View documents')]")
	static
	WebElement viewDoc_link;
	public static void ViewDocuments_Link() {
		HighlightElement.highLighterMethod(webDriver.get(), viewDoc_link);
		Util.click(viewDoc_link);
	}
	
	@FindBy(xpath = "//*[contains(text(),'View and edit suppliers')]")
	static
	WebElement viewEditSupp_link;
	public static void View_EditSupplier_Link() throws Exception {
		ScrollView(webDriver.get(), viewEditSupp_link);
		HighlightElement.highLighterMethod(webDriver.get(), viewEditSupp_link);
		Util.click(viewEditSupp_link);
	}
	
	@FindBy(xpath = "//*[contains(text(),'View agreements')]")
	static
	WebElement viewAgree_link;
	public static void ViewAgreement_Link() {
		HighlightElement.highLighterMethod(webDriver.get(), viewAgree_link);
		Util.click(viewAgree_link);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Edit suppliers and services')]")
	static
	WebElement editSupServ_link;
	public static void EditSupplierService_Link() throws Exception {
		Thread.sleep(1000);
		HighlightElement.highLighterMethod(webDriver.get(), editSupServ_link);
		Util.click(editSupServ_link);
	}
	
	@FindBy(xpath = "//*[contains(text(),'View services')]")
	static
	WebElement viewServices_link;
	public static void ViewService_Link() throws Exception {
		ScrollView(webDriver.get(), viewServices_link);
		Util.click(viewServices_link);
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Edit')])[1]")
	static
	WebElement Edit_1_link;
	public static void EditLink_First() throws Exception {
		ScrollView(webDriver.get(), Edit_1_link);
		HighlightElement.highLighterMethod(webDriver.get(), Edit_1_link);
		Util.click(Edit_1_link);
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Edit')])[2]")
	static
	WebElement Edit_2_link;
	public static void EditLink_Second() throws Exception {
		ScrollView(webDriver.get(), Edit_2_link);
		HighlightElement.highLighterMethod(webDriver.get(), Edit_2_link);
		Util.click(Edit_2_link);
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Edit')])[3]")
	static
	WebElement Edit_3_link;
	public static void EditLink_Third() throws Exception {
		ScrollView(webDriver.get(), Edit_3_link);
		HighlightElement.highLighterMethod(webDriver.get(), Edit_3_link);
		Util.click(Edit_3_link);
	}

	@FindBy(xpath = "(//*[contains(text(),'Edit')])[4]")
	static
	WebElement Edit_4_link;
	public static void EditLink_Fourth() throws Exception {
		ScrollView(webDriver.get(), Edit_4_link);
		HighlightElement.highLighterMethod(webDriver.get(), Edit_4_link);
		Util.click(Edit_4_link);
	}

	
	@FindBy(xpath = "//*[contains(text(),'Admin home')]")
	static
	WebElement adminHome_link;
	public static void AdminHome_Link() throws Exception {
		Thread.sleep(1000);
		ScrollView(webDriver.get(), adminHome_link);
		HighlightElement.highLighterMethod(webDriver.get(), adminHome_link);
		Util.click(adminHome_link);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Edit supplier name')]")
	static
	WebElement editSupp_link;
	public static void EditSupplier_Link() throws Exception {
		Thread.sleep(1000);
		ScrollView(webDriver.get(), editSupp_link);
		HighlightElement.highLighterMethod(webDriver.get(), editSupp_link);
		Util.click(editSupp_link);
	}
	
	@FindBy(xpath = "//*[@id='input-new_supplier_name']")
	static
	WebElement newSuppName_link;
	public static void NewSupplierName_Link(String new_sup_nam) throws Exception {
		ScrollView(webDriver.get(), newSuppName_link);
		HighlightElement.highLighterMethod(webDriver.get(), newSuppName_link);
		Util.sendText(newSuppName_link, new_sup_nam);
	}
	
	@FindBy(xpath = "//*[@id='input-serviceName']")
	static
	WebElement newServiceName_link;
	public static void NewServiceName_Link(String new_serv_nam) throws Exception {
		ScrollView(webDriver.get(), newServiceName_link);
		Util.sendText(newServiceName_link, new_serv_nam);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Save and return to summary')]")
	static
	WebElement saveRet_summ;
	public static void SaveReturnSummary_Button() throws Exception {
		ScrollView(webDriver.get(), saveRet_summ);
		HighlightElement.highLighterMethod(webDriver.get(), saveRet_summ);
		Util.click(saveRet_summ);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Save')]")
	static
	WebElement save_btn;
	public static void Save_Button() throws Exception {
		ScrollView(webDriver.get(), save_btn);
		HighlightElement.highLighterMethod(webDriver.get(), save_btn);
		Util.click(save_btn);
	}
	
	@FindBy(xpath = "//*[@name='registered_company_name']")
	static
	WebElement reg_compNam;
	public static void Registered_CompanyName(String regCompNam) throws Exception {
		Util.sendText(reg_compNam, regCompNam);
	}

	@FindBy(xpath = "//*[@id='input-companies_house_number']")
	static
	WebElement compHouseNo;
	public static void CompanyHouseNo(String Comphu) throws Exception {
		Util.sendText(compHouseNo, Comphu);
	}

	
	@FindBy(xpath = "//*[@id='input-other_company_registration_number']")
	static
	WebElement reg_compHouseNo;
	public static void Registered_CompanyHouseNo(String regComphu) throws Exception {
		Util.sendText(reg_compHouseNo, regComphu);
	}
	
	
	
	public static void Validation(WebElement element, String actualElem) {
		Assert.assertEquals(element.getText(), actualElem);
	}

	public static void ValidatingUrl(String currentUrl) {
		Assert.assertEquals(Util.getURL(), currentUrl);
	}
	
	public static void ScrollView(WebDriver driver, WebElement scrol_elem) throws InterruptedException {
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", scrol_elem);
	}
	
	
	
	


}

package Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.DriverManager;
import Utility.CommonElements;
import Utility.Util;

public class GCloudServicePage extends DriverManager {
	WebDriverWait wait;
	JavascriptExecutor jse = (JavascriptExecutor) webDriver.get();
	public static LoginPage log_pg = new LoginPage();

	public GCloudServicePage() {
		PageFactory.initElements(webDriver.get(), this);
	}

	@FindBy(xpath = "//*[@class='govuk-table__cell']/a")
	WebElement clk_editSup_Services;
	@FindBy(xpath = "(//*[@class='govuk-table__cell']/a)[3]")
	WebElement clk_editSup_Services3;
	@FindBy(xpath = "(//*[contains(text(),'Service name')])[3]/following::td[1]")
	WebElement servNam_get;
	@FindBy(xpath = "//*[@id='input-serviceDescription']")
	WebElement abtServ_desc;
	@FindBy(xpath = "(//*[text()='Service description']//following::td)[1]")
	WebElement abt_urServ;
	@FindBy(xpath = "//*[@id='input-serviceFeatures-1']")
	WebElement list_servFeatu;
	@FindBy(xpath = "//*[@id='input-serviceBenefits-1']")
	WebElement list_servbenf;
	@FindBy(xpath = "//p[contains(text(),'Service features')]//following::div[1]")
	WebElement ver_serFeat;
	@FindBy(xpath = "//p[contains(text(),'Service benefits')]//following::div[1]")
	WebElement ver_serBen;
	@FindBy(xpath = "//*[@class='file-upload-input']")
	WebElement file_upload;
	@FindBy(xpath = "//*[@class='document-link-with-narrow-icon']")
	WebElement verfy_file_upload;

	public void click_Editsupliersandservices(String serivceNam, String AbtServ, String listServFeatu,
			String listServbenf) throws Exception {
		Thread.sleep(1000);
		CommonElements.ScrollView(webDriver.get(), clk_editSup_Services3);
		Util.click(clk_editSup_Services3);
		CommonElements.EditLink_First();
		CommonElements.NewServiceName_Link(serivceNam);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(servNam_get, serivceNam);

		CommonElements.EditLink_Second();
		Util.sendText(abtServ_desc, AbtServ);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(abt_urServ, AbtServ);

		CommonElements.EditLink_Third();
		Util.sendText(list_servFeatu, listServFeatu);
		Util.sendText(list_servbenf, listServbenf);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(ver_serFeat, listServFeatu);
		CommonElements.Validation(ver_serBen, listServbenf);

		CommonElements.EditLink_Fourth();
		CommonElements.ScrollView(webDriver.get(), file_upload);
		WebElement up_loadFile = webDriver.get().findElement(By.xpath("//*[@class='file-upload-input']"));
		up_loadFile.sendKeys("C:/Users/Dreamguystech/ccs_workspace/ilm_project/Test_Document.pdf");
		CommonElements.SaveReturn_Button();

	}

	@FindBy(xpath = "(//*[@class='govuk-table__cell']/a)[2]")
	WebElement clk_editSup_Services2;
	public void click_Editsupliersandservices_CSoftware(String serivceNam, String AbtServ, String listServFeatu,
			String listServbenf) throws Exception {
		Thread.sleep(1000);
		CommonElements.ScrollView(webDriver.get(), clk_editSup_Services2);
		Util.click(clk_editSup_Services2);
		CommonElements.EditLink_First();
		CommonElements.NewServiceName_Link(serivceNam);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(servNam_get, serivceNam);

		CommonElements.EditLink_Second();
		Util.sendText(abtServ_desc, AbtServ);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(abt_urServ, AbtServ);

		CommonElements.EditLink_Third();
		Util.sendText(list_servFeatu, listServFeatu);
		Util.sendText(list_servbenf, listServbenf);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(ver_serFeat, listServFeatu);
		CommonElements.Validation(ver_serBen, listServbenf);

		CommonElements.EditLink_Fourth();
		CommonElements.ScrollView(webDriver.get(), file_upload);
		WebElement up_loadFile = webDriver.get().findElement(By.xpath("//*[@class='file-upload-input']"));
		up_loadFile.sendKeys("C:/Users/Dreamguystech/ccs_workspace/ilm_project/Test_Document.pdf");
		CommonElements.SaveReturn_Button();
	}

	@FindBy(xpath = "(//*[@class='govuk-table__cell']/a)[1]")
	WebElement clk_editSup_Services1;
	public void click_Editsupliersandservices_CHosting(String serivceNam, String AbtServ, String listServFeatu,
			String listServbenf) throws Exception {
		Thread.sleep(1000);
		CommonElements.ScrollView(webDriver.get(), clk_editSup_Services1);
		Util.click(clk_editSup_Services1);
		CommonElements.EditLink_First();
		CommonElements.NewServiceName_Link(serivceNam);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(servNam_get, serivceNam);

		CommonElements.EditLink_Second();
		Util.sendText(abtServ_desc, AbtServ);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(abt_urServ, AbtServ);

		CommonElements.EditLink_Third();
		Util.sendText(list_servFeatu, listServFeatu);
		Util.sendText(list_servbenf, listServbenf);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(ver_serFeat, listServFeatu);
		CommonElements.Validation(ver_serBen, listServbenf);

		CommonElements.EditLink_Fourth();
		CommonElements.ScrollView(webDriver.get(), file_upload);
		WebElement up_loadFile = webDriver.get().findElement(By.xpath("//*[@class='file-upload-input']"));
		up_loadFile.sendKeys("C:/Users/Dreamguystech/ccs_workspace/ilm_project/Test_Document.pdf");
		CommonElements.SaveReturn_Button();

	}
	
	
	@FindBy(xpath = "(//*[contains(text(),'Service name')])[1]")
	static WebElement serviceName_text;

	public void ServiceName_Scroll() throws Exception { // Just scroll purpose
		CommonElements.ScrollView(webDriver.get(), serviceName_text);
	}

	public void click_SupliersServiceName() throws Exception {
		Thread.sleep(1000);
		CommonElements.ScrollView(webDriver.get(), clk_editSup_Services);
		Util.click(clk_editSup_Services);
	}

	public void CategoryAdmin_EditSupplierName() throws Exception { // Just scroll purpose
		log_pg.Login("63956@user.marketplace.team", "Password1234");
	}

	@FindBy(xpath = "//*[@id='input-serviceName']")
	WebElement input_servNam;
	@FindBy(xpath = "(//p[text()='Service features']//following::div)[1]")
	WebElement ver_serFeat_1;
	@FindBy(xpath = "(//p[text()='Service benefits']//following::div)[1]")
	WebElement ver_serBen_1;
	@FindBy(xpath = "//*[@id='input-planningServiceDescription']")
	WebElement planServ_desc;
	@FindBy(xpath = "(//*[contains(text(),'Yes')])[2]")
	WebElement Yes_btn_1;
	@FindBy(xpath = "(//*[contains(text(),'No')])[2]")
	WebElement No_btn_1;
	@FindBy(xpath = "(//*[contains(text(),'No')])[3]")
	WebElement No_btn_2;
	@FindBy(xpath = "(//*[contains(text(),'How the planning service works')]//following::div)[1]")
	WebElement ver_planning;
	@FindBy(xpath = "//*[@id='input-setupAndMigrationServiceDescription']")
	WebElement setUp_migration;
	@FindBy(xpath = "(//*[text()='How the setup or migration service works']//following::div)[1]")
	WebElement ver_setupMig;
	@FindBy(tagName = "textarea")
	WebElement text_Desc;
	@FindBy(xpath = "(//*[@class='radio'])[1]")
	WebElement radio_btn_1;
	@FindBy(xpath = "//input[@id='input-standardsISOIEC27001Who']")
	WebElement iso_27001;
	@FindBy(xpath = "//*[@id='input-minimum-price']")
	WebElement min_price;
	@FindBy(xpath = "//*[@id='input-maximum-price']")
	WebElement max_price;
//	@FindBy(xpath = "")
//	WebElement ;

	public void CategoryAdmin_CSupp_EditServiceLine(String resrStudNam1, String AbtServ, String listServFeatures,
			String listServbenfits, String planServDesc, String setupMig, String qa_performance, String training_desc,
			String serv_scop, String online_ticket, String iso_cert, String flight_climate, String minPrice,
			String maxPrice) throws Exception {

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[1]")).click();
		wait = new WebDriverWait(webDriver.get(), 30);
		wait.until(ExpectedConditions.visibilityOf(input_servNam));
		Util.sendText(input_servNam, resrStudNam1);
		Util.sendText(abtServ_desc, AbtServ);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(abt_urServ, AbtServ);

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[2]")).click();
		Util.sendText(list_servFeatu, listServFeatures);
		Util.sendText(list_servbenf, listServbenfits);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(ver_serFeat, listServFeatures);
		CommonElements.Validation(ver_serBen, listServbenfits);

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[3]")).click();
//		Util.sendText(planServ_desc, planServDesc);
		Util.click(No_btn_1);
		CommonElements.SaveReturn_Button();
//		CommonElements.Validation(ver_planning, planServDesc);

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[4]")).click();
//		Util.sendText(setUp_migration, setupMig);
		Util.click(No_btn_1);
		CommonElements.SaveReturn_Button();
//		CommonElements.Validation(ver_setupMig, setupMig);

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[5]")).click();
		if (No_btn_1.isSelected() == true) {
			Util.click(Yes_btn_1);
			Util.sendText(text_Desc, qa_performance);
		}
		Util.click(No_btn_1);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[6]")).click();
		List<WebElement> user_res_part = webDriver.get().findElements(By.xpath("//input[contains(@type,'checkbox')]"));

		for (WebElement userRes_part : user_res_part) {
			String outComes_checked = userRes_part.getAttribute("value");
			if (userRes_part.isSelected() == false || userRes_part.isSelected() == true) {
				Thread.sleep(100);
				userRes_part.click();
			}
			break;
		}
		Util.click(No_btn_2);

		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[7]")).click();
		if (No_btn_1.isSelected() == true) {
			Util.click(Yes_btn_1);
			Util.sendText(text_Desc, training_desc);
		}
		Util.click(No_btn_1);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[8]")).click();
		List<WebElement> out_Comes = webDriver.get().findElements(By.xpath("//input[contains(@type,'checkbox')]"));
		for (WebElement outComes : out_Comes) {
			String outComes_checked = outComes.getAttribute("value");
			if (outComes.isSelected() == false || outComes.isSelected() == true) {
				Thread.sleep(100);
				outComes.click();
			}
		}
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[9]")).click();
		Util.sendText(text_Desc, serv_scop);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[10]")).click();
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[11]")).click();
//		Util.sendText(text_Desc, online_ticket);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[12]")).click();
		Util.click(radio_btn_1);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[13]")).click();
//		Util.sendText(iso_27001, iso_cert);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[14]")).click();
		Util.sendText(text_Desc, flight_climate);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[15]")).click();
		Util.sendText(min_price, minPrice);
		Util.sendText(max_price, maxPrice);
		CommonElements.SaveReturn_Button();
	}

	@FindBy(xpath = "//*[contains(text(),'Save and return')]")
	static WebElement saveRet_btn;
	@FindBy(xpath = "//*[contains(text(),'None')]")
	static WebElement none_radio_btn;

	public void CategoryAdmin_CSoftware_EditServiceLine(String resrStudNam1, String AbtServ, String listServFeatures,
			String listServbenfits, String planServDesc, String setupMig, String qa_performance, String training_desc,
			String serv_scop, String online_ticket, String iso_cert, String flight_climate, String minPrice,
			String maxPrice, String analytics_desc) throws Exception {

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[1]")).click();
		wait = new WebDriverWait(webDriver.get(), 30);
		wait.until(ExpectedConditions.visibilityOf(input_servNam));
		Util.sendText(input_servNam, resrStudNam1);
		Util.sendText(abtServ_desc, AbtServ);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(abt_urServ, AbtServ);

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[2]")).click();
		Util.sendText(list_servFeatu, listServFeatures);
		Util.sendText(list_servbenf, listServbenfits);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(ver_serFeat_1, listServFeatures);
		CommonElements.Validation(ver_serBen_1, listServbenfits);

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[3]")).click();
//		Util.sendText(text_Desc, serv_scop);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[4]")).click();
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[5]")).click();
//		Util.sendText(text_Desc, online_ticket);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[6]")).click();
		Util.click(Yes_btn_1);
		List<WebElement> operational_secu = webDriver.get().findElements(By.xpath("//input[contains(@type,'checkbox')]"));

		for (WebElement operationalSecu : operational_secu) {
			String outComes_checked = operationalSecu.getAttribute("value");
			if (operationalSecu.isSelected() == false || operationalSecu.isSelected() == true) {
				Thread.sleep(100);
				operationalSecu.click();
			}
			break;
		}
		Util.click(No_btn_2);

		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[7]")).click();
		Util.sendText(text_Desc, qa_performance);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[8]")).click();
		Util.sendText(text_Desc, qa_performance);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[9]")).click();
		Util.click(Yes_btn_1);
		Util.sendText(text_Desc, analytics_desc);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[10]")).click();
		Util.sendText(text_Desc, analytics_desc);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[11]")).click();
		if (No_btn_1.isSelected() == true) {
			Util.click(Yes_btn_1);
			Util.sendText(text_Desc, qa_performance);
		}
		Util.click(No_btn_1);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[12]")).click();
		List<WebElement> user_res_part = webDriver.get().findElements(By.xpath("//input[contains(@type,'checkbox')]"));
		for (WebElement userRes_part : user_res_part) {
			String outComes_checked = userRes_part.getAttribute("value");
			if (userRes_part.isSelected() == false || userRes_part.isSelected() == true) {
				Thread.sleep(100);
				userRes_part.click();
			}
			break;
		}
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[13]")).click();
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[14]")).click();
		Util.sendText(text_Desc, analytics_desc);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[15]")).click();
		if (No_btn_1.isSelected() == true) {
			Util.click(Yes_btn_1);
			Util.sendText(text_Desc, qa_performance);
		}
		Util.click(No_btn_1);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[16]")).click();
		Util.sendText(text_Desc, analytics_desc);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[17]")).click();
		Util.click(none_radio_btn);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[18]")).click();
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[19]")).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		CommonElements.SaveReturnSummary_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[20]")).click();
		List<WebElement> rad_usrDef = webDriver.get().findElements(By.xpath("//*[contains(text(),'User-defined')]"));
		for (WebElement user_Def_radBtn : rad_usrDef) {
			if (user_Def_radBtn.isSelected() == false) {
				Thread.sleep(100);
				user_Def_radBtn.click();
			}
			break;
		}
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();
		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[21]")).click();
		CommonElements.SaveReturn_Button();
		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[22]")).click();
		Util.sendText(text_Desc, qa_performance);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		CommonElements.SaveReturn_Button();
		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[23]")).click();
		Util.sendText(min_price, minPrice);
		Util.sendText(max_price, maxPrice);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		CommonElements.SaveReturn_Button();
	}

	
	@FindBy(xpath = "//*[@id='input-metricsWhatOther-1']")
	static WebElement metric_text;
	@FindBy(xpath = "//*[@id='input-dataProtectionWithinNetworkOther']")
	static WebElement dataProt_textarea;
	public void CategoryAdmin_CHosting_EditServiceLine(String resrStudNam1, String AbtServ, String listServFeatures,
			String listServbenfits, String planServDesc, String setupMig, String qa_performance, String training_desc,
			String serv_scop, String online_ticket, String iso_cert, String flight_climate, String minPrice,
			String maxPrice, String analytics_desc) throws Exception {
		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[1]")).click();
		wait = new WebDriverWait(webDriver.get(), 30);
		wait.until(ExpectedConditions.visibilityOf(input_servNam));
		Util.sendText(input_servNam, resrStudNam1);
		Util.sendText(abtServ_desc, AbtServ);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(abt_urServ, AbtServ);

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[2]")).click();
		Util.sendText(list_servFeatu, listServFeatures);
		Util.sendText(list_servbenf, listServbenfits);
		CommonElements.SaveReturn_Button();
		CommonElements.Validation(ver_serFeat_1, listServFeatures);
		CommonElements.Validation(ver_serBen_1, listServbenfits);

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[3]")).click();
//		Util.sendText(text_Desc, serv_scop);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[4]")).click();
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[5]")).click();
//		Util.sendText(text_Desc, online_ticket);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[6]")).click();
		Util.click(No_btn_1);
		Thread.sleep(1000);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[7]")).click();
		Util.sendText(text_Desc, qa_performance);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();
		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[8]")).click();
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[9]")).click();
		Util.click(Yes_btn_1);
		List<WebElement> user_res_part = webDriver.get().findElements(By.xpath("//input[contains(@type,'checkbox')]"));
		for (WebElement userRes_part : user_res_part) {
			if (userRes_part.isSelected() == true) {
				Thread.sleep(100);
				userRes_part.click();
			}
			if (userRes_part.isSelected() == false) {
				Thread.sleep(100);
				userRes_part.click();
			}
		}
		Util.sendText(metric_text, qa_performance);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[10]")).click();
		Util.sendText(text_Desc, analytics_desc);
		CommonElements.SaveReturn_Button();
	
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[11]")).click();
		List<WebElement> data_Prot = webDriver.get().findElements(By.xpath("//input[contains(@type,'checkbox')]"));
		for (WebElement data_in_Prot : data_Prot) {
			if (data_in_Prot.isSelected() == true) {
				Thread.sleep(100);
				data_in_Prot.click();
			}
			if (data_in_Prot.isSelected() == false) {
				Thread.sleep(100);
				data_in_Prot.click();
			}
		}
		Util.sendText(text_Desc, analytics_desc);
		Util.sendText(dataProt_textarea,analytics_desc);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		CommonElements.SaveReturn_Button();
		
		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[12]")).click();
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();

		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[13]")).click();
		Util.sendText(text_Desc, analytics_desc);
		CommonElements.SaveReturn_Button();
		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[14]")).click();
		if (No_btn_1.isSelected() == true) {
			Util.click(Yes_btn_1);
			Util.sendText(text_Desc, qa_performance);
		}
		Util.click(No_btn_1);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[15]")).click();
		if (No_btn_1.isSelected() == true) {
			Util.click(Yes_btn_1);
			Util.sendText(text_Desc, qa_performance);
		}
		Util.click(No_btn_1);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[16]")).click();
		Util.click(radio_btn_1);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		CommonElements.SaveReturn_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[17]")).click();
		CommonElements.SaveReturn_Button();
		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[18]")).click();
		Util.click(radio_btn_1);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		CommonElements.SaveReturn_Button();
		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[19]")).click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		CommonElements.SaveReturnSummary_Button();

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[20]")).click();
		List<WebElement> rad_usrDef = webDriver.get().findElements(By.xpath("//*[contains(text(),'User-defined')]"));
		for (WebElement user_Def_radBtn : rad_usrDef) {
			if (user_Def_radBtn.isSelected() == false) {
				Thread.sleep(100);
				user_Def_radBtn.click();
			}
			break;
		}
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		CommonElements.SaveReturn_Button();
		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[21]")).click();
		CommonElements.SaveReturn_Button();
		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[22]")).click();
		if (No_btn_1.isSelected() == true) {
			Util.click(Yes_btn_1);
			Util.sendText(text_Desc, qa_performance);
		}
		Util.click(No_btn_1);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		CommonElements.SaveReturn_Button();
	
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[23]")).click();
		Util.sendText(text_Desc, qa_performance);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		CommonElements.SaveReturn_Button();
		
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[24]")).click();
		Util.sendText(min_price, minPrice);
		Util.sendText(max_price, maxPrice);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		CommonElements.SaveReturn_Button();
		
	}


}

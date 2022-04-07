package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base.DriverManager;
import Utility.CommonElements;
import Utility.HighlightElement;
import Utility.Util;

public class CategoryAdminPage extends DriverManager {
//	public static String team_Cap_checked, outComes_checked, verf_serv;
	WebDriverWait wait;

	public CategoryAdminPage() {
		PageFactory.initElements(webDriver.get(), this);
	}

	@FindBy(xpath = "//*[contains(text(),'Find a user by email')]")
	WebElement clk_findUsrMail;

	public void click_FindUserByEmail() throws Exception {
		Thread.sleep(1000);
		CommonElements.ScrollView(webDriver.get(), clk_findUsrMail);
		Util.click(clk_findUsrMail);
	}

	
	
	@FindBy(xpath = "//*[contains(text(),'Edit suppliers and services')]")
	WebElement clk_editSup;

	public void click_Editsupliersandservices() throws Exception {
		Thread.sleep(1000);
		CommonElements.ScrollView(webDriver.get(), clk_editSup);
		Util.click(clk_editSup);
	}

	@FindBy(xpath = "//*[@id='input-email_address']")  //
	WebElement find_supNam_email;
	
	@FindBy(xpath = "//*[contains(text(),'Supplier')]/following::a[1]")
	WebElement clk_suppNam;
	
	@FindBy(xpath = "//*[contains(text(),'Supplier Name')]/following::a[1]")
	WebElement clk_suppNam_serv;

	public void FindSupplier_NameByEmail(String findSupNam_email) throws Exception {
		Util.sendText(find_supNam_email, findSupNam_email);
		HighlightElement.highLighterMethod(webDriver.get(), find_supNam_email);
		CommonElements.Search_Button();
		CommonElements.ScrollView(webDriver.get(), clk_suppNam);
		Util.click(clk_suppNam);
		CommonElements.ScrollView(webDriver.get(), clk_suppNam_serv);
		Util.click(clk_suppNam_serv);
	}
	
	@FindBy(xpath = "//*[@id='input-supplier_name']")  //
	WebElement find_supNam;

	@FindBy(xpath = "(//*[@class='summary-item-field-first-half']//a)[1]")
	WebElement supNam_clk;
	
	public void FindSupplier_ByName(String findSupNam) throws Exception {
		Thread.sleep(1000);	
		Util.sendText(find_supNam, findSupNam);
		Thread.sleep(1000);	
		HighlightElement.highLighterMethod(webDriver.get(), find_supNam);
		CommonElements.SearchByName_Button();
		supNam_clk.click();
/*		
		List<WebElement> srch_supp = webDriver.get()
				.findElements(By.xpath("//*[@class='summary-item-field-first-half']//a"));
		for (WebElement searchSupNam : srch_supp) {
			String search_sup1 = searchSupNam.getText();
			System.out.println("search_sup2:: "+search_sup1);
			if (search_sup1.equals(findSupNam)) {
				Thread.sleep(1000);
				searchSupNam.click();
			}
		}
	*/	
	}

	@FindBy(xpath = "(//*[@class='summary-item-row']/parent::tbody)[1]")
	WebElement cannotEdit_suppDet;

	public void SupplierDetails_NoEdit() throws Exception {
		CommonElements.ScrollView(webDriver.get(), cannotEdit_suppDet);
		HighlightElement.highLighterMethod(webDriver.get(), cannotEdit_suppDet);
	}

	public void TeamCapabilities() throws Exception {
		CommonElements.EditLink_First();
		List<WebElement> team_cap = webDriver.get().findElements(By.xpath("//input[contains(@type,'checkbox')]"));
		for (WebElement teamCap : team_cap) {
			if (teamCap.isSelected() == false || teamCap.isSelected() == true) {
				Thread.sleep(1000);
				teamCap.click();
				if (teamCap.isSelected() == true) {
					String team_Cap_checked = teamCap.getAttribute("value");
//							Verify_EditsDigitalOutcomes();
				}
			}

		}
		CommonElements.SaveReturn_Button();
		
	}

	@FindBy(xpath = "(//*[contains(text(),'Application operations engineer')]//following::*[text()='Edit'])[1]")
	WebElement appOpEng_edit;
	@FindBy(xpath = "//*[@id='input-minimum-price']")
	WebElement min_price;
	@FindBy(xpath = "//*[@id='input-maximum-price']")
	WebElement max_price;
	@FindBy(xpath = "(//*[contains(text(),'Application operations engineer')]//following::div[2])[1]")
	WebElement valid_min_max;

	public void DigitalRoles(String minPrice, String maxPrice) throws Exception {
		CommonElements.ScrollView(webDriver.get(), appOpEng_edit);
		Util.click(appOpEng_edit);
		Util.sendText(min_price, minPrice);
		CommonElements.ScrollView(webDriver.get(), min_price);
		HighlightElement.highLighterMethod(webDriver.get(), min_price);
		Util.sendText(max_price, maxPrice);
		HighlightElement.highLighterMethod(webDriver.get(), max_price);
		CommonElements.SaveReturn_Button();
		Assert.assertEquals(valid_min_max.getText().contains(minPrice), true);
		Assert.assertEquals(valid_min_max.getText().contains(maxPrice), true);
	}

	@FindBy(xpath = "(//*[contains(text(),'Outcomes locations')]//following::*[text()='Edit'])[1]")
	WebElement outcmLoc_edit;

	public void OutcomesLocation() throws Exception {
		CommonElements.ScrollView(webDriver.get(), outcmLoc_edit);
		Util.click(outcmLoc_edit);
		List<WebElement> out_Comes = webDriver.get().findElements(By.xpath("//input[contains(@type,'checkbox')]"));

		for (WebElement outComes : out_Comes) {
			String outComes_checked = outComes.getAttribute("value");
			if (outComes.isSelected() == false || outComes.isSelected() == true) {
				Thread.sleep(1000);
				outComes.click();
			}
		}
		CommonElements.SaveReturn_Button();
	}

	@FindBy(xpath = "//*[@id='input-serviceName']")
	WebElement input_servNam;
	@FindBy(xpath = "//*[@id='input-labAddressBuilding']")
	WebElement buildStrt;
	@FindBy(xpath = "//*[@id='input-labAddressTown']")
	WebElement town_city;
	@FindBy(xpath = "//*[@id='input-labAddressPostcode']")
	WebElement post_Code;
	@FindBy(xpath = "//*[@id='input-labPublicTransport']")
	WebElement trans_port;
	@FindBy(xpath = "//*[@id='input-labCarPark']")
	WebElement studio_park;
	@FindBy(xpath = "//*[@id='input-labSize']")
	WebElement resr_stud_size;
	@FindBy(xpath = "//*[@class='radio selected']")
	WebElement view_area;
	@FindBy(xpath = "(//*[@class='radio'])[1]")
	WebElement view_area_cost;
	@FindBy(xpath = "(//*[@class='radio'])[2]")
	WebElement baby_chang_fac;
	@FindBy(xpath = "(//*[@class='radio'])[3]")
	WebElement remote_stream;
	@FindBy(xpath = "//*[@id='input-labAccessibility']")
	WebElement accessibil;
	@FindBy(xpath = "//*[@id='input-minimum-price']")
	WebElement vat_bookTime;

	public void Edit_ResearchStudio(String resrStudNam1, String resrStudNam2, String resrStudNam3, String resrStudNam4,
			String resrStudNam5, String resrStudNam6, String resrStudNam7, String resrStudNam8, String resrStudNam9)
			throws Exception {

		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[1]")).click();
		wait = new WebDriverWait(webDriver.get(), 30);
		wait.until(ExpectedConditions.visibilityOf(input_servNam));
		Util.sendText(input_servNam, resrStudNam1);
		CommonElements.SaveReturn_Button();
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[2]")).click();
		wait.until(ExpectedConditions.visibilityOf(buildStrt));
		Util.sendText(buildStrt, resrStudNam2);
		Util.sendText(town_city, resrStudNam3);
		Util.sendText(post_Code, resrStudNam4);
		CommonElements.SaveReturn_Button();
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[3]")).click();
		Util.sendText(trans_port, resrStudNam5);
		Util.sendText(studio_park, resrStudNam6);
		CommonElements.SaveReturn_Button();
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[4]")).click();
		Util.sendText(resr_stud_size, resrStudNam7);
		CommonElements.SaveReturn_Button();
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[5]")).click();
		if (view_area.isSelected() == false) {
			Thread.sleep(1000);
			Util.click(view_area_cost);
			Util.click(remote_stream);
		}
		CommonElements.SaveReturn_Button();
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[6]")).click();
		if (view_area.isSelected() == false) {
			Thread.sleep(1000);
			Util.click(view_area_cost);
		}
		CommonElements.SaveReturn_Button();
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[7]")).click();
		if (view_area.isSelected() == false) {
			Thread.sleep(1000);
			Util.click(view_area_cost);
			Util.click(remote_stream);
		}
		CommonElements.SaveReturn_Button();
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[8]")).click();
		if (view_area.isSelected() == false) {
			Thread.sleep(1000);
			Util.click(view_area_cost);
			Util.click(baby_chang_fac);
		}
		CommonElements.SaveReturn_Button();
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[9]")).click();
		Util.sendText(accessibil, resrStudNam8);
		CommonElements.SaveReturn_Button();
		webDriver.get().findElement(By.xpath("(//*[contains(text(),'Edit')])[10]")).click();
		if (view_area.isSelected() == false) {
			Thread.sleep(1000);
			Util.click(view_area_cost);
		}
		Util.click(remote_stream);
		Util.sendText(vat_bookTime, resrStudNam9);
		Thread.sleep(1000);
		CommonElements.SaveReturn_Button();
	}

	@FindBy(xpath = "//*[@class='summary-item-field']")
	WebElement stuNam_listall;

	public void Verify_StudioName_Lists(String resrStudNam1, String resrStudNam2, String resrStudNam3,
			String resrStudNam4, String resrStudNam5, String resrStudNam6, String resrStudNam7, String resrStudNam8,
			String resrStudNam9) throws Exception {
		String studio_Name = stuNam_listall.getText();
		String[] arr = { resrStudNam1, resrStudNam2, resrStudNam3, resrStudNam4, resrStudNam5, resrStudNam6,
				resrStudNam7, resrStudNam8, resrStudNam9 };
		List<WebElement> stuNam_listall_1 = webDriver.get().findElements(By.xpath("//*[@class='summary-item-field']"));

		for (int i = 0; i <= studio_Name.length() - 1; i++) {
			String str3 = stuNam_listall_1.get(i).getText();
			System.out.println(">>>>" + str3);
			if (arr[i].equalsIgnoreCase((stuNam_listall_1.get(i).getText())) == true) {
				Thread.sleep(1000);
				System.out.println(arr[i] + "---------" + stuNam_listall_1.get(i).getText());
				Assert.assertEquals(stuNam_listall_1.get(i).getText().contains(arr[i]), true);

			} else {
				break; //How much does it cost (excluding VAT) for the minimum booking time? here giving value is issue
			}

		}
	}
	
	@FindBy(xpath = "//*[@class='checkbox selected']")
	WebElement checkBox_Enable;
	@FindBy(xpath = "(//*[@class='checkbox'])[1]")
	WebElement first_checkBox;
	@FindBy(xpath = "//*[contains(text(),'Initial recruitment offline, but then contact them online')]")
	WebElement second_checkBox;
	public void UserResearchParticipants() throws Exception {
			Util.click(second_checkBox);
		 if(view_area.isSelected() == false) {
			 Thread.sleep(1000);
			Util.click(view_area_cost);
		}
		CommonElements.SaveReturn_Button();
	
		CommonElements.EditLink_Second();
		List<WebElement> user_res_part = webDriver.get().findElements(By.xpath("//input[contains(@type,'checkbox')]"));

		for (WebElement userRes_part : user_res_part) {
			String outComes_checked = userRes_part.getAttribute("value");
			if (userRes_part.isSelected() == false || userRes_part.isSelected() == true) {
				Thread.sleep(1000);
				userRes_part.click();
			}
		}
		CommonElements.SaveReturn_Button();
	}
	
	
	@FindBy(xpath = "//*[contains(text(),'Entirely ')]")
	WebElement entire_online;
	public void Verify_UserResearchParticipants() throws Exception {
		Assert.assertEquals(entire_online.getText().contains("Entirely "), true);
	}
	
	@FindBy(xpath = "//*[@id='main-content']/h1")
	WebElement ver_edtsupp_Nam;
	public void Verify_Edit_SupplierName(String editSupName) throws Exception {
		CommonElements.Validation(ver_edtsupp_Nam,editSupName);
	}
	
	@FindBy(xpath = "//*[contains(text(),'View countersigned framework agreement')]")
	WebElement countersign_agree;
	public void Verify_CountersignAgreement(String countSignAgre) throws Exception {
		CommonElements.Validation(countersign_agree,countSignAgre);
	}
	
	public void Download_CountersignAgreement() throws Exception {
		Thread.sleep(2000);
		CommonElements.ScrollView(webDriver.get(), countersign_agree);
		Util.click(countersign_agree);
	}
	
}
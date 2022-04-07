package stepDef;

import org.junit.Assert;

import Base.DriverManager;
import Pages.CategoryAdminPage;
import Pages.CompanyDetailsPage;
import Pages.DataControllerPage;
import Pages.GCloudServicePage;
import Pages.LoginPage;
import Utility.CommonElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends DriverManager {
//	public static DashboardPage obj2=new DashboardPage();
	public static LoginPage log_pg = new LoginPage();
	public static CompanyDetailsPage comp_Det = new CompanyDetailsPage();
	public static CommonElements comm_elem = new CommonElements();
	public static CategoryAdminPage cat_adm = new CategoryAdminPage();
	public static DataControllerPage data_cont=new DataControllerPage();
	public static GCloudServicePage gc_serv= new GCloudServicePage();
	
	@Given("^Enter the company details page (.*) and (.*)$")
	public void enter_into_the_company_details_page(String unam, String pword) {
		log_pg.Login(unam, pword);
		comp_Det.CompanyDetails();
	}

	@When("^Edit the below section of what buyers will see(.*)$")
	public void edit_the_below_section_of_what_buyers_will_see(String eMail) {
		comp_Det.Edit_YourCompanyDetails("Test1", eMail, "6778001911", "Test Summary New");
	}

	@When("^clicks the save button$")
	public void clicks_the_save_button() throws Exception {
		CommonElements.SaveReturn_Button();
	}

	@Then("^changes displayed in the details page or not(.*)$")
	public void changes_displayed_in_the_details_page_or_not(String eMail) {
		comp_Det.Verify_YourCompanyDetails("Test1", eMail, "6778001911", "Test Summary New");
	}

	//Registered details editable or not
	@Given("^Enter the registered company details page$")
	public void go_to_the_company_details_page() throws InterruptedException {
		comp_Det.viewRegisteredCompanyDetails();
	}

	@When("^Edit the below section of Company details for your framework applications$")
	public void edit_the_below_section_of_company_details_for_your_framework_applications() throws Exception {
		comp_Det.Edit_RegisteredCompanyDetails();
	}

	@Then("^changes will do or not in the registered details(.*)$")
	public void changes_will_do_or_not_in_the_registered_details(String cur_url) {
		CommonElements.ValidatingUrl(cur_url);
	}
	
	//support team mail id
	@Given("any changes need to contant support team mail id")
	public void make_the_changes_need_to_contant_support_team_mail_id() throws Exception {
		comp_Det.RegisteredDetails_SendMail();
	}

	@When("can able to see the support team mail with message")
	public void can_able_to_see_the_support_team_mail() throws InterruptedException {
		comp_Det.RegisteredDetails_SendMail_Message();
	}

	@Then("verify the support team mail id")
	public void verify_the_support_team_mail_id() throws Exception {
		Thread.sleep(1000);
		comp_Det.RegisteredCompanyDetails_Info();
		CommonElements.Logout_Button();
	}
	
	//Category Admin cant do changes into registered company details 
	@Given("log on to the Category Admin role for changes in the registered details")
	public void log_on_to_the_category_admin_role_for_changes_in_the_registered_details() throws Exception {
		log_pg.Login("63956@user.marketplace.team", "Password1234");
		cat_adm.click_FindUserByEmail();
	}

	@When("^can able to make changes in the registered company details(.*)$")
	public void can_able_to_make_changes_in_the_registered_company_details(String eMail) throws Exception {
		cat_adm.FindSupplier_NameByEmail(eMail);
	}

	@Then("verify the category team shouldnot do the changes")
	public void verify_the_category_team_shouldnot_do_the_changes() throws Exception {
		cat_adm.SupplierDetails_NoEdit();
		CommonElements.Logout_Button();
	}

	//Supplier can able to do changes on Registered Company Address, Trading Status, Company Size
	@Given("^log on to the Supplier role for changes in the registered company details (.*) and (.*)$")
	public void log_on_to_the_supplier_role_for_changes_in_the_registered_company_details(String unam, String pword) {
		log_pg.Login(unam, pword);
		comp_Det.CompanyDetails();
	}

	@When("Edit under the section of company details of your framework applications and save")
	public void edit_under_the_section_of_company_details_of_your_framework_applications() throws Exception {
	  comp_Det.Edit_YourFrameworkApp_Address("55, Jurong West", "Western coastal", "WC1033", "United Kingdom");
	  comp_Det.Edit_YourFrameworkApp_TradingStatus("public body");
	  comp_Det.Edit_YourFrameworkApp_CompanySize("Medium");
	}
	
	@Then("verify the changes will be displayed in the framework application")
	public void verify_the_changes_will_be_displayed_in_the_framework_application() throws Exception {
		comp_Det.Verify_EditYourFrameworkApp("55, Jurong West", "Western coastal", "WC1033", "United Kingdom");
	}

	//Shouldn't displayed the opportunity link
	@Given("Supplier can able to visible the opportunities link or not")
	public void supplier_can_able_to_visible_the_opportunities_link_or_not() {
		CommonElements.YourAccount_Link();
	}

	@When("click on view documents and go to the opportunity link")
	public void click_on_view_documents_and_go_to_the_opportunity_link() {
		CommonElements.ViewDocuments_Link();
	}

	@Then("Opportunity link should not be displayed in the application")
	public void opportunity_link_should_not_be_displayed_in_the_application() {
		Assert.assertNotEquals("suppliers/opportunities/frameworks/digital-outcomes-6", true);
		CommonElements.Logout_Button();
	}
	
	//Category Admin service line changes in the Team Capabilities, Outcomes Location, Digital roles
	@Given("log in as Category Admin can able to edit the supplier services")
	public void log_in_as_category_admin_can_able_to_edit_the_supplier_services() {
		log_pg.Login("63956@user.marketplace.team", "Password1234");
	    
	}

	@When("click on edit supplier and servies then search supplier by name wise")
	public void click_on_edit_supplier_and_servies_then_search_supplier_by_name_wise() throws Exception {
	    CommonElements.EditSupplierService_Link();
	    cat_adm.FindSupplier_ByName("Sigma365");
	}

	@When("click the services link then do the some edits and save")
	public void click_the_services_link_then_do_the_some_edits_and_save() throws Exception {
		CommonElements.ViewService_Link();
		CommonElements.EditLink_First();
		cat_adm.TeamCapabilities();
		cat_adm.DigitalRoles("100", "120");
		cat_adm.OutcomesLocation();
	}

	@Then("verify the changes will be displayed in the Digital outcomes or not")
	public void verify_the_changes_will_be_displayed_in_the_digital_outcomes_or_not() throws Exception {
//		cat_adm.Verify_EditsDigitalOutcomes();
	}
	
	//Category admin can able to edit a suppliers service lines on Research studio 
	@Given("log in as Category Admin can able to edit the Research Studio services")
	public void log_in_as_category_admin_can_able_to_edit_the_research_studio_services() throws Exception {
		CommonElements.AdminHome_Link(); //remove comment - SlasheS
	}
	
	@When("click on Admin home breadcrumbs choose edit suppliers and services")
	public void click_on_admin_home_breadcrumbs_choose_edit_suppliers_and_services() throws Exception {
		CommonElements.EditSupplierService_Link();
	}

	@And("search by supplier name based and edit the changes finally save")
	public void search_by_supplier_name_based_and_edit_the_changes_finally_save() throws Exception {
		cat_adm.FindSupplier_ByName("Sigma365");
		CommonElements.ViewService_Link();
		CommonElements.EditLink_Second(); 
		cat_adm.Edit_ResearchStudio("Studio Name","34 Shreron place", "Tuas", "WT5577", "public transport", "studio park","5","Test1", "4"); // comment - SlasheS
	}

	@Then("verify the changes will be displayed in the research studio services or not")
	public void verify_the_changes_will_be_displayed_in_the_research_studio_services_or_not() throws Exception {
		cat_adm.Verify_StudioName_Lists("Studio Name","34 Shreron place", "Tuas", "WT5577", "public transport", "studio park","5","Test1", "4");
	}

	//Category admin can able to edit a suppliers service lines on User research participants
	@Given("log in as Category Admin can able to edit the Research Participants services")
	public void log_in_as_category_admin_can_able_to_edit_the_research_participants_services() throws Exception {
		CommonElements.AdminHome_Link(); //remove comment - SlasheS
	}

	@When("click on Admin home breadcrumbs then choose edit suppliers and services")
	public void click_on_admin_home_breadcrumbs_then_choose_edit_suppliers_and_services() throws Exception {
		CommonElements.EditSupplierService_Link();
	    cat_adm.FindSupplier_ByName("Sigma365");
	}

	@And("Find the supplier name and edit the service secctions then save")
	public void find_the_supplier_name_and_edit_the_service_secctions_then_save() throws Exception {
		CommonElements.ViewService_Link();
		
		CommonElements.EditLink_Third();
		CommonElements.EditLink_First();
		cat_adm.UserResearchParticipants();
	}

	@Then("verify the changes will be displayed in the Research Participants services or not")
	public void verify_the_changes_will_be_displayed_in_the_research_participants_services_or_not() throws Exception {
		cat_adm.Verify_UserResearchParticipants();
	}
	
	//Category admin can able to edit a Supplier name
	@Given("log in as Category Admin can able to edit the Trading name")
	public void log_in_as_category_admin_can_able_to_edit_the_trading_name() throws Exception {
		CommonElements.AdminHome_Link(); //remove comment - SlasheS
	}

	@And("Find the supplier based upon name and do some edits then finally save")
	public void find_the_supplier_based_upon_name_and_do_some_edits_then_finally_save() throws Exception {
		CommonElements.EditSupplier_Link();
		CommonElements.NewSupplierName_Link("Sigma365");
		CommonElements.Save_Button();
	}

	@Then("verify the supplier name changes will be displayed or not")
	public void verify_the_supplier_name_changes_will_be_displayed_or_not() throws Exception {
		cat_adm.Verify_Edit_SupplierName("Sigma365");
	}
	
	//view Agreements
	@Given("log in as Category Admin can able to view the Agreement or not")
	public void log_in_as_category_admin_can_able_to_view_the_agreement_or_not() {
	 CommonElements.ViewAgreement_Link();   
	}

	@When("click on View agreements link on the supplier account page")
	public void click_on_view_agreements_link_on_the_supplier_account_page() {
	    
	 
	}

	@Then("Cateogry admin should be able to View agreements in the Supplier account page")
	public void cateogry_admin_should_be_able_to_view_agreements_in_the_supplier_account_page() {
	 CommonElements.ValidatingUrl("https://www.uat.marketplace.team/admin/suppliers/720167/agreements/digital-outcomes-6");
	}
	
	//View Countersigned framework agreement
	@Given("log in as Category Admin can able to view the Countersigned Agreement or not")
	public void log_in_as_category_admin_can_able_to_view_the_countersigned_agreement_or_not() {
		
	}

	@When("under Signature details shows like Signer Name Role Date on the supplier account page")
	public void under_signature_details_shows_like_signer_name_role_date_on_the_supplier_account_page() {
	    
	    
	}

	@Then("Cateogry admin should be able to View countersigned framework agreement in the Supplier account page")
	public void cateogry_admin_should_be_able_to_view_countersigned_framework_agreement_in_the_supplier_account_page() throws Exception {
	    cat_adm.Verify_CountersignAgreement("View countersigned framework agreement");
	    
	}
	
	@Given("log in as Category Admin and also able to download the Countersigned Agreement or not")
	public void log_in_as_category_admin_and_also_able_to_download_the_countersigned_agreement_or_not() throws Exception {
		cat_adm.Download_CountersignAgreement();
	}

	@When("under Countersignature status click on View countersigned framework agreement link on the supplier account page")
	public void under_countersignature_status_click_on_view_countersigned_framework_agreement_link_on_the_supplier_account_page() {
	    
	    
	}

	@Then("Cateogry admin should be able to download the countersigned framework agreement in the Supplier account page")
	public void cateogry_admin_should_be_able_to_download_the_countersigned_framework_agreement_in_the_supplier_account_page() {
		CommonElements.Logout_Button();
	}
	
	//can able to edit register name number address
	@Given("log on to the Admin Controller role for changes in the registered company details")
	public void log_on_to_the_admin_controller_role_for_changes_in_the_registered_company_details() {
		log_pg.Login("66953@user.marketplace.team", "Password1234");
	}

	@When("Click on View and edit suppliers link then search the supplier name and edit in the company details page")
	public void click_on_view_and_edit_suppliers_link_then_search_the_supplier_name_and_edit_in_the_company_details_page() throws Exception {
		Thread.sleep(2000);
		CommonElements.View_EditSupplier_Link();
		cat_adm.FindSupplier_ByName("Sigma365");
		data_cont.click_CompNameNoReg_Change("Sigma365", "56232325", "65, Mark St", "MiddleManchester", "MM0055", "United Kingdom");
	}

	@Then("Admin Data Controller should be able to edit a suppliers registered company details")
	public void admin_data_controller_should_be_able_to_edit_a_suppliers_registered_company_details() throws Exception {
		data_cont.Validation_CompanyRegNamandNo("Sigma365", "56232325");
		data_cont.Validation_CompanyAddress("65, Mark St", "MiddleManchester", "MM0055", "United Kingdom");
	}
	
	@When("Click on View and edit suppliers link then search the supplier name and edit in the company details")
	public void click_on_view_and_edit_suppliers_link_then_search_the_supplier_name_and_edit_in_the_company_details() throws Exception {
		Thread.sleep(2000);
		CommonElements.View_EditSupplier_Link();
		cat_adm.FindSupplier_ByName("Beta365");
		data_cont.click_CompNameNoReg_Change("Beta365", "56232325", "65, Mark St", "MiddleManchester", "MM0055", "United Kingdom");
	}

	@Then("Admin Data Controller should be able to edit a suppliers registered company details page")
	public void admin_data_controller_should_be_able_to_edit_a_suppliers_registered_company_details_page() throws Exception {
		data_cont.Validation_CompanyRegNamandNo("Beta365", "56232325");
		data_cont.Validation_CompanyAddress("65, Mark St", "MiddleManchester", "MM0055", "United Kingdom");
	}
		
	//cannot able to edit a DUNS Number
	
	@Given("In the Admin Controller role under the registered company details DUNS Number click")
	public void in_the_admin_controller_role_under_the_registered_company_details_duns_number_click() throws Exception {
		data_cont.click_DUNSNumber_Change();
	}
	
	@When("Edit duns number in the company details page")
	public void Edit_duns_number_in_the_company_details_page() throws Exception {
		
	}

	@Then("Admin Data Controller shouldnot be able to edit DUNS Number")
	public void Admin_Data_Controller_shouldnot_be_able_to_edit_DUNS_Number() throws Exception {
		comp_Det.RegisteredDetails_SendMail();
	    CommonElements.Logout_Button();
	}
	
	//supplier can able to edit the Service line details for Cloud Support
	@Given("^log in as Supplier can able to edit the Cloud Support services (.*) and (.*)$")
	public void log_in_as_supplier_can_able_to_edit_the_cloud_support_services(String unam, String pwsd) {
		log_pg.Login(unam, pwsd);
	    
	}

	@When("click on View servies link")
	public void click_on_view_servies_link() throws Exception {
		CommonElements.ViewService_Link();
	    
	}

	@And("click the supplier services link then do the some edits and save")
	public void click_the_supplier_services_link_then_do_the_some_edits_and_save() throws Exception {
		gc_serv.click_Editsupliersandservices("Cloud Services", "Test Data", "Service Features", "Service Benefits");
	}
	
	@And("click the supplier services link then do the some changes and save")
	public void click_the_supplier_services_link_then_do_the_some_changes_and_save() throws Exception {
		gc_serv.click_Editsupliersandservices_CSoftware("Cloud Services", "Test Data", "Service Features", "Service Benefits");
	}
	
	@And("click the supplier services link then do the some changes and again save")
	public void click_the_supplier_services_link_then_do_the_some_changes_and_again_save() throws Exception {
		gc_serv.click_Editsupliersandservices_CHosting("Cloud Services", "Test Data", "Service Features", "Service Benefits");
	}
	
	@Then("verify the changes will be displayed in the Cloud Support or not")
	public void verify_the_changes_will_be_displayed_in_the_cloud_support_or_not() {
		CommonElements.Logout_Button();
	}
	
	@Given("log in as Supplier can able to edit the Cloud Software services")
	public void log_in_as_supplier_can_able_to_edit_the_cloud_software_services() {
		log_pg.Login("gcloud1uat@yopmail.com", "Password1234");
	    
	}

	@Then("Supplier should be able to edit the Service line details for Cloud Software lot")
	public void supplier_should_be_able_to_edit_the_service_line_details_for_cloud_software_lot() {
		CommonElements.Logout_Button();
	    
	}
	
	@Given("log in as Supplier can able to edit the Cloud Hosting services")
	public void log_in_as_supplier_can_able_to_edit_the_cloud_hosting_services() {
		log_pg.Login("gcloud1uat@yopmail.com", "Password1234");
	    
	}

	@When("click on Admin home breadcrumbs then choose View services")
	public void click_on_admin_home_breadcrumbs_then_choose_view_services() throws Exception {
		CommonElements.ViewService_Link();
	}
	
	@Then("verify the changes will be displayed in the Cloud Hosting services or not")
	public void verify_the_changes_will_be_displayed_in_the_cloud_hosting_services_or_not() {
		CommonElements.Logout_Button();
	    
	}
	
	@Given("log in as CCS Category Admin whether supplier changes can able to view in the dashboard or not")
	public void log_in_as_ccs_category_admin_whether_supplier_changes_can_able_to_view_in_the_dashboard_or_not() {
		log_pg.Login("63956@user.marketplace.team", "Password1234");
	}

	@When("click on edit suppliers and services and search by supplier name")
	public void click_on_edit_suppliers_and_services_and_search_by_supplier_name() throws Exception {
	    CommonElements.ReviewServiceChanges_Link();
	    CommonElements.ViewChanges_Link();
	    gc_serv.ServiceName_Scroll();
	}

	@Then("Supplier should be edited changes are recorded")
	public void supplier_should_be_edited_changes_are_recorded() {
	    CommonElements.Logout_Button();
	}
	
	@Given("log in as supplier can able to add the documents or not")
	public void log_in_as_supplier_can_able_to_add_the_documents_or_not() {
	    
	    
	}

	@When("click on View services link on the supplier account page")
	public void click_on_view_services_link_on_the_supplier_account_page() {
	System.out.println("This test case is Covered under the TestCase ID of 7, 8 and 9");    
	}

	@When("click on supplier link next upload the documents in the services")
	public void click_on_supplier_link_next_upload_the_documents_in_the_services() {
	    
	}

	@Then("Supplier should be able to add new document for all the lots")
	public void supplier_should_be_able_to_add_new_document_for_all_the_lots() {
	    
	}
	
	@Given("log in as supplier, can able to reinstate the service request by mail")
	public void log_in_as_supplier_can_able_to_reinstate_the_service_request_by_mail() {
		log_pg.Login("gcloud1uat@yopmail.com", "Password1234");
	    
	}

	@When("under the Remove services section mail id as cloud digital need to validate")
	public void under_the_remove_services_section_mail_id_as_cloud_digital_need_to_validate() throws Exception {
	    CommonElements.ViewService_Link();
	    gc_serv.click_SupliersServiceName();
	    
	}

	@Then("Supplier needs to make a request via the cloud digital email address incase reinstate the service")
	public void supplier_needs_to_make_a_request_via_the_cloud_digital_email_address_incase_reinstate_the_service() throws Exception {
		comp_Det.RegisteredDetails_SendMail();
	    CommonElements.Logout_Button();
	}
	@Given("log in as Category Admin either supplier can able to edit the Trading name")
	public void log_in_as_category_admin_either_supplier_can_able_to_edit_the_trading_name() throws Exception {
		gc_serv.CategoryAdmin_EditSupplierName();
		CommonElements.EditSupplierService_Link();
	}

	@When("click on Edit Supplier and Service then search supplier name")
	public void click_on_edit_supplier_and_service_then_search_supplier_name() throws Exception {
//		cat_adm.FindSupplier_ByName("Beta365");
		cat_adm.FindSupplier_NameByEmail("gcloud1uat@yopmail.com");
		
	}

	@And("Under the Edit supplier name edits do some changes then save data")
	public void under_the_edit_supplier_name_edits_do_some_changes_then_save_data() throws Exception {
		CommonElements.EditSupplier_Link();
		CommonElements.NewSupplierName_Link("Beta365");
		CommonElements.Save_Button();
		cat_adm.Verify_Edit_SupplierName("Beta365");
	}
	
	@Then("Cateogry admin be able to View agreements in the Supplier account page")
	public void cateogry_admin_be_able_to_view_agreements_in_the_supplier_account_page() {
		CommonElements.ValidatingUrl("https://www.uat.marketplace.team/admin/suppliers/720168/agreements/g-cloud-13");
	
	}
	@Given("log in as Category Admin service line details changes in the Cloud Services")
	public void log_in_as_category_admin_service_line_details_changes_in_the_cloud_Services() throws Exception {
		gc_serv.CategoryAdmin_EditSupplierName();
		CommonElements.EditSupplierService_Link();
	}
	
	@When("click on edit suppliers and services and search by supplier name in the Application")
	public void click_on_edit_suppliers_and_services_and_search_by_supplier_name_in_the_application() throws Exception {
		cat_adm.FindSupplier_ByName("Beta365");
		CommonElements.ViewService_Link();
	}

	@When("Under the supplier name click on Services link and in the Service section choose Edit link")
	public void under_the_supplier_name_click_on_services_link_and_in_the_service_section_choose_edit_link() throws Exception {
		CommonElements.EditLink_Third();
		gc_serv.CategoryAdmin_CSupp_EditServiceLine("Cloud Services", "Test1", "Test2", "Test3", "Planning Service", "Test5", "Test6", "Test7", "Test8", "Online Ticketing", "ISO Cert", "Fighting climate change", "50", "150");
	}

	@Then("Category admin should be able to edit the Service line details for Cloud application")
	public void category_admin_should_be_able_to_edit_the_service_line_details_for_application() {
		CommonElements.Logout_Button(); //remove slashes
	   
	}

	@When("Under the supplier name click on Services link and choose Cloud Software Edit link")
	public void under_the_supplier_name_click_on_services_link_and_choose_cloud_software_edit_link() throws Exception {
		CommonElements.EditLink_Second();
		gc_serv.CategoryAdmin_CSoftware_EditServiceLine("Cloud Services", "Test1", "Test2", "Test3", "Planning Service", "Test5", "Test6", "Test7", "Test8", "Online Ticketing", "ISO Cert", "Fighting climate change", "50", "150", "Testing Purpose");
	}
	
	@When("Under the supplier name click on Services link and choose Cloud Hosting Edit link")
	public void under_the_supplier_name_click_on_services_link_and_choose_cloud_hosting_edit_link() throws Exception {
		CommonElements.EditLink_First();
		gc_serv.CategoryAdmin_CHosting_EditServiceLine("Cloud Services", "Test1", "Test2", "Test3", "Planning Service", "Test5", "Test6", "Test7", "Test8", "Online Ticketing", "ISO Cert", "Fighting climate change", "50", "150", "Testing Purpose");
	}
}
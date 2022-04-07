Feature: G-Cloud13 - ILM UI Stories
 
  #1
  @GCloud
  Scenario Outline: Verify the supplier can able to edit Company Contact details
  Given Enter the company details page <unam> and <pword>
  When Edit the below section of what buyers will see<eMail>
  And clicks the save button
  Then changes displayed in the details page or not<eMail>
  
  Examples:
  	| unam | pword |	eMail  |
  	| gcloud1uat@yopmail.com | Password1234 | gcloud1uat@yopmail.com |
  	 
  	 
  #2
  @GCloud
  Scenario Outline: Supplier cannot able to make changes to the registered Company details of Registered Company Name
  Given Enter the registered company details page
  When Edit the below section of Company details for your framework applications
  Then changes will do or not in the registered details<cur_url>
  Examples:
  	| cur_url |
  	| https://www.uat.marketplace.team/suppliers/registered-company-name/edit |
  	
  #3
  @GCloud
  Scenario: Verify the supplier needs to contact the support team to make the changes in the registered Company details
  Given any changes need to contant support team mail id
  When can able to see the support team mail with message
  Then verify the support team mail id
  
  #4
  @GCloud
  Scenario Outline: Verify the Category admin cannot able to make changes to the registered Company details
  Given log on to the Category Admin role for changes in the registered details
  When can able to make changes in the registered company details<eMail>
  Then verify the category team shouldnot do the changes
  Examples:
  	|	eMail  |
  	| gcloud1uat@yopmail.com |
  
  #5
  @GCloud
  Scenario Outline: Verify the supplier can able to make changes to the registered Company details like company address trading status company size
  Given log on to the Supplier role for changes in the registered company details <unam> and <pword>
  When Edit under the section of company details of your framework applications and save
  Then verify the changes will be displayed in the framework application
  Examples:
  	| unam | pword |
  	| gcloud1uat@yopmail.com | Password1234 |
  
  #6
  @GCloud
  Scenario: Verify the supplier should not be able to see the opportunities link on the admin page
    Given Supplier can able to visible the opportunities link or not
    When click on view documents and go to the opportunity link
    Then Opportunity link should not be displayed in the application
	#7
   @GCloud
 	 Scenario Outline: Verify the supplier can able to edit the Service line details for Cloud Support
    Given log in as Supplier can able to edit the Cloud Support services <unam> and <pword>
    When click on View servies link
    And click the supplier services link then do the some edits and save
    Then verify the changes will be displayed in the Cloud Support or not
    Examples:
  	| unam | pword |
  	| gcloud1uat@yopmail.com | Password1234 |
    
    #8
    @GCloud
 	 Scenario: Verify the supplier can able to edit the Service line details for Cloud Software
    Given log in as Supplier can able to edit the Cloud Software services
   	When click on View servies link
    And click the supplier services link then do the some changes and save
    Then Supplier should be able to edit the Service line details for Cloud Software lot
    #9
   @GCloud
 	 Scenario: Verify the supplier can able to edit the Service line details for Cloud Hosting
    Given log in as Supplier can able to edit the Cloud Hosting services
    When click on View servies link
    And click the supplier services link then do the some changes and again save
    Then verify the changes will be displayed in the Cloud Hosting services or not
    #10
  @GCloud
 	 Scenario: Verify the supplier edited changes are displays in CCS Category Admin dashboard
    Given log in as CCS Category Admin whether supplier changes can able to view in the dashboard or not
    When click on edit suppliers and services and search by supplier name
    Then Supplier should be edited changes are recorded
    #11
    @GCloud
 	 Scenario: Verify the supplier can able to add new document in service
    Given log in as supplier can able to add the documents or not
    When click on View services link on the supplier account page
    And  click on supplier link next upload the documents in the services 
    Then Supplier should be able to add new document for all the lots
   #13
   @GCloud
 	 Scenario: Verify the supplier needs to make a request via the cloud digital email address
    Given log in as supplier, can able to reinstate the service request by mail
    When under the Remove services section mail id as cloud digital need to validate 
    Then Supplier needs to make a request via the cloud digital email address incase reinstate the service
   #16
    @GCloud
 	 Scenario Outline: Verify the Category admin can able to edit a Supplier name in the Supplier account page
	 	Given log on to the Category Admin role for changes in the registered details
	  When can able to make changes in the registered company details<eMail>
    And Under the Edit supplier name edits do some changes then save data
    Examples:
  	|	eMail  |
  	| gcloud1uat@yopmail.com |
    
   #17
    @GCloud
 	 Scenario: Verify the Cateogry admin can able to View agreements in the Supplier account page
    Given log in as Category Admin can able to view the Agreement or not
    When click on View agreements link on the supplier account page
    Then Cateogry admin be able to View agreements in the Supplier account page
   #18
   @GCloud
 	 Scenario: Verify the Cateogry admin can able to View countersigned framework agreement in the Supplier account page
    Given log in as Category Admin can able to view the Countersigned Agreement or not
    When under Signature details shows like Signer Name Role Date on the supplier account page
    Then Cateogry admin should be able to View countersigned framework agreement in the Supplier account page
   #19
   @GCloud
 	 Scenario: Verify the Cateogry admin can able to download the countersigned framework agreement in the Supplier account page
    Given log in as Category Admin and also able to download the Countersigned Agreement or not
    When under Countersignature status click on View countersigned framework agreement link on the supplier account page
    Then Cateogry admin should be able to download the countersigned framework agreement in the Supplier account page
   #20
   @GCloud
 	 Scenario: Verify the Category admin can able to edit the Service line details for Cloud Support
    Given log in as Category Admin service line details changes in the Cloud Services
    When click on edit suppliers and services and search by supplier name in the Application
	  And Under the supplier name click on Services link and in the Service section choose Edit link
	  Then Category admin should be able to edit the Service line details for Cloud application
   #21
  @GCloud
 	 Scenario: Verify the Category admin can able to edit the Service line details for Cloud Software
    Given log in as Category Admin service line details changes in the Cloud Services
    When click on edit suppliers and services and search by supplier name in the Application
	  And Under the supplier name click on Services link and choose Cloud Software Edit link
	  Then Category admin should be able to edit the Service line details for Cloud application
   #22
   @GCloud
 	 Scenario: Verify the Category admin can able to edit the Service line details for Cloud Hosting
    Given log in as Category Admin service line details changes in the Cloud Services
    When click on edit suppliers and services and search by supplier name in the Application
	  And Under the supplier name click on Services link and choose Cloud Hosting Edit link
	  Then Category admin should be able to edit the Service line details for Cloud application
	  #23
 		@GCloud
	  Scenario: Verify the Admin Data Controller can able to edit a suppliers registered company details
	  Given log on to the Admin Controller role for changes in the registered company details
	  When Click on View and edit suppliers link then search the supplier name and edit in the company details
	  Then Admin Data Controller should be able to edit a suppliers registered company details page
   #24
    @GCloud
	  Scenario: Verify the Admin Data Controller cannot able to edit a suppliers registered company details of DUNS Number
	  Given In the Admin Controller role under the registered company details DUNS Number click
    When Edit duns number in the company details page
    Then Admin Data Controller shouldnot be able to edit DUNS Number
 
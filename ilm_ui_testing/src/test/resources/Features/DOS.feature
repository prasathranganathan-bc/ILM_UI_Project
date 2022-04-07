Feature: DOS6 - ILM UI Stories
  #1
	@Dos
	Scenario Outline: Verify the supplier can able to edit Company Contact details
	Given Enter the company details page <unam> and <pword>
	When Edit the below section of what buyers will see<eMail>
	And clicks the save button
	Then changes displayed in the details page or not<eMail>
   Examples:
  	| unam | pword |	eMail  |
  	| dos1uat@yopmail.com | Password1234 | dos1uat@yopmail.com |
  	
  #2
  @Dos
  Scenario Outline: Supplier cannot able to make changes to the registered Company details of Registered Company Name
  Given Enter the registered company details page
  When Edit the below section of Company details for your framework applications
  Then changes will do or not in the registered details<cur_url>
  Examples:
  	| cur_url |
  	| https://www.uat.marketplace.team/suppliers/registered-company-name/edit |
  
  #3
  @Dos
  Scenario: Verify the supplier needs to contact the support team to make the changes in the registered Company details
  Given any changes need to contant support team mail id
  When can able to see the support team mail with message
  Then verify the support team mail id
  #4
  @Dos
  Scenario Outline: Verify the Category admin cannot able to make changes to the registered Company details DUNS Number
  Given log on to the Category Admin role for changes in the registered details
  When can able to make changes in the registered company details<eMail>
  Then verify the category team shouldnot do the changes
  Examples:
  	|	eMail  |
  	| dos1uat@yopmail.com |
  
  #5
  @Dos
  Scenario Outline: Verify the supplier can able to make changes to the registered Company details like company address trading status company size
  Given log on to the Supplier role for changes in the registered company details <unam> and <pword>
  When Edit under the section of company details of your framework applications and save
  Then verify the changes will be displayed in the framework application
    Examples:
  	| unam | pword |
  	| dos1uat@yopmail.com | Password1234 |
  	
  #6
  @Dos
  Scenario: Verify the supplier should not be able to see the opportunities link on the admin page
  Given Supplier can able to visible the opportunities link or not
  When click on view documents and go to the opportunity link
  Then Opportunity link should not be displayed in the application
  #7
  @Dos
  Scenario: Verify the Category admin can able to edit a suppliers service lines on Digital Outcomes
  Given log in as Category Admin can able to edit the supplier services
  When click on edit supplier and servies then search supplier by name wise
  And click the services link then do the some edits and save
  Then verify the changes will be displayed in the Digital outcomes or not
 	#8
  @Dos
  Scenario: Verify the Category admin can able to edit a suppliers service lines on Research studio
  Given log in as Category Admin can able to edit the Research Studio services
  When click on Admin home breadcrumbs choose edit suppliers and services
  And search by supplier name based and edit the changes finally save
  Then verify the changes will be displayed in the research studio services or not
  #9
  @Dos
  Scenario: Verify the Category admin can able to edit a suppliers service lines on User research participants
  Given log in as Category Admin can able to edit the Research Participants services
  When click on Admin home breadcrumbs then choose edit suppliers and services
  And Find the supplier name and edit the service secctions then save
  Then verify the changes will be displayed in the Research Participants services or not
 	#10
  @Dos
  Scenario: Verify the Category admin can able to edit a Supplier name in the Supplier account page
  Given log in as Category Admin can able to edit the Trading name
  When click on Admin home breadcrumbs then choose edit suppliers and services
  And Find the supplier based upon name and do some edits then finally save
  Then verify the supplier name changes will be displayed or not
 	#11
  @Dos
  Scenario: Verify the Cateogry admin can able to View agreements in the Supplier account page
  Given log in as Category Admin can able to view the Agreement or not
  When click on View agreements link on the supplier account page
  Then Cateogry admin should be able to View agreements in the Supplier account page
  #12
  @Dos
  Scenario: Verify the Cateogry admin can able to View countersigned framework agreement in the Supplier account page
  Given log in as Category Admin can able to view the Countersigned Agreement or not
  When under Signature details shows like Signer Name Role Date on the supplier account page
  Then Cateogry admin should be able to View countersigned framework agreement in the Supplier account page
  #13
  @Dos
  Scenario: Verify the Cateogry admin can able to download the countersigned framework agreement in the Supplier account page
  Given log in as Category Admin and also able to download the Countersigned Agreement or not
  When under Countersignature status click on View countersigned framework agreement link on the supplier account page
  Then Cateogry admin should be able to download the countersigned framework agreement in the Supplier account page
  #16
  @Dos
  Scenario: Verify the Admin Data Controller can able to edit a suppliers registered company
    Given log on to the Admin Controller role for changes in the registered company details
    When Click on View and edit suppliers link then search the supplier name and edit in the company details page
    Then Admin Data Controller should be able to edit a suppliers registered company details
    
  #17
  @Dos
  Scenario: Verify the Admin Data Controller cannot able to edit a suppliers registered company details
    Given In the Admin Controller role under the registered company details DUNS Number click
    When Edit duns number in the company details page
    Then Admin Data Controller shouldnot be able to edit DUNS Number
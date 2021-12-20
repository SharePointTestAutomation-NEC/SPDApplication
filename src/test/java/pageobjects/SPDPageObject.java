package pageobjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

import com.github.javafaker.Faker;
import helpers.PopupWindow;
import helpers.WritePropertiesFile;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;


import step_definitions.BaseClass;

import static java.util.concurrent.TimeUnit.SECONDS;

//import com.sharepoint.qa.base.TestBase;

public class SPDPageObject extends BaseClass {

	private Faker faker = new Faker();

	@FindBy(xpath = "//span[text()='PSA InformationPortal']")
	WebElement PSAInformation;

	@FindBy(xpath = "//input[contains(@class,'search')]")
	WebElement EnterCrmNumber;

	@FindBy(xpath = "//button[text()='Search' and @type='submit']")
	WebElement SeacrhSubmitBtn;

	@FindBy(xpath = "(//div[@data-automation-key='CRMRef' or @data-automation-key='CRM' or @data-automation-key='CRMID']//span)[1]")
	WebElement CRMRefNumber;

	@FindBy(xpath = "//div[@id='bidData']//a[contains(@href,'/sites/contracts')]")
	WebElement verifyEsofCRM;

	@FindBy(xpath = "//*[text()='CRM Reference' or text()='CRM' or text()='CRM ID']//following::td[1]")
	WebElement CRMReferenceNumber;

	@FindBy(xpath = "//*[text()='CRM']//following::td[1]")
	WebElement CRMForWriteBack;

	@FindBy(xpath = "(//a[@href='/_layouts/15/viewlsts.aspx'])[2]")
	WebElement siteContent;

	@FindBy(xpath = "//a[@href='/sites/ProcessingServices/Lists/SPDTelephoneRecord/AllItems.aspx']")
	WebElement SPDTelePhoneRecord;

	@FindBy(xpath = "//a[@href='/sites/ProcessingServices/Lists/EPRTelephoneRecord/AllItems.aspx']")
	WebElement EPRTelePhoneRecord;

	@FindBy(xpath = "//a[@href='/sites/ProcessingServices/Lists/StudentReview/AllItems.aspx']")
	WebElement StudentReview;

	@FindBy(xpath = "//a[@href='/sites/ProcessingServices/Lists/ComplaintsEscalations/AllItems.aspx']")
	WebElement ComplaintsEscalations;

	@FindBy(xpath = "//a[@href='/sites/ProcessingServices/GeneralDocumentsStore/Forms/AllItems.aspx']")
	WebElement GeneralDocumentsStore;

	@FindBy(xpath = "//h2[@class='StandaloneList-title']")
	WebElement SPDTelePhoneRecordHedarname;

	@FindBy(xpath = "//span[@class='CommandBarItem-commandText' and text()='Create']")
	WebElement CreateBtnClick;

	@FindBy(xpath = "//span[@class='CommandBarItem-commandText' and text()='New']")
	WebElement NewBtnClick;

	@FindBy(xpath = "//span[text()='Folder']")
	WebElement folderBtn;

	@FindBy(xpath = "//div[@class='od-FolderBuilder']/div/input[1]")
	WebElement folderNameInputVal;

	@FindBy(xpath = "//div[@class='od-Dialog-actions']/div/button")
	WebElement createfolderBtn;

	@FindBy(xpath = "//input[@title='Account Number Required Field']")
	WebElement AccontNumberRequired;

	@FindBy(xpath = "//input[contains(@id,'Title_')]")
	WebElement CallersName;

	@FindBy(xpath = "//input[contains(@id,'CallerContactNumber')]")
	WebElement CallerContactNumber;

	@FindBy(xpath = "//input[contains(@id,'ContactNumber')]")
	WebElement ContactNumber;

	@FindBy(xpath = "//input[contains(@id,'LocalCouncil')]")
	WebElement LocalCouncil;




	@FindBy(xpath = "//input[@title='Full Customer Name Required Field']")
	WebElement FullCustomerNameRequired;

	@FindBy(xpath = "//input[@title='Full Name of Account Holder Required Field']")
	WebElement AccountHolderName;

	@FindBy(xpath = "//input[contains(@id,'FullNameAdditionalOccupant')]")
	WebElement FullNameOFAdditionalCharge;

	@FindBy(xpath = "//textarea[contains(@id,'NoteResponseByChargePayer')]")
	WebElement SoleOccupierNotes;

	@FindBy(xpath = "//textarea[contains(@id,'AdditionalNotes')]")
	WebElement AdditionalActionNotes;

	@FindBy(xpath = "//input[contains(@class,'ms-BasePicker-input pickerInput')]")
	public WebElement InputFilterVal;

	@FindBy(xpath = "//div[contains(@class,'ms-Button-label') and contains(@id,'id') and text()='Apply']")
	public  WebElement filterApplyBtn;

	@FindBy(xpath = "//input[@title='Date Additional Occupant Moved In']")
	WebElement AdditionalAccupiedDate;

	@FindBy(xpath = "//input[@title='Date of Sale/Tenancy Start Date']")
	WebElement SaleTenancyDate;

	@FindBy(xpath = "//input[@title='Date Property Became Occupied']")
	WebElement DatePropertyBecameOccupied;

	@FindBy(xpath = "//textarea[contains(@id,'NamesOccupiersOverAge18')]")
	WebElement NamesOccupiersOverAge18;

	@FindBy(xpath = "//input[contains(@id,'AccountReference1') and @type='text']")
	WebElement AccountReference1;

	@FindBy(xpath = "//textarea[contains(@id,'PropertyAddress')]")
	WebElement PropertyAddress;

	@FindBy(xpath = "//input[contains(@id,'TenancyEndedDate1')]")
	WebElement TenancyEndedDate1;

	@FindBy(xpath = "//input[contains(@id,'TenantvacatedDate1')]")
	WebElement TenantvacatedDate1;


	@FindBy(xpath = "//input[contains(@id,'LandlordName1')]")
	WebElement LandlordName1;

	@FindBy(xpath = "//input[contains(@id,'LandlordTelephoneNumber')]")
	WebElement LandlordTelephoneNumber;

	@FindBy(xpath = "//input[contains(@id,'LandlordEmailAddress')]")
	WebElement LandlordEmailAddress;

	@FindBy(xpath = "//input[contains(@id,'Tenant1FullName1')]")
	WebElement Tenant1FullName1;

	@FindBy(xpath = "//input[contains(@id,'Tenant1MoveInDate1')]")
	WebElement Tenant1MoveInDate1;

	@FindBy(xpath = "//input[contains(@id,'Tenant1CourseEndDate1')]")
	WebElement Tenant1CourseEndDate1;

	@FindBy(xpath = "//input[contains(@id,'Tenant1StudId1')]")
	WebElement Tenant1StudId1;


	@FindBy(xpath = "//select[contains(@id,'ActiveTenancyAgreement')]")
	WebElement ActiveTenancyAgreement;

	@FindBy(xpath = "//select[contains(@id,'LiableForCouncilTax')]")
	WebElement LiableForCouncilTax;


	@FindBy(xpath = "//input[contains(@id,'FullName_')]")
	WebElement FullNameOccupied;


	@FindBy(xpath = "//input[@title='Additional Occupant DOB']")
	WebElement AdditionalAccuPantDOB;

	@FindBy(xpath = "//select[contains(@id,'RelationshipChargePayer') and @title='Relationship to Charge Payer']")
	WebElement RelationShiChargePayer;

	@FindBy(xpath = "//select[contains(@id,'DisregardCategory')]")
	WebElement DisregardCategory;

	@FindBy(xpath = "//select[contains(@id,'AwaitingAction')]")
	WebElement AwaitingAction;


	@FindBy(xpath = "//textarea[@title='Rich text editor Address Required Field']")
	WebElement AddressRequired;

	@FindBy(xpath = "//textarea[contains(@id,'PropertyAddress')]")
	WebElement PropertyAddressEPR;


	@FindBy(xpath = "//input[@title='Contact Telephone Number Required Field']")
	WebElement ConatactNumberRequired;

	@FindBy(xpath = "//input[contains(@id,'CouncilTaxByDirectDebit') and @value='Yes']")
	WebElement TaxSavingYesRadiobtn;

	@FindBy(xpath = "//input[@id='nextButtonTab' and @value='Next']")
	WebElement NextBtn;

	@FindBy(xpath = "(//input[@value='Save'])[2]")
	WebElement SaveBtns;

	@FindBy(xpath = "//span[contains(@class,'ms-ContextualMenu-itemText') and contains(text(),'Filter by')]")
	public WebElement filterBy;

	@FindBy(xpath = "//input[@id='Test'and @value='No']")
	WebElement NoBtnForCancellation;


	@FindBy(xpath = "//div[text()='Caller Details']")
	WebElement CallDetails;

	@FindBy(xpath = "//div[text()='Action Details']")
	WebElement ActionDetails;

	@FindBy(xpath = "//div[text()='Occupied']")
	WebElement OccupiedDetails;

	@FindBy(xpath = "//div[text()='Tenant Details']")
	WebElement TenantDetails;

	@FindBy(xpath = "//div[text()='Final Action']")
	WebElement FinalActionDetails;

	@FindBy(xpath = "//div[text()='Cancellation']")
	WebElement Cancellation;

	@FindBy(xpath = "//div[text()='Existing Student']")
	WebElement ExistingStudent;

	@FindBy(xpath = "//div[text()='Disregard']")
	WebElement Disregard;

	@FindBy(xpath = "//div[text()='Sole Occupier (Verify)']")
	WebElement SoleOccupier;

	@FindBy(xpath = "//div[text()='Reinstatement']")
	WebElement Reinstatement;

	@FindBy(xpath = "//div[text()='Moved Out of Property']")
	WebElement MovedOutofProperty;

	@FindBy(xpath = "//select[contains(@id,'PleaseChooseActions')]")
	WebElement ChooseActions;

	@FindBy(xpath = "//select[contains(@id,'HouseholdStatus')]")
	WebElement houseHoldStatus;

	@FindBy(xpath = "//select[contains(@id,'LocalAuthority')]")
	WebElement LocalAuthority;

	@FindBy(xpath = "(//input[contains(@id,'PortsmouthOrSouthamptonUni') and @value='Yes'])[1]")
	WebElement PortsmouthOrSouthamptonUni;


	@FindBy(xpath = "//select[contains(@id,'Council')]")
	WebElement ChooseCouncils;

	@FindBy(xpath = "(//select[contains(@id,'Council')])[2]")
	WebElement ChooseCouncilsEPR;

	@FindBy(xpath = "//select[contains(@id,'CallerStatus')]")
	WebElement CallerStatusEPR;


	@FindBy(xpath = "//a[@title='PSAInfoPortalData']")
	WebElement PSAInfoDataLink;

	@FindBy(xpath = "(//label[text()='Title']//following::div//input)[1]")
	WebElement titleCardName;

	@FindBy(xpath = "(//label[text()='RestUrl']//following::div//input)[1]")
	WebElement RestUrl;

	@FindBy(xpath = "(//label[text()='OneRecordUrl']//following::div//input)[1]")
	WebElement OneRecordUrl;

	@FindBy(xpath = "(//label[text()='MoreThanOneRecord']//following::div//input)[1]")
	WebElement MoreThanOneRecord;

	@FindBy(xpath = "(//label[text()='imageUrl']//following::div//input)[1]")
	WebElement imageUrl;

	@FindBy(xpath= "//button[@data-automationid='clientFormSaveButton']")
	WebElement saveManagerBtn;

	@FindBy(xpath= "//div[@id='searchresult;']")
	WebElement noRecordFoundMessage;




































//	WebConnnector con;













	@FindBy(xpath = "//select[@id='DropdownNr2']")
	WebElement SalesLead;

	@FindBy(xpath = "//input[@title='Submission Date Required Field']")
	WebElement SubmissonDate;

	@FindBy(xpath = "//select[@title='Sensitivity level Required Field']")
	WebElement SensitivityLevel;

	@FindBy(xpath = "//textarea[contains(@id,'Notes')]")  //"//textarea[@title='Notes']")
	WebElement Notes;

	@FindBy(xpath = "//textarea[contains(@id,'Security')]") //"//textarea[@title='Security clearance requirements Required Field']")
	WebElement SecurityClearanceRequirements;

	@FindBy(xpath = "//textarea[contains(@id,'Submission')]")//"//textarea[@title='Submission instructions Required Field']")
	WebElement SubmissionInstructions;

	//@FindBy(xpath = "//input[@title='CRM ID']")
	//WebElement CRMID;

	@FindBy(xpath = "//input[@title='CRM ID Required Field']")
	WebElement CRMID;

	@FindBy(xpath = "//input[@value='Save']")
	WebElement Save;

	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//td[@valign='top']/../td[3]")
	List<WebElement> FinalBidValues;

	@FindBy(xpath =   "//iframe[contains(@src,'/_layouts/15/listform.aspx?')]" )    //"(//iframe)[1]")
	WebElement CreateBidFrame;

	@FindBy(xpath = "//*[@title='Upload a document from your computer to this library.']/span[1]")
	WebElement uploadBtn;

	@FindBy(xpath ="//*[@id='dialogTitleSpan']")
	WebElement addDocumentDialogBox;


	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement addDocmentPageClose;

	@FindBy(xpath = "//iframe[@class='ms-dlgFrame']")
	WebElement uplaodFrame;

	@FindBy(xpath = "//input[@title='Choose a file']")
	WebElement uploadFilePath;

	@FindBy(xpath = "//*[@title='Version Comments']")
	WebElement versionComment;

	@FindBy(xpath = "//*[@value='OK']")
	WebElement okUploadBnt;

	@FindBy(xpath = "//*[text()='Sub Group']//following::input[@value='Check In']")
	WebElement checkInbtn;

	@FindBy(xpath = "//*[@title='Select files and download as a zip file']/span/img")
	WebElement zipFileBtn;

	@FindBy(xpath = "//*[@title='Click here for Final Submission']/span/img")
	WebElement finalSubmission;

	@FindBy(xpath = "//*[@class='ms-List-cell']")
	WebElement bidRecordsCnt;

	@FindBy(xpath = "(((//*[@class='ms-List-cell'])[1]//following::span[contains(@class,'FieldRenderer-NameRenderer-SignalField')])[1]//following::a)[1]")
	WebElement bidCreationBtn;

	@FindBy(xpath = "(//div[@role='checkbox'])[1]")
	WebElement bidAttachmentChkBox;


	@FindBy (xpath = "//iframe[contains(@src,'/FinalSubmission/FinalSubmission.aspx')]")
	WebElement finalSubmisionFrame;

	@FindBy(xpath = "//input[@value='OK']")
	WebElement FinalSubmissionOk;

	@FindBy(xpath  ="//a[@id='ViewPropsLink']")
	WebElement viewAllPropertiesLink;



	@FindBy(xpath  ="//a[@id='EditPropsLink']")
	WebElement EditPropertiesLink;

	@FindBy(xpath = "//input[@title='Bid Title Required Field']")
	WebElement  bidTitle;

	@FindBy(xpath = "//*[contains(@id,'Frameworks')]//following::input[@value='Save']")
	WebElement SaveBtn;

	@FindBy(xpath = "//*[text()='Copy Documents']")
	WebElement copyDocument;

	@FindBy(xpath = "//select[@id='crmIDList']")
	WebElement crmIdDropDown;

	@FindBy(xpath = "//input[@id='copyDoc']")
	WebElement copyBtn;

	@FindBy(xpath = "//p[@id='msgCopy']")
	WebElement CopySuccessFulMsg;

	@FindBy(xpath = "//iframe[contains(@id,'DlgFrame') and @class='ms-dlgFrame']")
	WebElement DlgFrame;

	@FindBy(xpath = "//a[@id='destBidUrl']")
	WebElement destinationBidLink;

	@FindBy(xpath = "//span[text()='Edit' and @class='CommandBarItem-commandText']")
	WebElement editMenu;

	@FindBy(xpath = "//span[text()='Delete' and @class='CommandBarItem-commandText']")
	WebElement deleteBidManager;

	@FindBy(xpath = "//span[text()='Delete' and @class='od-Button-label']")
	WebElement deleteConfirmBtn;

	@FindBy(xpath = "//*[contains(text(),'Deleted 1 item from ')]")
	WebElement deletedMsg;

	// new document added
	@FindBy(xpath = "//input[@value='SharePoint Test case (2)' and contains(@title,'Name Required Field')]")
	WebElement DocName;  // i want to take this xpath directly into script as value will get change

    @FindBy(xpath = "//select[contains(@title,'Bid Event Type Required') or @id='Bid']")
    WebElement bidEventType;

    @FindBy(xpath = "//select[contains(@title,'Document Group Required') or contains(@id,'Document')]")
	WebElement documentRequiredDropDown;

    @FindBy(xpath = "//select[contains(@title,'Sub Group Required') or contains(@id,'Sub')]")
	WebElement subgroup;

    @FindBy(xpath = "//span[@id='idDocsetName']")
	WebElement BidId;

    @FindBy(xpath = "//*[text()='More']/span[2]")
	WebElement moreBtn;

    @FindBy(xpath = "//a[@id='ID_AdvancedMenu']")
	WebElement advanceMenuOption;

	/*@FindBy(xpath = "//a[@id='ID_DeleteMenu']")
	WebElement deleteMenuOption;*/
	@FindBy(xpath = "//a[@id='ID_DeleteDocItem']")
	WebElement deleteMenuOption;

	@FindBy(xpath = "//a[@id='ID_Checkout' or @id='ID_Checkin']")
	WebElement checkInAndCheckOut;

	@FindBy(xpath = "//*[@id='CheckinDescription']")
	WebElement CheckInComments;

	@FindBy(xpath = "//input[@id='CheckinOk']")
	WebElement checkInBtnOk;

	@FindBy(xpath = "//input[@id='inplaceSearchDiv_WPQ7_lsinput']")
	WebElement insideBidCreation;

	@FindBy(xpath = "//div[@id='WebPartWPQ1']//input[1]")
	WebElement BidRecordKeyContent;

	@FindBy(id = "Result")
	public WebElement SearchContentBid;

	@FindBy(xpath = "//span[@id='inplaceSearchDiv_WPQ7_lsimgspan']")
	WebElement SearchMagnifierBtn;

	@FindBy(xpath = "//table[@summary='Bid List']/tbody")
	WebElement BidRecords;

	@FindBy(name = "Search")
	WebElement SearchAsKey;

	@FindBy(xpath = "//span[text()='Share']")
	WebElement shareBtnDispay;

	@FindBy(xpath = "//div[@id='selected-suggestion-alert']//following::input[1]")
	WebElement enterSenderName;

	@FindBy(xpath = "//div[contains(@id,'id__') and text()='Send']")
	WebElement  sendRecepientBtn;

	@FindBy(xpath = "//div[@class='od-ShareNotification-icon']")
	WebElement shareNotificatioDisplay;

	@FindBy(xpath = "//*[@class='ms-standardheader' and text()='CRM ID']//following::td[2]")
	WebElement getCRMID;




	public SPDPageObject() {
		PageFactory.initElements(driver, this);
	}


	public void switchToCreateNewBidFrame() throws InterruptedException {
	manageFluientWait(CreateBidFrame);
		Thread.sleep(20000);
		     driver.getTitle();
		     System.out.println(driver.getTitle());
		     //driver.switchTo().defaultContent();
			driver.switchTo().frame(CreateBidFrame);
	}

	public void switchToDefaultWindow() {
		driver.switchTo().defaultContent();
	}

	public String bidIDNumber(){
		BidId.isDisplayed();
	    return BidId.getText().trim();
	}
















	public boolean isSalesLeadDropDownDisplayed() {
		return (SalesLead.isDisplayed());
	}

	public boolean isSalesLeadDropDownEnabled() {
		return (SalesLead.isEnabled());
	}

	public boolean isSubmissionDateFieldDisplayed() {
		return (SubmissonDate.isDisplayed());
	}

	public boolean isSubmissionDateFieldEnabled() {
		return (SubmissonDate.isEnabled());
	}

	public boolean isSensitivityLevelDropDownDisplayed() {
		return (SensitivityLevel.isDisplayed());
	}

	public boolean isSensitivityLevelDropDownEnabled() {
		return (SensitivityLevel.isEnabled());
	}

	public boolean isNotesTextDisplayed() {
		return (Notes.isDisplayed());
	}

	public boolean isNotesTextEnabled() {
		return (Notes.isEnabled());
	}

	public boolean isSecurityClearanceRequirementsTextDisplayed() {
		return (SecurityClearanceRequirements.isDisplayed());
	}

	public boolean isSecurityClearanceRequirementsTextEnabled() {
		return (SecurityClearanceRequirements.isEnabled());
	}

	public boolean isSubmissionInstructionsTextDisplayed() {
		return (SubmissionInstructions.isDisplayed());
	}

	public boolean isSubmissionInstructionsTextEnabled() {
		return (SubmissionInstructions.isEnabled());
	}

	public boolean isCRMIDTextDisplayed() {
		return (CRMID.isDisplayed());
	}

	public boolean isCRMIDTextEnabled() {
		return (CRMID.isEnabled());
	}

	public boolean isSaveButtonDisplayed() {
		return (Save.isDisplayed());
	}

	public boolean isSaveButtonEnabled() {
		return (Save.isEnabled());
	}

	public boolean isCancelButtonDisplayed() {
		return (Cancel.isDisplayed());
	}

	public boolean isCancelButtonEnabled() {
		return (Cancel.isEnabled());
	}



	public void clickSaveButton() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", Save);
			//Save.click();
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}

	}

	public void clickCancelButton() {
		Cancel.click();
	}


	public void setCRMNumber(String CRM) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(this.EnterCrmNumber));
		this.EnterCrmNumber.sendKeys(CRM);
		Thread.sleep(2000);
	}

	public void submitBtnClick() throws InterruptedException {
		Thread.sleep(8000);
		this.SeacrhSubmitBtn.click();
		Thread.sleep(15000);
	}

	public Boolean CardNameVerify() throws InterruptedException, IOException {
		Boolean flag=false;
		SPDPageObject SPDPageObject = new SPDPageObject();
		String title = SPDPageObject.getDatafromInfoPortalProperties("title");
		WebElement titleName = driver.findElement(By.xpath("//h2[text()='"+title+"']"));
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(titleName));
		titleName.click();
		Thread.sleep(5000);
		return flag= true;
	}



	public void setClientName(String ClientName) throws InterruptedException {
		for (int i = 0; i < ClientName.length(); i++) {
			char ch = ClientName.charAt(i);
			//this.ClientName.sendKeys(String.valueOf(ch));
			Thread.sleep(500);
		}
//		this.ClientName.sendKeys(ClientName);
//		Thread.sleep(2000);
	}


	public void setClientNameTest(String ClientName) throws InterruptedException {
	//	this.ClientName.sendKeys(ClientName);
	}





	public void setDocumentVal(String docName,String uploadedDoc) throws  InterruptedException{
		String docNam = driver.findElement(By.xpath("//input[@value='"+docName+"' and contains(@title,'Name Required Field')]")).getAttribute("value").trim();
		Assert.assertTrue("Documnet Name verify", docNam.equalsIgnoreCase(uploadedDoc));
	}

	public void setBidTypVerify(String bidTypeVal) throws InterruptedException{
		Select bidType = new Select(this.bidEventType);
		bidType.selectByVisibleText(bidTypeVal);
		Thread.sleep(2000);

	}

	public void setdocumentGroupVerify(String docGroupVal) throws InterruptedException{
		Select bidType = new Select(this.documentRequiredDropDown);
		bidType.selectByVisibleText(docGroupVal);
		Thread.sleep(2000);

	}

	public void setSubtGroupVerify(String subGroupVal) throws InterruptedException{
		Select bidType = new Select(this.subgroup);
		bidType.selectByVisibleText(subGroupVal);
		Thread.sleep(2000);

	}

	public void setSalesLead(String SalesLead) throws InterruptedException {
		Select saleslead = new Select(this.SalesLead);
		saleslead.selectByVisibleText(SalesLead);
		// this.SalesLead.sendKeys(SalesLead);
		Thread.sleep(2000);
	}

	public String setSubmissonDate(WebElement webElement) throws InterruptedException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String formattedLocalDate = dtf.format(now);
		webElement.sendKeys(formattedLocalDate);
		Thread.sleep(2000);
		return formattedLocalDate;
	}

	public String setStaticDate(WebElement webElement) throws InterruptedException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String formattedLocalDate = dtf.format(now);
		webElement.sendKeys("2/23/2012");
		Thread.sleep(2000);
		return formattedLocalDate;
	}

	public void setSensitivityLevel(String SensitivityLevel) throws InterruptedException {
		Select senstivitylevel = new Select(this.SensitivityLevel);
		senstivitylevel.selectByVisibleText(SensitivityLevel);
		// this.SensitivityLevel.sendKeys(SensitivityLevel);
		Thread.sleep(2000);
	}

	public void setNotes(String Notes) throws InterruptedException {
		this.Notes.sendKeys(Notes);
		Thread.sleep(2000);
	}

	public void setSecurityClearanceRequirements(String SecurityClearanceRequirements) throws InterruptedException {
		this.SecurityClearanceRequirements.sendKeys(SecurityClearanceRequirements);
		Thread.sleep(2000);
	}

	public void setSubmissionInstructions(String SubmissionInstructions) throws InterruptedException {
		this.SubmissionInstructions.sendKeys(SubmissionInstructions);
		Thread.sleep(2000);
	}

	public String setNameandCRMID() throws InterruptedException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime now = LocalDateTime.now();
		String formattedLocalDateTime = dtf.format(now);
		this.CRMID.sendKeys(formattedLocalDateTime);
		//this.Name.sendKeys(formattedLocalDateTime);
		Thread.sleep(2000);
		return formattedLocalDateTime;
	}

	public Integer setNameandCRMIDDynamic() throws InterruptedException {
		Thread.sleep(2000);
		String dynamicCRMID = String.valueOf(faker.hashCode());
		this.CRMID.sendKeys(dynamicCRMID);
		return Integer.valueOf(dynamicCRMID);
	}
	
	public ArrayList<String> getFinalBidValues() {
		ArrayList<String> temp = new ArrayList<String>();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(FinalBidValues.get(1)));
		
		for (int i = 0; i < FinalBidValues.size(); i++) {
			temp.add(FinalBidValues.get(i).getText());
		}
		return temp;
	}

	public void WaitForSpecificTime() throws InterruptedException {
		Thread.sleep(20000);
	}

	public void uploadBtnVeriy()throws InterruptedException{
		try{
			//Thread.sleep(10000);
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(uploadBtn));
			uploadBtn.click();
			WaitForSpecificTime();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void uploadFile()throws InterruptedException{
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
			prop.load(ip);
			String docName = prop.getProperty("attachmentName");
			uploadFilePath.sendKeys( System.getProperty("user.dir")+"/Attachments/"+docName);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void versionCommits()throws InterruptedException{
		try{
			versionComment.sendKeys("Test Uplaod");
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void addDocumentSpanWindow()throws InterruptedException{
		try{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", addDocumentDialogBox);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void okUploadBnt()throws InterruptedException{
		try{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", okUploadBnt);
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void checkIn()throws InterruptedException{
		try{

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", checkInbtn);
			Thread.sleep(20000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void uploadFrameSwitch()throws InterruptedException{
		try{
			//Thread.sleep(8000);
			waitForPageToLoad(uplaodFrame);
			driver.switchTo().frame(uplaodFrame);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void finalSubmissionFrame()throws InterruptedException{
		try{
			Thread.sleep(5000);
			driver.switchTo().frame(finalSubmisionFrame);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void finalSubmissionOk()throws InterruptedException{
		try{
			FinalSubmissionOk.click();
			driver.manage().timeouts().pageLoadTimeout(30, SECONDS);
			//Thread.sleep(20000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void zipBtnVerify()throws InterruptedException{
		System.out.println("JummmmmmmmmmmmmmmmmmmmmmmmmmmmmmPPPPPPPPing");
		driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", zipFileBtn);
		Thread.sleep(5000);

	}

	public void verifyZipGetsDownloaded() throws  Exception{
		Thread.sleep(20000);
		String crmId =getCRMID.getText().trim();
		System.out.println("sdjfkjdsfksdkfkdskf :" +crmId);
		String path = "C:\\Users\\Parmeshwar.Sakole\\Downloads";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		boolean found = false;
		File f = null;
		//Look for the file in the files
		// You should write smart REGEX according to the filename
		for (File listOfFile : listOfFiles) {
			if (listOfFile.isFile()) {
				String fileName = listOfFile.getName();
				System.out.println("File " + listOfFile.getName());
				if (fileName.matches("CRMID_"+crmId+".zip")) {
					f = new File(fileName);
					found = true;
				}
			}
		}
		Assert.assertTrue("Downloaded document is not found",found);
		f.deleteOnExit();
		//if(Directory.Exist)
	}

	public  void finalSubmissionVerify()throws InterruptedException{
		try{
			Thread.sleep(2000);
			finalSubmission.click();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public  void checkPSAInfoPortalCreation()throws InterruptedException{
		try{
			Thread.sleep(2000);
			PSAInformation.click();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public String getData(String KeyName) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String keyName = prop.getProperty(KeyName);
		return keyName;
	}

	public String getDatafromInfoPortalProperties(String KeyName) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/InfoPortal.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String keyName = prop.getProperty(KeyName);
		return keyName;
	}




	public void alertPersentOrNot()throws InterruptedException{
		try{
			WebDriverWait wait = new WebDriverWait(driver, 30 /*timeout in seconds*/);
			if(wait.until(ExpectedConditions.alertIsPresent())!=null) {
				System.out.println("alert  present");
				Alert alert = driver.switchTo().alert();
				alert.accept();
				Thread.sleep(5000);
			}else{
				System.out.println("alert was present");
			}
		}catch (Exception e){

		}
	}
	public String getTitle="";
	public void checkExistBidCreation()throws InterruptedException{
		try{
			Thread.sleep(10000);
			List<WebElement> bidRecords =  driver.findElements(By.xpath("(//*[@class='ms-List-cell'])[1]//following::span[contains(@class,'FieldRenderer-NameRenderer-SignalField')]"));
			System.out.println("bidRecords count "+ bidRecords);
			if(!bidRecords.isEmpty()){
					getTitle=  bidCreationBtn.getText();
					System.out.println("---------*****"+getTitle);
						bidCreationBtn.click();
			}else{
					System.out.println("We don't have a bid creation records");
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public boolean BidReturnSearchContent()throws  Exception{
		Boolean flag= false;
		try{
			Boolean tbodyExist = BidRecords.isDisplayed();
			if(tbodyExist){
				flag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	public boolean isCRMNumberExistAndSave()throws  Exception{
		Boolean flag= false;
		Boolean tbodyExist = CRMRefNumber.isDisplayed();
		try{
			if(tbodyExist){
				String CRMID = String.valueOf(CRMRefNumber.getText().trim());
				WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
				writePropertiesFile.WritePropertiesFile("CRMID",CRMID,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
				flag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	public boolean isRecordsExist()throws  Exception{
		Boolean flag= false;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		Boolean CRMRecord = wait.until(ExpectedConditions.visibilityOf(verifyEsofCRM)).isDisplayed();
		try{
			if(CRMRecord){
				verifyEsofCRM.click();
				WaitForSpecificTime();
				flag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	public boolean isRecordsExistWithUrl(String url)throws  Exception{
		Boolean flag= false;
		WebElement urlDisplay = driver.findElement(By.xpath("//div[@id='bidData']//a[contains(@href,'"+url+"')]"));
		WebDriverWait wait = new WebDriverWait(driver, 60);
		Boolean CRMRecord = wait.until(ExpectedConditions.visibilityOf(urlDisplay)).isDisplayed();
		try{
			if(CRMRecord){
				urlDisplay.click();
				WaitForSpecificTime();
				flag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	public boolean SearchContentCRMDisplay()throws  Exception{
		Boolean flag= false;
		try{
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(CRMReferenceNumber));
			Boolean tbodyExist = CRMReferenceNumber.isDisplayed();
			if(tbodyExist){
				flag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}


	public boolean BidReturnAsKeyContent()throws  Exception{
		Boolean flag= false;
		Thread.sleep(10000);
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		try{

			String docName = prop.getProperty("BidListKey");
			Boolean tbodyExist = driver.findElement(By.xpath("//span[text()='"+docName+"']")).isDisplayed();
			if(tbodyExist){
				flag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		finally {
			ip.close();
		}
		return flag;
	}

	public boolean  bidListViewDocSelect(String uploadedDocName) throws Exception{
		boolean docFlag=false;
		try{
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			WebElement test = driver.findElement(By.xpath("(//a[text()='"+uploadedDocName+"']//preceding::div[@role='checkbox'and @aria-checked='false'])[1]"));
			driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
			System.out.println("**************************************************test Id one "+ test);
			test.click();
			Thread.sleep(2000);
			docFlag=true;

		}catch (Exception e){
			e.printStackTrace();
		}
		return docFlag;
	}


	public boolean  bidListViewDocNotPresent(String uploadedDocName){
		boolean docFlag=false;
		try{
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			WebElement test = driver.findElement(By.xpath("(//a[text()='"+uploadedDocName+"']//preceding::div[@role='checkbox'and @aria-checked='false'])[1]"));
			driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
			System.out.println("**************************************************test Id one "+ test);
			test.click();
			Thread.sleep(2000);
			docFlag=false;
		}catch (Exception e){
			docFlag=true;
		}
		return docFlag;
	}

	public void switchWindow() throws InterruptedException {
		PopupWindow window = new PopupWindow();
		window.getTitleOfNewPage(driver,getTitle);
	}
	public void selectItemInBidList()throws InterruptedException{
		try{
			driver.switchTo().defaultContent();
			bidAttachmentChkBox.click();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void viewAllPropertiesLink()throws InterruptedException{
		try{
			driver.switchTo().defaultContent();
			viewAllPropertiesLink.click();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void sitecontent()throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(siteContent));
		siteContent.click();
	}


	public void SPDTelePhoneRecord()throws InterruptedException{
		manageFluientWait(SPDTelePhoneRecord);
		SPDTelePhoneRecord.click();
	}
	public void EPRTelePhoneRecord()throws InterruptedException{
		manageFluientWait(EPRTelePhoneRecord);
		EPRTelePhoneRecord.click();
	}

	public void StudentReview()throws InterruptedException{
		manageFluientWait(StudentReview);
		StudentReview.click();
	}

	public void Complaints_Escalations()throws InterruptedException{
		manageFluientWait(ComplaintsEscalations);
		ComplaintsEscalations.click();
	}

	public void generalDocumentStore()throws InterruptedException{
		manageFluientWait(GeneralDocumentsStore);
		GeneralDocumentsStore.click();
	}

	public void SPDTelePhoneRecordPage()throws InterruptedException{
		manageFluientWait(SPDTelePhoneRecordHedarname);
		String HeaderName = SPDTelePhoneRecordHedarname.getText().trim();
		if(HeaderName.equalsIgnoreCase("SPD Telephone Record")){
			SPDTelePhoneRecord.isDisplayed();
		}else{
			Assert.fail("SPD Telephone Recrod page doen not exist");
		}

	}

	public void EPRTelePhoneRecordPage()throws InterruptedException{
		manageFluientWait(SPDTelePhoneRecordHedarname);
		String HeaderName = SPDTelePhoneRecordHedarname.getText().trim();
		if(HeaderName.equalsIgnoreCase("EPR Telephone Record")){
			SPDTelePhoneRecord.isDisplayed();
		}else{
			Assert.fail("EPR Telephone Recrod page doen not exist");
		}

	}

	public void StudentReviewRecordPage()throws InterruptedException{
		manageFluientWait(SPDTelePhoneRecordHedarname);
		String HeaderName = SPDTelePhoneRecordHedarname.getText().trim();
		if(HeaderName.equalsIgnoreCase("Student Review")){
			SPDTelePhoneRecord.isDisplayed();
		}else{
			Assert.fail("Student Review Recrod page doen not exist");
		}

	}

	public void ComplaintsEscalationsRecordPage()throws InterruptedException{
		manageFluientWait(SPDTelePhoneRecordHedarname);
		String HeaderName = SPDTelePhoneRecordHedarname.getText().trim();
		if(HeaderName.equalsIgnoreCase("Complaints & Escalations")){
			SPDTelePhoneRecord.isDisplayed();
		}else{
			Assert.fail("Student Review Recrod page doen not exist");
		}

	}

	public void GeneralDocumentStoreRecordPage()throws InterruptedException{
		manageFluientWait(SPDTelePhoneRecordHedarname);
		String HeaderName = SPDTelePhoneRecordHedarname.getText().trim();
		if(HeaderName.equalsIgnoreCase("General Documents Store")){
			SPDTelePhoneRecord.isDisplayed();
		}else{
			Assert.fail("Student Review Recrod page doen not exist");
		}

	}

	public void CreateButtonCLick()throws InterruptedException{
		manageFluientWait(CreateBtnClick);
		//CreateBtnClick.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", CreateBtnClick);
	}
	public void NewuttonCLick()throws InterruptedException{
		manageFluientWait(NewBtnClick);
		NewBtnClick.click();
	}

	public void NewFolderName() throws InterruptedException, IOException {
		manageFluientWait(folderBtn);
		folderBtn.click();
		Thread.sleep(2000);
		String accNumber = String.valueOf(setNumber(folderNameInputVal));
		//String crmid = ReadIntoConfig("AccountNumber","/config/RunTimeData.properties");
		//folderNameInputVal.sendKeys(crmid);
		createfolderBtn.click();
		Thread.sleep(10000);
		//WebElement ele =driver.findElement(By.xpath("//a[@title='"+crmid+"']"));
		driver.navigate().refresh();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@title='"+accNumber+"']")).isDisplayed();
		//Thread.sleep(10000);
	}

	public void FillSPDTelePhoneRecord(String chooseActions,String councils)throws InterruptedException{
		switchToCreateNewBidFrame();
		CallDetails.isDisplayed();
		Select select = new Select(ChooseActions);
		select.selectByVisibleText(chooseActions);
		select = new Select(ChooseCouncils);
		select.selectByVisibleText(councils);
		String accNumber = String.valueOf(setNumber(AccontNumberRequired));
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile("AccountNumber",accNumber,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		FullCustomerNameRequired.sendKeys("Test Automation");
		AddressRequired.sendKeys("NY,Mumbai");
		ConatactNumberRequired.sendKeys("09898765654");
		TaxSavingYesRadiobtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NextBtn);
	}

	public void FillEPRTelePhoneRecord(String houseHold,String councils)throws InterruptedException{
		switchToCreateNewBidFrame();
		CallDetails.isDisplayed();
		Select select = new Select(houseHoldStatus);
		select.selectByVisibleText(houseHold);
		select = new Select(ChooseCouncilsEPR);
		select.selectByVisibleText(councils);
		String accNumber = String.valueOf(setNumber(AccontNumberRequired));
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile("AccountNumber",accNumber,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		AccountHolderName.sendKeys("Test Automation");
		PropertyAddressEPR.sendKeys("NY,Mumbai");
		select = new Select(CallerStatusEPR);
		select.selectByVisibleText("Owner");
		ConatactNumberRequired.sendKeys("09898765654");
		//TaxSavingYesRadiobtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NextBtn);
	}

	public void FillStudentReviewRecord(String LocalAuthoritys,String councils)throws InterruptedException{
		switchToCreateNewBidFrame();
		CallDetails.isDisplayed();
		Select select = new Select(LocalAuthority);
		select.selectByVisibleText(LocalAuthoritys);
		PortsmouthOrSouthamptonUni.click();
		CallersName.sendKeys("Callers Name Test Autoamtion");
		String accNumber = String.valueOf(setNumber(CallerContactNumber));
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile("CallerContactNumber",accNumber,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NextBtn);
	}

	public void FillComplaintsAndEscaltionsRecord(String chargePayerelationShip)throws InterruptedException{
		switchToCreateNewBidFrame();
		CallersName.isDisplayed();
		CallersName.sendKeys("Callers Name Test Autoamtion");
		String accNumber = String.valueOf(setNumber(ContactNumber));
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile("CallerContactNumberForComplaints",accNumber,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		LocalCouncil.sendKeys("LocalCouncil enter");
		Select select = new Select(AwaitingAction);
		select.selectByVisibleText(chargePayerelationShip);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", SaveBtns);
	}

	public Integer setNumber(WebElement webElement) throws InterruptedException {
		String dynamicCRMID = String.valueOf(ThreadLocalRandom.current().nextInt());
		webElement.sendKeys(dynamicCRMID);
		return Integer.valueOf(dynamicCRMID);
	}

	public void FillSPDTelePhoneCancellation(String chargePayerelationShip)throws InterruptedException{
		manageFluientWait(NoBtnForCancellation);
		NoBtnForCancellation.click();
		manageFluientWait(ActionDetails);
		ActionDetails.isDisplayed();
		Cancellation.isDisplayed();
		FullNameOFAdditionalCharge.sendKeys("Cacellation Test Automation");
		setSubmissonDate(AdditionalAccupiedDate);
		setSubmissonDate(AdditionalAccuPantDOB);
		Select select = new Select(RelationShiChargePayer);
		select.selectByVisibleText(chargePayerelationShip);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NextBtn);
		//NextBtn.click();
	}

	public void FillEPRTelePhoneOccupied()throws InterruptedException{
		manageFluientWait(OccupiedDetails);
		OccupiedDetails.isDisplayed();
		//Cancellation.isDisplayed();
		setStaticDate(SaleTenancyDate);
		setStaticDate(DatePropertyBecameOccupied);
		NamesOccupiersOverAge18.sendKeys("Please enter all Names");
		Select select = new Select(ActiveTenancyAgreement);
		select.selectByVisibleText("Yes");
		select = new Select(LiableForCouncilTax);
		select.selectByVisibleText("Yes");
		FullNameOccupied.sendKeys("TestAutomation");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NextBtn);
		//NextBtn.click();
	}

	public void FillEPRTelePhoneTenantDetails()throws InterruptedException{
		manageFluientWait(TenantDetails);
		TenantDetails.isDisplayed();
		ExistingStudent.isDisplayed();
		/*setStaticDate(SaleTenancyDate);
		setStaticDate(DatePropertyBecameOccupied);*/
		AccountReference1.sendKeys("Please AccountReference");
		PropertyAddress.sendKeys("Please enter Property Address");
		setStaticDate(TenancyEndedDate1);
		setStaticDate(TenantvacatedDate1);
		LandlordName1.sendKeys("LandLordName");
		LandlordTelephoneNumber.sendKeys("6563453353");
		LandlordEmailAddress.sendKeys("Test@gmail.com");
		Tenant1FullName1.sendKeys("TenantFull NAME");
		setStaticDate(Tenant1MoveInDate1);
		setStaticDate(Tenant1CourseEndDate1);
		Tenant1StudId1.sendKeys("322");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NextBtn);
		//NextBtn.click();
	}

	public void FillSPDTelePhoneDisRegard(String chargePayerelationShip)throws InterruptedException{
		manageFluientWait(ActionDetails);
		ActionDetails.isDisplayed();
		Disregard.isDisplayed();
		FullNameOFAdditionalCharge.sendKeys("Cacellation Test Automation");
		setSubmissonDate(AdditionalAccupiedDate);
		setSubmissonDate(AdditionalAccuPantDOB);
		Select select = new Select(RelationShiChargePayer);
		select.selectByVisibleText(chargePayerelationShip);
		select = new Select(DisregardCategory);
		select.selectByVisibleText("Carers");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NextBtn);
		//NextBtn.click();
	}

	public void FillSPDTelePhoneSoleOccupier()throws InterruptedException{
		manageFluientWait(ActionDetails);
		ActionDetails.isDisplayed();
		SoleOccupier.isDisplayed();
		SoleOccupierNotes.sendKeys("SoleOccupier Test Automation");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NextBtn);
		//NextBtn.click();
	}

	public void FillSPDTelePhoneReinstatement()throws InterruptedException{
		manageFluientWait(ActionDetails);
		ActionDetails.isDisplayed();
		Reinstatement.isDisplayed();
		SoleOccupierNotes.sendKeys("SoleOccupier Test Automation");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NextBtn);
		//NextBtn.click();
	}

	public void FillSPDTelePhoneMovedOutOFProperty()throws InterruptedException{
		manageFluientWait(ActionDetails);
		ActionDetails.isDisplayed();
		MovedOutofProperty.isDisplayed();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", NextBtn);
		//NextBtn.click();
	}

	public void FillSPDTelePhoneCancellationFinalAction(String chargePayerelationShip)throws InterruptedException{
		manageFluientWait(FinalActionDetails);
		FinalActionDetails.isDisplayed();
		AdditionalActionNotes.sendKeys("Final Action Test Automation");
		Select select = new Select(AwaitingAction);
		select.selectByVisibleText(chargePayerelationShip);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", SaveBtns);
		//js.executeScript("arguments[0].click();", SaveBtns);
		//SaveBtns.click();
		//Thread.sleep(1000000);
	}



	public String ReadIntoConfig(String KeyNameVal,String targetPath) throws InterruptedException, IOException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" +targetPath );
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String keyValue = prop.getProperty(KeyNameVal);
		return keyValue;
	}

	public void VerifyRecordForSPD() throws InterruptedException, IOException {
		Thread.sleep(20000);
		String crmid = ReadIntoConfig("AccountNumber","/config/RunTimeData.properties");
		List<WebElement> headerSize = driver.findElements(By.xpath("//span[@class='ms-DetailsHeader-cellName']"));
		Integer getTblHeaderSize = headerSize.size();
		System.out.println("Table Header Size"+ getTblHeaderSize);
		for(int i=0;i<=getTblHeaderSize;i++)
		{

			String HeaderName = headerSize.get(i).getText();
			if(HeaderName.equals("Account Number"))
			{
				System.out.println(i);
				headerSize.get(i).click();
				WaitForSpecificTime();
				filterBy.click();
				try{
					Thread.sleep(10000);
					driver.findElement(By.xpath("//span[contains(@class,'ms-Checkbox-text') and text()='"+crmid+"']")).click();
				}catch (Exception e){
					manageFluientWaits(InputFilterVal);
					//waits.until(ExpectedConditions.visibilityOf(InputFilterVal));
					InputFilterVal.sendKeys(crmid);
					Thread.sleep(20000);
					InputFilterVal.sendKeys(Keys.ENTER);
				}
				//Thread.sleep(200);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", filterApplyBtn);
				Thread.sleep(10000);
				break;
			}
		}

	}

	public void VerifyRecordForStudentReview() throws InterruptedException, IOException {
		Thread.sleep(20000);
		String crmid = ReadIntoConfig("CallerContactNumber","/config/RunTimeData.properties");
		List<WebElement> headerSize = driver.findElements(By.xpath("//span[@class='ms-DetailsHeader-cellName']"));
		Integer getTblHeaderSize = headerSize.size();
		System.out.println("Table Header Size"+ getTblHeaderSize);
		for(int i=0;i<=getTblHeaderSize;i++)
		{

			String HeaderName = headerSize.get(i).getText();
			if(HeaderName.equals("Caller's Contact Number"))
			{
				System.out.println(i);
				headerSize.get(i).click();
				WaitForSpecificTime();
				filterBy.click();
				try{
					Thread.sleep(10000);
					driver.findElement(By.xpath("//span[contains(@class,'ms-Checkbox-text') and text()='"+crmid+"']")).click();
				}catch (Exception e){
					manageFluientWaits(InputFilterVal);
					//waits.until(ExpectedConditions.visibilityOf(InputFilterVal));
					InputFilterVal.sendKeys(crmid);
					Thread.sleep(20000);
					InputFilterVal.sendKeys(Keys.ENTER);
				}
				//Thread.sleep(200);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", filterApplyBtn);
				Thread.sleep(10000);
				break;
			}
		}

	}

	public void VerifyRecordForCoplaintsAndEscalations() throws InterruptedException, IOException {
		Thread.sleep(20000);
		String crmid = ReadIntoConfig("CallerContactNumberForComplaints","/config/RunTimeData.properties");
		List<WebElement> headerSize = driver.findElements(By.xpath("//span[@class='ms-DetailsHeader-cellName']"));
		Integer getTblHeaderSize = headerSize.size();
		System.out.println("Table Header Size"+ getTblHeaderSize);
		for(int i=0;i<=getTblHeaderSize;i++)
		{

			String HeaderName = headerSize.get(i).getText();
			if(HeaderName.equals("Contact Number"))
			{
				System.out.println(i);
				headerSize.get(i).click();
				WaitForSpecificTime();
				filterBy.click();
				try{
					Thread.sleep(10000);
					driver.findElement(By.xpath("//span[contains(@class,'ms-Checkbox-text') and text()='"+crmid+"']")).click();
				}catch (Exception e){
					manageFluientWaits(InputFilterVal);
					//waits.until(ExpectedConditions.visibilityOf(InputFilterVal));
					InputFilterVal.sendKeys(crmid);
					Thread.sleep(20000);
					InputFilterVal.sendKeys(Keys.ENTER);
				}
				//Thread.sleep(200);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", filterApplyBtn);
				Thread.sleep(10000);
				break;
			}
		}

	}

	public void manageFluientWaits(WebElement element){
		WebElement waitFluent=null;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(java.time.Duration.ofSeconds(300))
				.pollingEvery(Duration.ofMillis(50))
				.ignoring(NoSuchElementException.class);
		WebElement elements = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement elements = element;
				String getTextOnPage = elements.getText();
				if(elements.isDisplayed()){
					System.out.println(getTextOnPage);
					return element;
				}
				return elements;
			}
		});
	}

	public void noRecordsFoundMessage()throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(noRecordFoundMessage));
		noRecordFoundMessage.isDisplayed();
	}

	public void PSAInfoData()throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(PSAInfoDataLink));
		PSAInfoDataLink.click();
	}

	public void SaveBtn()throws InterruptedException{
			SaveBtn.click();
	}
	public void EditPropertiesLink()throws InterruptedException{
			driver.switchTo().defaultContent();
			EditPropertiesLink.click();
	}

	public void VerifyRecords(String CRM) throws InterruptedException {
		List<WebElement> recordsVerify = null;
		Boolean flag=false;
		//Thread.sleep(10000);
		try{
			recordsVerify = driver.findElements(By.xpath("//div[@class='ms-List-cell']"));
		}catch (Exception e){
			System.out.println("We don't have multiple records");
		}
		if(!(recordsVerify==null)) {
			for (int i = 1; i <= recordsVerify.size(); i++) {
				WebElement recordClick = driver.findElement(By.xpath("((//div[@class='ms-List-cell'])[" + i + "]//following-sibling::div//div[1])[1]//button"));
				Thread.sleep(5000);
				recordClick.click();
				Thread.sleep(5000);
				WebDriverWait wait = new WebDriverWait(driver, 50);
				wait.until(ExpectedConditions.visibilityOf(CRMForWriteBack));
				String tbodyExist = CRMForWriteBack.getText().trim();
				if(tbodyExist.equalsIgnoreCase(CRM.trim())){
					flag=true;
					driver.navigate().back();
					Thread.sleep(5000);
				}else {
					Assert.fail("Failed with CRM Number miss match");
				}
			}
		}else {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(CRMForWriteBack));
			String tbodyExist = CRMForWriteBack.getText().trim();
			if(tbodyExist.equalsIgnoreCase(CRM.trim())){
				flag=true;
			}else {
				Assert.fail("Failed with CRM Number miss match");
			}
		}
	}


	public void NewCardFillForm() throws Exception{
		SPDPageObject SPDPageObject = new SPDPageObject();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(titleCardName));
		String title = SPDPageObject.getDatafromInfoPortalProperties("title");
		titleCardName.sendKeys(title);
		String restUrl = SPDPageObject.getDatafromInfoPortalProperties("resturl");
		RestUrl.sendKeys(restUrl);
		String onerecordurl = SPDPageObject.getDatafromInfoPortalProperties("onerecordurl");
		OneRecordUrl.sendKeys(onerecordurl);
		String morethanonerecord = SPDPageObject.getDatafromInfoPortalProperties("morethanonerecord");
		MoreThanOneRecord.sendKeys(morethanonerecord);
		String imageurl = SPDPageObject.getDatafromInfoPortalProperties("imageurl");
		imageUrl.sendKeys(imageurl);
	}
	public void iSaveBtn() {
		try {
			saveManagerBtn.click();
			Thread.sleep(8000);
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}

	}

	public void manageFluientWait(WebElement element){
		WebElement waitFluent=null;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(java.time.Duration.ofSeconds(700))
				.pollingEvery(Duration.ofMillis(50))
				.ignoring(NoSuchElementException.class);
		WebElement elements = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement elements = element;
				String getTextOnPage = elements.getText();
				if(elements.isDisplayed()){
					System.out.println(getTextOnPage);
					return element;
				}
				return elements;
			}
		});
	}



	public void UpdateTheBidTitle(String changeTitleName){
		try{
			bidTitle.clear();
			bidTitle.sendKeys(changeTitleName);

		}catch (Exception e){
			e.printStackTrace();

		}
	}

	public void copyDocument()throws InterruptedException{
			copyDocument.click();
	}

	public void  SelectCrmId() throws InterruptedException, IOException {
		//Dropdown dropdown = new Dropdown();
		//dropdown.selectValueFromUnorderedList((WebElement) driver,val);
		Thread.sleep(20000);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String crmId = prop.getProperty("CRMID");
		Select bidmanager = new Select(this.crmIdDropDown);
		bidmanager.selectByVisibleText(crmId);
		Thread.sleep(5000);


	}

	public void CopyDocumentBtn()throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", copyBtn);
		    Thread.sleep(5000);

	}

	public void waitTillMsgDisply() throws InterruptedException {
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(DlgFrame);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(CopySuccessFulMsg));
		Thread.sleep(5000);
	}
	public void destinationLink()throws InterruptedException{
			/*JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", destinationBidLink);*/
		    destinationBidLink.click();
		    Thread.sleep(20000);
		    driver.switchTo().defaultContent();
	}

public void clickOnBIdMangerSelection(String titleName) throws InterruptedException {
			System.out.println("titleName......>"+titleName);
			driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
			WebElement slectCheckbox = driver.findElement(By.xpath("(//button[contains(@class,'ms-Link titleField') and @title='"+titleName+"'])[1]//preceding::div[contains(@class,'ms-Check root')][1]"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", slectCheckbox);
}

public void editMenuBar()throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(editMenu));
			editMenu.click();
}

	public void deleteBidManager()throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(deleteBidManager));
			deleteBidManager.click();

	}

	public void deleteConfirmBtn()throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(deleteConfirmBtn));
			deleteConfirmBtn.click();
	}

	public void confirmDeletMessage()throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(deletedMsg));
	}

	public void verifyEditTitleName(String bidName)throws InterruptedException{
			Thread.sleep(5000);
			WebElement updatedElemnt = driver.findElement(By.xpath("//button[@title='"+bidName+"' and text()='"+bidName+"']"));
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(updatedElemnt));
			Assert.assertTrue(updatedElemnt.isDisplayed());

	}

	public void SelectBidCreated(String bidName)throws InterruptedException{
		Thread.sleep(5000);
		WebElement updatedElemnt = driver.findElement(By.xpath("//button[@title='"+bidName+"' and text()='"+bidName+"']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(updatedElemnt));
		Assert.assertTrue(updatedElemnt.isDisplayed());

	}


	public void VerifyDocumentStatus() throws  InterruptedException{
		driver.manage().timeouts().pageLoadTimeout(30, SECONDS);
		List<WebElement> tblHeader = driver.findElements(By.xpath("(//table//thead/tr/th)"));
		for(int i=0;i<tblHeader.size();i++){
			String status = tblHeader.get(i).getText().trim();
			System.out.println("status "+ status);
			if(status.equalsIgnoreCase("Document Group")){
				WebElement docuStatuswebElement = driver.findElement(By.xpath("(//table//thead//tr//th//following::tbody[1]/tr/td)["+(i+1)+"]"));
				String docstatus = docuStatuswebElement.getText().trim();
				System.out.println("docstatus "+ status);
				if(docstatus.equalsIgnoreCase("Final Submission")){
						Assert.assertTrue(docuStatuswebElement.isDisplayed());
						break;
					}else{
						Assert.fail("Document Status not in Final Status");
					}
			}
		}
}

	public void SelectAutoGeneratedBidID() throws InterruptedException, IOException {
		Thread.sleep(10000);
		driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String bidNumber = prop.getProperty("BidId");
		WebElement slectCheckbox = driver.findElement(By.xpath("//*[text()='"+bidNumber+"']//preceding::div[@role='checkbox' and @aria-checked='false' ][1]"));
		//slectCheckbox.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", slectCheckbox);
		Thread.sleep(2000);
	}

	public void SelectRestrictedAutoGeneratedBidID() throws InterruptedException, IOException {
		Thread.sleep(10000);
		driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String bidNumber = prop.getProperty("RestrcitedBidId");
		WebElement slectCheckbox = driver.findElement(By.xpath("//*[text()='"+bidNumber+"']//preceding::div[@role='checkbox' and @aria-checked='false' ][1]"));
		//slectCheckbox.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", slectCheckbox);
		Thread.sleep(2000);
	}

	public void SelectFinalBidSubmission() throws InterruptedException, IOException {
		Thread.sleep(10000);
		driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String bidNumber = prop.getProperty("BidFinalSubmission");
		WebElement slectCheckbox = driver.findElement(By.xpath("//*[text()='"+bidNumber+"']//preceding::div[@role='checkbox' and @aria-checked='false' ][1]"));
		//slectCheckbox.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", slectCheckbox);

	}

	public void clickOnBidRecord() throws InterruptedException, IOException {
		try {
			Thread.sleep(10000);
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String bidNumber = prop.getProperty("BidId");
			System.out.println("bid*************** "+bidNumber);
			fileInputStream.close();
			WebElement bidNumberExist = driver.findElement(By.xpath("//a[text()='"+ bidNumber +"']"));
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(bidNumberExist));
			bidNumberExist.click();
		}catch (Exception e){

			e.printStackTrace();
		}
	}

	public void clickOnBidForSearchAttachMentContent() throws InterruptedException, IOException {
		try {
			Thread.sleep(10000);
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String bidNumber = prop.getProperty("BidNumberForSearch");
			System.out.println("bid*************** "+bidNumber);
			fileInputStream.close();
			WebElement bidNumberExist = driver.findElement(By.xpath("//a[text()='"+ bidNumber +"']"));
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(bidNumberExist));
			bidNumberExist.click();
		}catch (Exception e){

			e.printStackTrace();
		}
	}

	public boolean isCheckOutVerify() throws Exception{
		boolean moreBtnEnabled=false;
		try{
			  moreBtnEnabled = moreBtn.isEnabled();
			if(moreBtnEnabled){
				moreBtnEnabled=true;
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", moreBtn);
				Thread.sleep(2000);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		finally {
			return moreBtnEnabled;
		}
	}

	public boolean isAdvanceMenu() throws Exception{
		try {


			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", advanceMenuOption);
			//advanceMenuOption.click();
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public boolean isDeleteOption() throws Exception{
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", deleteMenuOption);
			Thread.sleep(2000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}


	public boolean isCheckInAndCheckOut() throws Exception{
		try {
			Thread.sleep(5000);
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("arguments[0].click();", checkInAndCheckOut);
			checkInAndCheckOut.click();
			Thread.sleep(2000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public void isSearchContentChecked() throws Exception{
		try{
			Thread.sleep(5000);
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
			prop.load(ip);
			String docName = prop.getProperty("InsideBidContentSearch");
			insideBidCreation.sendKeys( docName);
			Thread.sleep(5000);
			insideBidCreation.sendKeys(Keys.ENTER);
			//SearchMagnifierBtn.click();
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void isSearchBidRecordKeyContent() throws Exception{
		try{
			Thread.sleep(5000);
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
			prop.load(ip);
			String docName = prop.getProperty("InsideBidContentSearch");
			BidRecordKeyContent.sendKeys(docName);
			Thread.sleep(2000);
			BidRecordKeyContent.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}




	public void isSearchContentKey() throws Exception{
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		try{
			Thread.sleep(5000);

			String docName = prop.getProperty("BidListKey");
			SearchAsKey.sendKeys( docName);
			SearchAsKey.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
		finally {
			ip.close();
		}
	}

	public boolean isSharebtnDisplay() throws Exception{
		boolean chkbtn=false;
		try{
			Thread.sleep(10000);
			shareBtnDispay.isDisplayed();
			shareBtnDispay.click();
			chkbtn=true;
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return chkbtn;
	}


	public void isAddSenderName(String Name) throws InterruptedException {
		this.enterSenderName.sendKeys(Name);
		Thread.sleep(5000);
		this.enterSenderName.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	public boolean isSendBtn() throws Exception{
		boolean sendBtnEnabled = false;
		try {
			 sendBtnEnabled=this.sendRecepientBtn.isDisplayed();
			 this.sendRecepientBtn.click();
		}catch (Exception e){
			e.printStackTrace();
		}
		return sendBtnEnabled;
	}

	public boolean isShareNotification() throws Exception{
		boolean shareNotifiaction = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(shareNotificatioDisplay));
			shareNotifiaction=this.shareNotificatioDisplay.isDisplayed();
		}catch (Exception e){
			e.printStackTrace();
		}
		return shareNotifiaction;
	}


	public boolean isCheckOutExistOrNot() throws Exception{
		Boolean CheckOutOption= false;
		try{
			WebDriverWait wait = new WebDriverWait(driver, 60 /*timeout in seconds*/);
			if(wait.until(ExpectedConditions.alertIsPresent())!=null) {
				System.out.println("alert  present");
				Alert alert = driver.switchTo().alert();
				String alertMsg =alert.getText();
				System.out.println("*************************************************"+alertMsg);
				alert.accept();
				CheckOutOption= true;
				Thread.sleep(10000);
			}else{
				System.out.println("alert was present");
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return CheckOutOption;
	}

	public boolean isCheckInPopupIsExist() throws Exception{
		Boolean checkIn= false;
		try{
			Thread.sleep(2000);
			CheckInComments.sendKeys("TestCheckIn");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", checkInBtnOk);
			Thread.sleep(5000);
			checkIn=true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return checkIn;
	}

	public void clickOnBidRecordForShare() throws InterruptedException, IOException {
		try {
			Thread.sleep(10000);
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String bidNumber = prop.getProperty("BidId");
			System.out.println("bid*************** "+bidNumber);
			fileInputStream.close();
			WebElement bidNumberExist = driver.findElement(By.xpath("//a[text()='"+ bidNumber +"']//preceding::div[@role='checkbox'][1]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", bidNumberExist);
			//bidNumberExist.click();
		}catch (Exception e){

			e.printStackTrace();
		}
	}



	public String  fullPermission() throws Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		//String Username = prop.getProperty("fullPermissionUseName");
		//String pwd  =  prop.getProperty("fullPermissionPwd");
		//String url = prop.getProperty("urlPermission");
		String url = "http://tc3-v-devsp05/SitePages/PSAInformationPortal.aspx";
		String Url = url;
		return Url;
	}

	public String TestUser() throws  Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		//String Username = prop.getProperty("testUsername");
		//String pwd  =  prop.getProperty("testPwd");
		//String url = prop.getProperty("urlPermission");
		String url = "http://tc3-v-devsp05/SitePages/PSAInformationPortal.aspx";
		String Url = url;
		return Url;
	}

	public String  contactApplication() throws Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		String Username = prop.getProperty("fullPermissionUseName");
		String pwd  =  prop.getProperty("fullPermissionPwd");
		String url = prop.getProperty("url");
		String Url = "http://" + Username + ":" + pwd + "@" + url;
/*


		String Username = prop.getProperty("fullPermissionUseName");
		String pwd  =  prop.getProperty("fullPermissionPwd");
		String url = prop.getProperty("urlPermission");
		String url = "http://parmeshwar.sakole:Maahi@123456789+"+@+"+tc3-v-devsp05/sites/ProcessingServices/Lists/SPDTelephoneRecord/AllItems.aspx";
		String Url = url;*/
		return Url;
	}

	public String  InvoiceBillingRequestApplication() throws Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		//String Username = prop.getProperty("fullPermissionUseName");
		//String pwd  =  prop.getProperty("fullPermissionPwd");
		//String url = prop.getProperty("urlPermission");
		String url = "http://parmeshwar.sakole:Maahi@123456789@tc3-v-devsp05/sites/ProcessingServices/Lists/SPDTelephoneRecord/AllItems.aspx";
		String Url = url;
		return Url;
	}


	public String  BidPortalRequestApplication() throws Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		//String Username = prop.getProperty("fullPermissionUseName");
		//String pwd  =  prop.getProperty("fullPermissionPwd");
		//String url = prop.getProperty("urlPermission");
		String url = "http://tc3-v-devsp05:8888/Bid%20List/Forms/StandardSecurityView.aspx";
		String Url = url;
		return Url;
	}

	public String  writeBackRequestApplication() throws Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		//String Username = prop.getProperty("fullPermissionUseName");
		//String pwd  =  prop.getProperty("fullPermissionPwd");
		//String url = prop.getProperty("urlPermission");
		String url = "http://tc3-v-devsp05/sites/InvoicesPortal/Lists/WriteBackRequest/AllItems.aspx";
		String Url = url;
		return Url;
	}



}

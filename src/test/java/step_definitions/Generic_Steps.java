package step_definitions;

import com.aventstack.extentreports.Status;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageobjects.BidManagerCreationPage;
import pageobjects.SPDPageObject;
import pageobjects.HomePage;


import java.io.*;

public class Generic_Steps extends BaseClass {
	SPDPageObject SPDPageObject = new SPDPageObject();
	HomePage homepage = new HomePage();



	SPDPageObject createnewbidpage;
	public String SubmissonDate;

	SoftAssert sa;

	@Given("^I have logged in full permission user model (.*)$")
	public void iHaveLoggedInFullPermissionUserModel(String AdminRights) throws Exception {
		String permission= "AdminRights";
		try {
			if(permission.equals(AdminRights.trim())){
				String Url = SPDPageObject.fullPermission();
				driver.manage().deleteAllCookies();
				driver.get(Url);
//				driver.get("https://tc3-v-devsp05:8888/Lists/Bid%20Managers/AllItems.aspx");
				Thread.sleep(15000);
				System.out.println("============="+ "if conditon");
			}else {
				String Url = SPDPageObject.TestUser();
				driver.get(Url);
//				driver.get("https://tc3-v-devsp05:8888/Lists/Bid%20Managers/AllItems.aspx");
				System.out.println("============="+ "else conditon");
			}
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			//Thread.sleep(10000);
			HomePage homepage = new HomePage();
			sa = new SoftAssert();
			test = rep.createTest("Testing...");
			String expectedtitle = "BidPortal - Bid Managers - All Items";
			String actualtitle = homepage.getPageTitle();
			System.out.println("actualtitle = " + actualtitle);
			sa.assertEquals(actualtitle, expectedtitle);
			test.log(Status.INFO, "Expected title = " + expectedtitle);
			test.log(Status.INFO, "Actual title = " + actualtitle);
			if (expectedtitle.equals(actualtitle)) {
				test.log(Status.PASS, "Expected and Actual title is a match");
			} else {
				test.log(Status.FAIL, "Expected and Actual title does NOT match");
			}
		}

	}



	@And("^Card should be get created$")
	public void iCarVerify() throws InterruptedException, IOException {
		SPDPageObject.checkPSAInfoPortalCreation();
		String CRMNumber = SPDPageObject.getData("CRMID");
		SPDPageObject.setCRMNumber(CRMNumber);
		SPDPageObject.submitBtnClick();
		Assert.assertTrue(SPDPageObject.CardNameVerify(),"Card Verification");
	}

	@And("^I Verify the PSA Information Seacrh CRM Number$")
	public void iNavigateToPSAInformation() throws InterruptedException, IOException {
		SPDPageObject.checkPSAInfoPortalCreation();
		String CRMNumber = SPDPageObject.getData("CRMID");
		SPDPageObject.setCRMNumber(CRMNumber);
		SPDPageObject.submitBtnClick();

	}

	@And("^I Verify the PSA Information Seacrh CRM Number as Invalid$")
	public void iNavigateToPSAInformationInvalid() throws InterruptedException, IOException {
		SPDPageObject.checkPSAInfoPortalCreation();
		SPDPageObject.setCRMNumber("test1232022");
		SPDPageObject.submitBtnClick();

	}

	@And("^I have Save the CRM Number into config file$")
	public void SaveTheCRMNumber() throws Exception {
		SPDPageObject.isCRMNumberExistAndSave();
	}

	@And("^I navigate to the site content menu$")
	public void SiteContentMenu() throws Exception {
		SPDPageObject.sitecontent();

	}

	@And("^I navigate to the SPDTelePhone menu$")
	public void SPDTelePhoneRecord() throws Exception {
		SPDPageObject.SPDTelePhoneRecord();

	}

	@And("^I navigate to the EPRTelePhone menu$")
	public void EPRTelePhoneRecord() throws Exception {
		SPDPageObject.EPRTelePhoneRecord();

	}

	@And("^I navigate to the Student review menu$")
	public void studentReview() throws Exception {
		SPDPageObject.StudentReview();

	}

	@And("^I navigate to the Complaints & Escalations menu$")
	public void ComplaintsAndEscalations() throws Exception {
		SPDPageObject.Complaints_Escalations();

	}

	@And("^I navigate to the General Document store menu$")
	public void GeneralDocumentstore() throws Exception {
		SPDPageObject.generalDocumentStore();

	}

	@And("^I verify the SPD Telephone record page$")
	public void SPDTelePhoneRecordPage() throws Exception {
		SPDPageObject.SPDTelePhoneRecordPage();

	}
	@And("^I verify the EPR Telephone record page$")
	public void EPRTelePhoneRecordPage() throws Exception {
		SPDPageObject.EPRTelePhoneRecordPage();

	}

	@And("^I verify the Student Review record page$")
	public void StudentReviewRecordPage() throws Exception {
		SPDPageObject.StudentReviewRecordPage();

	}

	@And("^I verify the Complaints & Escalations record page$")
	public void ComplaintsEscalationsRecordPage() throws Exception {
		SPDPageObject.ComplaintsEscalationsRecordPage();

	}

	@And("^I verify the General Document store record page$")
	public void GeneralDocumentstoreRecordPage() throws Exception {
		SPDPageObject.GeneralDocumentStoreRecordPage();

	}

	@And("^I click on the Create button$")
	public void CreateButton() throws Exception {
		SPDPageObject.CreateButtonCLick();

	}

	@And("^I click on the New button$")
	public void NewButton() throws Exception {
		SPDPageObject.NewuttonCLick();

	}

	@And("^Enter the folder name and click on Save button$")
	public void newFolderName() throws Exception {
		SPDPageObject.NewFolderName();

	}



	@And("^Fill the SPD Telephone record and choose actions as (.*) and (.*) and Save it$")
	public void FillSPDTelePhoneRecord(String chooseActions,String councils) throws Exception {
		SPDPageObject.FillSPDTelePhoneRecord(chooseActions,councils);
	}

	@And("^Fill the EPR Telephone record and choose actions as (.*) and (.*) and Save it$")
	public void FillEPRTelePhoneRecord(String chooseActions,String councils) throws Exception {
		SPDPageObject.FillEPRTelePhoneRecord(chooseActions,councils);
	}

	@And("^Fill the Student Review record and choose actions as (.*) and (.*) and Save it$")
	public void FillStudentReviewRecord(String chooseActions,String councils) throws Exception {
		SPDPageObject.FillStudentReviewRecord(chooseActions,councils);
	}

	@And("^Fill the Complaints and Escalations Review record and Awating action is as (.*)$")
	public void FillComplaintsAndEscalationsRecord(String AwaitingActions) throws Exception {
		SPDPageObject.FillComplaintsAndEscaltionsRecord(AwaitingActions);
	}

	@And("^Fill the Cancellation action and ChargePayer realtionship is as (.*)$")
	public void FillCancellation(String chargePayerRelationShip) throws Exception {
		SPDPageObject.FillSPDTelePhoneCancellation(chargePayerRelationShip);
	}

	@And("^Fill the Occupied action$")
	public void FillOccupied() throws Exception {
		SPDPageObject.FillEPRTelePhoneOccupied();
	}

	@And("^Fill the Tenant details action$")
	public void FillTenantDetails() throws Exception {
		SPDPageObject.FillEPRTelePhoneTenantDetails();
	}

	@And("^Fill the DisRegard action and ChargePayer realtionship is as (.*)$")
	public void FillDisRegard(String chargePayerRelationShip) throws Exception {
		SPDPageObject.FillSPDTelePhoneDisRegard(chargePayerRelationShip);
	}

	@And("^Fill the Sole Occupier action$")
	public void FillSoleOccupier() throws Exception {
		SPDPageObject.FillSPDTelePhoneSoleOccupier();
	}

	@And("^Fill the Reinstatement action$")
	public void FillReinstatement() throws Exception {
		SPDPageObject.FillSPDTelePhoneReinstatement();
	}

	@And("^Fill the Moved Out of Property action$")
	public void FillMovedOutofProperty() throws Exception {
		SPDPageObject.FillSPDTelePhoneMovedOutOFProperty();
	}

	@And("^Fill the Final action along with notes and awaiting action as (.*)$")
	public void FinalAction(String awatingaction) throws Exception {
		SPDPageObject.FillSPDTelePhoneCancellationFinalAction(awatingaction);
	}

	@And("^I verify the Raised Request page$")
	public void iVerifyTheBillingRaiseRequestPage() throws InterruptedException, IOException {
		test.log(Status.INFO, "Billing Raise Request home page");
		SPDPageObject.VerifyRecordForSPD();
	}

	@And("^I verify the Raised Request page for Student Review$")
	public void iVerifyTheBillingRaiseRequestPageStudentReview() throws InterruptedException, IOException {
		test.log(Status.INFO, "Billing Raise Request home page");
		SPDPageObject.VerifyRecordForStudentReview();
	}

	@And("^I verify the Raised Request page for Complaints And Escaltions$")
	public void iVerifyTheBillingRaiseRequestPageComplaintsAndEscaltions() throws InterruptedException, IOException {
		test.log(Status.INFO, "Complaints And Escaltions Raise request page");
		SPDPageObject.VerifyRecordForCoplaintsAndEscalations();
	}


	@And("^I click on PSAInfoPortalData link$")
	public void PSAInfoPortatData() throws Exception {
		SPDPageObject.PSAInfoData();

	}

	@And("^I verify the number of records$")
	public void verifyTheRecords() throws Exception {
		SPDPageObject.isRecordsExist();
	}

	@And("^I verify the number of records for (.*)$")
	public void verifyTheRecords(String endpointUrl) throws Exception {
		SPDPageObject.isRecordsExistWithUrl(endpointUrl);
	}

	@And("^I verify the no records found message$")
	public void verifyTheNoRecords() throws Exception {
		SPDPageObject.noRecordsFoundMessage();
	}

	@And("^I Navigate and switch the window to Record$")
	public void iNavigateAndSwitchTheWindowToBidListRecord() throws InterruptedException {
		SPDPageObject.switchWindow();
	}

	@And("^I create the New Card filling with form details$")
	public void iNewCardFillForm() throws Exception {
		SPDPageObject.NewCardFillForm();
	}

	@And("^I click on Save button$")
	public void iSaveBtn() throws Exception {
		SPDPageObject.iSaveBtn();
	}


	@Given("I click on Create New button for Card Creation")
	public void CreateBidManager(){
		try {
			BidManagerCreationPage bidManager = new BidManagerCreationPage();
			test.log(Status.INFO, "Browser used: " + "");
			bidManager.clickNewBidManagerButton();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@And("^Verify the Multiple CRM if exist$")
	public void iVerifyMultipleCRM() throws InterruptedException, IOException {
		String CRMNumber = SPDPageObject.getData("CRMID");
		SPDPageObject.VerifyRecords(CRMNumber);
	}

	@And("^I verify the CRM Reference Number and respective details$")
	public void VerifyTheListOrSingleRecord() throws Exception {
		Assert.assertTrue(SPDPageObject.SearchContentCRMDisplay(),"Verifiaction CRM Number");
	}


	@And ("^Navigate to the SPD site (.*)$")
	public void LoginToContractApplications(String AdminRights) throws Exception {
		String permission = "AdminRights";
		try {
			if (permission.equals(AdminRights.trim())) {
				String Url = SPDPageObject.contactApplication();

				//driver.manage().deleteAllCookies();
				driver.get(Url);

//				driver.get("https://tc3-v-devsp05:8888/Lists/Bid%20Managers/AllItems.aspx");
				Thread.sleep(15000);
				//String urls= driver.getTitle();
				driver.findElement(By.xpath("//title")).sendKeys(Keys.F5);
				//driver.navigate().to(driver.findElements(By.xpath("//title")).se);
			//	driver.navigate().refresh();
				System.out.println("=============" + "if conditon");
			} else {
				String Url = SPDPageObject.contactApplication();
				driver.get(Url);
//				driver.get("https://tc3-v-devsp05:8888/Lists/Bid%20Managers/AllItems.aspx");
				System.out.println("=============" + "else conditon");
				driver.navigate().refresh();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//Thread.sleep(10000);
			HomePage homepage = new HomePage();
			sa = new SoftAssert();
			test = rep.createTest("Testing...");
			String expectedtitle = "BidPortal - Bid Managers - All Items";
			String actualtitle = homepage.getPageTitle();
			System.out.println("actualtitle = " + actualtitle);
			sa.assertEquals(actualtitle, expectedtitle);
			test.log(Status.INFO, "Expected title = " + expectedtitle);
			test.log(Status.INFO, "Actual title = " + actualtitle);
			if (expectedtitle.equals(actualtitle)) {
				test.log(Status.PASS, "Expected and Actual title is a match");
			} else {
				test.log(Status.FAIL, "Expected and Actual title does NOT match");
			}
		}

	}


	@And ("^Navigate to the InvoiceBillingRequest site to fetch the CRM Number (.*)$")
	public void LoginToInvoiceBillingRequestApplications(String AdminRights) throws Exception {
		String permission = "AdminRights";
		try {
			if (permission.equals(AdminRights.trim())) {
				String Url = SPDPageObject.InvoiceBillingRequestApplication();
				driver.get(Url);
//				driver.get("https://tc3-v-devsp05:8888/Lists/Bid%20Managers/AllItems.aspx");
				Thread.sleep(15000);
				System.out.println("=============" + "if conditon");
			} else {
				String Url = SPDPageObject.InvoiceBillingRequestApplication();
				driver.get(Url);
//				driver.get("https://tc3-v-devsp05:8888/Lists/Bid%20Managers/AllItems.aspx");
				System.out.println("=============" + "else conditon");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//Thread.sleep(10000);
			HomePage homepage = new HomePage();
			sa = new SoftAssert();
			test = rep.createTest("Testing...");
			String expectedtitle = "BidPortal - Bid Managers - All Items";
			String actualtitle = homepage.getPageTitle();
			System.out.println("actualtitle = " + actualtitle);
			sa.assertEquals(actualtitle, expectedtitle);
			test.log(Status.INFO, "Expected title = " + expectedtitle);
			test.log(Status.INFO, "Actual title = " + actualtitle);
			if (expectedtitle.equals(actualtitle)) {
				test.log(Status.PASS, "Expected and Actual title is a match");
			} else {
				test.log(Status.FAIL, "Expected and Actual title does NOT match");
			}
		}

	}

	@And ("^Navigate to the WriteBackRequest site to fetch the CRM Number (.*)$")
	public void LoginToWriteBackRequestApplications(String AdminRights) throws Exception {
		String permission = "AdminRights";
		try {
			if (permission.equals(AdminRights.trim())) {
				String Url = SPDPageObject.writeBackRequestApplication();
				driver.get(Url);
//				driver.get("https://tc3-v-devsp05:8888/Lists/Bid%20Managers/AllItems.aspx");
				Thread.sleep(15000);
				System.out.println("=============" + "if conditon");
			} else {
				String Url = SPDPageObject.writeBackRequestApplication();
				driver.get(Url);
//				driver.get("https://tc3-v-devsp05:8888/Lists/Bid%20Managers/AllItems.aspx");
				System.out.println("=============" + "else conditon");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//Thread.sleep(10000);
			HomePage homepage = new HomePage();
			sa = new SoftAssert();
			test = rep.createTest("Testing...");
			String expectedtitle = "BidPortal - Bid Managers - All Items";
			String actualtitle = homepage.getPageTitle();
			System.out.println("actualtitle = " + actualtitle);
			sa.assertEquals(actualtitle, expectedtitle);
			test.log(Status.INFO, "Expected title = " + expectedtitle);
			test.log(Status.INFO, "Actual title = " + actualtitle);
			if (expectedtitle.equals(actualtitle)) {
				test.log(Status.PASS, "Expected and Actual title is a match");
			} else {
				test.log(Status.FAIL, "Expected and Actual title does NOT match");
			}
		}

	}


	@And ("^Navigate to the BidPortalRequest site to fetch the CRM Number (.*)$")
	public void LoginToBidPortalRequestApplications(String AdminRights) throws Exception {
		String permission = "AdminRights";
		try {
			if (permission.equals(AdminRights.trim())) {
				String Url = SPDPageObject.BidPortalRequestApplication();
				driver.get(Url);
//				driver.get("https://tc3-v-devsp05:8888/Lists/Bid%20Managers/AllItems.aspx");
				Thread.sleep(15000);
				System.out.println("=============" + "if conditon");
			} else {
				String Url = SPDPageObject.BidPortalRequestApplication();
				driver.get(Url);
//				driver.get("https://tc3-v-devsp05:8888/Lists/Bid%20Managers/AllItems.aspx");
				System.out.println("=============" + "else conditon");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//Thread.sleep(10000);
			HomePage homepage = new HomePage();
			sa = new SoftAssert();
			test = rep.createTest("Testing...");
			String expectedtitle = "BidPortal - Bid Managers - All Items";
			String actualtitle = homepage.getPageTitle();
			System.out.println("actualtitle = " + actualtitle);
			sa.assertEquals(actualtitle, expectedtitle);
			test.log(Status.INFO, "Expected title = " + expectedtitle);
			test.log(Status.INFO, "Actual title = " + actualtitle);
			if (expectedtitle.equals(actualtitle)) {
				test.log(Status.PASS, "Expected and Actual title is a match");
			} else {
				test.log(Status.FAIL, "Expected and Actual title does NOT match");
			}
		}

	}


}

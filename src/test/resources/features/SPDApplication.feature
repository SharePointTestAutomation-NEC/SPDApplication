@TestSPDApplication
Feature: Verify inputs fields of SPD application.
  I want to verify if the SPD application  details.

  Background:
    #Given I have logged into SPD application

  @TC01_SPD_Telephone_Record_WithCancellation
  Scenario Outline: Raise the request for SPD telephone record
    Given Navigate to the SPD site AdminRights
    And   I navigate to the SPDTelePhone menu
    And   I verify the SPD Telephone record page
    And   I click on the Create button
    And   Fill the SPD Telephone record and choose actions as <ChooseActions> and <counclis> and Save it
    And   Fill the Cancellation action and ChargePayer realtionship is as <RelationsShipChargePayer>
    And   Fill the Final action along with notes and awaiting action as <AwaitingAction>
    Then  I verify the Raised Request page
    Examples:
      |ChooseActions|counclis|RelationsShipChargePayer|AwaitingAction|
      |Cancellation|Darlington 2020|Mother|Yes|

  @TC02_SPD_Telephone_Record_With_Disregard
  Scenario Outline: Raise the request for SPD telephone record
    Given Navigate to the SPD site AdminRights
    And   I navigate to the SPDTelePhone menu
    And   I verify the SPD Telephone record page
    And   I click on the Create button
    And   Fill the SPD Telephone record and choose actions as <ChooseActions> and <counclis> and Save it
    And   Fill the DisRegard action and ChargePayer realtionship is as <RelationsShipChargePayer>
    And   Fill the Final action along with notes and awaiting action as <AwaitingAction>
    Then  I verify the Raised Request page
    Examples:
      |ChooseActions|counclis|RelationsShipChargePayer|AwaitingAction|
      |Disregard|Darlington 2020|Mother|Yes|


  @TC03_SPD_Telephone_Record_With_SoleOccupier
  Scenario Outline: Raise the request for SPD telephone record
    Given Navigate to the SPD site AdminRights
    And   I navigate to the SPDTelePhone menu
    And   I verify the SPD Telephone record page
    And   I click on the Create button
    And   Fill the SPD Telephone record and choose actions as <ChooseActions> and <counclis> and Save it
    And   Fill the Sole Occupier action
    And   Fill the Final action along with notes and awaiting action as <AwaitingAction>
    Then  I verify the Raised Request page
    Examples:
      |ChooseActions|counclis|AwaitingAction|
      |Sole Occupier (Verify)|Darlington 2020|Yes|

  @TC04_SPD_Telephone_Record_With_Reinstatement
  Scenario Outline: Raise the request for SPD telephone record
    Given Navigate to the SPD site AdminRights
    And   I navigate to the SPDTelePhone menu
    And   I verify the SPD Telephone record page
    And   I click on the Create button
    And   Fill the SPD Telephone record and choose actions as <ChooseActions> and <counclis> and Save it
    And   Fill the Reinstatement action
    And   Fill the Final action along with notes and awaiting action as <AwaitingAction>
    Then  I verify the Raised Request page
    Examples:
      |ChooseActions|counclis|AwaitingAction|
      |Reinstatement|Darlington 2020|Yes|

  @TC05_SPD_Telephone_Record_With_Moved_Out_of_Property
  Scenario Outline: Raise the request for SPD telephone record
    Given Navigate to the SPD site AdminRights
    And   I navigate to the SPDTelePhone menu
    And   I verify the SPD Telephone record page
    And   I click on the Create button
    And   Fill the SPD Telephone record and choose actions as <ChooseActions> and <counclis> and Save it
    And   Fill the Moved Out of Property action
    And   Fill the Final action along with notes and awaiting action as <AwaitingAction>
    Then  I verify the Raised Request page
    Examples:
      |ChooseActions|counclis|AwaitingAction|
      |Moved Out of Property|Darlington 2020|Yes|


  @TC06_ERP_Telephone_Record_With_Vacant
  Scenario Outline: Raise the request for SPD telephone record
    Given Navigate to the SPD site AdminRights
    And   I navigate to the EPRTelePhone menu
    And   I verify the EPR Telephone record page
    And   I click on the Create button
    And   Fill the EPR Telephone record and choose actions as <ChooseActions> and <counclis> and Save it
    #And   Fill the Cancellation action and ChargePayer realtionship is as <RelationsShipChargePayer>
    And   Fill the Final action along with notes and awaiting action as <AwaitingAction>
    Then  I verify the Raised Request page
    Examples:
      |ChooseActions|counclis|AwaitingAction|
      |Vacant|Cambridge 2019|Yes|


  @TC07_ERP_Telephone_Record_With_Occupied
  Scenario Outline: Raise the request for SPD telephone record
    Given Navigate to the SPD site AdminRights
    And   I navigate to the EPRTelePhone menu
    And   I verify the EPR Telephone record page
    And   I click on the Create button
    And   Fill the EPR Telephone record and choose actions as <ChooseActions> and <counclis> and Save it
    And   Fill the Occupied action
    And   Fill the Final action along with notes and awaiting action as <AwaitingAction>
    Then  I verify the Raised Request page
    Examples:
      |ChooseActions|counclis|AwaitingAction|
      |Occupied|Cambridge 2019|Yes|


  @TC08_StudentReview
  Scenario Outline: Raise the request for SPD telephone record
    Given Navigate to the SPD site AdminRights
    And   I navigate to the Student review menu
    And   I verify the Student Review record page
    And   I click on the Create button
    And   Fill the Student Review record and choose actions as <ChooseActions> and <counclis> and Save it
    And   Fill the Tenant details action
    And   Fill the Final action along with notes and awaiting action as <AwaitingAction>
    Then  I verify the Raised Request page for Student Review
    Examples:
      |ChooseActions|counclis|AwaitingAction|
      |Portsmouth|Cambridge 2019|Yes|


  @TC09_Complaints_And_Escalations
  Scenario Outline: Raise the request for SPD telephone record
    Given Navigate to the SPD site AdminRights
    And   I navigate to the Complaints & Escalations menu
    And   I verify the Complaints & Escalations record page
    And   I click on the Create button
    And   Fill the Complaints and Escalations Review record and Awating action is as <AwaitingAction>
    Then  I verify the Raised Request page for Complaints And Escaltions
    Examples:
     |AwaitingAction|
      |Yes|

  @TC010_GeneralDocumentStore
  Scenario: Raise the request for SPD telephone record
    Given Navigate to the SPD site AdminRights
    And   I navigate to the General Document store menu
    And   I verify the General Document store record page
    And   I click on the New button
    Then   Enter the folder name and click on Save button

  @TC011_ScopingDocumentStore
  Scenario: Raise the request for SPD telephone record
    Given Navigate to the SPD site AdminRights
    And   I navigate to the General Document store menu
    And   I verify the General Document store record page
    And   I click on the New button
    Then   Enter the folder name and click on Save button





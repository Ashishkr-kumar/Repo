
package com.oracle.xmlns.apps.crmcommon.salesparties.contactservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.oracle.xmlns.adf.svc.types.AmountType;
import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.ChildrenDetailsC;
import com.oracle.xmlns.apps.cdm.foundation.parties.personservice.SampleProductsC;
import com.oracle.xmlns.apps.crmcommon.notes.noteservice.Note;
import com.oracle.xmlns.apps.crmcommon.salesparties.commonservice.PrimaryAddress;
import com.oracle.xmlns.apps.crmcommon.salesparties.commonservice.SalesTeamMember;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSystemReferenceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountSourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountSourceSystemReferenceValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OwnerPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistingCustomerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExistingCustomerFlagLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="NamedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastAssignmentDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LastAssignmentDateTime" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="AssignmentExceptionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesProfileStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxpayerIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfDeath" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DeceasedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaritalStatusEffectiveDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="DeclaredEthnicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredFunctionalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalIncomeAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="HeadOfHouseholdFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HouseholdIncomeAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="HouseholdSize" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalutoryIntroduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RentOrOwnIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificationReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FavoriteContactFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotCallFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DoNotContactFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DoNotEmailFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DoNotMailFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTitleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastContactDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="SalesAffinityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesBuyingRoleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataCloudStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastEnrichmentDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PartyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedWorkPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedMobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedFaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedHomePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassificationCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactIsPrimaryForAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MyBusinessContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/}PrimaryAddress" minOccurs="0"/>
 *         &lt;element name="SalesTeamMember" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/}SalesTeamMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://xmlns.oracle.com/apps/crmCommon/notes/noteService}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonDEO_TeamName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_TeamLead_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Role_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_TeamLead_LOV_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PersonDEO_TeamLead_LOV_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Type_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ContactSource_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Mobile_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PersonDEO_PersonalEmailId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Skype_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ResidenceNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_SpouseName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_SpouseDOB_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Anniversary_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PersonDEO_HighestLevelOfEducation_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_EMailIdOfficial_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_TINNo_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Account_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_DBContact_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PersonDEO_IfOthersThenSpecify_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="PersonDEO_EducationalQualification_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Level_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Username_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Password_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_TotalRewardPoints_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_PasswordReset_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Reference_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_TeamLead2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_TeamLead3_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ResidenceNo_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ResidenceAddress_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Flag_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_VarificationStatus_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Source_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ReferenceContact_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ReferenceContact_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_MobilePhone2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ProductAwareness_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ProductsPRSent_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_PresentationDone_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ProductsHighlyInterestedIn_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_FeedbackOnSolidSurface_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_PricingOfSolidSurface_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_FeedbackOnAcoustic_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_PricingOfAcoustic_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_FeedbackOnStones_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_FeedbackOnOtherProducts_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ReasonOfDecisionMaking_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_RoleKI_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ProductAwareness1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_PresentationDone1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ProductsHighlyInterestedIn1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ReasonOfDecisionMaking1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_PrimaryFormattedAddress_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_MigratedData_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PersonDEO_Notes_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ReferenceName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonDEO_ChildrenDetailsCollection_c" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/}ChildrenDetails_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonDEO_SampleProductsCollection_c" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/}SampleProducts_c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "partyId",
    "partyNumber",
    "sourceSystem",
    "sourceSystemReferenceValue",
    "accountPartyId",
    "accountPartyNumber",
    "accountSourceSystem",
    "accountSourceSystemReferenceValue",
    "accountName",
    "firstName",
    "lastName",
    "lastNamePrefix",
    "middleName",
    "uniqueNameSuffix",
    "contactName",
    "previousLastName",
    "secondLastName",
    "ownerPartyId",
    "ownerPartyNumber",
    "ownerEmailAddress",
    "ownerName",
    "type",
    "existingCustomerFlag",
    "existingCustomerFlagLastUpdateDate",
    "namedFlag",
    "lastAssignmentDate",
    "lastAssignmentDateTime",
    "assignmentExceptionFlag",
    "salesProfileStatus",
    "taxpayerIdentificationNumber",
    "dateOfBirth",
    "placeOfBirth",
    "dateOfDeath",
    "deceasedFlag",
    "gender",
    "maritalStatus",
    "maritalStatusEffectiveDate",
    "declaredEthnicity",
    "preferredFunctionalCurrency",
    "personalIncomeAmount",
    "headOfHouseholdFlag",
    "householdIncomeAmount",
    "householdSize",
    "salutation",
    "salutoryIntroduction",
    "title",
    "academicTitle",
    "initials",
    "rentOrOwnIndicator",
    "certificationLevel",
    "certificationReasonCode",
    "comments",
    "preferredContactMethod",
    "favoriteContactFlag",
    "department",
    "departmentCode",
    "doNotCallFlag",
    "doNotContactFlag",
    "doNotEmailFlag",
    "doNotMailFlag",
    "jobTitle",
    "jobTitleCode",
    "lastContactDate",
    "salesAffinityCode",
    "salesBuyingRoleCode",
    "currencyCode",
    "curcyConvRateType",
    "corpCurrencyCode",
    "dataCloudStatus",
    "lastEnrichmentDate",
    "partyStatus",
    "createdByModule",
    "createdBy",
    "creationDate",
    "lastUpdateDate",
    "lastUpdateLogin",
    "lastUpdatedBy",
    "workPhoneCountryCode",
    "workPhoneAreaCode",
    "workPhoneNumber",
    "workPhoneExtension",
    "formattedWorkPhoneNumber",
    "mobileCountryCode",
    "mobileAreaCode",
    "mobileNumber",
    "mobileExtension",
    "formattedMobileNumber",
    "faxCountryCode",
    "faxAreaCode",
    "faxNumber",
    "faxExtension",
    "formattedFaxNumber",
    "homePhoneCountryCode",
    "homePhoneAreaCode",
    "homePhoneNumber",
    "formattedHomePhoneNumber",
    "emailFormat",
    "emailAddress",
    "classificationCategory",
    "classificationCode",
    "contactIsPrimaryForAccount",
    "nameSuffix",
    "contactUniqueName",
    "recordSet",
    "myBusinessContact",
    "primaryAddress",
    "salesTeamMember",
    "note",
    "personDEOTeamNameC",
    "personDEOTeamLeadC",
    "personDEORoleC",
    "personDEOTeamLeadLOVIdC",
    "personDEOTeamLeadLOVC",
    "personDEOTypeC",
    "personDEOContactSourceC",
    "personDEOMobileC",
    "personDEOPersonalEmailIdC",
    "personDEOSkypeC",
    "personDEOResidenceNumberC",
    "personDEOSpouseNameC",
    "personDEOSpouseDOBC",
    "personDEOAnniversaryC",
    "personDEOHighestLevelOfEducationC",
    "personDEOEMailIdOfficialC",
    "personDEOTINNoC",
    "personDEOAccountC",
    "personDEODBContactC",
    "personDEOIfOthersThenSpecifyC",
    "personDEOEducationalQualificationC",
    "personDEOLevelC",
    "personDEOUsernameC",
    "personDEOPasswordC",
    "personDEOTotalRewardPointsC",
    "personDEOPasswordResetC",
    "personDEOReferenceC",
    "personDEOTeamLead2C",
    "personDEOTeamLead3C",
    "personDEOResidenceNoC",
    "personDEOResidenceAddressC",
    "personDEOFlagC",
    "personDEOVarificationStatusC",
    "personDEOSourceC",
    "personDEOReferenceContactIdC",
    "personDEOReferenceContactC",
    "personDEOMobilePhone2C",
    "personDEOProductAwarenessC",
    "personDEOProductsPRSentC",
    "personDEOPresentationDoneC",
    "personDEOProductsHighlyInterestedInC",
    "personDEOFeedbackOnSolidSurfaceC",
    "personDEOPricingOfSolidSurfaceC",
    "personDEOFeedbackOnAcousticC",
    "personDEOPricingOfAcousticC",
    "personDEOFeedbackOnStonesC",
    "personDEOFeedbackOnOtherProductsC",
    "personDEOReasonOfDecisionMakingC",
    "personDEORoleKIC",
    "personDEOProductAwareness1C",
    "personDEOPresentationDone1C",
    "personDEOProductsHighlyInterestedIn1C",
    "personDEOReasonOfDecisionMaking1C",
    "personDEOPrimaryFormattedAddressC",
    "personDEOMigratedDataC",
    "personDEONotesC",
    "personDEOReferenceNameC",
    "personDEOChildrenDetailsCollectionC",
    "personDEOSampleProductsCollectionC"
})
public class Contact {

    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElement(name = "PartyNumber")
    protected String partyNumber;
    @XmlElementRef(name = "SourceSystem", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSystem;
    @XmlElementRef(name = "SourceSystemReferenceValue", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSystemReferenceValue;
    @XmlElementRef(name = "AccountPartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> accountPartyId;
    @XmlElement(name = "AccountPartyNumber")
    protected String accountPartyNumber;
    @XmlElementRef(name = "AccountSourceSystem", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountSourceSystem;
    @XmlElementRef(name = "AccountSourceSystemReferenceValue", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountSourceSystemReferenceValue;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElementRef(name = "FirstName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "LastName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "LastNamePrefix", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastNamePrefix;
    @XmlElementRef(name = "MiddleName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleName;
    @XmlElementRef(name = "UniqueNameSuffix", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uniqueNameSuffix;
    @XmlElementRef(name = "ContactName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactName;
    @XmlElementRef(name = "PreviousLastName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousLastName;
    @XmlElementRef(name = "SecondLastName", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secondLastName;
    @XmlElementRef(name = "OwnerPartyId", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ownerPartyId;
    @XmlElement(name = "OwnerPartyNumber")
    protected String ownerPartyNumber;
    @XmlElementRef(name = "OwnerEmailAddress", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerEmailAddress;
    @XmlElement(name = "OwnerName")
    protected String ownerName;
    @XmlElementRef(name = "Type", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "ExistingCustomerFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> existingCustomerFlag;
    @XmlElementRef(name = "ExistingCustomerFlagLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> existingCustomerFlagLastUpdateDate;
    @XmlElementRef(name = "NamedFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> namedFlag;
    @XmlElementRef(name = "LastAssignmentDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastAssignmentDate;
    @XmlElementRef(name = "LastAssignmentDateTime", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastAssignmentDateTime;
    @XmlElementRef(name = "AssignmentExceptionFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> assignmentExceptionFlag;
    @XmlElementRef(name = "SalesProfileStatus", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesProfileStatus;
    @XmlElementRef(name = "TaxpayerIdentificationNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxpayerIdentificationNumber;
    @XmlElementRef(name = "DateOfBirth", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfBirth;
    @XmlElementRef(name = "PlaceOfBirth", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placeOfBirth;
    @XmlElementRef(name = "DateOfDeath", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfDeath;
    @XmlElement(name = "DeceasedFlag")
    protected Boolean deceasedFlag;
    @XmlElementRef(name = "Gender", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gender;
    @XmlElementRef(name = "MaritalStatus", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maritalStatus;
    @XmlElementRef(name = "MaritalStatusEffectiveDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> maritalStatusEffectiveDate;
    @XmlElementRef(name = "DeclaredEthnicity", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> declaredEthnicity;
    @XmlElementRef(name = "PreferredFunctionalCurrency", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredFunctionalCurrency;
    @XmlElementRef(name = "PersonalIncomeAmount", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> personalIncomeAmount;
    @XmlElementRef(name = "HeadOfHouseholdFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> headOfHouseholdFlag;
    @XmlElementRef(name = "HouseholdIncomeAmount", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> householdIncomeAmount;
    @XmlElementRef(name = "HouseholdSize", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> householdSize;
    @XmlElementRef(name = "Salutation", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salutation;
    @XmlElementRef(name = "SalutoryIntroduction", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salutoryIntroduction;
    @XmlElementRef(name = "Title", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "AcademicTitle", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> academicTitle;
    @XmlElementRef(name = "Initials", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> initials;
    @XmlElementRef(name = "RentOrOwnIndicator", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rentOrOwnIndicator;
    @XmlElementRef(name = "CertificationLevel", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificationLevel;
    @XmlElementRef(name = "CertificationReasonCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificationReasonCode;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "PreferredContactMethod", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactMethod;
    @XmlElementRef(name = "FavoriteContactFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> favoriteContactFlag;
    @XmlElementRef(name = "Department", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> department;
    @XmlElementRef(name = "DepartmentCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departmentCode;
    @XmlElementRef(name = "DoNotCallFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> doNotCallFlag;
    @XmlElementRef(name = "DoNotContactFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> doNotContactFlag;
    @XmlElementRef(name = "DoNotEmailFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> doNotEmailFlag;
    @XmlElementRef(name = "DoNotMailFlag", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> doNotMailFlag;
    @XmlElementRef(name = "JobTitle", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobTitle;
    @XmlElementRef(name = "JobTitleCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobTitleCode;
    @XmlElementRef(name = "LastContactDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastContactDate;
    @XmlElementRef(name = "SalesAffinityCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAffinityCode;
    @XmlElementRef(name = "SalesBuyingRoleCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesBuyingRoleCode;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "DataCloudStatus", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCloudStatus;
    @XmlElementRef(name = "LastEnrichmentDate", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastEnrichmentDate;
    @XmlElement(name = "PartyStatus")
    protected String partyStatus;
    @XmlElementRef(name = "CreatedByModule", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdByModule;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "WorkPhoneCountryCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workPhoneCountryCode;
    @XmlElementRef(name = "WorkPhoneAreaCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workPhoneAreaCode;
    @XmlElementRef(name = "WorkPhoneNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workPhoneNumber;
    @XmlElementRef(name = "WorkPhoneExtension", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workPhoneExtension;
    @XmlElementRef(name = "FormattedWorkPhoneNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedWorkPhoneNumber;
    @XmlElementRef(name = "MobileCountryCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileCountryCode;
    @XmlElementRef(name = "MobileAreaCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileAreaCode;
    @XmlElementRef(name = "MobileNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileNumber;
    @XmlElementRef(name = "MobileExtension", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileExtension;
    @XmlElementRef(name = "FormattedMobileNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedMobileNumber;
    @XmlElementRef(name = "FaxCountryCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faxCountryCode;
    @XmlElementRef(name = "FaxAreaCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faxAreaCode;
    @XmlElementRef(name = "FaxNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faxNumber;
    @XmlElementRef(name = "FaxExtension", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faxExtension;
    @XmlElementRef(name = "FormattedFaxNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedFaxNumber;
    @XmlElementRef(name = "HomePhoneCountryCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homePhoneCountryCode;
    @XmlElementRef(name = "HomePhoneAreaCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homePhoneAreaCode;
    @XmlElementRef(name = "HomePhoneNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homePhoneNumber;
    @XmlElementRef(name = "FormattedHomePhoneNumber", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedHomePhoneNumber;
    @XmlElementRef(name = "EmailFormat", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailFormat;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElementRef(name = "ClassificationCategory", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classificationCategory;
    @XmlElementRef(name = "ClassificationCode", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classificationCode;
    @XmlElementRef(name = "ContactIsPrimaryForAccount", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactIsPrimaryForAccount;
    @XmlElementRef(name = "NameSuffix", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameSuffix;
    @XmlElement(name = "ContactUniqueName")
    protected String contactUniqueName;
    @XmlElementRef(name = "RecordSet", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordSet;
    @XmlElementRef(name = "MyBusinessContact", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> myBusinessContact;
    @XmlElement(name = "PrimaryAddress")
    protected PrimaryAddress primaryAddress;
    @XmlElement(name = "SalesTeamMember")
    protected List<SalesTeamMember> salesTeamMember;
    @XmlElement(name = "Note")
    protected List<Note> note;
    @XmlElementRef(name = "PersonDEO_TeamName_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOTeamNameC;
    @XmlElementRef(name = "PersonDEO_TeamLead_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOTeamLeadC;
    @XmlElementRef(name = "PersonDEO_Role_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEORoleC;
    @XmlElementRef(name = "PersonDEO_TeamLead_LOV_Id_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> personDEOTeamLeadLOVIdC;
    @XmlElementRef(name = "PersonDEO_TeamLead_LOV_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOTeamLeadLOVC;
    @XmlElementRef(name = "PersonDEO_Type_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOTypeC;
    @XmlElementRef(name = "PersonDEO_ContactSource_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOContactSourceC;
    @XmlElementRef(name = "PersonDEO_Mobile_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> personDEOMobileC;
    @XmlElementRef(name = "PersonDEO_PersonalEmailId_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOPersonalEmailIdC;
    @XmlElementRef(name = "PersonDEO_Skype_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOSkypeC;
    @XmlElementRef(name = "PersonDEO_ResidenceNumber_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOResidenceNumberC;
    @XmlElementRef(name = "PersonDEO_SpouseName_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOSpouseNameC;
    @XmlElementRef(name = "PersonDEO_SpouseDOB_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> personDEOSpouseDOBC;
    @XmlElementRef(name = "PersonDEO_Anniversary_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> personDEOAnniversaryC;
    @XmlElementRef(name = "PersonDEO_HighestLevelOfEducation_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOHighestLevelOfEducationC;
    @XmlElementRef(name = "PersonDEO_EMailIdOfficial_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOEMailIdOfficialC;
    @XmlElementRef(name = "PersonDEO_TINNo_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOTINNoC;
    @XmlElementRef(name = "PersonDEO_Account_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOAccountC;
    @XmlElement(name = "PersonDEO_DBContact_c")
    protected Boolean personDEODBContactC;
    @XmlElementRef(name = "PersonDEO_IfOthersThenSpecify_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> personDEOIfOthersThenSpecifyC;
    @XmlElementRef(name = "PersonDEO_EducationalQualification_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOEducationalQualificationC;
    @XmlElementRef(name = "PersonDEO_Level_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOLevelC;
    @XmlElementRef(name = "PersonDEO_Username_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOUsernameC;
    @XmlElementRef(name = "PersonDEO_Password_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOPasswordC;
    @XmlElementRef(name = "PersonDEO_TotalRewardPoints_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOTotalRewardPointsC;
    @XmlElement(name = "PersonDEO_PasswordReset_c")
    protected Boolean personDEOPasswordResetC;
    @XmlElementRef(name = "PersonDEO_Reference_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOReferenceC;
    @XmlElementRef(name = "PersonDEO_TeamLead2_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOTeamLead2C;
    @XmlElementRef(name = "PersonDEO_TeamLead3_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOTeamLead3C;
    @XmlElementRef(name = "PersonDEO_ResidenceNo_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> personDEOResidenceNoC;
    @XmlElementRef(name = "PersonDEO_ResidenceAddress_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> personDEOResidenceAddressC;
    @XmlElementRef(name = "PersonDEO_Flag_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOFlagC;
    @XmlElementRef(name = "PersonDEO_VarificationStatus_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOVarificationStatusC;
    @XmlElementRef(name = "PersonDEO_Source_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOSourceC;
    @XmlElementRef(name = "PersonDEO_ReferenceContact_Id_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> personDEOReferenceContactIdC;
    @XmlElementRef(name = "PersonDEO_ReferenceContact_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOReferenceContactC;
    @XmlElementRef(name = "PersonDEO_MobilePhone2_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOMobilePhone2C;
    @XmlElementRef(name = "PersonDEO_ProductAwareness_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOProductAwarenessC;
    @XmlElementRef(name = "PersonDEO_ProductsPRSent_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOProductsPRSentC;
    @XmlElementRef(name = "PersonDEO_PresentationDone_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOPresentationDoneC;
    @XmlElementRef(name = "PersonDEO_ProductsHighlyInterestedIn_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOProductsHighlyInterestedInC;
    @XmlElementRef(name = "PersonDEO_FeedbackOnSolidSurface_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOFeedbackOnSolidSurfaceC;
    @XmlElementRef(name = "PersonDEO_PricingOfSolidSurface_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOPricingOfSolidSurfaceC;
    @XmlElementRef(name = "PersonDEO_FeedbackOnAcoustic_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOFeedbackOnAcousticC;
    @XmlElementRef(name = "PersonDEO_PricingOfAcoustic_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOPricingOfAcousticC;
    @XmlElementRef(name = "PersonDEO_FeedbackOnStones_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOFeedbackOnStonesC;
    @XmlElementRef(name = "PersonDEO_FeedbackOnOtherProducts_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOFeedbackOnOtherProductsC;
    @XmlElementRef(name = "PersonDEO_ReasonOfDecisionMaking_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOReasonOfDecisionMakingC;
    @XmlElementRef(name = "PersonDEO_RoleKI_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEORoleKIC;
    @XmlElementRef(name = "PersonDEO_ProductAwareness1_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOProductAwareness1C;
    @XmlElementRef(name = "PersonDEO_PresentationDone1_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOPresentationDone1C;
    @XmlElementRef(name = "PersonDEO_ProductsHighlyInterestedIn1_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOProductsHighlyInterestedIn1C;
    @XmlElementRef(name = "PersonDEO_ReasonOfDecisionMaking1_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOReasonOfDecisionMaking1C;
    @XmlElementRef(name = "PersonDEO_PrimaryFormattedAddress_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOPrimaryFormattedAddressC;
    @XmlElement(name = "PersonDEO_MigratedData_c")
    protected Boolean personDEOMigratedDataC;
    @XmlElementRef(name = "PersonDEO_Notes_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> personDEONotesC;
    @XmlElementRef(name = "PersonDEO_ReferenceName_c", namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personDEOReferenceNameC;
    @XmlElement(name = "PersonDEO_ChildrenDetailsCollection_c")
    protected List<ChildrenDetailsC> personDEOChildrenDetailsCollectionC;
    @XmlElement(name = "PersonDEO_SampleProductsCollection_c")
    protected List<SampleProductsC> personDEOSampleProductsCollectionC;

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyId(Long value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the partyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNumber() {
        return partyNumber;
    }

    /**
     * Sets the value of the partyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNumber(String value) {
        this.partyNumber = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystem(JAXBElement<String> value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the sourceSystemReferenceValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSystemReferenceValue() {
        return sourceSystemReferenceValue;
    }

    /**
     * Sets the value of the sourceSystemReferenceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSystemReferenceValue(JAXBElement<String> value) {
        this.sourceSystemReferenceValue = value;
    }

    /**
     * Gets the value of the accountPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAccountPartyId() {
        return accountPartyId;
    }

    /**
     * Sets the value of the accountPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAccountPartyId(JAXBElement<Long> value) {
        this.accountPartyId = value;
    }

    /**
     * Gets the value of the accountPartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPartyNumber() {
        return accountPartyNumber;
    }

    /**
     * Sets the value of the accountPartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPartyNumber(String value) {
        this.accountPartyNumber = value;
    }

    /**
     * Gets the value of the accountSourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountSourceSystem() {
        return accountSourceSystem;
    }

    /**
     * Sets the value of the accountSourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountSourceSystem(JAXBElement<String> value) {
        this.accountSourceSystem = value;
    }

    /**
     * Gets the value of the accountSourceSystemReferenceValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountSourceSystemReferenceValue() {
        return accountSourceSystemReferenceValue;
    }

    /**
     * Sets the value of the accountSourceSystemReferenceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountSourceSystemReferenceValue(JAXBElement<String> value) {
        this.accountSourceSystemReferenceValue = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lastNamePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastNamePrefix() {
        return lastNamePrefix;
    }

    /**
     * Sets the value of the lastNamePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastNamePrefix(JAXBElement<String> value) {
        this.lastNamePrefix = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleName(JAXBElement<String> value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the uniqueNameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUniqueNameSuffix() {
        return uniqueNameSuffix;
    }

    /**
     * Sets the value of the uniqueNameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUniqueNameSuffix(JAXBElement<String> value) {
        this.uniqueNameSuffix = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactName(JAXBElement<String> value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the previousLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousLastName() {
        return previousLastName;
    }

    /**
     * Sets the value of the previousLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousLastName(JAXBElement<String> value) {
        this.previousLastName = value;
    }

    /**
     * Gets the value of the secondLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondLastName() {
        return secondLastName;
    }

    /**
     * Sets the value of the secondLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondLastName(JAXBElement<String> value) {
        this.secondLastName = value;
    }

    /**
     * Gets the value of the ownerPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOwnerPartyId() {
        return ownerPartyId;
    }

    /**
     * Sets the value of the ownerPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOwnerPartyId(JAXBElement<Long> value) {
        this.ownerPartyId = value;
    }

    /**
     * Gets the value of the ownerPartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerPartyNumber() {
        return ownerPartyNumber;
    }

    /**
     * Sets the value of the ownerPartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerPartyNumber(String value) {
        this.ownerPartyNumber = value;
    }

    /**
     * Gets the value of the ownerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerEmailAddress() {
        return ownerEmailAddress;
    }

    /**
     * Sets the value of the ownerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerEmailAddress(JAXBElement<String> value) {
        this.ownerEmailAddress = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

    /**
     * Gets the value of the existingCustomerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExistingCustomerFlag() {
        return existingCustomerFlag;
    }

    /**
     * Sets the value of the existingCustomerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExistingCustomerFlag(JAXBElement<Boolean> value) {
        this.existingCustomerFlag = value;
    }

    /**
     * Gets the value of the existingCustomerFlagLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExistingCustomerFlagLastUpdateDate() {
        return existingCustomerFlagLastUpdateDate;
    }

    /**
     * Sets the value of the existingCustomerFlagLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExistingCustomerFlagLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.existingCustomerFlagLastUpdateDate = value;
    }

    /**
     * Gets the value of the namedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNamedFlag() {
        return namedFlag;
    }

    /**
     * Sets the value of the namedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNamedFlag(JAXBElement<Boolean> value) {
        this.namedFlag = value;
    }

    /**
     * Gets the value of the lastAssignmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAssignmentDate() {
        return lastAssignmentDate;
    }

    /**
     * Sets the value of the lastAssignmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAssignmentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAssignmentDate = value;
    }

    /**
     * Gets the value of the lastAssignmentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAssignmentDateTime() {
        return lastAssignmentDateTime;
    }

    /**
     * Sets the value of the lastAssignmentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAssignmentDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAssignmentDateTime = value;
    }

    /**
     * Gets the value of the assignmentExceptionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAssignmentExceptionFlag() {
        return assignmentExceptionFlag;
    }

    /**
     * Sets the value of the assignmentExceptionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAssignmentExceptionFlag(JAXBElement<Boolean> value) {
        this.assignmentExceptionFlag = value;
    }

    /**
     * Gets the value of the salesProfileStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesProfileStatus() {
        return salesProfileStatus;
    }

    /**
     * Sets the value of the salesProfileStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesProfileStatus(JAXBElement<String> value) {
        this.salesProfileStatus = value;
    }

    /**
     * Gets the value of the taxpayerIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxpayerIdentificationNumber() {
        return taxpayerIdentificationNumber;
    }

    /**
     * Sets the value of the taxpayerIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxpayerIdentificationNumber(JAXBElement<String> value) {
        this.taxpayerIdentificationNumber = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfBirth(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlaceOfBirth(JAXBElement<String> value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfDeath(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the deceasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeceasedFlag() {
        return deceasedFlag;
    }

    /**
     * Sets the value of the deceasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeceasedFlag(Boolean value) {
        this.deceasedFlag = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGender(JAXBElement<String> value) {
        this.gender = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaritalStatus(JAXBElement<String> value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the maritalStatusEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMaritalStatusEffectiveDate() {
        return maritalStatusEffectiveDate;
    }

    /**
     * Sets the value of the maritalStatusEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMaritalStatusEffectiveDate(JAXBElement<XMLGregorianCalendar> value) {
        this.maritalStatusEffectiveDate = value;
    }

    /**
     * Gets the value of the declaredEthnicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeclaredEthnicity() {
        return declaredEthnicity;
    }

    /**
     * Sets the value of the declaredEthnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeclaredEthnicity(JAXBElement<String> value) {
        this.declaredEthnicity = value;
    }

    /**
     * Gets the value of the preferredFunctionalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredFunctionalCurrency() {
        return preferredFunctionalCurrency;
    }

    /**
     * Sets the value of the preferredFunctionalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredFunctionalCurrency(JAXBElement<String> value) {
        this.preferredFunctionalCurrency = value;
    }

    /**
     * Gets the value of the personalIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getPersonalIncomeAmount() {
        return personalIncomeAmount;
    }

    /**
     * Sets the value of the personalIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setPersonalIncomeAmount(JAXBElement<AmountType> value) {
        this.personalIncomeAmount = value;
    }

    /**
     * Gets the value of the headOfHouseholdFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHeadOfHouseholdFlag() {
        return headOfHouseholdFlag;
    }

    /**
     * Sets the value of the headOfHouseholdFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHeadOfHouseholdFlag(JAXBElement<Boolean> value) {
        this.headOfHouseholdFlag = value;
    }

    /**
     * Gets the value of the householdIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getHouseholdIncomeAmount() {
        return householdIncomeAmount;
    }

    /**
     * Sets the value of the householdIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setHouseholdIncomeAmount(JAXBElement<AmountType> value) {
        this.householdIncomeAmount = value;
    }

    /**
     * Gets the value of the householdSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHouseholdSize() {
        return householdSize;
    }

    /**
     * Sets the value of the householdSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHouseholdSize(JAXBElement<BigDecimal> value) {
        this.householdSize = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalutation(JAXBElement<String> value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the salutoryIntroduction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalutoryIntroduction() {
        return salutoryIntroduction;
    }

    /**
     * Sets the value of the salutoryIntroduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalutoryIntroduction(JAXBElement<String> value) {
        this.salutoryIntroduction = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the academicTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcademicTitle() {
        return academicTitle;
    }

    /**
     * Sets the value of the academicTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcademicTitle(JAXBElement<String> value) {
        this.academicTitle = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInitials(JAXBElement<String> value) {
        this.initials = value;
    }

    /**
     * Gets the value of the rentOrOwnIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRentOrOwnIndicator() {
        return rentOrOwnIndicator;
    }

    /**
     * Sets the value of the rentOrOwnIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRentOrOwnIndicator(JAXBElement<String> value) {
        this.rentOrOwnIndicator = value;
    }

    /**
     * Gets the value of the certificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificationLevel() {
        return certificationLevel;
    }

    /**
     * Sets the value of the certificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificationLevel(JAXBElement<String> value) {
        this.certificationLevel = value;
    }

    /**
     * Gets the value of the certificationReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificationReasonCode() {
        return certificationReasonCode;
    }

    /**
     * Sets the value of the certificationReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificationReasonCode(JAXBElement<String> value) {
        this.certificationReasonCode = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = value;
    }

    /**
     * Gets the value of the preferredContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactMethod() {
        return preferredContactMethod;
    }

    /**
     * Sets the value of the preferredContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactMethod(JAXBElement<String> value) {
        this.preferredContactMethod = value;
    }

    /**
     * Gets the value of the favoriteContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFavoriteContactFlag() {
        return favoriteContactFlag;
    }

    /**
     * Sets the value of the favoriteContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFavoriteContactFlag(JAXBElement<Boolean> value) {
        this.favoriteContactFlag = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment(JAXBElement<String> value) {
        this.department = value;
    }

    /**
     * Gets the value of the departmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartmentCode() {
        return departmentCode;
    }

    /**
     * Sets the value of the departmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartmentCode(JAXBElement<String> value) {
        this.departmentCode = value;
    }

    /**
     * Gets the value of the doNotCallFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDoNotCallFlag() {
        return doNotCallFlag;
    }

    /**
     * Sets the value of the doNotCallFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDoNotCallFlag(JAXBElement<Boolean> value) {
        this.doNotCallFlag = value;
    }

    /**
     * Gets the value of the doNotContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDoNotContactFlag() {
        return doNotContactFlag;
    }

    /**
     * Sets the value of the doNotContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDoNotContactFlag(JAXBElement<Boolean> value) {
        this.doNotContactFlag = value;
    }

    /**
     * Gets the value of the doNotEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDoNotEmailFlag() {
        return doNotEmailFlag;
    }

    /**
     * Sets the value of the doNotEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDoNotEmailFlag(JAXBElement<Boolean> value) {
        this.doNotEmailFlag = value;
    }

    /**
     * Gets the value of the doNotMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDoNotMailFlag() {
        return doNotMailFlag;
    }

    /**
     * Sets the value of the doNotMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDoNotMailFlag(JAXBElement<Boolean> value) {
        this.doNotMailFlag = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobTitle(JAXBElement<String> value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the jobTitleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobTitleCode() {
        return jobTitleCode;
    }

    /**
     * Sets the value of the jobTitleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobTitleCode(JAXBElement<String> value) {
        this.jobTitleCode = value;
    }

    /**
     * Gets the value of the lastContactDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastContactDate() {
        return lastContactDate;
    }

    /**
     * Sets the value of the lastContactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastContactDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastContactDate = value;
    }

    /**
     * Gets the value of the salesAffinityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAffinityCode() {
        return salesAffinityCode;
    }

    /**
     * Sets the value of the salesAffinityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAffinityCode(JAXBElement<String> value) {
        this.salesAffinityCode = value;
    }

    /**
     * Gets the value of the salesBuyingRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesBuyingRoleCode() {
        return salesBuyingRoleCode;
    }

    /**
     * Sets the value of the salesBuyingRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesBuyingRoleCode(JAXBElement<String> value) {
        this.salesBuyingRoleCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the curcyConvRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurcyConvRateType() {
        return curcyConvRateType;
    }

    /**
     * Sets the value of the curcyConvRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurcyConvRateType(JAXBElement<String> value) {
        this.curcyConvRateType = value;
    }

    /**
     * Gets the value of the corpCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpCurrencyCode() {
        return corpCurrencyCode;
    }

    /**
     * Sets the value of the corpCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpCurrencyCode(JAXBElement<String> value) {
        this.corpCurrencyCode = value;
    }

    /**
     * Gets the value of the dataCloudStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCloudStatus() {
        return dataCloudStatus;
    }

    /**
     * Sets the value of the dataCloudStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCloudStatus(JAXBElement<String> value) {
        this.dataCloudStatus = value;
    }

    /**
     * Gets the value of the lastEnrichmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastEnrichmentDate() {
        return lastEnrichmentDate;
    }

    /**
     * Sets the value of the lastEnrichmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastEnrichmentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastEnrichmentDate = value;
    }

    /**
     * Gets the value of the partyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyStatus() {
        return partyStatus;
    }

    /**
     * Sets the value of the partyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyStatus(String value) {
        this.partyStatus = value;
    }

    /**
     * Gets the value of the createdByModule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedByModule() {
        return createdByModule;
    }

    /**
     * Sets the value of the createdByModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedByModule(JAXBElement<String> value) {
        this.createdByModule = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the lastUpdateLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     * Sets the value of the lastUpdateLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateLogin(JAXBElement<String> value) {
        this.lastUpdateLogin = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Gets the value of the workPhoneCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPhoneCountryCode() {
        return workPhoneCountryCode;
    }

    /**
     * Sets the value of the workPhoneCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPhoneCountryCode(JAXBElement<String> value) {
        this.workPhoneCountryCode = value;
    }

    /**
     * Gets the value of the workPhoneAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPhoneAreaCode() {
        return workPhoneAreaCode;
    }

    /**
     * Sets the value of the workPhoneAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPhoneAreaCode(JAXBElement<String> value) {
        this.workPhoneAreaCode = value;
    }

    /**
     * Gets the value of the workPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    /**
     * Sets the value of the workPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPhoneNumber(JAXBElement<String> value) {
        this.workPhoneNumber = value;
    }

    /**
     * Gets the value of the workPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkPhoneExtension() {
        return workPhoneExtension;
    }

    /**
     * Sets the value of the workPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkPhoneExtension(JAXBElement<String> value) {
        this.workPhoneExtension = value;
    }

    /**
     * Gets the value of the formattedWorkPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedWorkPhoneNumber() {
        return formattedWorkPhoneNumber;
    }

    /**
     * Sets the value of the formattedWorkPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedWorkPhoneNumber(JAXBElement<String> value) {
        this.formattedWorkPhoneNumber = value;
    }

    /**
     * Gets the value of the mobileCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileCountryCode() {
        return mobileCountryCode;
    }

    /**
     * Sets the value of the mobileCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileCountryCode(JAXBElement<String> value) {
        this.mobileCountryCode = value;
    }

    /**
     * Gets the value of the mobileAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileAreaCode() {
        return mobileAreaCode;
    }

    /**
     * Sets the value of the mobileAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileAreaCode(JAXBElement<String> value) {
        this.mobileAreaCode = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileNumber(JAXBElement<String> value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the mobileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileExtension() {
        return mobileExtension;
    }

    /**
     * Sets the value of the mobileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileExtension(JAXBElement<String> value) {
        this.mobileExtension = value;
    }

    /**
     * Gets the value of the formattedMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedMobileNumber() {
        return formattedMobileNumber;
    }

    /**
     * Sets the value of the formattedMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedMobileNumber(JAXBElement<String> value) {
        this.formattedMobileNumber = value;
    }

    /**
     * Gets the value of the faxCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxCountryCode() {
        return faxCountryCode;
    }

    /**
     * Sets the value of the faxCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxCountryCode(JAXBElement<String> value) {
        this.faxCountryCode = value;
    }

    /**
     * Gets the value of the faxAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxAreaCode() {
        return faxAreaCode;
    }

    /**
     * Sets the value of the faxAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxAreaCode(JAXBElement<String> value) {
        this.faxAreaCode = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxNumber(JAXBElement<String> value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the faxExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFaxExtension() {
        return faxExtension;
    }

    /**
     * Sets the value of the faxExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFaxExtension(JAXBElement<String> value) {
        this.faxExtension = value;
    }

    /**
     * Gets the value of the formattedFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedFaxNumber() {
        return formattedFaxNumber;
    }

    /**
     * Sets the value of the formattedFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedFaxNumber(JAXBElement<String> value) {
        this.formattedFaxNumber = value;
    }

    /**
     * Gets the value of the homePhoneCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomePhoneCountryCode() {
        return homePhoneCountryCode;
    }

    /**
     * Sets the value of the homePhoneCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomePhoneCountryCode(JAXBElement<String> value) {
        this.homePhoneCountryCode = value;
    }

    /**
     * Gets the value of the homePhoneAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomePhoneAreaCode() {
        return homePhoneAreaCode;
    }

    /**
     * Sets the value of the homePhoneAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomePhoneAreaCode(JAXBElement<String> value) {
        this.homePhoneAreaCode = value;
    }

    /**
     * Gets the value of the homePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomePhoneNumber() {
        return homePhoneNumber;
    }

    /**
     * Sets the value of the homePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomePhoneNumber(JAXBElement<String> value) {
        this.homePhoneNumber = value;
    }

    /**
     * Gets the value of the formattedHomePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedHomePhoneNumber() {
        return formattedHomePhoneNumber;
    }

    /**
     * Sets the value of the formattedHomePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedHomePhoneNumber(JAXBElement<String> value) {
        this.formattedHomePhoneNumber = value;
    }

    /**
     * Gets the value of the emailFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailFormat() {
        return emailFormat;
    }

    /**
     * Sets the value of the emailFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailFormat(JAXBElement<String> value) {
        this.emailFormat = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the classificationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassificationCategory() {
        return classificationCategory;
    }

    /**
     * Sets the value of the classificationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassificationCategory(JAXBElement<String> value) {
        this.classificationCategory = value;
    }

    /**
     * Gets the value of the classificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassificationCode() {
        return classificationCode;
    }

    /**
     * Sets the value of the classificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassificationCode(JAXBElement<String> value) {
        this.classificationCode = value;
    }

    /**
     * Gets the value of the contactIsPrimaryForAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactIsPrimaryForAccount() {
        return contactIsPrimaryForAccount;
    }

    /**
     * Sets the value of the contactIsPrimaryForAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactIsPrimaryForAccount(JAXBElement<String> value) {
        this.contactIsPrimaryForAccount = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameSuffix(JAXBElement<String> value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the contactUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactUniqueName() {
        return contactUniqueName;
    }

    /**
     * Sets the value of the contactUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactUniqueName(String value) {
        this.contactUniqueName = value;
    }

    /**
     * Gets the value of the recordSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecordSet() {
        return recordSet;
    }

    /**
     * Sets the value of the recordSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecordSet(JAXBElement<String> value) {
        this.recordSet = value;
    }

    /**
     * Gets the value of the myBusinessContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMyBusinessContact() {
        return myBusinessContact;
    }

    /**
     * Sets the value of the myBusinessContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMyBusinessContact(JAXBElement<String> value) {
        this.myBusinessContact = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddress }
     *     
     */
    public PrimaryAddress getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddress }
     *     
     */
    public void setPrimaryAddress(PrimaryAddress value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the salesTeamMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesTeamMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesTeamMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesTeamMember }
     * 
     * 
     */
    public List<SalesTeamMember> getSalesTeamMember() {
        if (salesTeamMember == null) {
            salesTeamMember = new ArrayList<SalesTeamMember>();
        }
        return this.salesTeamMember;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNote() {
        if (note == null) {
            note = new ArrayList<Note>();
        }
        return this.note;
    }

    /**
     * Gets the value of the personDEOTeamNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOTeamNameC() {
        return personDEOTeamNameC;
    }

    /**
     * Sets the value of the personDEOTeamNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOTeamNameC(JAXBElement<String> value) {
        this.personDEOTeamNameC = value;
    }

    /**
     * Gets the value of the personDEOTeamLeadC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOTeamLeadC() {
        return personDEOTeamLeadC;
    }

    /**
     * Sets the value of the personDEOTeamLeadC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOTeamLeadC(JAXBElement<String> value) {
        this.personDEOTeamLeadC = value;
    }

    /**
     * Gets the value of the personDEORoleC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEORoleC() {
        return personDEORoleC;
    }

    /**
     * Sets the value of the personDEORoleC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEORoleC(JAXBElement<String> value) {
        this.personDEORoleC = value;
    }

    /**
     * Gets the value of the personDEOTeamLeadLOVIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPersonDEOTeamLeadLOVIdC() {
        return personDEOTeamLeadLOVIdC;
    }

    /**
     * Sets the value of the personDEOTeamLeadLOVIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPersonDEOTeamLeadLOVIdC(JAXBElement<BigDecimal> value) {
        this.personDEOTeamLeadLOVIdC = value;
    }

    /**
     * Gets the value of the personDEOTeamLeadLOVC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOTeamLeadLOVC() {
        return personDEOTeamLeadLOVC;
    }

    /**
     * Sets the value of the personDEOTeamLeadLOVC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOTeamLeadLOVC(JAXBElement<String> value) {
        this.personDEOTeamLeadLOVC = value;
    }

    /**
     * Gets the value of the personDEOTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOTypeC() {
        return personDEOTypeC;
    }

    /**
     * Sets the value of the personDEOTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOTypeC(JAXBElement<String> value) {
        this.personDEOTypeC = value;
    }

    /**
     * Gets the value of the personDEOContactSourceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOContactSourceC() {
        return personDEOContactSourceC;
    }

    /**
     * Sets the value of the personDEOContactSourceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOContactSourceC(JAXBElement<String> value) {
        this.personDEOContactSourceC = value;
    }

    /**
     * Gets the value of the personDEOMobileC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPersonDEOMobileC() {
        return personDEOMobileC;
    }

    /**
     * Sets the value of the personDEOMobileC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPersonDEOMobileC(JAXBElement<BigDecimal> value) {
        this.personDEOMobileC = value;
    }

    /**
     * Gets the value of the personDEOPersonalEmailIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOPersonalEmailIdC() {
        return personDEOPersonalEmailIdC;
    }

    /**
     * Sets the value of the personDEOPersonalEmailIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOPersonalEmailIdC(JAXBElement<String> value) {
        this.personDEOPersonalEmailIdC = value;
    }

    /**
     * Gets the value of the personDEOSkypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOSkypeC() {
        return personDEOSkypeC;
    }

    /**
     * Sets the value of the personDEOSkypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOSkypeC(JAXBElement<String> value) {
        this.personDEOSkypeC = value;
    }

    /**
     * Gets the value of the personDEOResidenceNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOResidenceNumberC() {
        return personDEOResidenceNumberC;
    }

    /**
     * Sets the value of the personDEOResidenceNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOResidenceNumberC(JAXBElement<String> value) {
        this.personDEOResidenceNumberC = value;
    }

    /**
     * Gets the value of the personDEOSpouseNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOSpouseNameC() {
        return personDEOSpouseNameC;
    }

    /**
     * Sets the value of the personDEOSpouseNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOSpouseNameC(JAXBElement<String> value) {
        this.personDEOSpouseNameC = value;
    }

    /**
     * Gets the value of the personDEOSpouseDOBC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPersonDEOSpouseDOBC() {
        return personDEOSpouseDOBC;
    }

    /**
     * Sets the value of the personDEOSpouseDOBC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPersonDEOSpouseDOBC(JAXBElement<XMLGregorianCalendar> value) {
        this.personDEOSpouseDOBC = value;
    }

    /**
     * Gets the value of the personDEOAnniversaryC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPersonDEOAnniversaryC() {
        return personDEOAnniversaryC;
    }

    /**
     * Sets the value of the personDEOAnniversaryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPersonDEOAnniversaryC(JAXBElement<XMLGregorianCalendar> value) {
        this.personDEOAnniversaryC = value;
    }

    /**
     * Gets the value of the personDEOHighestLevelOfEducationC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOHighestLevelOfEducationC() {
        return personDEOHighestLevelOfEducationC;
    }

    /**
     * Sets the value of the personDEOHighestLevelOfEducationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOHighestLevelOfEducationC(JAXBElement<String> value) {
        this.personDEOHighestLevelOfEducationC = value;
    }

    /**
     * Gets the value of the personDEOEMailIdOfficialC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOEMailIdOfficialC() {
        return personDEOEMailIdOfficialC;
    }

    /**
     * Sets the value of the personDEOEMailIdOfficialC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOEMailIdOfficialC(JAXBElement<String> value) {
        this.personDEOEMailIdOfficialC = value;
    }

    /**
     * Gets the value of the personDEOTINNoC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOTINNoC() {
        return personDEOTINNoC;
    }

    /**
     * Sets the value of the personDEOTINNoC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOTINNoC(JAXBElement<String> value) {
        this.personDEOTINNoC = value;
    }

    /**
     * Gets the value of the personDEOAccountC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOAccountC() {
        return personDEOAccountC;
    }

    /**
     * Sets the value of the personDEOAccountC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOAccountC(JAXBElement<String> value) {
        this.personDEOAccountC = value;
    }

    /**
     * Gets the value of the personDEODBContactC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonDEODBContactC() {
        return personDEODBContactC;
    }

    /**
     * Sets the value of the personDEODBContactC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonDEODBContactC(Boolean value) {
        this.personDEODBContactC = value;
    }

    /**
     * Gets the value of the personDEOIfOthersThenSpecifyC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPersonDEOIfOthersThenSpecifyC() {
        return personDEOIfOthersThenSpecifyC;
    }

    /**
     * Sets the value of the personDEOIfOthersThenSpecifyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPersonDEOIfOthersThenSpecifyC(JAXBElement<byte[]> value) {
        this.personDEOIfOthersThenSpecifyC = value;
    }

    /**
     * Gets the value of the personDEOEducationalQualificationC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOEducationalQualificationC() {
        return personDEOEducationalQualificationC;
    }

    /**
     * Sets the value of the personDEOEducationalQualificationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOEducationalQualificationC(JAXBElement<String> value) {
        this.personDEOEducationalQualificationC = value;
    }

    /**
     * Gets the value of the personDEOLevelC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOLevelC() {
        return personDEOLevelC;
    }

    /**
     * Sets the value of the personDEOLevelC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOLevelC(JAXBElement<String> value) {
        this.personDEOLevelC = value;
    }

    /**
     * Gets the value of the personDEOUsernameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOUsernameC() {
        return personDEOUsernameC;
    }

    /**
     * Sets the value of the personDEOUsernameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOUsernameC(JAXBElement<String> value) {
        this.personDEOUsernameC = value;
    }

    /**
     * Gets the value of the personDEOPasswordC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOPasswordC() {
        return personDEOPasswordC;
    }

    /**
     * Sets the value of the personDEOPasswordC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOPasswordC(JAXBElement<String> value) {
        this.personDEOPasswordC = value;
    }

    /**
     * Gets the value of the personDEOTotalRewardPointsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOTotalRewardPointsC() {
        return personDEOTotalRewardPointsC;
    }

    /**
     * Sets the value of the personDEOTotalRewardPointsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOTotalRewardPointsC(JAXBElement<String> value) {
        this.personDEOTotalRewardPointsC = value;
    }

    /**
     * Gets the value of the personDEOPasswordResetC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonDEOPasswordResetC() {
        return personDEOPasswordResetC;
    }

    /**
     * Sets the value of the personDEOPasswordResetC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonDEOPasswordResetC(Boolean value) {
        this.personDEOPasswordResetC = value;
    }

    /**
     * Gets the value of the personDEOReferenceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOReferenceC() {
        return personDEOReferenceC;
    }

    /**
     * Sets the value of the personDEOReferenceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOReferenceC(JAXBElement<String> value) {
        this.personDEOReferenceC = value;
    }

    /**
     * Gets the value of the personDEOTeamLead2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOTeamLead2C() {
        return personDEOTeamLead2C;
    }

    /**
     * Sets the value of the personDEOTeamLead2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOTeamLead2C(JAXBElement<String> value) {
        this.personDEOTeamLead2C = value;
    }

    /**
     * Gets the value of the personDEOTeamLead3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOTeamLead3C() {
        return personDEOTeamLead3C;
    }

    /**
     * Sets the value of the personDEOTeamLead3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOTeamLead3C(JAXBElement<String> value) {
        this.personDEOTeamLead3C = value;
    }

    /**
     * Gets the value of the personDEOResidenceNoC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPersonDEOResidenceNoC() {
        return personDEOResidenceNoC;
    }

    /**
     * Sets the value of the personDEOResidenceNoC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPersonDEOResidenceNoC(JAXBElement<BigDecimal> value) {
        this.personDEOResidenceNoC = value;
    }

    /**
     * Gets the value of the personDEOResidenceAddressC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPersonDEOResidenceAddressC() {
        return personDEOResidenceAddressC;
    }

    /**
     * Sets the value of the personDEOResidenceAddressC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPersonDEOResidenceAddressC(JAXBElement<byte[]> value) {
        this.personDEOResidenceAddressC = value;
    }

    /**
     * Gets the value of the personDEOFlagC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOFlagC() {
        return personDEOFlagC;
    }

    /**
     * Sets the value of the personDEOFlagC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOFlagC(JAXBElement<String> value) {
        this.personDEOFlagC = value;
    }

    /**
     * Gets the value of the personDEOVarificationStatusC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOVarificationStatusC() {
        return personDEOVarificationStatusC;
    }

    /**
     * Sets the value of the personDEOVarificationStatusC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOVarificationStatusC(JAXBElement<String> value) {
        this.personDEOVarificationStatusC = value;
    }

    /**
     * Gets the value of the personDEOSourceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOSourceC() {
        return personDEOSourceC;
    }

    /**
     * Sets the value of the personDEOSourceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOSourceC(JAXBElement<String> value) {
        this.personDEOSourceC = value;
    }

    /**
     * Gets the value of the personDEOReferenceContactIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPersonDEOReferenceContactIdC() {
        return personDEOReferenceContactIdC;
    }

    /**
     * Sets the value of the personDEOReferenceContactIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPersonDEOReferenceContactIdC(JAXBElement<BigDecimal> value) {
        this.personDEOReferenceContactIdC = value;
    }

    /**
     * Gets the value of the personDEOReferenceContactC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOReferenceContactC() {
        return personDEOReferenceContactC;
    }

    /**
     * Sets the value of the personDEOReferenceContactC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOReferenceContactC(JAXBElement<String> value) {
        this.personDEOReferenceContactC = value;
    }

    /**
     * Gets the value of the personDEOMobilePhone2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOMobilePhone2C() {
        return personDEOMobilePhone2C;
    }

    /**
     * Sets the value of the personDEOMobilePhone2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOMobilePhone2C(JAXBElement<String> value) {
        this.personDEOMobilePhone2C = value;
    }

    /**
     * Gets the value of the personDEOProductAwarenessC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOProductAwarenessC() {
        return personDEOProductAwarenessC;
    }

    /**
     * Sets the value of the personDEOProductAwarenessC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOProductAwarenessC(JAXBElement<String> value) {
        this.personDEOProductAwarenessC = value;
    }

    /**
     * Gets the value of the personDEOProductsPRSentC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOProductsPRSentC() {
        return personDEOProductsPRSentC;
    }

    /**
     * Sets the value of the personDEOProductsPRSentC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOProductsPRSentC(JAXBElement<String> value) {
        this.personDEOProductsPRSentC = value;
    }

    /**
     * Gets the value of the personDEOPresentationDoneC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOPresentationDoneC() {
        return personDEOPresentationDoneC;
    }

    /**
     * Sets the value of the personDEOPresentationDoneC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOPresentationDoneC(JAXBElement<String> value) {
        this.personDEOPresentationDoneC = value;
    }

    /**
     * Gets the value of the personDEOProductsHighlyInterestedInC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOProductsHighlyInterestedInC() {
        return personDEOProductsHighlyInterestedInC;
    }

    /**
     * Sets the value of the personDEOProductsHighlyInterestedInC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOProductsHighlyInterestedInC(JAXBElement<String> value) {
        this.personDEOProductsHighlyInterestedInC = value;
    }

    /**
     * Gets the value of the personDEOFeedbackOnSolidSurfaceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOFeedbackOnSolidSurfaceC() {
        return personDEOFeedbackOnSolidSurfaceC;
    }

    /**
     * Sets the value of the personDEOFeedbackOnSolidSurfaceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOFeedbackOnSolidSurfaceC(JAXBElement<String> value) {
        this.personDEOFeedbackOnSolidSurfaceC = value;
    }

    /**
     * Gets the value of the personDEOPricingOfSolidSurfaceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOPricingOfSolidSurfaceC() {
        return personDEOPricingOfSolidSurfaceC;
    }

    /**
     * Sets the value of the personDEOPricingOfSolidSurfaceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOPricingOfSolidSurfaceC(JAXBElement<String> value) {
        this.personDEOPricingOfSolidSurfaceC = value;
    }

    /**
     * Gets the value of the personDEOFeedbackOnAcousticC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOFeedbackOnAcousticC() {
        return personDEOFeedbackOnAcousticC;
    }

    /**
     * Sets the value of the personDEOFeedbackOnAcousticC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOFeedbackOnAcousticC(JAXBElement<String> value) {
        this.personDEOFeedbackOnAcousticC = value;
    }

    /**
     * Gets the value of the personDEOPricingOfAcousticC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOPricingOfAcousticC() {
        return personDEOPricingOfAcousticC;
    }

    /**
     * Sets the value of the personDEOPricingOfAcousticC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOPricingOfAcousticC(JAXBElement<String> value) {
        this.personDEOPricingOfAcousticC = value;
    }

    /**
     * Gets the value of the personDEOFeedbackOnStonesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOFeedbackOnStonesC() {
        return personDEOFeedbackOnStonesC;
    }

    /**
     * Sets the value of the personDEOFeedbackOnStonesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOFeedbackOnStonesC(JAXBElement<String> value) {
        this.personDEOFeedbackOnStonesC = value;
    }

    /**
     * Gets the value of the personDEOFeedbackOnOtherProductsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOFeedbackOnOtherProductsC() {
        return personDEOFeedbackOnOtherProductsC;
    }

    /**
     * Sets the value of the personDEOFeedbackOnOtherProductsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOFeedbackOnOtherProductsC(JAXBElement<String> value) {
        this.personDEOFeedbackOnOtherProductsC = value;
    }

    /**
     * Gets the value of the personDEOReasonOfDecisionMakingC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOReasonOfDecisionMakingC() {
        return personDEOReasonOfDecisionMakingC;
    }

    /**
     * Sets the value of the personDEOReasonOfDecisionMakingC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOReasonOfDecisionMakingC(JAXBElement<String> value) {
        this.personDEOReasonOfDecisionMakingC = value;
    }

    /**
     * Gets the value of the personDEORoleKIC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEORoleKIC() {
        return personDEORoleKIC;
    }

    /**
     * Sets the value of the personDEORoleKIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEORoleKIC(JAXBElement<String> value) {
        this.personDEORoleKIC = value;
    }

    /**
     * Gets the value of the personDEOProductAwareness1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOProductAwareness1C() {
        return personDEOProductAwareness1C;
    }

    /**
     * Sets the value of the personDEOProductAwareness1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOProductAwareness1C(JAXBElement<String> value) {
        this.personDEOProductAwareness1C = value;
    }

    /**
     * Gets the value of the personDEOPresentationDone1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOPresentationDone1C() {
        return personDEOPresentationDone1C;
    }

    /**
     * Sets the value of the personDEOPresentationDone1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOPresentationDone1C(JAXBElement<String> value) {
        this.personDEOPresentationDone1C = value;
    }

    /**
     * Gets the value of the personDEOProductsHighlyInterestedIn1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOProductsHighlyInterestedIn1C() {
        return personDEOProductsHighlyInterestedIn1C;
    }

    /**
     * Sets the value of the personDEOProductsHighlyInterestedIn1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOProductsHighlyInterestedIn1C(JAXBElement<String> value) {
        this.personDEOProductsHighlyInterestedIn1C = value;
    }

    /**
     * Gets the value of the personDEOReasonOfDecisionMaking1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOReasonOfDecisionMaking1C() {
        return personDEOReasonOfDecisionMaking1C;
    }

    /**
     * Sets the value of the personDEOReasonOfDecisionMaking1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOReasonOfDecisionMaking1C(JAXBElement<String> value) {
        this.personDEOReasonOfDecisionMaking1C = value;
    }

    /**
     * Gets the value of the personDEOPrimaryFormattedAddressC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOPrimaryFormattedAddressC() {
        return personDEOPrimaryFormattedAddressC;
    }

    /**
     * Sets the value of the personDEOPrimaryFormattedAddressC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOPrimaryFormattedAddressC(JAXBElement<String> value) {
        this.personDEOPrimaryFormattedAddressC = value;
    }

    /**
     * Gets the value of the personDEOMigratedDataC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonDEOMigratedDataC() {
        return personDEOMigratedDataC;
    }

    /**
     * Sets the value of the personDEOMigratedDataC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonDEOMigratedDataC(Boolean value) {
        this.personDEOMigratedDataC = value;
    }

    /**
     * Gets the value of the personDEONotesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPersonDEONotesC() {
        return personDEONotesC;
    }

    /**
     * Sets the value of the personDEONotesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPersonDEONotesC(JAXBElement<byte[]> value) {
        this.personDEONotesC = value;
    }

    /**
     * Gets the value of the personDEOReferenceNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonDEOReferenceNameC() {
        return personDEOReferenceNameC;
    }

    /**
     * Sets the value of the personDEOReferenceNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonDEOReferenceNameC(JAXBElement<String> value) {
        this.personDEOReferenceNameC = value;
    }

    /**
     * Gets the value of the personDEOChildrenDetailsCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personDEOChildrenDetailsCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonDEOChildrenDetailsCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildrenDetailsC }
     * 
     * 
     */
    public List<ChildrenDetailsC> getPersonDEOChildrenDetailsCollectionC() {
        if (personDEOChildrenDetailsCollectionC == null) {
            personDEOChildrenDetailsCollectionC = new ArrayList<ChildrenDetailsC>();
        }
        return this.personDEOChildrenDetailsCollectionC;
    }

    /**
     * Gets the value of the personDEOSampleProductsCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personDEOSampleProductsCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonDEOSampleProductsCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SampleProductsC }
     * 
     * 
     */
    public List<SampleProductsC> getPersonDEOSampleProductsCollectionC() {
        if (personDEOSampleProductsCollectionC == null) {
            personDEOSampleProductsCollectionC = new ArrayList<SampleProductsC>();
        }
        return this.personDEOSampleProductsCollectionC;
    }

}

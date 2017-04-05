
package com.oracle.xmlns.apps.crmcommon.salesparties.contactservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.oracle.xmlns.adf.svc.types.AmountType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.crmcommon.salesparties.contactservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Contact_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "contact");
    private final static QName _ContactResult_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "contactResult");
    private final static QName _ContactClassificationCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "ClassificationCode");
    private final static QName _ContactOwnerPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "OwnerPartyId");
    private final static QName _ContactPersonDEOTeamNameC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_TeamName_c");
    private final static QName _ContactType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "Type");
    private final static QName _ContactNameSuffix_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "NameSuffix");
    private final static QName _ContactPersonDEOMobilePhone2C_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_MobilePhone2_c");
    private final static QName _ContactFormattedWorkPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "FormattedWorkPhoneNumber");
    private final static QName _ContactAssignmentExceptionFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "AssignmentExceptionFlag");
    private final static QName _ContactPersonDEOTINNoC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_TINNo_c");
    private final static QName _ContactRecordSet_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "RecordSet");
    private final static QName _ContactDepartment_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "Department");
    private final static QName _ContactSalutoryIntroduction_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "SalutoryIntroduction");
    private final static QName _ContactMobileNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "MobileNumber");
    private final static QName _ContactPersonDEOResidenceNoC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ResidenceNo_c");
    private final static QName _ContactMaritalStatus_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "MaritalStatus");
    private final static QName _ContactPersonDEOReasonOfDecisionMakingC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ReasonOfDecisionMaking_c");
    private final static QName _ContactPersonDEOReferenceContactIdC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ReferenceContact_Id_c");
    private final static QName _ContactFavoriteContactFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "FavoriteContactFlag");
    private final static QName _ContactCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "CurrencyCode");
    private final static QName _ContactPlaceOfBirth_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PlaceOfBirth");
    private final static QName _ContactPersonDEOSourceC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Source_c");
    private final static QName _ContactInitials_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "Initials");
    private final static QName _ContactPersonDEOPricingOfAcousticC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_PricingOfAcoustic_c");
    private final static QName _ContactPersonDEOTotalRewardPointsC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_TotalRewardPoints_c");
    private final static QName _ContactPersonDEOFeedbackOnAcousticC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_FeedbackOnAcoustic_c");
    private final static QName _ContactSourceSystemReferenceValue_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "SourceSystemReferenceValue");
    private final static QName _ContactMyBusinessContact_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "MyBusinessContact");
    private final static QName _ContactJobTitle_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "JobTitle");
    private final static QName _ContactPersonalIncomeAmount_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonalIncomeAmount");
    private final static QName _ContactSourceSystem_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "SourceSystem");
    private final static QName _ContactPersonDEOProductAwarenessC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ProductAwareness_c");
    private final static QName _ContactJobTitleCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "JobTitleCode");
    private final static QName _ContactDoNotMailFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "DoNotMailFlag");
    private final static QName _ContactWorkPhoneCountryCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "WorkPhoneCountryCode");
    private final static QName _ContactSecondLastName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "SecondLastName");
    private final static QName _ContactOwnerEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "OwnerEmailAddress");
    private final static QName _ContactPersonDEOIfOthersThenSpecifyC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_IfOthersThenSpecify_c");
    private final static QName _ContactDoNotCallFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "DoNotCallFlag");
    private final static QName _ContactPersonDEORoleC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Role_c");
    private final static QName _ContactHomePhoneAreaCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "HomePhoneAreaCode");
    private final static QName _ContactPersonDEOProductsHighlyInterestedIn1C_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ProductsHighlyInterestedIn1_c");
    private final static QName _ContactPersonDEOAccountC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Account_c");
    private final static QName _ContactEmailFormat_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "EmailFormat");
    private final static QName _ContactPersonDEOEducationalQualificationC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_EducationalQualification_c");
    private final static QName _ContactDepartmentCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "DepartmentCode");
    private final static QName _ContactPersonDEOVarificationStatusC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_VarificationStatus_c");
    private final static QName _ContactContactIsPrimaryForAccount_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "ContactIsPrimaryForAccount");
    private final static QName _ContactPersonDEOTeamLeadLOVIdC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_TeamLead_LOV_Id_c");
    private final static QName _ContactAccountSourceSystem_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "AccountSourceSystem");
    private final static QName _ContactPersonDEOSpouseDOBC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_SpouseDOB_c");
    private final static QName _ContactLastAssignmentDateTime_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "LastAssignmentDateTime");
    private final static QName _ContactFaxAreaCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "FaxAreaCode");
    private final static QName _ContactFormattedHomePhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "FormattedHomePhoneNumber");
    private final static QName _ContactHomePhoneCountryCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "HomePhoneCountryCode");
    private final static QName _ContactComments_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "Comments");
    private final static QName _ContactWorkPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "WorkPhoneNumber");
    private final static QName _ContactPersonDEOFlagC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Flag_c");
    private final static QName _ContactLastAssignmentDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "LastAssignmentDate");
    private final static QName _ContactPersonDEOProductsHighlyInterestedInC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ProductsHighlyInterestedIn_c");
    private final static QName _ContactDoNotContactFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "DoNotContactFlag");
    private final static QName _ContactGender_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "Gender");
    private final static QName _ContactClassificationCategory_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "ClassificationCategory");
    private final static QName _ContactDeclaredEthnicity_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "DeclaredEthnicity");
    private final static QName _ContactPersonDEOPersonalEmailIdC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_PersonalEmailId_c");
    private final static QName _ContactSalesAffinityCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "SalesAffinityCode");
    private final static QName _ContactPersonDEOTeamLeadLOVC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_TeamLead_LOV_c");
    private final static QName _ContactMobileExtension_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "MobileExtension");
    private final static QName _ContactFaxExtension_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "FaxExtension");
    private final static QName _ContactCertificationLevel_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "CertificationLevel");
    private final static QName _ContactSalesBuyingRoleCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "SalesBuyingRoleCode");
    private final static QName _ContactPersonDEOUsernameC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Username_c");
    private final static QName _ContactPersonDEOContactSourceC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ContactSource_c");
    private final static QName _ContactFaxNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "FaxNumber");
    private final static QName _ContactPersonDEOPresentationDoneC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_PresentationDone_c");
    private final static QName _ContactTaxpayerIdentificationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "TaxpayerIdentificationNumber");
    private final static QName _ContactAccountPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "AccountPartyId");
    private final static QName _ContactPersonDEOReferenceContactC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ReferenceContact_c");
    private final static QName _ContactLastEnrichmentDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "LastEnrichmentDate");
    private final static QName _ContactFormattedMobileNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "FormattedMobileNumber");
    private final static QName _ContactFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "FirstName");
    private final static QName _ContactPersonDEOTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Type_c");
    private final static QName _ContactPreferredContactMethod_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PreferredContactMethod");
    private final static QName _ContactWorkPhoneExtension_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "WorkPhoneExtension");
    private final static QName _ContactMobileCountryCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "MobileCountryCode");
    private final static QName _ContactUniqueNameSuffix_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "UniqueNameSuffix");
    private final static QName _ContactContactName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "ContactName");
    private final static QName _ContactLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "LastUpdateLogin");
    private final static QName _ContactPersonDEOMobileC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Mobile_c");
    private final static QName _ContactDataCloudStatus_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "DataCloudStatus");
    private final static QName _ContactTitle_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "Title");
    private final static QName _ContactPersonDEOHighestLevelOfEducationC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_HighestLevelOfEducation_c");
    private final static QName _ContactExistingCustomerFlagLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "ExistingCustomerFlagLastUpdateDate");
    private final static QName _ContactSalesProfileStatus_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "SalesProfileStatus");
    private final static QName _ContactMiddleName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "MiddleName");
    private final static QName _ContactPersonDEOSpouseNameC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_SpouseName_c");
    private final static QName _ContactCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "CorpCurrencyCode");
    private final static QName _ContactPersonDEOPrimaryFormattedAddressC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_PrimaryFormattedAddress_c");
    private final static QName _ContactPersonDEOReferenceC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Reference_c");
    private final static QName _ContactPersonDEOProductsPRSentC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ProductsPRSent_c");
    private final static QName _ContactPersonDEOFeedbackOnOtherProductsC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_FeedbackOnOtherProducts_c");
    private final static QName _ContactPersonDEONotesC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Notes_c");
    private final static QName _ContactHouseholdIncomeAmount_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "HouseholdIncomeAmount");
    private final static QName _ContactPersonDEOResidenceNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ResidenceNumber_c");
    private final static QName _ContactPersonDEOReferenceNameC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ReferenceName_c");
    private final static QName _ContactAccountSourceSystemReferenceValue_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "AccountSourceSystemReferenceValue");
    private final static QName _ContactFaxCountryCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "FaxCountryCode");
    private final static QName _ContactPersonDEOPricingOfSolidSurfaceC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_PricingOfSolidSurface_c");
    private final static QName _ContactLastContactDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "LastContactDate");
    private final static QName _ContactLastName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "LastName");
    private final static QName _ContactWorkPhoneAreaCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "WorkPhoneAreaCode");
    private final static QName _ContactPersonDEOTeamLead3C_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_TeamLead3_c");
    private final static QName _ContactPreferredFunctionalCurrency_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PreferredFunctionalCurrency");
    private final static QName _ContactHeadOfHouseholdFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "HeadOfHouseholdFlag");
    private final static QName _ContactDateOfDeath_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "DateOfDeath");
    private final static QName _ContactPersonDEOTeamLead2C_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_TeamLead2_c");
    private final static QName _ContactPersonDEOProductAwareness1C_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ProductAwareness1_c");
    private final static QName _ContactFormattedFaxNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "FormattedFaxNumber");
    private final static QName _ContactHouseholdSize_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "HouseholdSize");
    private final static QName _ContactCertificationReasonCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "CertificationReasonCode");
    private final static QName _ContactHomePhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "HomePhoneNumber");
    private final static QName _ContactPersonDEOFeedbackOnSolidSurfaceC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_FeedbackOnSolidSurface_c");
    private final static QName _ContactPersonDEOPasswordC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Password_c");
    private final static QName _ContactExistingCustomerFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "ExistingCustomerFlag");
    private final static QName _ContactDoNotEmailFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "DoNotEmailFlag");
    private final static QName _ContactPersonDEOLevelC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Level_c");
    private final static QName _ContactCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "CurcyConvRateType");
    private final static QName _ContactPersonDEOReasonOfDecisionMaking1C_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ReasonOfDecisionMaking1_c");
    private final static QName _ContactPersonDEOAnniversaryC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Anniversary_c");
    private final static QName _ContactCreatedByModule_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "CreatedByModule");
    private final static QName _ContactMobileAreaCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "MobileAreaCode");
    private final static QName _ContactRentOrOwnIndicator_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "RentOrOwnIndicator");
    private final static QName _ContactPreviousLastName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PreviousLastName");
    private final static QName _ContactPersonDEOResidenceAddressC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_ResidenceAddress_c");
    private final static QName _ContactPersonDEOPresentationDone1C_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_PresentationDone1_c");
    private final static QName _ContactPersonDEOTeamLeadC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_TeamLead_c");
    private final static QName _ContactSalutation_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "Salutation");
    private final static QName _ContactPersonDEOFeedbackOnStonesC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_FeedbackOnStones_c");
    private final static QName _ContactAcademicTitle_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "AcademicTitle");
    private final static QName _ContactLastNamePrefix_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "LastNamePrefix");
    private final static QName _ContactDateOfBirth_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "DateOfBirth");
    private final static QName _ContactPersonDEORoleKIC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_RoleKI_c");
    private final static QName _ContactPersonDEOEMailIdOfficialC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_EMailIdOfficial_c");
    private final static QName _ContactMaritalStatusEffectiveDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "MaritalStatusEffectiveDate");
    private final static QName _ContactNamedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "NamedFlag");
    private final static QName _ContactPersonDEOSkypeC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", "PersonDEO_Skype_c");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.crmcommon.salesparties.contactservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link ContactResult }
     * 
     */
    public ContactResult createContactResult() {
        return new ContactResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "contact")
    public JAXBElement<Contact> createContact(Contact value) {
        return new JAXBElement<Contact>(_Contact_QNAME, Contact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "contactResult")
    public JAXBElement<ContactResult> createContactResult(ContactResult value) {
        return new JAXBElement<ContactResult>(_ContactResult_QNAME, ContactResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "ClassificationCode", scope = Contact.class)
    public JAXBElement<String> createContactClassificationCode(String value) {
        return new JAXBElement<String>(_ContactClassificationCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "OwnerPartyId", scope = Contact.class)
    public JAXBElement<Long> createContactOwnerPartyId(Long value) {
        return new JAXBElement<Long>(_ContactOwnerPartyId_QNAME, Long.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_TeamName_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOTeamNameC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOTeamNameC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "Type", scope = Contact.class)
    public JAXBElement<String> createContactType(String value) {
        return new JAXBElement<String>(_ContactType_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "NameSuffix", scope = Contact.class)
    public JAXBElement<String> createContactNameSuffix(String value) {
        return new JAXBElement<String>(_ContactNameSuffix_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_MobilePhone2_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOMobilePhone2C(String value) {
        return new JAXBElement<String>(_ContactPersonDEOMobilePhone2C_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "FormattedWorkPhoneNumber", scope = Contact.class)
    public JAXBElement<String> createContactFormattedWorkPhoneNumber(String value) {
        return new JAXBElement<String>(_ContactFormattedWorkPhoneNumber_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "AssignmentExceptionFlag", scope = Contact.class, defaultValue = "false")
    public JAXBElement<Boolean> createContactAssignmentExceptionFlag(Boolean value) {
        return new JAXBElement<Boolean>(_ContactAssignmentExceptionFlag_QNAME, Boolean.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_TINNo_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOTINNoC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOTINNoC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "RecordSet", scope = Contact.class)
    public JAXBElement<String> createContactRecordSet(String value) {
        return new JAXBElement<String>(_ContactRecordSet_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "Department", scope = Contact.class)
    public JAXBElement<String> createContactDepartment(String value) {
        return new JAXBElement<String>(_ContactDepartment_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "SalutoryIntroduction", scope = Contact.class)
    public JAXBElement<String> createContactSalutoryIntroduction(String value) {
        return new JAXBElement<String>(_ContactSalutoryIntroduction_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "MobileNumber", scope = Contact.class)
    public JAXBElement<String> createContactMobileNumber(String value) {
        return new JAXBElement<String>(_ContactMobileNumber_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ResidenceNo_c", scope = Contact.class)
    public JAXBElement<BigDecimal> createContactPersonDEOResidenceNoC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContactPersonDEOResidenceNoC_QNAME, BigDecimal.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "MaritalStatus", scope = Contact.class)
    public JAXBElement<String> createContactMaritalStatus(String value) {
        return new JAXBElement<String>(_ContactMaritalStatus_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ReasonOfDecisionMaking_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOReasonOfDecisionMakingC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOReasonOfDecisionMakingC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ReferenceContact_Id_c", scope = Contact.class)
    public JAXBElement<BigDecimal> createContactPersonDEOReferenceContactIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContactPersonDEOReferenceContactIdC_QNAME, BigDecimal.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "FavoriteContactFlag", scope = Contact.class)
    public JAXBElement<Boolean> createContactFavoriteContactFlag(Boolean value) {
        return new JAXBElement<Boolean>(_ContactFavoriteContactFlag_QNAME, Boolean.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "CurrencyCode", scope = Contact.class)
    public JAXBElement<String> createContactCurrencyCode(String value) {
        return new JAXBElement<String>(_ContactCurrencyCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PlaceOfBirth", scope = Contact.class)
    public JAXBElement<String> createContactPlaceOfBirth(String value) {
        return new JAXBElement<String>(_ContactPlaceOfBirth_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Source_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOSourceC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOSourceC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "Initials", scope = Contact.class)
    public JAXBElement<String> createContactInitials(String value) {
        return new JAXBElement<String>(_ContactInitials_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_PricingOfAcoustic_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOPricingOfAcousticC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOPricingOfAcousticC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_TotalRewardPoints_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOTotalRewardPointsC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOTotalRewardPointsC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_FeedbackOnAcoustic_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOFeedbackOnAcousticC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOFeedbackOnAcousticC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "SourceSystemReferenceValue", scope = Contact.class)
    public JAXBElement<String> createContactSourceSystemReferenceValue(String value) {
        return new JAXBElement<String>(_ContactSourceSystemReferenceValue_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "MyBusinessContact", scope = Contact.class)
    public JAXBElement<String> createContactMyBusinessContact(String value) {
        return new JAXBElement<String>(_ContactMyBusinessContact_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "JobTitle", scope = Contact.class)
    public JAXBElement<String> createContactJobTitle(String value) {
        return new JAXBElement<String>(_ContactJobTitle_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonalIncomeAmount", scope = Contact.class)
    public JAXBElement<AmountType> createContactPersonalIncomeAmount(AmountType value) {
        return new JAXBElement<AmountType>(_ContactPersonalIncomeAmount_QNAME, AmountType.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "SourceSystem", scope = Contact.class)
    public JAXBElement<String> createContactSourceSystem(String value) {
        return new JAXBElement<String>(_ContactSourceSystem_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ProductAwareness_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOProductAwarenessC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOProductAwarenessC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "JobTitleCode", scope = Contact.class)
    public JAXBElement<String> createContactJobTitleCode(String value) {
        return new JAXBElement<String>(_ContactJobTitleCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "DoNotMailFlag", scope = Contact.class)
    public JAXBElement<Boolean> createContactDoNotMailFlag(Boolean value) {
        return new JAXBElement<Boolean>(_ContactDoNotMailFlag_QNAME, Boolean.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "WorkPhoneCountryCode", scope = Contact.class)
    public JAXBElement<String> createContactWorkPhoneCountryCode(String value) {
        return new JAXBElement<String>(_ContactWorkPhoneCountryCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "SecondLastName", scope = Contact.class)
    public JAXBElement<String> createContactSecondLastName(String value) {
        return new JAXBElement<String>(_ContactSecondLastName_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "OwnerEmailAddress", scope = Contact.class)
    public JAXBElement<String> createContactOwnerEmailAddress(String value) {
        return new JAXBElement<String>(_ContactOwnerEmailAddress_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_IfOthersThenSpecify_c", scope = Contact.class)
    public JAXBElement<byte[]> createContactPersonDEOIfOthersThenSpecifyC(byte[] value) {
        return new JAXBElement<byte[]>(_ContactPersonDEOIfOthersThenSpecifyC_QNAME, byte[].class, Contact.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "DoNotCallFlag", scope = Contact.class)
    public JAXBElement<Boolean> createContactDoNotCallFlag(Boolean value) {
        return new JAXBElement<Boolean>(_ContactDoNotCallFlag_QNAME, Boolean.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Role_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEORoleC(String value) {
        return new JAXBElement<String>(_ContactPersonDEORoleC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "HomePhoneAreaCode", scope = Contact.class)
    public JAXBElement<String> createContactHomePhoneAreaCode(String value) {
        return new JAXBElement<String>(_ContactHomePhoneAreaCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ProductsHighlyInterestedIn1_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOProductsHighlyInterestedIn1C(String value) {
        return new JAXBElement<String>(_ContactPersonDEOProductsHighlyInterestedIn1C_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Account_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOAccountC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOAccountC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "EmailFormat", scope = Contact.class)
    public JAXBElement<String> createContactEmailFormat(String value) {
        return new JAXBElement<String>(_ContactEmailFormat_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_EducationalQualification_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOEducationalQualificationC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOEducationalQualificationC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "DepartmentCode", scope = Contact.class)
    public JAXBElement<String> createContactDepartmentCode(String value) {
        return new JAXBElement<String>(_ContactDepartmentCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_VarificationStatus_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOVarificationStatusC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOVarificationStatusC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "ContactIsPrimaryForAccount", scope = Contact.class)
    public JAXBElement<String> createContactContactIsPrimaryForAccount(String value) {
        return new JAXBElement<String>(_ContactContactIsPrimaryForAccount_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_TeamLead_LOV_Id_c", scope = Contact.class)
    public JAXBElement<BigDecimal> createContactPersonDEOTeamLeadLOVIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContactPersonDEOTeamLeadLOVIdC_QNAME, BigDecimal.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "AccountSourceSystem", scope = Contact.class)
    public JAXBElement<String> createContactAccountSourceSystem(String value) {
        return new JAXBElement<String>(_ContactAccountSourceSystem_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_SpouseDOB_c", scope = Contact.class)
    public JAXBElement<XMLGregorianCalendar> createContactPersonDEOSpouseDOBC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactPersonDEOSpouseDOBC_QNAME, XMLGregorianCalendar.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "LastAssignmentDateTime", scope = Contact.class)
    public JAXBElement<XMLGregorianCalendar> createContactLastAssignmentDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactLastAssignmentDateTime_QNAME, XMLGregorianCalendar.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "FaxAreaCode", scope = Contact.class)
    public JAXBElement<String> createContactFaxAreaCode(String value) {
        return new JAXBElement<String>(_ContactFaxAreaCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "FormattedHomePhoneNumber", scope = Contact.class)
    public JAXBElement<String> createContactFormattedHomePhoneNumber(String value) {
        return new JAXBElement<String>(_ContactFormattedHomePhoneNumber_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "HomePhoneCountryCode", scope = Contact.class)
    public JAXBElement<String> createContactHomePhoneCountryCode(String value) {
        return new JAXBElement<String>(_ContactHomePhoneCountryCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "Comments", scope = Contact.class)
    public JAXBElement<String> createContactComments(String value) {
        return new JAXBElement<String>(_ContactComments_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "WorkPhoneNumber", scope = Contact.class)
    public JAXBElement<String> createContactWorkPhoneNumber(String value) {
        return new JAXBElement<String>(_ContactWorkPhoneNumber_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Flag_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOFlagC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOFlagC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "LastAssignmentDate", scope = Contact.class)
    public JAXBElement<XMLGregorianCalendar> createContactLastAssignmentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactLastAssignmentDate_QNAME, XMLGregorianCalendar.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ProductsHighlyInterestedIn_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOProductsHighlyInterestedInC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOProductsHighlyInterestedInC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "DoNotContactFlag", scope = Contact.class)
    public JAXBElement<Boolean> createContactDoNotContactFlag(Boolean value) {
        return new JAXBElement<Boolean>(_ContactDoNotContactFlag_QNAME, Boolean.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "Gender", scope = Contact.class)
    public JAXBElement<String> createContactGender(String value) {
        return new JAXBElement<String>(_ContactGender_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "ClassificationCategory", scope = Contact.class)
    public JAXBElement<String> createContactClassificationCategory(String value) {
        return new JAXBElement<String>(_ContactClassificationCategory_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "DeclaredEthnicity", scope = Contact.class)
    public JAXBElement<String> createContactDeclaredEthnicity(String value) {
        return new JAXBElement<String>(_ContactDeclaredEthnicity_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_PersonalEmailId_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOPersonalEmailIdC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOPersonalEmailIdC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "SalesAffinityCode", scope = Contact.class)
    public JAXBElement<String> createContactSalesAffinityCode(String value) {
        return new JAXBElement<String>(_ContactSalesAffinityCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_TeamLead_LOV_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOTeamLeadLOVC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOTeamLeadLOVC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "MobileExtension", scope = Contact.class)
    public JAXBElement<String> createContactMobileExtension(String value) {
        return new JAXBElement<String>(_ContactMobileExtension_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "FaxExtension", scope = Contact.class)
    public JAXBElement<String> createContactFaxExtension(String value) {
        return new JAXBElement<String>(_ContactFaxExtension_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "CertificationLevel", scope = Contact.class)
    public JAXBElement<String> createContactCertificationLevel(String value) {
        return new JAXBElement<String>(_ContactCertificationLevel_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "SalesBuyingRoleCode", scope = Contact.class)
    public JAXBElement<String> createContactSalesBuyingRoleCode(String value) {
        return new JAXBElement<String>(_ContactSalesBuyingRoleCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Username_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOUsernameC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOUsernameC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ContactSource_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOContactSourceC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOContactSourceC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "FaxNumber", scope = Contact.class)
    public JAXBElement<String> createContactFaxNumber(String value) {
        return new JAXBElement<String>(_ContactFaxNumber_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_PresentationDone_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOPresentationDoneC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOPresentationDoneC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "TaxpayerIdentificationNumber", scope = Contact.class)
    public JAXBElement<String> createContactTaxpayerIdentificationNumber(String value) {
        return new JAXBElement<String>(_ContactTaxpayerIdentificationNumber_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "AccountPartyId", scope = Contact.class)
    public JAXBElement<Long> createContactAccountPartyId(Long value) {
        return new JAXBElement<Long>(_ContactAccountPartyId_QNAME, Long.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ReferenceContact_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOReferenceContactC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOReferenceContactC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "LastEnrichmentDate", scope = Contact.class)
    public JAXBElement<XMLGregorianCalendar> createContactLastEnrichmentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactLastEnrichmentDate_QNAME, XMLGregorianCalendar.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "FormattedMobileNumber", scope = Contact.class)
    public JAXBElement<String> createContactFormattedMobileNumber(String value) {
        return new JAXBElement<String>(_ContactFormattedMobileNumber_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "FirstName", scope = Contact.class)
    public JAXBElement<String> createContactFirstName(String value) {
        return new JAXBElement<String>(_ContactFirstName_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Type_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOTypeC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOTypeC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PreferredContactMethod", scope = Contact.class)
    public JAXBElement<String> createContactPreferredContactMethod(String value) {
        return new JAXBElement<String>(_ContactPreferredContactMethod_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "WorkPhoneExtension", scope = Contact.class)
    public JAXBElement<String> createContactWorkPhoneExtension(String value) {
        return new JAXBElement<String>(_ContactWorkPhoneExtension_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "MobileCountryCode", scope = Contact.class)
    public JAXBElement<String> createContactMobileCountryCode(String value) {
        return new JAXBElement<String>(_ContactMobileCountryCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "UniqueNameSuffix", scope = Contact.class)
    public JAXBElement<String> createContactUniqueNameSuffix(String value) {
        return new JAXBElement<String>(_ContactUniqueNameSuffix_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "ContactName", scope = Contact.class)
    public JAXBElement<String> createContactContactName(String value) {
        return new JAXBElement<String>(_ContactContactName_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "LastUpdateLogin", scope = Contact.class)
    public JAXBElement<String> createContactLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ContactLastUpdateLogin_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Mobile_c", scope = Contact.class)
    public JAXBElement<BigDecimal> createContactPersonDEOMobileC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContactPersonDEOMobileC_QNAME, BigDecimal.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "DataCloudStatus", scope = Contact.class)
    public JAXBElement<String> createContactDataCloudStatus(String value) {
        return new JAXBElement<String>(_ContactDataCloudStatus_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "Title", scope = Contact.class)
    public JAXBElement<String> createContactTitle(String value) {
        return new JAXBElement<String>(_ContactTitle_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_HighestLevelOfEducation_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOHighestLevelOfEducationC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOHighestLevelOfEducationC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "ExistingCustomerFlagLastUpdateDate", scope = Contact.class)
    public JAXBElement<XMLGregorianCalendar> createContactExistingCustomerFlagLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactExistingCustomerFlagLastUpdateDate_QNAME, XMLGregorianCalendar.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "SalesProfileStatus", scope = Contact.class)
    public JAXBElement<String> createContactSalesProfileStatus(String value) {
        return new JAXBElement<String>(_ContactSalesProfileStatus_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "MiddleName", scope = Contact.class)
    public JAXBElement<String> createContactMiddleName(String value) {
        return new JAXBElement<String>(_ContactMiddleName_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_SpouseName_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOSpouseNameC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOSpouseNameC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "CorpCurrencyCode", scope = Contact.class)
    public JAXBElement<String> createContactCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ContactCorpCurrencyCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_PrimaryFormattedAddress_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOPrimaryFormattedAddressC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOPrimaryFormattedAddressC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Reference_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOReferenceC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOReferenceC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ProductsPRSent_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOProductsPRSentC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOProductsPRSentC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_FeedbackOnOtherProducts_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOFeedbackOnOtherProductsC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOFeedbackOnOtherProductsC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Notes_c", scope = Contact.class)
    public JAXBElement<byte[]> createContactPersonDEONotesC(byte[] value) {
        return new JAXBElement<byte[]>(_ContactPersonDEONotesC_QNAME, byte[].class, Contact.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "HouseholdIncomeAmount", scope = Contact.class)
    public JAXBElement<AmountType> createContactHouseholdIncomeAmount(AmountType value) {
        return new JAXBElement<AmountType>(_ContactHouseholdIncomeAmount_QNAME, AmountType.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ResidenceNumber_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOResidenceNumberC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOResidenceNumberC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ReferenceName_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOReferenceNameC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOReferenceNameC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "AccountSourceSystemReferenceValue", scope = Contact.class)
    public JAXBElement<String> createContactAccountSourceSystemReferenceValue(String value) {
        return new JAXBElement<String>(_ContactAccountSourceSystemReferenceValue_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "FaxCountryCode", scope = Contact.class)
    public JAXBElement<String> createContactFaxCountryCode(String value) {
        return new JAXBElement<String>(_ContactFaxCountryCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_PricingOfSolidSurface_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOPricingOfSolidSurfaceC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOPricingOfSolidSurfaceC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "LastContactDate", scope = Contact.class)
    public JAXBElement<XMLGregorianCalendar> createContactLastContactDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactLastContactDate_QNAME, XMLGregorianCalendar.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "LastName", scope = Contact.class)
    public JAXBElement<String> createContactLastName(String value) {
        return new JAXBElement<String>(_ContactLastName_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "WorkPhoneAreaCode", scope = Contact.class)
    public JAXBElement<String> createContactWorkPhoneAreaCode(String value) {
        return new JAXBElement<String>(_ContactWorkPhoneAreaCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_TeamLead3_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOTeamLead3C(String value) {
        return new JAXBElement<String>(_ContactPersonDEOTeamLead3C_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PreferredFunctionalCurrency", scope = Contact.class)
    public JAXBElement<String> createContactPreferredFunctionalCurrency(String value) {
        return new JAXBElement<String>(_ContactPreferredFunctionalCurrency_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "HeadOfHouseholdFlag", scope = Contact.class, defaultValue = "false")
    public JAXBElement<Boolean> createContactHeadOfHouseholdFlag(Boolean value) {
        return new JAXBElement<Boolean>(_ContactHeadOfHouseholdFlag_QNAME, Boolean.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "DateOfDeath", scope = Contact.class)
    public JAXBElement<XMLGregorianCalendar> createContactDateOfDeath(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactDateOfDeath_QNAME, XMLGregorianCalendar.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_TeamLead2_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOTeamLead2C(String value) {
        return new JAXBElement<String>(_ContactPersonDEOTeamLead2C_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ProductAwareness1_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOProductAwareness1C(String value) {
        return new JAXBElement<String>(_ContactPersonDEOProductAwareness1C_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "FormattedFaxNumber", scope = Contact.class)
    public JAXBElement<String> createContactFormattedFaxNumber(String value) {
        return new JAXBElement<String>(_ContactFormattedFaxNumber_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "HouseholdSize", scope = Contact.class)
    public JAXBElement<BigDecimal> createContactHouseholdSize(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContactHouseholdSize_QNAME, BigDecimal.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "CertificationReasonCode", scope = Contact.class)
    public JAXBElement<String> createContactCertificationReasonCode(String value) {
        return new JAXBElement<String>(_ContactCertificationReasonCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "HomePhoneNumber", scope = Contact.class)
    public JAXBElement<String> createContactHomePhoneNumber(String value) {
        return new JAXBElement<String>(_ContactHomePhoneNumber_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_FeedbackOnSolidSurface_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOFeedbackOnSolidSurfaceC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOFeedbackOnSolidSurfaceC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Password_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOPasswordC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOPasswordC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "ExistingCustomerFlag", scope = Contact.class, defaultValue = "false")
    public JAXBElement<Boolean> createContactExistingCustomerFlag(Boolean value) {
        return new JAXBElement<Boolean>(_ContactExistingCustomerFlag_QNAME, Boolean.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "DoNotEmailFlag", scope = Contact.class)
    public JAXBElement<Boolean> createContactDoNotEmailFlag(Boolean value) {
        return new JAXBElement<Boolean>(_ContactDoNotEmailFlag_QNAME, Boolean.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Level_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOLevelC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOLevelC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "CurcyConvRateType", scope = Contact.class)
    public JAXBElement<String> createContactCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ContactCurcyConvRateType_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ReasonOfDecisionMaking1_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOReasonOfDecisionMaking1C(String value) {
        return new JAXBElement<String>(_ContactPersonDEOReasonOfDecisionMaking1C_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Anniversary_c", scope = Contact.class)
    public JAXBElement<XMLGregorianCalendar> createContactPersonDEOAnniversaryC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactPersonDEOAnniversaryC_QNAME, XMLGregorianCalendar.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "CreatedByModule", scope = Contact.class, defaultValue = "HZ_WS")
    public JAXBElement<String> createContactCreatedByModule(String value) {
        return new JAXBElement<String>(_ContactCreatedByModule_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "MobileAreaCode", scope = Contact.class)
    public JAXBElement<String> createContactMobileAreaCode(String value) {
        return new JAXBElement<String>(_ContactMobileAreaCode_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "RentOrOwnIndicator", scope = Contact.class)
    public JAXBElement<String> createContactRentOrOwnIndicator(String value) {
        return new JAXBElement<String>(_ContactRentOrOwnIndicator_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PreviousLastName", scope = Contact.class)
    public JAXBElement<String> createContactPreviousLastName(String value) {
        return new JAXBElement<String>(_ContactPreviousLastName_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_ResidenceAddress_c", scope = Contact.class)
    public JAXBElement<byte[]> createContactPersonDEOResidenceAddressC(byte[] value) {
        return new JAXBElement<byte[]>(_ContactPersonDEOResidenceAddressC_QNAME, byte[].class, Contact.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_PresentationDone1_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOPresentationDone1C(String value) {
        return new JAXBElement<String>(_ContactPersonDEOPresentationDone1C_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_TeamLead_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOTeamLeadC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOTeamLeadC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "Salutation", scope = Contact.class)
    public JAXBElement<String> createContactSalutation(String value) {
        return new JAXBElement<String>(_ContactSalutation_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_FeedbackOnStones_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOFeedbackOnStonesC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOFeedbackOnStonesC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "AcademicTitle", scope = Contact.class)
    public JAXBElement<String> createContactAcademicTitle(String value) {
        return new JAXBElement<String>(_ContactAcademicTitle_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "LastNamePrefix", scope = Contact.class)
    public JAXBElement<String> createContactLastNamePrefix(String value) {
        return new JAXBElement<String>(_ContactLastNamePrefix_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "DateOfBirth", scope = Contact.class)
    public JAXBElement<XMLGregorianCalendar> createContactDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactDateOfBirth_QNAME, XMLGregorianCalendar.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_RoleKI_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEORoleKIC(String value) {
        return new JAXBElement<String>(_ContactPersonDEORoleKIC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_EMailIdOfficial_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOEMailIdOfficialC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOEMailIdOfficialC_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "MaritalStatusEffectiveDate", scope = Contact.class)
    public JAXBElement<XMLGregorianCalendar> createContactMaritalStatusEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContactMaritalStatusEffectiveDate_QNAME, XMLGregorianCalendar.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "NamedFlag", scope = Contact.class, defaultValue = "false")
    public JAXBElement<Boolean> createContactNamedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_ContactNamedFlag_QNAME, Boolean.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/contactService/", name = "PersonDEO_Skype_c", scope = Contact.class)
    public JAXBElement<String> createContactPersonDEOSkypeC(String value) {
        return new JAXBElement<String>(_ContactPersonDEOSkypeC_QNAME, String.class, Contact.class, value);
    }

}

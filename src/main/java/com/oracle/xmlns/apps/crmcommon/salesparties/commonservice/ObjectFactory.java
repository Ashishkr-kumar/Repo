
package com.oracle.xmlns.apps.crmcommon.salesparties.commonservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.crmcommon.salesparties.commonservice package. 
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

    private final static QName _SalesTeamMember_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "salesTeamMember");
    private final static QName _PrimaryAddress_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "primaryAddress");
    private final static QName _SalesTeamMemberEndDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "EndDateActive");
    private final static QName _SalesTeamMemberUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "UserLastUpdateDate");
    private final static QName _SalesTeamMemberResourcePartyNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "ResourcePartyNumber");
    private final static QName _SalesTeamMemberAssignmentTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AssignmentTypeCode");
    private final static QName _SalesTeamMemberResourceId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "ResourceId");
    private final static QName _SalesTeamMemberLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "LastUpdateLogin");
    private final static QName _SalesTeamMemberStartDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "StartDateActive");
    private final static QName _SalesTeamMemberMemberFunctionCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "MemberFunctionCode");
    private final static QName _SalesTeamMemberResourceEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "ResourceEmailAddress");
    private final static QName _PrimaryAddressHouseType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "HouseType");
    private final static QName _PrimaryAddressAddressLinesPhonetic_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressLinesPhonetic");
    private final static QName _PrimaryAddressDescription_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Description");
    private final static QName _PrimaryAddressComments_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Comments");
    private final static QName _PrimaryAddressAddressElementAttribute4_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressElementAttribute4");
    private final static QName _PrimaryAddressAddressElementAttribute5_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressElementAttribute5");
    private final static QName _PrimaryAddressDateValidated_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "DateValidated");
    private final static QName _PrimaryAddressCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "CurrencyCode");
    private final static QName _PrimaryAddressProvince_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Province");
    private final static QName _PrimaryAddressFormattedAddress_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "FormattedAddress");
    private final static QName _PrimaryAddressCity_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "City");
    private final static QName _PrimaryAddressMailstop_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Mailstop");
    private final static QName _PrimaryAddressCounty_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "County");
    private final static QName _PrimaryAddressPostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "PostalCode");
    private final static QName _PrimaryAddressSourceSystemReferenceValue_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "SourceSystemReferenceValue");
    private final static QName _PrimaryAddressState_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "State");
    private final static QName _PrimaryAddressAddressLine4_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressLine4");
    private final static QName _PrimaryAddressLongitude_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Longitude");
    private final static QName _PrimaryAddressCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "CorpCurrencyCode");
    private final static QName _PrimaryAddressAddressLine1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressLine1");
    private final static QName _PrimaryAddressPostalPlus4Code_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "PostalPlus4Code");
    private final static QName _PrimaryAddressFormattedMultiLineAddress_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "FormattedMultiLineAddress");
    private final static QName _PrimaryAddressLocationDirections_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "LocationDirections");
    private final static QName _PrimaryAddressAddressLine3_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressLine3");
    private final static QName _PrimaryAddressSourceSystem_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "SourceSystem");
    private final static QName _PrimaryAddressAddressLine2_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressLine2");
    private final static QName _PrimaryAddressBuilding_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Building");
    private final static QName _PrimaryAddressDeleteFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "DeleteFlag");
    private final static QName _PrimaryAddressFloorNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "FloorNumber");
    private final static QName _PrimaryAddressValidationStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "ValidationStatusCode");
    private final static QName _PrimaryAddressCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "CurcyConvRateType");
    private final static QName _PrimaryAddressLatitude_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "Latitude");
    private final static QName _PrimaryAddressValidatedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "ValidatedFlag");
    private final static QName _PrimaryAddressAddressElementAttribute1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressElementAttribute1");
    private final static QName _PrimaryAddressAddressElementAttribute3_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressElementAttribute3");
    private final static QName _PrimaryAddressAddressElementAttribute2_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", "AddressElementAttribute2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.crmcommon.salesparties.commonservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SalesTeamMember }
     * 
     */
    public SalesTeamMember createSalesTeamMember() {
        return new SalesTeamMember();
    }

    /**
     * Create an instance of {@link PrimaryAddress }
     * 
     */
    public PrimaryAddress createPrimaryAddress() {
        return new PrimaryAddress();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesTeamMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "salesTeamMember")
    public JAXBElement<SalesTeamMember> createSalesTeamMember(SalesTeamMember value) {
        return new JAXBElement<SalesTeamMember>(_SalesTeamMember_QNAME, SalesTeamMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimaryAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "primaryAddress")
    public JAXBElement<PrimaryAddress> createPrimaryAddress(PrimaryAddress value) {
        return new JAXBElement<PrimaryAddress>(_PrimaryAddress_QNAME, PrimaryAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "EndDateActive", scope = SalesTeamMember.class)
    public JAXBElement<XMLGregorianCalendar> createSalesTeamMemberEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesTeamMemberEndDateActive_QNAME, XMLGregorianCalendar.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "UserLastUpdateDate", scope = SalesTeamMember.class)
    public JAXBElement<XMLGregorianCalendar> createSalesTeamMemberUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesTeamMemberUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "ResourcePartyNumber", scope = SalesTeamMember.class)
    public JAXBElement<String> createSalesTeamMemberResourcePartyNumber(String value) {
        return new JAXBElement<String>(_SalesTeamMemberResourcePartyNumber_QNAME, String.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AssignmentTypeCode", scope = SalesTeamMember.class, defaultValue = "MANUAL")
    public JAXBElement<String> createSalesTeamMemberAssignmentTypeCode(String value) {
        return new JAXBElement<String>(_SalesTeamMemberAssignmentTypeCode_QNAME, String.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "ResourceId", scope = SalesTeamMember.class)
    public JAXBElement<Long> createSalesTeamMemberResourceId(Long value) {
        return new JAXBElement<Long>(_SalesTeamMemberResourceId_QNAME, Long.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "LastUpdateLogin", scope = SalesTeamMember.class)
    public JAXBElement<String> createSalesTeamMemberLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SalesTeamMemberLastUpdateLogin_QNAME, String.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "StartDateActive", scope = SalesTeamMember.class)
    public JAXBElement<XMLGregorianCalendar> createSalesTeamMemberStartDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SalesTeamMemberStartDateActive_QNAME, XMLGregorianCalendar.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "MemberFunctionCode", scope = SalesTeamMember.class)
    public JAXBElement<String> createSalesTeamMemberMemberFunctionCode(String value) {
        return new JAXBElement<String>(_SalesTeamMemberMemberFunctionCode_QNAME, String.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "ResourceEmailAddress", scope = SalesTeamMember.class)
    public JAXBElement<String> createSalesTeamMemberResourceEmailAddress(String value) {
        return new JAXBElement<String>(_SalesTeamMemberResourceEmailAddress_QNAME, String.class, SalesTeamMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "HouseType", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressHouseType(String value) {
        return new JAXBElement<String>(_PrimaryAddressHouseType_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressLinesPhonetic", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressLinesPhonetic(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressLinesPhonetic_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Description", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressDescription(String value) {
        return new JAXBElement<String>(_PrimaryAddressDescription_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Comments", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressComments(String value) {
        return new JAXBElement<String>(_PrimaryAddressComments_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressElementAttribute4", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressElementAttribute4(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressElementAttribute4_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "LastUpdateLogin", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SalesTeamMemberLastUpdateLogin_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressElementAttribute5", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressElementAttribute5(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressElementAttribute5_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "DateValidated", scope = PrimaryAddress.class)
    public JAXBElement<XMLGregorianCalendar> createPrimaryAddressDateValidated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrimaryAddressDateValidated_QNAME, XMLGregorianCalendar.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "CurrencyCode", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressCurrencyCode(String value) {
        return new JAXBElement<String>(_PrimaryAddressCurrencyCode_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Province", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressProvince(String value) {
        return new JAXBElement<String>(_PrimaryAddressProvince_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "FormattedAddress", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressFormattedAddress(String value) {
        return new JAXBElement<String>(_PrimaryAddressFormattedAddress_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "City", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressCity(String value) {
        return new JAXBElement<String>(_PrimaryAddressCity_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Mailstop", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressMailstop(String value) {
        return new JAXBElement<String>(_PrimaryAddressMailstop_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "County", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressCounty(String value) {
        return new JAXBElement<String>(_PrimaryAddressCounty_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "PostalCode", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressPostalCode(String value) {
        return new JAXBElement<String>(_PrimaryAddressPostalCode_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "SourceSystemReferenceValue", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressSourceSystemReferenceValue(String value) {
        return new JAXBElement<String>(_PrimaryAddressSourceSystemReferenceValue_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "State", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressState(String value) {
        return new JAXBElement<String>(_PrimaryAddressState_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressLine4", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressLine4(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressLine4_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Longitude", scope = PrimaryAddress.class)
    public JAXBElement<BigDecimal> createPrimaryAddressLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PrimaryAddressLongitude_QNAME, BigDecimal.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "CorpCurrencyCode", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_PrimaryAddressCorpCurrencyCode_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressLine1", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressLine1(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressLine1_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "PostalPlus4Code", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressPostalPlus4Code(String value) {
        return new JAXBElement<String>(_PrimaryAddressPostalPlus4Code_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "FormattedMultiLineAddress", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressFormattedMultiLineAddress(String value) {
        return new JAXBElement<String>(_PrimaryAddressFormattedMultiLineAddress_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "LocationDirections", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressLocationDirections(String value) {
        return new JAXBElement<String>(_PrimaryAddressLocationDirections_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressLine3", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressLine3(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressLine3_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "SourceSystem", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressSourceSystem(String value) {
        return new JAXBElement<String>(_PrimaryAddressSourceSystem_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressLine2", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressLine2(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressLine2_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Building", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressBuilding(String value) {
        return new JAXBElement<String>(_PrimaryAddressBuilding_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "DeleteFlag", scope = PrimaryAddress.class)
    public JAXBElement<Boolean> createPrimaryAddressDeleteFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PrimaryAddressDeleteFlag_QNAME, Boolean.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "FloorNumber", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressFloorNumber(String value) {
        return new JAXBElement<String>(_PrimaryAddressFloorNumber_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "ValidationStatusCode", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressValidationStatusCode(String value) {
        return new JAXBElement<String>(_PrimaryAddressValidationStatusCode_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "CurcyConvRateType", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressCurcyConvRateType(String value) {
        return new JAXBElement<String>(_PrimaryAddressCurcyConvRateType_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "Latitude", scope = PrimaryAddress.class)
    public JAXBElement<BigDecimal> createPrimaryAddressLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PrimaryAddressLatitude_QNAME, BigDecimal.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "ValidatedFlag", scope = PrimaryAddress.class)
    public JAXBElement<Boolean> createPrimaryAddressValidatedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_PrimaryAddressValidatedFlag_QNAME, Boolean.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressElementAttribute1", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressElementAttribute1(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressElementAttribute1_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressElementAttribute3", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressElementAttribute3(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressElementAttribute3_QNAME, String.class, PrimaryAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/salesParties/commonService/", name = "AddressElementAttribute2", scope = PrimaryAddress.class)
    public JAXBElement<String> createPrimaryAddressAddressElementAttribute2(String value) {
        return new JAXBElement<String>(_PrimaryAddressAddressElementAttribute2_QNAME, String.class, PrimaryAddress.class, value);
    }

}

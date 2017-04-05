
package com.oracle.xmlns.apps.cdm.foundation.parties.personservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.personservice package. 
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

    private final static QName _SampleProductsC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "sampleProducts_c");
    private final static QName _ChildrenDetailsC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "childrenDetails_c");
    private final static QName _ChildrenDetailsCCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CorpCurrencyCode");
    private final static QName _ChildrenDetailsCJobDefinitionPackage_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "JobDefinitionPackage");
    private final static QName _ChildrenDetailsCCpdrfVerPillar_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CpdrfVerPillar");
    private final static QName _ChildrenDetailsCCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CurcyConvRateType");
    private final static QName _ChildrenDetailsCGenderChildrenC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "GenderChildren_c");
    private final static QName _ChildrenDetailsCIsOwner_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "IsOwner");
    private final static QName _ChildrenDetailsCPersonProfileIdC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "PersonProfile_Id_c");
    private final static QName _ChildrenDetailsCRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "RequestId");
    private final static QName _ChildrenDetailsCUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "UserLastUpdateDate");
    private final static QName _ChildrenDetailsCJobDefinitionName_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "JobDefinitionName");
    private final static QName _ChildrenDetailsCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CurrencyCode");
    private final static QName _ChildrenDetailsCObjectVersionNumber_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ObjectVersionNumber");
    private final static QName _ChildrenDetailsCChildrenNameC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ChildrenName_c");
    private final static QName _ChildrenDetailsCCpdrfLastUpd_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CpdrfLastUpd");
    private final static QName _ChildrenDetailsCCpdrfVerSor_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "CpdrfVerSor");
    private final static QName _ChildrenDetailsCLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "LastUpdateLogin");
    private final static QName _ChildrenDetailsCDOBChildrenC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DOBChildren_c");
    private final static QName _SampleProductsCQuantityC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Quantity_c");
    private final static QName _SampleProductsCSampleProductNameIdC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SampleProductName_Id_c");
    private final static QName _SampleProductsCCommentsC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Comments_c");
    private final static QName _SampleProductsCStatusC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "Status_c");
    private final static QName _SampleProductsCInStockC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "InStock_c");
    private final static QName _SampleProductsCDeliveredDateC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "DeliveredDate_c");
    private final static QName _SampleProductsCSampleProductNameC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "SampleProductName_c");
    private final static QName _SampleProductsCReturnStatusC_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", "ReturnStatus_c");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.personservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChildrenDetailsC }
     * 
     */
    public ChildrenDetailsC createChildrenDetailsC() {
        return new ChildrenDetailsC();
    }

    /**
     * Create an instance of {@link SampleProductsC }
     * 
     */
    public SampleProductsC createSampleProductsC() {
        return new SampleProductsC();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleProductsC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "sampleProducts_c")
    public JAXBElement<SampleProductsC> createSampleProductsC(SampleProductsC value) {
        return new JAXBElement<SampleProductsC>(_SampleProductsC_QNAME, SampleProductsC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildrenDetailsC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "childrenDetails_c")
    public JAXBElement<ChildrenDetailsC> createChildrenDetailsC(ChildrenDetailsC value) {
        return new JAXBElement<ChildrenDetailsC>(_ChildrenDetailsC_QNAME, ChildrenDetailsC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CorpCurrencyCode", scope = ChildrenDetailsC.class)
    public JAXBElement<String> createChildrenDetailsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCCorpCurrencyCode_QNAME, String.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "JobDefinitionPackage", scope = ChildrenDetailsC.class)
    public JAXBElement<String> createChildrenDetailsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCJobDefinitionPackage_QNAME, String.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CpdrfVerPillar", scope = ChildrenDetailsC.class)
    public JAXBElement<Integer> createChildrenDetailsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ChildrenDetailsCCpdrfVerPillar_QNAME, Integer.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CurcyConvRateType", scope = ChildrenDetailsC.class)
    public JAXBElement<String> createChildrenDetailsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCCurcyConvRateType_QNAME, String.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "GenderChildren_c", scope = ChildrenDetailsC.class)
    public JAXBElement<String> createChildrenDetailsCGenderChildrenC(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCGenderChildrenC_QNAME, String.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "IsOwner", scope = ChildrenDetailsC.class)
    public JAXBElement<String> createChildrenDetailsCIsOwner(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCIsOwner_QNAME, String.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonProfile_Id_c", scope = ChildrenDetailsC.class)
    public JAXBElement<BigDecimal> createChildrenDetailsCPersonProfileIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ChildrenDetailsCPersonProfileIdC_QNAME, BigDecimal.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = ChildrenDetailsC.class)
    public JAXBElement<Long> createChildrenDetailsCRequestId(Long value) {
        return new JAXBElement<Long>(_ChildrenDetailsCRequestId_QNAME, Long.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "UserLastUpdateDate", scope = ChildrenDetailsC.class)
    public JAXBElement<XMLGregorianCalendar> createChildrenDetailsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ChildrenDetailsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "JobDefinitionName", scope = ChildrenDetailsC.class)
    public JAXBElement<String> createChildrenDetailsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCJobDefinitionName_QNAME, String.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CurrencyCode", scope = ChildrenDetailsC.class)
    public JAXBElement<String> createChildrenDetailsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCCurrencyCode_QNAME, String.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ObjectVersionNumber", scope = ChildrenDetailsC.class)
    public JAXBElement<BigDecimal> createChildrenDetailsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ChildrenDetailsCObjectVersionNumber_QNAME, BigDecimal.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ChildrenName_c", scope = ChildrenDetailsC.class)
    public JAXBElement<String> createChildrenDetailsCChildrenNameC(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCChildrenNameC_QNAME, String.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CpdrfLastUpd", scope = ChildrenDetailsC.class)
    public JAXBElement<String> createChildrenDetailsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCCpdrfLastUpd_QNAME, String.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CpdrfVerSor", scope = ChildrenDetailsC.class)
    public JAXBElement<Integer> createChildrenDetailsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ChildrenDetailsCCpdrfVerSor_QNAME, Integer.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = ChildrenDetailsC.class)
    public JAXBElement<String> createChildrenDetailsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCLastUpdateLogin_QNAME, String.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DOBChildren_c", scope = ChildrenDetailsC.class)
    public JAXBElement<XMLGregorianCalendar> createChildrenDetailsCDOBChildrenC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ChildrenDetailsCDOBChildrenC_QNAME, XMLGregorianCalendar.class, ChildrenDetailsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Quantity_c", scope = SampleProductsC.class)
    public JAXBElement<BigDecimal> createSampleProductsCQuantityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleProductsCQuantityC_QNAME, BigDecimal.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CorpCurrencyCode", scope = SampleProductsC.class)
    public JAXBElement<String> createSampleProductsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCCorpCurrencyCode_QNAME, String.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SampleProductName_Id_c", scope = SampleProductsC.class)
    public JAXBElement<BigDecimal> createSampleProductsCSampleProductNameIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleProductsCSampleProductNameIdC_QNAME, BigDecimal.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Comments_c", scope = SampleProductsC.class)
    public JAXBElement<String> createSampleProductsCCommentsC(String value) {
        return new JAXBElement<String>(_SampleProductsCCommentsC_QNAME, String.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "JobDefinitionPackage", scope = SampleProductsC.class)
    public JAXBElement<String> createSampleProductsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCJobDefinitionPackage_QNAME, String.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CpdrfVerPillar", scope = SampleProductsC.class)
    public JAXBElement<Integer> createSampleProductsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ChildrenDetailsCCpdrfVerPillar_QNAME, Integer.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CurcyConvRateType", scope = SampleProductsC.class)
    public JAXBElement<String> createSampleProductsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCCurcyConvRateType_QNAME, String.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "IsOwner", scope = SampleProductsC.class)
    public JAXBElement<String> createSampleProductsCIsOwner(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCIsOwner_QNAME, String.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "PersonProfile_Id_c", scope = SampleProductsC.class)
    public JAXBElement<BigDecimal> createSampleProductsCPersonProfileIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ChildrenDetailsCPersonProfileIdC_QNAME, BigDecimal.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "RequestId", scope = SampleProductsC.class)
    public JAXBElement<Long> createSampleProductsCRequestId(Long value) {
        return new JAXBElement<Long>(_ChildrenDetailsCRequestId_QNAME, Long.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "UserLastUpdateDate", scope = SampleProductsC.class)
    public JAXBElement<XMLGregorianCalendar> createSampleProductsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ChildrenDetailsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "JobDefinitionName", scope = SampleProductsC.class)
    public JAXBElement<String> createSampleProductsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCJobDefinitionName_QNAME, String.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "Status_c", scope = SampleProductsC.class)
    public JAXBElement<String> createSampleProductsCStatusC(String value) {
        return new JAXBElement<String>(_SampleProductsCStatusC_QNAME, String.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "InStock_c", scope = SampleProductsC.class)
    public JAXBElement<BigDecimal> createSampleProductsCInStockC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SampleProductsCInStockC_QNAME, BigDecimal.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CurrencyCode", scope = SampleProductsC.class)
    public JAXBElement<String> createSampleProductsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCCurrencyCode_QNAME, String.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "DeliveredDate_c", scope = SampleProductsC.class)
    public JAXBElement<XMLGregorianCalendar> createSampleProductsCDeliveredDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SampleProductsCDeliveredDateC_QNAME, XMLGregorianCalendar.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ObjectVersionNumber", scope = SampleProductsC.class)
    public JAXBElement<BigDecimal> createSampleProductsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ChildrenDetailsCObjectVersionNumber_QNAME, BigDecimal.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CpdrfLastUpd", scope = SampleProductsC.class)
    public JAXBElement<String> createSampleProductsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCCpdrfLastUpd_QNAME, String.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "SampleProductName_c", scope = SampleProductsC.class)
    public JAXBElement<String> createSampleProductsCSampleProductNameC(String value) {
        return new JAXBElement<String>(_SampleProductsCSampleProductNameC_QNAME, String.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "CpdrfVerSor", scope = SampleProductsC.class)
    public JAXBElement<Integer> createSampleProductsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ChildrenDetailsCCpdrfVerSor_QNAME, Integer.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "LastUpdateLogin", scope = SampleProductsC.class)
    public JAXBElement<String> createSampleProductsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ChildrenDetailsCLastUpdateLogin_QNAME, String.class, SampleProductsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", name = "ReturnStatus_c", scope = SampleProductsC.class)
    public JAXBElement<String> createSampleProductsCReturnStatusC(String value) {
        return new JAXBElement<String>(_SampleProductsCReturnStatusC_QNAME, String.class, SampleProductsC.class, value);
    }

}

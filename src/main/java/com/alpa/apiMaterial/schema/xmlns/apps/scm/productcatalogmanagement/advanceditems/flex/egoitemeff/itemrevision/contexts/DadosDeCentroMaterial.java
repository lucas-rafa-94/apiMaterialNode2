//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.07 at 02:00:32 AM BRT 
//


package com.alpa.apiMaterial.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.itemrevision.contexts;

import com.alpa.apiMaterial.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.protectedmodel.ItemRevisionEffBase;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.Objects;


/**
 * <p>Java class for DadosDeCentroMaterial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosDeCentroMaterial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/protectedModel/}ItemRevisionEffBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RaiseEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPersistentAttributeUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAddedToChildEntitiesMap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsImportCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RedLineid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinematnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="werks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="werks_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinewerks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinewerks_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lvorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lvorm_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinelvorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinelvorm_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mmsta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinemmsta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mmstd" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/&gt;
 *         &lt;element name="RedLinemmstd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mtorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinemtorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matgr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinematgr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="steuc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinesteuc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosDeCentroMaterial", propOrder = {
    "raiseEvent",
    "isPersistentAttributeUpdated",
    "isAddedToChildEntitiesMap",
    "isImportCase",
    "id",
    "redLineid",
    "matnr",
    "redLinematnr",
    "werks",
    "werksDisplay",
    "redLinewerks",
    "redLinewerksDisplay",
    "lvorm",
    "lvormDisplay",
    "redLinelvorm",
    "redLinelvormDisplay",
    "mmsta",
    "redLinemmsta",
    "mmstd",
    "redLinemmstd",
    "mtorg",
    "redLinemtorg",
    "matgr",
    "redLinematgr",
    "steuc",
    "redLinesteuc"
})
public class DadosDeCentroMaterial
    extends ItemRevisionEffBase
{

    @XmlElementRef(name = "RaiseEvent", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> raiseEvent;
    @XmlElementRef(name = "IsPersistentAttributeUpdated", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPersistentAttributeUpdated;
    @XmlElementRef(name = "IsAddedToChildEntitiesMap", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAddedToChildEntitiesMap;
    @XmlElementRef(name = "IsImportCase", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isImportCase;
    protected BigDecimal id;
    @XmlElementRef(name = "RedLineid", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLineid;
    @XmlElementRef(name = "matnr", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> matnr;
    @XmlElementRef(name = "RedLinematnr", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinematnr;
    @XmlElementRef(name = "werks", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> werks;
    @XmlElementRef(name = "werks_Display", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> werksDisplay;
    @XmlElementRef(name = "RedLinewerks", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinewerks;
    @XmlElementRef(name = "RedLinewerks_Display", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinewerksDisplay;
    @XmlElementRef(name = "lvorm", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lvorm;
    @XmlElementRef(name = "lvorm_Display", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lvormDisplay;
    @XmlElementRef(name = "RedLinelvorm", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinelvorm;
    @XmlElementRef(name = "RedLinelvorm_Display", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinelvormDisplay;
    @XmlElementRef(name = "mmsta", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mmsta;
    @XmlElementRef(name = "RedLinemmsta", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinemmsta;
    @XmlElementRef(name = "mmstd", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> mmstd;
    @XmlElementRef(name = "RedLinemmstd", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinemmstd;
    @XmlElementRef(name = "mtorg", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mtorg;
    @XmlElementRef(name = "RedLinemtorg", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinemtorg;
    @XmlElementRef(name = "matgr", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> matgr;
    @XmlElementRef(name = "RedLinematgr", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinematgr;
    @XmlElementRef(name = "steuc", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> steuc;
    @XmlElementRef(name = "RedLinesteuc", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinesteuc;

    /**
     * Gets the value of the raiseEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRaiseEvent() {
        return raiseEvent;
    }

    /**
     * Sets the value of the raiseEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRaiseEvent(JAXBElement<String> value) {
        this.raiseEvent = value;
    }

    /**
     * Gets the value of the isPersistentAttributeUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPersistentAttributeUpdated() {
        return isPersistentAttributeUpdated;
    }

    /**
     * Sets the value of the isPersistentAttributeUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPersistentAttributeUpdated(JAXBElement<Boolean> value) {
        this.isPersistentAttributeUpdated = value;
    }

    /**
     * Gets the value of the isAddedToChildEntitiesMap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAddedToChildEntitiesMap() {
        return isAddedToChildEntitiesMap;
    }

    /**
     * Sets the value of the isAddedToChildEntitiesMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAddedToChildEntitiesMap(JAXBElement<Boolean> value) {
        this.isAddedToChildEntitiesMap = value;
    }

    /**
     * Gets the value of the isImportCase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsImportCase() {
        return isImportCase;
    }

    /**
     * Sets the value of the isImportCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsImportCase(JAXBElement<Boolean> value) {
        this.isImportCase = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the redLineid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLineid() {
        return redLineid;
    }

    /**
     * Sets the value of the redLineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLineid(JAXBElement<String> value) {
        this.redLineid = value;
    }

    /**
     * Gets the value of the matnr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatnr() {
        return matnr;
    }

    /**
     * Sets the value of the matnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatnr(JAXBElement<String> value) {
        this.matnr = value;
    }

    /**
     * Gets the value of the redLinematnr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinematnr() {
        return redLinematnr;
    }

    /**
     * Sets the value of the redLinematnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinematnr(JAXBElement<String> value) {
        this.redLinematnr = value;
    }

    /**
     * Gets the value of the werks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWerks() {
        return werks;
    }

    /**
     * Sets the value of the werks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWerks(JAXBElement<String> value) {
        this.werks = value;
    }

    /**
     * Gets the value of the werksDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWerksDisplay() {
        return werksDisplay;
    }

    /**
     * Sets the value of the werksDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWerksDisplay(JAXBElement<String> value) {
        this.werksDisplay = value;
    }

    /**
     * Gets the value of the redLinewerks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinewerks() {
        return redLinewerks;
    }

    /**
     * Sets the value of the redLinewerks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinewerks(JAXBElement<String> value) {
        this.redLinewerks = value;
    }

    /**
     * Gets the value of the redLinewerksDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinewerksDisplay() {
        return redLinewerksDisplay;
    }

    /**
     * Sets the value of the redLinewerksDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinewerksDisplay(JAXBElement<String> value) {
        this.redLinewerksDisplay = value;
    }

    /**
     * Gets the value of the lvorm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLvorm() {
        return lvorm;
    }

    /**
     * Sets the value of the lvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLvorm(JAXBElement<String> value) {
        this.lvorm = value;
    }

    /**
     * Gets the value of the lvormDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLvormDisplay() {
        return lvormDisplay;
    }

    /**
     * Sets the value of the lvormDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLvormDisplay(JAXBElement<String> value) {
        this.lvormDisplay = value;
    }

    /**
     * Gets the value of the redLinelvorm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinelvorm() {
        return redLinelvorm;
    }

    /**
     * Sets the value of the redLinelvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinelvorm(JAXBElement<String> value) {
        this.redLinelvorm = value;
    }

    /**
     * Gets the value of the redLinelvormDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinelvormDisplay() {
        return redLinelvormDisplay;
    }

    /**
     * Sets the value of the redLinelvormDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinelvormDisplay(JAXBElement<String> value) {
        this.redLinelvormDisplay = value;
    }

    /**
     * Gets the value of the mmsta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMmsta() {
        return mmsta;
    }

    /**
     * Sets the value of the mmsta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMmsta(JAXBElement<String> value) {
        this.mmsta = value;
    }

    /**
     * Gets the value of the redLinemmsta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinemmsta() {
        return redLinemmsta;
    }

    /**
     * Sets the value of the redLinemmsta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinemmsta(JAXBElement<String> value) {
        this.redLinemmsta = value;
    }

    /**
     * Gets the value of the mmstd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMmstd() {
        return mmstd;
    }

    /**
     * Sets the value of the mmstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMmstd(JAXBElement<XMLGregorianCalendar> value) {
        this.mmstd = value;
    }

    /**
     * Gets the value of the redLinemmstd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinemmstd() {
        return redLinemmstd;
    }

    /**
     * Sets the value of the redLinemmstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinemmstd(JAXBElement<String> value) {
        this.redLinemmstd = value;
    }

    /**
     * Gets the value of the mtorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMtorg() {
        return mtorg;
    }

    /**
     * Sets the value of the mtorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMtorg(JAXBElement<String> value) {
        this.mtorg = value;
    }

    /**
     * Gets the value of the redLinemtorg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinemtorg() {
        return redLinemtorg;
    }

    /**
     * Sets the value of the redLinemtorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinemtorg(JAXBElement<String> value) {
        this.redLinemtorg = value;
    }

    /**
     * Gets the value of the matgr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatgr() {
        return matgr;
    }

    /**
     * Sets the value of the matgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatgr(JAXBElement<String> value) {
        this.matgr = value;
    }

    /**
     * Gets the value of the redLinematgr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinematgr() {
        return redLinematgr;
    }

    /**
     * Sets the value of the redLinematgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinematgr(JAXBElement<String> value) {
        this.redLinematgr = value;
    }

    /**
     * Gets the value of the steuc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSteuc() {
        return steuc;
    }

    /**
     * Sets the value of the steuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSteuc(JAXBElement<String> value) {
        this.steuc = value;
    }

    /**
     * Gets the value of the redLinesteuc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinesteuc() {
        return redLinesteuc;
    }

    /**
     * Sets the value of the redLinesteuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinesteuc(JAXBElement<String> value) {
        this.redLinesteuc = value;
    }


    public boolean equals(DadosDeCentroMaterial o, DadosDeCentroMaterial o1) {
        if(o.getMatgr().getValue().equals(o1.getMatgr().getValue()) && o.getWerks().getValue().equals(o1.getWerks().getValue())){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatnr(), getWerks());
    }
}

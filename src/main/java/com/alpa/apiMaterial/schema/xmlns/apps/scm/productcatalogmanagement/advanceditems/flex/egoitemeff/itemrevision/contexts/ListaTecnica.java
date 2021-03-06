//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.07 at 02:00:32 AM BRT 
//


package com.alpa.apiMaterial.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.itemrevision.contexts;

import com.alpa.apiMaterial.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.protectedmodel.ItemRevisionEffBase;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.Objects;


/**
 * <p>Java class for ListaTecnica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaTecnica"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/protectedModel/}ItemRevisionEffBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RaiseEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPersistentAttributeUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAddedToChildEntitiesMap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsImportCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="werks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="werks_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinewerks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinewerks_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="j3akordxl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinej3akordxl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bmein" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinebmein" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bmeng" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RedLinebmeng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idnrk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLineidnrk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinemeins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="menge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RedLinemenge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="j3apgnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinej3apgnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="j3akordx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinej3akordx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmeng" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RedLinecmeng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaTecnica", propOrder = {
    "raiseEvent",
    "isPersistentAttributeUpdated",
    "isAddedToChildEntitiesMap",
    "isImportCase",
    "werks",
    "werksDisplay",
    "redLinewerks",
    "redLinewerksDisplay",
    "j3Akordxl",
    "redLinej3Akordxl",
    "bmein",
    "redLinebmein",
    "bmeng",
    "redLinebmeng",
    "idnrk",
    "redLineidnrk",
    "meins",
    "redLinemeins",
    "menge",
    "redLinemenge",
    "j3Apgnr",
    "redLinej3Apgnr",
    "j3Akordx",
    "redLinej3Akordx",
    "cmeng",
    "redLinecmeng"
})
public class ListaTecnica
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
    protected String werks;
    @XmlElementRef(name = "werks_Display", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> werksDisplay;
    @XmlElementRef(name = "RedLinewerks", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinewerks;
    @XmlElementRef(name = "RedLinewerks_Display", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinewerksDisplay;
    @XmlElement(name = "j3akordxl")
    protected String j3Akordxl;
    @XmlElementRef(name = "RedLinej3akordxl", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinej3Akordxl;
    @XmlElementRef(name = "bmein", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bmein;
    @XmlElementRef(name = "RedLinebmein", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinebmein;
    @XmlElementRef(name = "bmeng", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> bmeng;
    @XmlElementRef(name = "RedLinebmeng", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinebmeng;
    @XmlElementRef(name = "idnrk", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idnrk;
    @XmlElementRef(name = "RedLineidnrk", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLineidnrk;
    @XmlElementRef(name = "meins", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> meins;
    @XmlElementRef(name = "RedLinemeins", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinemeins;
    @XmlElementRef(name = "menge", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> menge;
    @XmlElementRef(name = "RedLinemenge", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinemenge;
    @XmlElementRef(name = "j3apgnr", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> j3Apgnr;
    @XmlElementRef(name = "RedLinej3apgnr", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinej3Apgnr;
    @XmlElement(name = "j3akordx")
    protected String j3Akordx;
    @XmlElementRef(name = "RedLinej3akordx", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinej3Akordx;
    @XmlElementRef(name = "cmeng", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> cmeng;
    @XmlElementRef(name = "RedLinecmeng", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinecmeng;

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
     * Gets the value of the werks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWerks() {
        return werks;
    }

    /**
     * Sets the value of the werks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWerks(String value) {
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
     * Gets the value of the j3Akordxl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJ3Akordxl() {
        return j3Akordxl;
    }

    /**
     * Sets the value of the j3Akordxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJ3Akordxl(String value) {
        this.j3Akordxl = value;
    }

    /**
     * Gets the value of the redLinej3Akordxl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinej3Akordxl() {
        return redLinej3Akordxl;
    }

    /**
     * Sets the value of the redLinej3Akordxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinej3Akordxl(JAXBElement<String> value) {
        this.redLinej3Akordxl = value;
    }

    /**
     * Gets the value of the bmein property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBmein() {
        return bmein;
    }

    /**
     * Sets the value of the bmein property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBmein(JAXBElement<String> value) {
        this.bmein = value;
    }

    /**
     * Gets the value of the redLinebmein property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinebmein() {
        return redLinebmein;
    }

    /**
     * Sets the value of the redLinebmein property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinebmein(JAXBElement<String> value) {
        this.redLinebmein = value;
    }

    /**
     * Gets the value of the bmeng property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBmeng() {
        return bmeng;
    }

    /**
     * Sets the value of the bmeng property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBmeng(JAXBElement<BigDecimal> value) {
        this.bmeng = value;
    }

    /**
     * Gets the value of the redLinebmeng property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinebmeng() {
        return redLinebmeng;
    }

    /**
     * Sets the value of the redLinebmeng property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinebmeng(JAXBElement<String> value) {
        this.redLinebmeng = value;
    }

    /**
     * Gets the value of the idnrk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdnrk() {
        return idnrk;
    }

    /**
     * Sets the value of the idnrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdnrk(JAXBElement<String> value) {
        this.idnrk = value;
    }

    /**
     * Gets the value of the redLineidnrk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLineidnrk() {
        return redLineidnrk;
    }

    /**
     * Sets the value of the redLineidnrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLineidnrk(JAXBElement<String> value) {
        this.redLineidnrk = value;
    }

    /**
     * Gets the value of the meins property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeins() {
        return meins;
    }

    /**
     * Sets the value of the meins property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeins(JAXBElement<String> value) {
        this.meins = value;
    }

    /**
     * Gets the value of the redLinemeins property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinemeins() {
        return redLinemeins;
    }

    /**
     * Sets the value of the redLinemeins property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinemeins(JAXBElement<String> value) {
        this.redLinemeins = value;
    }

    /**
     * Gets the value of the menge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMenge() {
        return menge;
    }

    /**
     * Sets the value of the menge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMenge(JAXBElement<BigDecimal> value) {
        this.menge = value;
    }

    /**
     * Gets the value of the redLinemenge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinemenge() {
        return redLinemenge;
    }

    /**
     * Sets the value of the redLinemenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinemenge(JAXBElement<String> value) {
        this.redLinemenge = value;
    }

    /**
     * Gets the value of the j3Apgnr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJ3Apgnr() {
        return j3Apgnr;
    }

    /**
     * Sets the value of the j3Apgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJ3Apgnr(JAXBElement<String> value) {
        this.j3Apgnr = value;
    }

    /**
     * Gets the value of the redLinej3Apgnr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinej3Apgnr() {
        return redLinej3Apgnr;
    }

    /**
     * Sets the value of the redLinej3Apgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinej3Apgnr(JAXBElement<String> value) {
        this.redLinej3Apgnr = value;
    }

    /**
     * Gets the value of the j3Akordx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJ3Akordx() {
        return j3Akordx;
    }

    /**
     * Sets the value of the j3Akordx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJ3Akordx(String value) {
        this.j3Akordx = value;
    }

    /**
     * Gets the value of the redLinej3Akordx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinej3Akordx() {
        return redLinej3Akordx;
    }

    /**
     * Sets the value of the redLinej3Akordx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinej3Akordx(JAXBElement<String> value) {
        this.redLinej3Akordx = value;
    }

    /**
     * Gets the value of the cmeng property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCmeng() {
        return cmeng;
    }

    /**
     * Sets the value of the cmeng property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCmeng(JAXBElement<BigDecimal> value) {
        this.cmeng = value;
    }

    /**
     * Gets the value of the redLinecmeng property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinecmeng() {
        return redLinecmeng;
    }

    /**
     * Sets the value of the redLinecmeng property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinecmeng(JAXBElement<String> value) {
        this.redLinecmeng = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListaTecnica)) return false;
        ListaTecnica that = (ListaTecnica) o;
        return Objects.equals(getWerks(), that.getWerks()) &&
                Objects.equals(getJ3Akordxl(), that.getJ3Akordxl()) &&
                Objects.equals(getBmein(), that.getBmein()) &&
                Objects.equals(getBmeng(), that.getBmeng()) &&
                Objects.equals(getIdnrk(), that.getIdnrk()) &&
                Objects.equals(getMeins(), that.getMeins()) &&
                Objects.equals(getMenge(), that.getMenge()) &&
                Objects.equals(getJ3Apgnr(), that.getJ3Apgnr()) &&
                Objects.equals(getJ3Akordx(), that.getJ3Akordx()) &&
                Objects.equals(getCmeng(), that.getCmeng());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWerks(), getJ3Akordxl(), getBmein(), getBmeng(), getIdnrk(), getMeins(), getMenge(), getJ3Apgnr(), getJ3Akordx(), getCmeng());
    }
}

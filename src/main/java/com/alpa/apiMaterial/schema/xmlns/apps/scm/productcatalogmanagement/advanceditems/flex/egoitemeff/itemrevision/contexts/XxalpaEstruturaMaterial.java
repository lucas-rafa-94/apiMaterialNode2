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
import java.math.BigDecimal;
import java.util.Objects;


/**
 * <p>Java class for XxalpaEstruturaMaterial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XxalpaEstruturaMaterial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/protectedModel/}ItemRevisionEffBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RaiseEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPersistentAttributeUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAddedToChildEntitiesMap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsImportCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="grupoDeMercadoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grupoDeMercadoria_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinegrupoDeMercadoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinegrupoDeMercadoria_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subfamilia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subfamilia_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinesubfamilia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinesubfamilia_Display" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multiplo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RedLinemultiplo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XxalpaEstruturaMaterial", propOrder = {
    "raiseEvent",
    "isPersistentAttributeUpdated",
    "isAddedToChildEntitiesMap",
    "isImportCase",
    "grupoDeMercadoria",
    "grupoDeMercadoriaDisplay",
    "redLinegrupoDeMercadoria",
    "redLinegrupoDeMercadoriaDisplay",
    "subfamilia",
    "subfamiliaDisplay",
    "redLinesubfamilia",
    "redLinesubfamiliaDisplay",
    "multiplo",
    "redLinemultiplo"
})
public class XxalpaEstruturaMaterial
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
    @XmlElementRef(name = "grupoDeMercadoria", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grupoDeMercadoria;
    @XmlElementRef(name = "grupoDeMercadoria_Display", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grupoDeMercadoriaDisplay;
    @XmlElementRef(name = "RedLinegrupoDeMercadoria", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinegrupoDeMercadoria;
    @XmlElementRef(name = "RedLinegrupoDeMercadoria_Display", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinegrupoDeMercadoriaDisplay;
    @XmlElementRef(name = "subfamilia", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subfamilia;
    @XmlElementRef(name = "subfamilia_Display", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subfamiliaDisplay;
    @XmlElementRef(name = "RedLinesubfamilia", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinesubfamilia;
    @XmlElementRef(name = "RedLinesubfamilia_Display", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinesubfamiliaDisplay;
    @XmlElementRef(name = "multiplo", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> multiplo;
    @XmlElementRef(name = "RedLinemultiplo", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinemultiplo;

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
     * Gets the value of the grupoDeMercadoria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrupoDeMercadoria() {
        return grupoDeMercadoria;
    }

    /**
     * Sets the value of the grupoDeMercadoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrupoDeMercadoria(JAXBElement<String> value) {
        this.grupoDeMercadoria = value;
    }

    /**
     * Gets the value of the grupoDeMercadoriaDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrupoDeMercadoriaDisplay() {
        return grupoDeMercadoriaDisplay;
    }

    /**
     * Sets the value of the grupoDeMercadoriaDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrupoDeMercadoriaDisplay(JAXBElement<String> value) {
        this.grupoDeMercadoriaDisplay = value;
    }

    /**
     * Gets the value of the redLinegrupoDeMercadoria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinegrupoDeMercadoria() {
        return redLinegrupoDeMercadoria;
    }

    /**
     * Sets the value of the redLinegrupoDeMercadoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinegrupoDeMercadoria(JAXBElement<String> value) {
        this.redLinegrupoDeMercadoria = value;
    }

    /**
     * Gets the value of the redLinegrupoDeMercadoriaDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinegrupoDeMercadoriaDisplay() {
        return redLinegrupoDeMercadoriaDisplay;
    }

    /**
     * Sets the value of the redLinegrupoDeMercadoriaDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinegrupoDeMercadoriaDisplay(JAXBElement<String> value) {
        this.redLinegrupoDeMercadoriaDisplay = value;
    }

    /**
     * Gets the value of the subfamilia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubfamilia() {
        return subfamilia;
    }

    /**
     * Sets the value of the subfamilia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubfamilia(JAXBElement<String> value) {
        this.subfamilia = value;
    }

    /**
     * Gets the value of the subfamiliaDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubfamiliaDisplay() {
        return subfamiliaDisplay;
    }

    /**
     * Sets the value of the subfamiliaDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubfamiliaDisplay(JAXBElement<String> value) {
        this.subfamiliaDisplay = value;
    }

    /**
     * Gets the value of the redLinesubfamilia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinesubfamilia() {
        return redLinesubfamilia;
    }

    /**
     * Sets the value of the redLinesubfamilia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinesubfamilia(JAXBElement<String> value) {
        this.redLinesubfamilia = value;
    }

    /**
     * Gets the value of the redLinesubfamiliaDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinesubfamiliaDisplay() {
        return redLinesubfamiliaDisplay;
    }

    /**
     * Sets the value of the redLinesubfamiliaDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinesubfamiliaDisplay(JAXBElement<String> value) {
        this.redLinesubfamiliaDisplay = value;
    }

    /**
     * Gets the value of the multiplo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMultiplo() {
        return multiplo;
    }

    /**
     * Sets the value of the multiplo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMultiplo(JAXBElement<BigDecimal> value) {
        this.multiplo = value;
    }

    /**
     * Gets the value of the redLinemultiplo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinemultiplo() {
        return redLinemultiplo;
    }

    /**
     * Sets the value of the redLinemultiplo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinemultiplo(JAXBElement<String> value) {
        this.redLinemultiplo = value;
    }


    public boolean equals(XxalpaEstruturaMaterial o, XxalpaEstruturaMaterial o1) {

        if(o.getGrupoDeMercadoria().equals(o1.getGrupoDeMercadoria())){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(getGrupoDeMercadoria());
    }
}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.07 at 02:00:32 AM BRT 
//


package com.alpa.apiMaterial.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.item.contexts;

import com.alpa.apiMaterial.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.protectedmodel.ItemEffBase;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XxalpaSku complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XxalpaSku"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/protectedModel/}ItemEffBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RaiseEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPersistentAttributeUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAddedToChildEntitiesMap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsImportCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BulkloadRecCreated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinecor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tamanho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLinetamanho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XxalpaSku", propOrder = {
    "raiseEvent",
    "isPersistentAttributeUpdated",
    "isAddedToChildEntitiesMap",
    "isImportCase",
    "bulkloadRecCreated",
    "cor",
    "redLinecor",
    "tamanho",
    "redLinetamanho"
})
public class XxalpaSku
    extends ItemEffBase
{

    @XmlElementRef(name = "RaiseEvent", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> raiseEvent;
    @XmlElementRef(name = "IsPersistentAttributeUpdated", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPersistentAttributeUpdated;
    @XmlElementRef(name = "IsAddedToChildEntitiesMap", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAddedToChildEntitiesMap;
    @XmlElementRef(name = "IsImportCase", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isImportCase;
    @XmlElementRef(name = "BulkloadRecCreated", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bulkloadRecCreated;
    @XmlElementRef(name = "cor", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cor;
    @XmlElementRef(name = "RedLinecor", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinecor;
    @XmlElementRef(name = "tamanho", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tamanho;
    @XmlElementRef(name = "RedLinetamanho", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLinetamanho;

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
     * Gets the value of the bulkloadRecCreated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBulkloadRecCreated() {
        return bulkloadRecCreated;
    }

    /**
     * Sets the value of the bulkloadRecCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBulkloadRecCreated(JAXBElement<String> value) {
        this.bulkloadRecCreated = value;
    }

    /**
     * Gets the value of the cor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCor() {
        return cor;
    }

    /**
     * Sets the value of the cor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCor(JAXBElement<String> value) {
        this.cor = value;
    }

    /**
     * Gets the value of the redLinecor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinecor() {
        return redLinecor;
    }

    /**
     * Sets the value of the redLinecor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinecor(JAXBElement<String> value) {
        this.redLinecor = value;
    }

    /**
     * Gets the value of the tamanho property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTamanho() {
        return tamanho;
    }

    /**
     * Sets the value of the tamanho property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTamanho(JAXBElement<String> value) {
        this.tamanho = value;
    }

    /**
     * Gets the value of the redLinetamanho property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLinetamanho() {
        return redLinetamanho;
    }

    /**
     * Sets the value of the redLinetamanho property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLinetamanho(JAXBElement<String> value) {
        this.redLinetamanho = value;
    }

}

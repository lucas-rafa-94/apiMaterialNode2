//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.07 at 02:00:32 AM BRT 
//


package com.alpa.apiMaterial.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.item.categories;

import com.alpa.apiMaterial.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.item.contexts.XxalpaSku;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mizuno1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mizuno1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/categories/}j_ItemRootIccPrivate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XxalpaSku" type="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/}XxalpaSku" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mizuno1", propOrder = {
    "xxalpaSku"
})
public class Mizuno1
    extends JItemRootIccPrivate
{

    @XmlElement(name = "XxalpaSku")
    protected XxalpaSku xxalpaSku;

    /**
     * Gets the value of the xxalpaSku property.
     * 
     * @return
     *     possible object is
     *     {@link XxalpaSku }
     *     
     */
    public XxalpaSku getXxalpaSku() {
        return xxalpaSku;
    }

    /**
     * Sets the value of the xxalpaSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XxalpaSku }
     *     
     */
    public void setXxalpaSku(XxalpaSku value) {
        this.xxalpaSku = value;
    }

}

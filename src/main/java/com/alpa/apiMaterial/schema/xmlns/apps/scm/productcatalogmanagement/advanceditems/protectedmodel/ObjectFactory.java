//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.07 at 02:00:32 AM BRT 
//


package com.alpa.apiMaterial.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.protectedmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.scm.productcatalogmanagement.advanceditems.protectedmodel package. 
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

    private final static QName _ItemEffBase_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/protectedModel/", "itemEffBase");
    private final static QName _ItemRevisionEffBase_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/protectedModel/", "itemRevisionEffBase");
    private final static QName _ItemRevisionEffBaseLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/protectedModel/", "LastUpdateLogin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.scm.productcatalogmanagement.advanceditems.protectedmodel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemEffBase }
     * 
     */
    public ItemEffBase createItemEffBase() {
        return new ItemEffBase();
    }

    /**
     * Create an instance of {@link ItemRevisionEffBase }
     * 
     */
    public ItemRevisionEffBase createItemRevisionEffBase() {
        return new ItemRevisionEffBase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemEffBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/protectedModel/", name = "itemEffBase")
    public JAXBElement<ItemEffBase> createItemEffBase(ItemEffBase value) {
        return new JAXBElement<ItemEffBase>(_ItemEffBase_QNAME, ItemEffBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemRevisionEffBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/protectedModel/", name = "itemRevisionEffBase")
    public JAXBElement<ItemRevisionEffBase> createItemRevisionEffBase(ItemRevisionEffBase value) {
        return new JAXBElement<ItemRevisionEffBase>(_ItemRevisionEffBase_QNAME, ItemRevisionEffBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/protectedModel/", name = "LastUpdateLogin", scope = ItemRevisionEffBase.class)
    public JAXBElement<String> createItemRevisionEffBaseLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ItemRevisionEffBaseLastUpdateLogin_QNAME, String.class, ItemRevisionEffBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/protectedModel/", name = "LastUpdateLogin", scope = ItemEffBase.class)
    public JAXBElement<String> createItemEffBaseLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ItemRevisionEffBaseLastUpdateLogin_QNAME, String.class, ItemEffBase.class, value);
    }

}

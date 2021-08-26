
package com.example.springbootswagger2.copybook.transaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.springbootswagger2.copybook.transaction package. 
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

    private final static QName _So1Record_QNAME = new QName("http://coxb.test.legstar.com/transaction", "so1Record");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.springbootswagger2.copybook.transaction
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link So1Record }
     * 
     */
    public So1Record createSo1Record() {
        return new So1Record();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link So1Record }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://coxb.test.legstar.com/transaction", name = "so1Record")
    public JAXBElement<So1Record> createSo1Record(So1Record value) {
        return new JAXBElement<So1Record>(_So1Record_QNAME, So1Record.class, null, value);
    }

}

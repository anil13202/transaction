package com.example.springbootswagger2.copybook.transaction.bind;

import com.legstar.coxb.CobolContext;
import com.legstar.coxb.transform.AbstractHostToXmlTransformer;
import com.legstar.coxb.transform.HostTransformException;

/**
 * Transforms mainframe data to XML.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  So1RecordHostToXmlTransformer transformer = new So1RecordHostToXmlTransformer();
 *  StringWriter writer = new StringWriter();
 *  transformer.transform(hostByteArray, writer);
 * </pre>
 *
 */
public class So1RecordHostToXmlTransformer extends AbstractHostToXmlTransformer {

    /**
     * Create a Host to XML transformer using a Host to Java transformer.
     * @throws HostTransformException if transformer cannot be created
     */
    public So1RecordHostToXmlTransformer() throws HostTransformException {
        super(new So1RecordHostToJavaTransformer());
    }
    
    /**
     * Create a Host to XML transformer using a specific COBOL parameters set.
     * @param cobolContext the COBOL parameters set.
     * @throws HostTransformException if transformer cannot be created
     */
    public So1RecordHostToXmlTransformer(
            final CobolContext cobolContext) throws HostTransformException {
        super(new So1RecordHostToJavaTransformer(cobolContext));
    }

    /**
     * Create a Host to XML transformer using a specific host character set while
     * other COBOL parameters are set by default.
     * @param hostCharset the host character set
     * @throws HostTransformException if transformer cannot be created
     */
    public So1RecordHostToXmlTransformer(
            final String hostCharset) throws HostTransformException {
        super(new So1RecordHostToJavaTransformer(hostCharset));
    }
    
    /** {@inheritDoc} */
    public String getElementName() {
        return "So1Record";
    }

    /** {@inheritDoc} */
    public String getNamespace() {
        return "http://coxb.test.legstar.com/transaction";
    }

    /** {@inheritDoc} */
    public boolean isXmlRootElement() {
        return false;
    }
    
}

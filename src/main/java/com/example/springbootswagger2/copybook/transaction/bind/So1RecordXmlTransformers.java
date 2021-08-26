package com.example.springbootswagger2.copybook.transaction.bind;

import com.legstar.coxb.transform.AbstractXmlTransformers;
import com.legstar.coxb.transform.HostTransformException;

/**
 * XML Transformers provider for So1Record.
 *
 */
public class So1RecordXmlTransformers extends AbstractXmlTransformers {

    /**
     * Create a set of directional transformers.
     * @throws HostTransformException if transformer cannot be created
     */
    public So1RecordXmlTransformers() throws HostTransformException {
        super(new So1RecordXmlToHostTransformer(),
                new So1RecordHostToXmlTransformer());
    }

}

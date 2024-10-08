package com.fasterxml.jackson.databind.ext;

import X.17Z;
import X.AnonymousClass4iD;
import X.AnonymousClass7TF;
import X.C269494fD;
import X.C269504fE;
import X.Pxe;
import X.Pxf;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;

public class DOMSerializer extends StdSerializer {
    public final TransformerFactory A00;

    public DOMSerializer() {
        super(Node.class);
        try {
            TransformerFactory newInstance = TransformerFactory.newInstance();
            this.A00 = newInstance;
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Exception e) {
            throw Pxe.A0j(AnonymousClass7TF.A0m("Could not instantiate `TransformerFactory`: ", e), e);
        }
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r5, C269504fE r6, Object obj) {
        Node node = (Node) obj;
        try {
            Transformer newTransformer = this.A00.newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", "yes");
            newTransformer.setOutputProperty("indent", "no");
            StreamResult streamResult = new StreamResult(new StringWriter());
            newTransformer.transform(new DOMSource(node), streamResult);
            r5.A0t(streamResult.getWriter().toString());
        } catch (TransformerConfigurationException e) {
            throw Pxe.A0j(AnonymousClass7TF.A0m("Could not create XML Transformer for writing DOM `Node` value: ", e), e);
        } catch (TransformerException e2) {
            throw new AnonymousClass4iD(((C269494fD) r6).A00, String.format("DOM `Node` value serialization failed: %s", Pxf.A1Z(e2)), e2);
        }
    }
}

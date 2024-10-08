package com.fasterxml.jackson.databind.ext;

import X.AnonymousClass7TF;
import X.C269674fV;
import X.Pxe;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public abstract class DOMDeserializer extends FromStringDeserializer {
    public static final DocumentBuilderFactory A00;

    public class DocumentDeserializer extends DOMDeserializer {
        public DocumentDeserializer() {
            super(Document.class);
        }

        public final /* bridge */ /* synthetic */ Object A10(C269674fV r2, String str) {
            return A12(str);
        }
    }

    public class NodeDeserializer extends DOMDeserializer {
        public NodeDeserializer() {
            super(Node.class);
        }

        public final /* bridge */ /* synthetic */ Object A10(C269674fV r2, String str) {
            return A12(str);
        }
    }

    public final Document A12(String str) {
        try {
            return A00.newDocumentBuilder().parse(new InputSource(new StringReader(str)));
        } catch (Exception e) {
            throw Pxe.A0h(AnonymousClass7TF.A0m("Failed to parse JSON String as XML: ", e), e);
        }
    }

    static {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setExpandEntityReferences(false);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Error | ParserConfigurationException unused) {
        }
        try {
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Throwable unused2) {
        }
        try {
            newInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        } catch (Throwable unused3) {
        }
        A00 = newInstance;
    }
}

package X;

public final class SGV {
    public static final SGV A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C227922kK r10) {
        /*
            r9 = this;
            java.lang.String r5 = "Xmp"
            java.lang.String r6 = r10.A0N(r5)     // Catch:{ IOException -> 0x00dd }
            if (r6 == 0) goto L_0x00d0
            int r0 = r6.length()     // Catch:{ IOException -> 0x00dd }
            if (r0 == 0) goto L_0x00d0
            java.lang.String r1 = r10.A0N(r5)     // Catch:{ IOException -> 0x00dd }
            r4 = 0
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "trainedAlgorithmicMedia"
            boolean r0 = X.00l.A0d(r1, r0, r4)     // Catch:{ IOException -> 0x00dd }
            if (r0 == 0) goto L_0x001f
            return
        L_0x001f:
            java.lang.String r2 = "trainedAlgorithmicMedia"
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()     // Catch:{ IOException -> 0x00dd }
            java.io.StringReader r3 = new java.io.StringReader     // Catch:{ IOException -> 0x00dd }
            r3.<init>(r6)     // Catch:{ IOException -> 0x00dd }
            javax.xml.parsers.DocumentBuilder r1 = r0.newDocumentBuilder()     // Catch:{ Exception -> 0x00c2 }
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource     // Catch:{ Exception -> 0x00c2 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x00c2 }
            org.w3c.dom.Document r6 = r1.parse(r0)     // Catch:{ Exception -> 0x00c2 }
            X.0qQ.A0A(r6)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r0 = "rdf:Description"
            org.w3c.dom.Element r7 = r6.createElement(r0)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "xmlns:iptcExt"
            java.lang.String r0 = "http://iptc.org/std/Iptc4xmpExt/2008-02-29/"
            r7.setAttribute(r1, r0)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r0 = "iptcExt:DigitalSourceType"
            r7.setAttribute(r0, r2)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r8 = "rdf:RDF"
            org.w3c.dom.NodeList r1 = r6.getElementsByTagName(r8)     // Catch:{ Exception -> 0x00c2 }
            int r0 = r1.getLength()     // Catch:{ Exception -> 0x00c2 }
            r2 = 1
            if (r0 != r2) goto L_0x006e
            org.w3c.dom.Node r0 = r1.item(r4)     // Catch:{ Exception -> 0x00c2 }
            r0.appendChild(r7)     // Catch:{ Exception -> 0x00c2 }
        L_0x0064:
            javax.xml.transform.TransformerFactory r0 = javax.xml.transform.TransformerFactory.newInstance()     // Catch:{ Exception -> 0x00c2 }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ Exception -> 0x00c2 }
            r4.<init>()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x0092
        L_0x006e:
            java.lang.String r0 = "x:xmpmeta"
            org.w3c.dom.NodeList r1 = r6.getElementsByTagName(r0)     // Catch:{ Exception -> 0x00c2 }
            int r0 = r1.getLength()     // Catch:{ Exception -> 0x00c2 }
            if (r0 != r2) goto L_0x0064
            org.w3c.dom.Node r4 = r1.item(r4)     // Catch:{ Exception -> 0x00c2 }
            org.w3c.dom.Element r2 = r6.createElement(r8)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "xmlns:rdf"
            java.lang.String r0 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
            r2.setAttribute(r1, r0)     // Catch:{ Exception -> 0x00c2 }
            r2.appendChild(r7)     // Catch:{ Exception -> 0x00c2 }
            r4.appendChild(r2)     // Catch:{ Exception -> 0x00c2 }
            goto L_0x0064
        L_0x0092:
            javax.xml.transform.Transformer r2 = r0.newTransformer()     // Catch:{ all -> 0x00bb }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = "omit-xml-declaration"
            java.lang.String r0 = "yes"
            r2.setOutputProperty(r1, r0)     // Catch:{ all -> 0x00bb }
            javax.xml.transform.dom.DOMSource r1 = new javax.xml.transform.dom.DOMSource     // Catch:{ all -> 0x00bb }
            r1.<init>(r6)     // Catch:{ all -> 0x00bb }
            javax.xml.transform.stream.StreamResult r0 = new javax.xml.transform.stream.StreamResult     // Catch:{ all -> 0x00bb }
            r0.<init>(r4)     // Catch:{ all -> 0x00bb }
            r2.transform(r1, r0)     // Catch:{ all -> 0x00bb }
            java.lang.StringBuffer r0 = r4.getBuffer()     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = X.DbT.A10(r0)     // Catch:{ all -> 0x00bb }
            r4.close()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x00d3
        L_0x00bb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            X.1zE.A00(r4, r1)     // Catch:{ Exception -> 0x00c2 }
            throw r0     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00c9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ IOException -> 0x00dd }
            throw r0     // Catch:{ IOException -> 0x00dd }
        L_0x00d0:
            java.lang.String r0 = "<?xpacket begin=\"\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"XMP Core 4.4.0-Exiv2\">\n<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n<rdf:Description xmlns:iptcExt=\"http://iptc.org/std/Iptc4xmpExt/2008-02-29/\" iptcExt:DigitalSourceType=\"trainedAlgorithmicMedia\"/>\n</rdf:RDF>\n</x:xmpmeta>"
            goto L_0x00d6
        L_0x00d3:
            r3.close()     // Catch:{ IOException -> 0x00dd }
        L_0x00d6:
            r10.A0P(r5, r0)     // Catch:{ IOException -> 0x00dd }
            r10.A0O()     // Catch:{ IOException -> 0x00dd }
            return
        L_0x00dd:
            r2 = move-exception
            java.lang.String r1 = "GenAiMetadataWriter"
            java.lang.String r0 = "Failed to set XMP data"
            X.0KC.A0F(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SGV.A00(X.2kK):void");
    }
}

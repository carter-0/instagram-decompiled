package X;

public abstract class RR3 {
    public S58 A00;

    /* JADX WARNING: type inference failed for: r2v3, types: [com.hierynomus.asn1.types.constructed.ASN1TaggedObject, X.RRQ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5, types: [com.hierynomus.asn1.types.primitive.ASN1Boolean, X.RRQ, X.R7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v10, types: [X.RRQ, X.R7c, java.lang.Object, com.hierynomus.asn1.types.primitive.ASN1ObjectIdentifier] */
    /* JADX WARNING: type inference failed for: r2v12, types: [X.RRQ, X.R7R, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v14, types: [X.RRQ, X.R7R, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v54, types: [X.RRQ, X.R7R, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v62, types: [X.RRQ, X.R7c, java.lang.Object, com.hierynomus.asn1.types.primitive.ASN1Integer] */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01f1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01fa, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.RRQ A00(X.SPJ r10, byte[] r11) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.R7L
            if (r0 == 0) goto L_0x0017
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r11)
            X.SPJ r1 = X.SPJ.A08
            com.hierynomus.asn1.types.primitive.ASN1Integer r0 = new com.hierynomus.asn1.types.primitive.ASN1Integer
            r0.<init>()
            r0.A00 = r1
            r0.A00 = r11
            r0.A00 = r2
            return r0
        L_0x0017:
            boolean r0 = r9 instanceof X.R7G
            if (r0 == 0) goto L_0x0060
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.S58 r0 = r9.A00     // Catch:{ IOException -> 0x004f }
            X.RCA r3 = new X.RCA     // Catch:{ IOException -> 0x004f }
            r3.<init>(r0, r11)     // Catch:{ IOException -> 0x004f }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0043 }
        L_0x002a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0043 }
            X.RRQ r0 = (X.RRQ) r0     // Catch:{ all -> 0x0043 }
            r4.add(r0)     // Catch:{ all -> 0x0043 }
            goto L_0x002a
        L_0x003a:
            r3.close()     // Catch:{ IOException -> 0x004f }
            com.hierynomus.asn1.types.constructed.ASN1Sequence r2 = new com.hierynomus.asn1.types.constructed.ASN1Sequence
            r2.<init>(r4, r11)
            return r2
        L_0x0043:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            X.C9153RRe.A00(r2, r0)     // Catch:{ IOException -> 0x004f }
        L_0x004e:
            throw r1     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            r2 = move-exception
            java.lang.Object[] r1 = X.Pxe.A1b()
            java.lang.String r0 = "Unable to parse the ASN.1 SEQUENCE contents."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.TQK r1 = new X.TQK
            r1.<init>(r0, r2)
            throw r1
        L_0x0060:
            boolean r0 = r9 instanceof X.R7P
            if (r0 == 0) goto L_0x006e
            com.hierynomus.asn1.types.string.ASN1OctetString r0 = new com.hierynomus.asn1.types.string.ASN1OctetString
            r0.<init>()
            r0.A00 = r10
            r0.A00 = r11
            return r0
        L_0x006e:
            boolean r0 = r9 instanceof X.R7O
            if (r0 == 0) goto L_0x00e7
            X.RDn r1 = r10.A01
            X.RDn r0 = X.C8871RDn.Constructed
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L_0x00d8
            X.S58 r0 = r9.A00
            X.RCA r7 = new X.RCA
            r7.<init>(r0, r11)
            java.io.ByteArrayOutputStream r8 = X.Pxe.A0b()     // Catch:{ IOException -> 0x00c9 }
        L_0x0089:
            int r0 = r7.available()     // Catch:{ IOException -> 0x00c9 }
            if (r0 <= 0) goto L_0x00bb
            X.S58 r5 = r7.A00     // Catch:{ IOException -> 0x00c9 }
            X.SPJ r3 = r5.A01(r7)     // Catch:{ IOException -> 0x00c9 }
            int r1 = r3.A00     // Catch:{ IOException -> 0x00c9 }
            int r0 = r10.A00     // Catch:{ IOException -> 0x00c9 }
            boolean r2 = X.AnonymousClass7TF.A1S(r1, r0)
            java.lang.String r1 = "Expected an ASN.1 BIT STRING as Constructed object, got: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ IOException -> 0x00c9 }
            if (r2 == 0) goto L_0x00b6
            int r0 = r5.A00(r7)     // Catch:{ IOException -> 0x00c9 }
            byte[] r1 = r5.A02(r7, r0)     // Catch:{ IOException -> 0x00c9 }
            int r0 = r1.length     // Catch:{ IOException -> 0x00c9 }
            int r0 = r0 - r6
            r8.write(r1, r6, r0)     // Catch:{ IOException -> 0x00c9 }
            r7.available()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x0089
        L_0x00b6:
            java.lang.IllegalStateException r0 = X.Pxf.A0Y(r1, r0)     // Catch:{ IOException -> 0x00c9 }
            throw r0     // Catch:{ IOException -> 0x00c9 }
        L_0x00bb:
            byte[] r0 = r8.toByteArray()     // Catch:{ IOException -> 0x00c9 }
            com.hierynomus.asn1.types.string.ASN1BitString r2 = new com.hierynomus.asn1.types.string.ASN1BitString     // Catch:{ IOException -> 0x00c9 }
            r2.<init>()     // Catch:{ IOException -> 0x00c9 }
            r2.A00 = r10     // Catch:{ IOException -> 0x00c9 }
            r2.A00 = r0     // Catch:{ IOException -> 0x00c9 }
            return r2
        L_0x00c9:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Unable to parse Constructed ASN.1 BIT STRING"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.TQK r1 = new X.TQK
            r1.<init>(r0, r2)
            throw r1
        L_0x00d8:
            int r0 = r11.length
            byte[] r0 = java.util.Arrays.copyOfRange(r11, r6, r0)
            com.hierynomus.asn1.types.string.ASN1BitString r2 = new com.hierynomus.asn1.types.string.ASN1BitString
            r2.<init>()
            r2.A00 = r10
            r2.A00 = r0
            return r2
        L_0x00e7:
            boolean r0 = r9 instanceof X.R7N
            if (r0 == 0) goto L_0x0160
            int r1 = r11.length
            r0 = 0
            boolean r2 = X.AnonymousClass7TF.A1R(r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "An ASN.1 OBJECT IDENTIFIER should have at least a one byte value"
            if (r2 == 0) goto L_0x015b
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            r7.<init>(r11)
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            int r1 = r7.read()
            int r0 = r1 / 40
            r6.append(r0)
            r5 = 46
            r6.append(r5)
            int r0 = r1 % 40
        L_0x0110:
            r6.append(r0)
        L_0x0113:
            int r0 = r7.available()
            if (r0 <= 0) goto L_0x0149
            int r0 = r7.read()
            r4 = 127(0x7f, float:1.78E-43)
            if (r0 >= r4) goto L_0x0125
            r6.append(r5)
            goto L_0x0110
        L_0x0125:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            long r0 = (long) r0
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r0)
        L_0x012c:
            int r3 = r7.read()
            r0 = 7
            java.math.BigInteger r2 = r1.shiftLeft(r0)
            r0 = r3 & 127(0x7f, float:1.78E-43)
            long r0 = (long) r0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.math.BigInteger r1 = r2.add(r0)
            if (r3 > r4) goto L_0x012c
            r6.append(r5)
            r6.append(r1)
            goto L_0x0113
        L_0x0149:
            java.lang.String r1 = r6.toString()
            X.SPJ r0 = X.SPJ.A0A
            com.hierynomus.asn1.types.primitive.ASN1ObjectIdentifier r2 = new com.hierynomus.asn1.types.primitive.ASN1ObjectIdentifier
            r2.<init>()
            r2.A00 = r0
            r2.A00 = r11
            r2.A00 = r1
            return r2
        L_0x015b:
            java.lang.IllegalArgumentException r1 = X.Pxf.A0X(r0, r1)
            throw r1
        L_0x0160:
            boolean r0 = r9 instanceof X.R7M
            if (r0 == 0) goto L_0x017b
            int r1 = r11.length
            r0 = 0
            boolean r2 = X.AnonymousClass7TF.A1Q(r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "ASN.1 NULL can not have a value"
            if (r2 == 0) goto L_0x0176
            com.hierynomus.asn1.types.primitive.ASN1Null r2 = new com.hierynomus.asn1.types.primitive.ASN1Null
            r2.<init>()
            return r2
        L_0x0176:
            java.lang.IllegalStateException r1 = X.Pxf.A0Y(r0, r1)
            throw r1
        L_0x017b:
            boolean r0 = r9 instanceof X.R7K
            if (r0 == 0) goto L_0x018a
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r11)
            com.hierynomus.asn1.types.primitive.ASN1Enumerated r2 = new com.hierynomus.asn1.types.primitive.ASN1Enumerated
            r2.<init>(r0, r11)
            return r2
        L_0x018a:
            boolean r0 = r9 instanceof X.R7J
            if (r0 == 0) goto L_0x01b5
            int r1 = r11.length
            r3 = 0
            r0 = 1
            boolean r2 = X.AnonymousClass7TF.A1S(r1, r0)
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r1)
            java.lang.String r0 = "Value of ASN1Boolean should have length 1, but was %s"
            if (r2 == 0) goto L_0x01b0
            byte r0 = r11[r3]
            if (r0 == 0) goto L_0x01a2
            r3 = 1
        L_0x01a2:
            X.SPJ r0 = X.SPJ.A06
            com.hierynomus.asn1.types.primitive.ASN1Boolean r2 = new com.hierynomus.asn1.types.primitive.ASN1Boolean
            r2.<init>()
            r2.A00 = r0
            r2.A00 = r11
            r2.A00 = r3
            return r2
        L_0x01b0:
            java.lang.IllegalStateException r1 = X.Pxf.A0Y(r0, r1)
            throw r1
        L_0x01b5:
            boolean r0 = r9 instanceof X.R7I
            if (r0 == 0) goto L_0x01c7
            X.S58 r0 = r9.A00
            com.hierynomus.asn1.types.constructed.ASN1TaggedObject r2 = new com.hierynomus.asn1.types.constructed.ASN1TaggedObject
            r2.<init>()
            r2.A00 = r10
            r2.A01 = r11
            r2.A00 = r0
            return r2
        L_0x01c7:
            java.util.HashSet r2 = X.AnonymousClass7TE.A1F()
            X.S58 r0 = r9.A00     // Catch:{ IOException -> 0x01fb }
            X.RCA r3 = new X.RCA     // Catch:{ IOException -> 0x01fb }
            r3.<init>(r0, r11)     // Catch:{ IOException -> 0x01fb }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x01ef }
        L_0x01d6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01ef }
            X.RRQ r0 = (X.RRQ) r0     // Catch:{ all -> 0x01ef }
            r2.add(r0)     // Catch:{ all -> 0x01ef }
            goto L_0x01d6
        L_0x01e6:
            r3.close()     // Catch:{ IOException -> 0x01fb }
            com.hierynomus.asn1.types.constructed.ASN1Set r0 = new com.hierynomus.asn1.types.constructed.ASN1Set
            r0.<init>(r2, r11)
            return r0
        L_0x01ef:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x01f1 }
        L_0x01f1:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x01f6 }
            goto L_0x01fa
        L_0x01f6:
            r0 = move-exception
            X.C9153RRe.A00(r2, r0)     // Catch:{ IOException -> 0x01fb }
        L_0x01fa:
            throw r1     // Catch:{ IOException -> 0x01fb }
        L_0x01fb:
            r2 = move-exception
            java.lang.Object[] r1 = X.Pxe.A1b()
            java.lang.String r0 = "Could not parse ASN.1 SET contents."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.TQK r1 = new X.TQK
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RR3.A00(X.SPJ, byte[]):X.RRQ");
    }
}

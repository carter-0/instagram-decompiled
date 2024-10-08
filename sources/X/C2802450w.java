package X;

/* renamed from: X.50w  reason: invalid class name and case insensitive filesystem */
public abstract class C2802450w {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C2802550x parseFromJson(X.16F r5) {
        /*
            r4 = 0
            X.0qQ.A0B(r5, r4)
            r2 = 0
            X.50x r3 = new X.50x     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            return r2
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            if (r1 == r0) goto L_0x006d
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            r5.A1J()     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            java.lang.String r0 = "span_metadata"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            r2 = 0
            if (r0 == 0) goto L_0x0053
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            if (r1 != r0) goto L_0x004d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            r2.<init>()     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
        L_0x003b:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            if (r1 == r0) goto L_0x004d
            X.50z r0 = X.AnonymousClass50y.parseFromJson(r5)     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            if (r0 == 0) goto L_0x003b
            r2.add(r0)     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            goto L_0x003b
        L_0x004d:
            X.0qQ.A0B(r2, r4)     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            r3.A01 = r2     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            goto L_0x0069
        L_0x0053:
            java.lang.String r0 = "text"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            if (r0 == 0) goto L_0x0069
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            if (r1 == r0) goto L_0x0067
            java.lang.String r2 = r5.A1P()     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
        L_0x0067:
            r3.A00 = r2     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
        L_0x0069:
            r5.A0z()     // Catch:{ IOException -> 0x0075, Exception -> 0x006e }
            goto L_0x0016
        L_0x006d:
            return r3
        L_0x006e:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0075:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2802450w.parseFromJson(X.16F):X.50x");
    }

    public static void A00(17Z r4, C2802550x r5) {
        r4.A0c();
        16P.A03(r4, "span_metadata");
        for (C2802650z r2 : r5.A01) {
            if (r2 != null) {
                r4.A0c();
                r4.A0P("span_start", r2.A02);
                r4.A0P("span_end", r2.A00);
                r4.A0P("span_flags", r2.A01);
                String str = r2.A04;
                if (str != null) {
                    r4.A0R("metadata_model", str);
                    r2.A00();
                    r4.A0R("metadata_model_type", AnonymousClass510.A00(r2.A00()));
                    r4.A0Z();
                } else {
                    0qQ.A0F("metadataModelJson");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        r4.A0Y();
        String str2 = r5.A00;
        if (str2 != null) {
            r4.A0R("text", str2);
        }
        r4.A0Z();
    }
}

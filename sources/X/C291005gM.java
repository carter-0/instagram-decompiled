package X;

/* renamed from: X.5gM  reason: invalid class name and case insensitive filesystem */
public final class C291005gM {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C290995gL parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.5gL r0 = new X.5gL     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            r0.<init>()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            if (r2 == r1) goto L_0x0015
            r5.A0z()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            goto L_0x0092
        L_0x0015:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            if (r2 == r1) goto L_0x0093
            java.lang.String r2 = r5.A0q()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            r5.A1J()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            java.lang.String r1 = "ranking"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            r4 = 0
            if (r1 == 0) goto L_0x0052
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            if (r2 != r1) goto L_0x004c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            r4.<init>()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
        L_0x003a:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            if (r2 == r1) goto L_0x004c
            X.5gF r1 = X.C290925gE.parseFromJson(r5)     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            if (r1 == 0) goto L_0x003a
            r4.add(r1)     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            goto L_0x003a
        L_0x004c:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            r0.A03 = r4     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            goto L_0x0060
        L_0x0052:
            java.lang.String r1 = "entities"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            if (r1 == 0) goto L_0x0064
            X.5l3 r1 = X.C293595l2.parseFromJson(r5)     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            r0.A00 = r1     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
        L_0x0060:
            r5.A0z()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            goto L_0x0015
        L_0x0064:
            java.lang.String r1 = "has_next_page"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            if (r1 == 0) goto L_0x0077
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            r0.A01 = r1     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            goto L_0x0060
        L_0x0077:
            java.lang.String r1 = "page_max_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            if (r1 == 0) goto L_0x008e
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            if (r2 == r1) goto L_0x008b
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
        L_0x008b:
            r0.A02 = r4     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            goto L_0x0060
        L_0x008e:
            X.1XY.A01(r5, r0, r2)     // Catch:{ IOException -> 0x009b, Exception -> 0x0094 }
            goto L_0x0060
        L_0x0092:
            r0 = 0
        L_0x0093:
            return r0
        L_0x0094:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x009b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291005gM.parseFromJson(X.16F):X.5gL");
    }
}

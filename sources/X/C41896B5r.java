package X;

/* renamed from: X.B5r  reason: case insensitive filesystem */
public final class C41896B5r {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.B65 parseFromJson(X.16F r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.B65 r2 = new X.B65     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            r2.<init>()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            if (r1 == r0) goto L_0x0016
            r8.A0z()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            r2 = 0
            return r2
        L_0x0016:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            if (r1 == r0) goto L_0x00b3
            java.lang.String r1 = r8.A0q()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            r8.A1J()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            java.lang.String r0 = "badging_source"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            r3 = 0
            if (r0 == 0) goto L_0x0058
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            if (r1 != r0) goto L_0x0055
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            r3.<init>()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
        L_0x003b:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            if (r1 == r0) goto L_0x0055
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            if (r1 == r0) goto L_0x003b
            java.lang.String r0 = r8.A1P()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            if (r0 == 0) goto L_0x003b
            r3.add(r0)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            goto L_0x003b
        L_0x0055:
            r2.A05 = r3     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            goto L_0x006a
        L_0x0058:
            java.lang.String r0 = "is_user_eligible"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = r8.A0d()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            r2.A01 = r0     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
        L_0x006a:
            r8.A0z()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            goto L_0x0016
        L_0x006e:
            java.lang.String r0 = "should_badge"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            if (r0 == 0) goto L_0x0081
            boolean r0 = r8.A0d()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            r2.A02 = r0     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            goto L_0x006a
        L_0x0081:
            java.lang.String r0 = "subtitle"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            if (r0 == 0) goto L_0x0098
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            if (r1 == r0) goto L_0x0095
            java.lang.String r3 = r8.A1P()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
        L_0x0095:
            r2.A03 = r3     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            goto L_0x006a
        L_0x0098:
            java.lang.String r0 = "title"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            if (r0 == 0) goto L_0x00af
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            if (r1 == r0) goto L_0x00ac
            java.lang.String r3 = r8.A1P()     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
        L_0x00ac:
            r2.A04 = r3     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            goto L_0x006a
        L_0x00af:
            X.1XY.A01(r8, r2, r1)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            goto L_0x006a
        L_0x00b3:
            java.util.List r6 = r2.A05     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            X.0qQ.A0A(r6)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            java.lang.Boolean r0 = r2.A01     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            boolean r7 = X.C41845B3m.A14(r0)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            java.lang.Boolean r0 = r2.A02     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            boolean r8 = X.C41845B3m.A14(r0)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            java.lang.String r4 = r2.A03     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            X.0qQ.A0A(r4)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            java.lang.String r5 = r2.A04     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            X.0qQ.A0A(r5)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            X.Deg r3 = new X.Deg     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            r2.A00 = r3     // Catch:{ IOException -> 0x00dc, Exception -> 0x00d6 }
            return r2
        L_0x00d6:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x00dc:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41896B5r.parseFromJson(X.16F):X.B65");
    }
}

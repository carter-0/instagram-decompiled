package X;

/* renamed from: X.5Im  reason: invalid class name and case insensitive filesystem */
public final class C283605Im {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4W5 parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.4W5 r0 = new X.4W5     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            r0.<init>()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            goto L_0x0098
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            if (r2 == r1) goto L_0x0099
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            r4.A1J()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            java.lang.String r1 = "request_status"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            r3 = 0
            if (r1 == 0) goto L_0x0040
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            if (r2 == r1) goto L_0x003a
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
        L_0x003a:
            r0.A00 = r3     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
        L_0x003c:
            r4.A0z()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            goto L_0x0016
        L_0x0040:
            java.lang.String r1 = "qp_data"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            if (r1 == 0) goto L_0x006a
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            if (r2 != r1) goto L_0x0067
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            r3.<init>()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
        L_0x0055:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            if (r2 == r1) goto L_0x0067
            X.5Ja r1 = X.AnonymousClass5JZ.parseFromJson(r4)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            if (r1 == 0) goto L_0x0055
            r3.add(r1)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            goto L_0x0055
        L_0x0067:
            r0.A02 = r3     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            goto L_0x003c
        L_0x006a:
            java.lang.String r1 = "extra_info"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            if (r1 == 0) goto L_0x0094
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            if (r2 != r1) goto L_0x0091
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            r3.<init>()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
        L_0x007f:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            if (r2 == r1) goto L_0x0091
            X.CuB r1 = X.Co3.parseFromJson(r4)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            if (r1 == 0) goto L_0x007f
            r3.add(r1)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            goto L_0x007f
        L_0x0091:
            r0.A01 = r3     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            goto L_0x003c
        L_0x0094:
            X.1XY.A01(r4, r0, r2)     // Catch:{ IOException -> 0x00a1, Exception -> 0x009a }
            goto L_0x003c
        L_0x0098:
            r0 = 0
        L_0x0099:
            return r0
        L_0x009a:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00a1:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C283605Im.parseFromJson(X.16F):X.4W5");
    }

    public static void A00(17Z r5, AnonymousClass4W5 r6) {
        r5.A0c();
        String str = r6.A00;
        if (str != null) {
            r5.A0R("request_status", str);
        }
        if (r6.A02 != null) {
            16P.A03(r5, "qp_data");
            for (AnonymousClass5Ja r2 : r6.A02) {
                if (r2 != null) {
                    r5.A0c();
                    Integer num = r2.A01;
                    if (num != null) {
                        r5.A0P("surface", num.intValue());
                    }
                    if (r2.A00 != null) {
                        r5.A0q("data");
                        C283735Jc r1 = r2.A00;
                        r5.A0c();
                        if (r1.A00 != null) {
                            r5.A0q("viewer");
                            C283755Je r12 = r1.A00;
                            r5.A0c();
                            if (r12.A00 != null) {
                                r5.A0q("eligible_promotions");
                                C283775Jg r13 = r12.A00;
                                r5.A0c();
                                if (r13.A00 != null) {
                                    16P.A03(r5, "edges");
                                    for (C283795Ji r0 : r13.A00) {
                                        if (r0 != null) {
                                            C283785Jh.A00(r5, r0);
                                        }
                                    }
                                    r5.A0Y();
                                }
                                r5.A0Z();
                            }
                            r5.A0Z();
                        }
                        r5.A0Z();
                    }
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        if (r6.A01 != null) {
            16P.A03(r5, "extra_info");
            for (C45307CuB cuB : r6.A01) {
                if (cuB != null) {
                    r5.A0c();
                    Integer num2 = cuB.A00;
                    if (num2 != null) {
                        r5.A0P("surface", num2.intValue());
                    }
                    String str2 = cuB.A01;
                    if (str2 != null) {
                        r5.A0R("extra_info", str2);
                    }
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        1XY.A00(r5, r6);
        r5.A0Z();
    }
}

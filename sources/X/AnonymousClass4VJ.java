package X;

import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.4VJ  reason: invalid class name */
public abstract class AnonymousClass4VJ {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.4VK] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4VK parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.4VK r0 = new X.4VK     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            r0.<init>()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r2 == r1) goto L_0x0015
            r4.A0z()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x0093
        L_0x0015:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r2 == r1) goto L_0x0094
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            r4.A1J()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            java.lang.String r1 = "clause_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            r3 = 0
            if (r1 == 0) goto L_0x003f
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r2 == r1) goto L_0x0039
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
        L_0x0039:
            r0.A00 = r3     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
        L_0x003b:
            r4.A0z()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x0015
        L_0x003f:
            java.lang.String r1 = "filters"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r1 == 0) goto L_0x0069
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r2 != r1) goto L_0x0066
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            r3.<init>()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
        L_0x0054:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r2 == r1) goto L_0x0066
            X.4VM r1 = X.AnonymousClass4VL.parseFromJson(r4)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r1 == 0) goto L_0x0054
            r3.add(r1)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x0054
        L_0x0066:
            r0.A02 = r3     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x003b
        L_0x0069:
            java.lang.String r1 = "clauses"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r1 == 0) goto L_0x003b
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r2 != r1) goto L_0x0090
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            r3.<init>()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
        L_0x007e:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r2 == r1) goto L_0x0090
            X.4VK r1 = parseFromJson(r4)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r1 == 0) goto L_0x007e
            r3.add(r1)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x007e
        L_0x0090:
            r0.A01 = r3     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x003b
        L_0x0093:
            r0 = 0
        L_0x0094:
            return r0
        L_0x0095:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x009c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VJ.parseFromJson(X.16F):X.4VK");
    }

    public static void A00(17Z r4, AnonymousClass4VK r5) {
        r4.A0c();
        String str = r5.A00;
        if (str != null) {
            r4.A0R("clause_type", str);
        }
        if (r5.A02 != null) {
            16P.A03(r4, "filters");
            for (AnonymousClass4VM r2 : r5.A02) {
                if (r2 != null) {
                    r4.A0c();
                    r4.A0R("filter_type", r2.A00.toString());
                    String str2 = r2.A02;
                    if (str2 != null) {
                        r4.A0R("unknown_action", str2);
                    }
                    if (r2.A01 != null) {
                        r4.A0q(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        AnonymousClass4VO.A00(r4, r2.A01);
                    }
                    if (r2.A03 != null) {
                        16P.A03(r4, "extra_datas");
                        for (AnonymousClass4VP r0 : r2.A03) {
                            if (r0 != null) {
                                AnonymousClass4VO.A00(r4, r0);
                            }
                        }
                        r4.A0Y();
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        if (r5.A01 != null) {
            16P.A03(r4, "clauses");
            for (AnonymousClass4VK r02 : r5.A01) {
                if (r02 != null) {
                    A00(r4, r02);
                }
            }
            r4.A0Y();
        }
        r4.A0Z();
    }
}

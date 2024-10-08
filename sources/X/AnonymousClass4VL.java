package X;

/* renamed from: X.4VL  reason: invalid class name */
public abstract class AnonymousClass4VL {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4VM parseFromJson(X.16F r5) {
        /*
            r4 = 0
            X.0qQ.A0B(r5, r4)
            X.4VM r0 = new X.4VM     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            r0.<init>()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            if (r2 == r1) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            goto L_0x0097
        L_0x0016:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            if (r2 == r1) goto L_0x0098
            java.lang.String r2 = r5.A0q()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            r5.A1J()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            java.lang.String r1 = "filter_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            if (r1 == 0) goto L_0x0046
            java.lang.String r2 = r5.A1Q()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            X.0qQ.A0B(r2, r4)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            java.util.Map r1 = com.instagram.quickpromotion.model.FilterType.A01     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            com.instagram.quickpromotion.model.FilterType r1 = (com.instagram.quickpromotion.model.FilterType) r1     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            if (r1 != 0) goto L_0x0040
            com.instagram.quickpromotion.model.FilterType r1 = com.instagram.quickpromotion.model.FilterType.UNKNOWN     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
        L_0x0040:
            r0.A00 = r1     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
        L_0x0042:
            r5.A0z()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            goto L_0x0016
        L_0x0046:
            java.lang.String r1 = "unknown_action"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            r3 = 0
            if (r1 == 0) goto L_0x005e
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            if (r2 == r1) goto L_0x005b
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
        L_0x005b:
            r0.A02 = r3     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            goto L_0x0042
        L_0x005e:
            java.lang.String r1 = "value"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            if (r1 == 0) goto L_0x006d
            X.4VP r1 = X.AnonymousClass4VO.parseFromJson(r5)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            r0.A01 = r1     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            goto L_0x0042
        L_0x006d:
            java.lang.String r1 = "extra_datas"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            if (r1 == 0) goto L_0x0042
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            if (r2 != r1) goto L_0x0094
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            r3.<init>()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
        L_0x0082:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            if (r2 == r1) goto L_0x0094
            X.4VP r1 = X.AnonymousClass4VO.parseFromJson(r5)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            if (r1 == 0) goto L_0x0082
            r3.add(r1)     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            goto L_0x0082
        L_0x0094:
            r0.A03 = r3     // Catch:{ IOException -> 0x00a0, Exception -> 0x0099 }
            goto L_0x0042
        L_0x0097:
            r0 = 0
        L_0x0098:
            return r0
        L_0x0099:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00a0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VL.parseFromJson(X.16F):X.4VM");
    }
}

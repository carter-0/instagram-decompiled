package X;

/* renamed from: X.5my  reason: invalid class name and case insensitive filesystem */
public abstract class C294755my {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C293645l7 parseFromJson(X.16F r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.5l7 r0 = new X.5l7     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r0.<init>()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r3 = X.16L.A0D     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r1 == r3) goto L_0x0016
            r8.A0z()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x00a4
        L_0x0016:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r7 = X.16L.A09     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r1 == r7) goto L_0x00a5
            java.lang.String r2 = r8.A0q()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r8.A1J()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            java.lang.String r1 = "name"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r6 = 0
            if (r1 == 0) goto L_0x0040
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r2 == r1) goto L_0x003a
            java.lang.String r6 = r8.A1P()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
        L_0x003a:
            r0.A01 = r6     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
        L_0x003c:
            r8.A0z()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x0016
        L_0x0040:
            java.lang.String r1 = "scores"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r1 == 0) goto L_0x007e
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r1 != r3) goto L_0x007b
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r5.<init>()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
        L_0x0053:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r1 == r7) goto L_0x007a
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r8.A1J()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r2 != r1) goto L_0x006c
            r5.put(r4, r6)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x0053
        L_0x006c:
            double r1 = r8.A0U()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r1 == 0) goto L_0x0053
            r5.put(r4, r1)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x0053
        L_0x007a:
            r6 = r5
        L_0x007b:
            r0.A03 = r6     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x003c
        L_0x007e:
            java.lang.String r1 = "rank_token"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r1 == 0) goto L_0x0095
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r2 == r1) goto L_0x0092
            java.lang.String r6 = r8.A1P()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
        L_0x0092:
            r0.A02 = r6     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x003c
        L_0x0095:
            java.lang.String r1 = "ttl_secs"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r1 == 0) goto L_0x003c
            long r1 = r8.A0y()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r0.A00 = r1     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x003c
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            return r0
        L_0x00a6:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00ad:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294755my.parseFromJson(X.16F):X.5l7");
    }
}

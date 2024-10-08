package X;

/* renamed from: X.5gE  reason: invalid class name and case insensitive filesystem */
public abstract class C290925gE {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C290935gF parseFromJson(X.16F r9) {
        /*
            r5 = 0
            X.0qQ.A0B(r9, r5)
            X.5gF r0 = new X.5gF     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            r0.<init>()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            X.16L r4 = X.16L.A0D     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            if (r1 == r4) goto L_0x0016
            r9.A0z()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            goto L_0x00b2
        L_0x0016:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            X.16L r8 = X.16L.A09     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            if (r1 == r8) goto L_0x00b3
            java.lang.String r2 = r9.A0q()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            r9.A1J()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            java.lang.String r1 = "view_name"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            r7 = 0
            if (r1 == 0) goto L_0x0040
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            if (r2 == r1) goto L_0x003a
            java.lang.String r7 = r9.A1P()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
        L_0x003a:
            r0.A03 = r7     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
        L_0x003c:
            r9.A0z()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            goto L_0x0016
        L_0x0040:
            java.lang.String r1 = "expiration_ms"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            if (r1 == 0) goto L_0x004f
            long r1 = r9.A0y()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            r0.A00 = r1     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            goto L_0x003c
        L_0x004f:
            java.lang.String r1 = "score_map"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            if (r1 == 0) goto L_0x008c
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            if (r1 != r4) goto L_0x0086
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            r6.<init>()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
        L_0x0062:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            if (r1 == r8) goto L_0x0085
            java.lang.String r3 = r9.A1P()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            r9.A1J()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            if (r2 != r1) goto L_0x007b
            r6.put(r3, r7)     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            goto L_0x0062
        L_0x007b:
            X.5gH r1 = X.C290945gG.parseFromJson(r9)     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            if (r1 == 0) goto L_0x0062
            r6.put(r3, r1)     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            goto L_0x0062
        L_0x0085:
            r7 = r6
        L_0x0086:
            X.0qQ.A0B(r7, r5)     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            r0.A04 = r7     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            goto L_0x003c
        L_0x008c:
            java.lang.String r1 = "ranking_request_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            if (r1 == 0) goto L_0x00a3
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            if (r2 == r1) goto L_0x00a0
            java.lang.String r7 = r9.A1P()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
        L_0x00a0:
            r0.A02 = r7     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            goto L_0x003c
        L_0x00a3:
            java.lang.String r1 = "expiration_timestamp"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            if (r1 == 0) goto L_0x003c
            long r1 = r9.A0y()     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            r0.A01 = r1     // Catch:{ IOException -> 0x00bb, Exception -> 0x00b4 }
            goto L_0x003c
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            return r0
        L_0x00b4:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00bb:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290925gE.parseFromJson(X.16F):X.5gF");
    }
}

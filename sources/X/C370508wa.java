package X;

/* renamed from: X.8wa  reason: invalid class name and case insensitive filesystem */
public abstract class C370508wa {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C370518wb parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.8wb r0 = new X.8wb     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            r0.<init>()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            goto L_0x00a7
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            if (r2 == r1) goto L_0x00a8
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            r4.A1J()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            java.lang.String r1 = "oldest_cursor"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            r3 = 0
            if (r1 == 0) goto L_0x0040
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            if (r2 == r1) goto L_0x003a
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
        L_0x003a:
            r0.A03 = r3     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
        L_0x003c:
            r4.A0z()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            goto L_0x0016
        L_0x0040:
            java.lang.String r1 = "has_older"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            if (r1 == 0) goto L_0x0053
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            r0.A02 = r1     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            goto L_0x003c
        L_0x0053:
            java.lang.String r1 = "threads"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            if (r1 == 0) goto L_0x007d
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            if (r2 != r1) goto L_0x007a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            r3.<init>()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
        L_0x0068:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            if (r2 == r1) goto L_0x007a
            X.8wd r1 = X.C370528wc.parseFromJson(r4)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            if (r1 == 0) goto L_0x0068
            r3.add(r1)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            goto L_0x0068
        L_0x007a:
            r0.A05 = r3     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            goto L_0x003c
        L_0x007d:
            java.lang.String r1 = "pinned_threads"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            if (r1 == 0) goto L_0x003c
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            if (r2 != r1) goto L_0x00a4
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            r3.<init>()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
        L_0x0092:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            if (r2 == r1) goto L_0x00a4
            X.8wd r1 = X.C370528wc.parseFromJson(r4)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            if (r1 == 0) goto L_0x0092
            r3.add(r1)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            goto L_0x0092
        L_0x00a4:
            r0.A04 = r3     // Catch:{ IOException -> 0x00b0, Exception -> 0x00a9 }
            goto L_0x003c
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            return r0
        L_0x00a9:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00b0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370508wa.parseFromJson(X.16F):X.8wb");
    }
}

package X;

/* renamed from: X.8jn  reason: invalid class name and case insensitive filesystem */
public abstract class C363478jn {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C363488jo parseFromJson(X.16F r5) {
        /*
            r4 = 0
            X.0qQ.A0B(r5, r4)
            X.8jo r0 = new X.8jo     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r0.<init>()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r2 == r1) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x00a4
        L_0x0016:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r2 == r1) goto L_0x00a5
            java.lang.String r2 = r5.A0q()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r5.A1J()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            java.lang.String r1 = "identity_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r3 = 0
            if (r1 == 0) goto L_0x0043
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r2 == r1) goto L_0x003a
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
        L_0x003a:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r0.A00 = r3     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
        L_0x003f:
            r5.A0z()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x0016
        L_0x0043:
            java.lang.String r1 = "identity_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r1 == 0) goto L_0x005d
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r2 == r1) goto L_0x0057
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
        L_0x0057:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r0.A01 = r3     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x003f
        L_0x005d:
            java.lang.String r1 = "obfuscated_identity_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r1 == 0) goto L_0x0077
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r2 == r1) goto L_0x0071
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
        L_0x0071:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r0.A02 = r3     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x003f
        L_0x0077:
            java.lang.String r1 = "surface_to_xpost_eligibilities"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r1 == 0) goto L_0x003f
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r2 != r1) goto L_0x009e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r3.<init>()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
        L_0x008c:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r2 == r1) goto L_0x009e
            X.805 r1 = X.C363498jp.parseFromJson(r5)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            if (r1 == 0) goto L_0x008c
            r3.add(r1)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x008c
        L_0x009e:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            r0.A03 = r3     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6 }
            goto L_0x003f
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
        throw new UnsupportedOperationException("Method not decompiled: X.C363478jn.parseFromJson(X.16F):X.8jo");
    }
}

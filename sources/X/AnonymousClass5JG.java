package X;

/* renamed from: X.5JG  reason: invalid class name */
public abstract class AnonymousClass5JG {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass2fN parseFromJson(X.16F r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.2fN r0 = new X.2fN     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r0.<init>()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r6 = X.16L.A0D     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == r6) goto L_0x0016
            r8.A0z()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x00ac
        L_0x0016:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r7 = X.16L.A09     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == r7) goto L_0x00ad
            java.lang.String r2 = r8.A0q()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r8.A1J()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            java.lang.String r1 = "request_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r5 = 0
            if (r1 == 0) goto L_0x0040
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r2 == r1) goto L_0x003a
            java.lang.String r5 = r8.A1P()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
        L_0x003a:
            r0.A00 = r5     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
        L_0x003c:
            r8.A0z()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x0016
        L_0x0040:
            java.lang.String r1 = "seen_clip_ids"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == 0) goto L_0x0072
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r2 != r1) goto L_0x006f
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r5.<init>()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
        L_0x0055:
            X.16L r2 = r8.A1J()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r2 == r1) goto L_0x006f
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r2 == r1) goto L_0x0055
            java.lang.String r1 = r8.A1P()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == 0) goto L_0x0055
            r5.add(r1)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x0055
        L_0x006f:
            r0.A02 = r5     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x003c
        L_0x0072:
            java.lang.String r1 = "blend_impressions"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == 0) goto L_0x003c
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 != r6) goto L_0x00a9
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r4.<init>()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
        L_0x0085:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == r7) goto L_0x00a8
            java.lang.String r3 = r8.A1P()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r8.A1J()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r2 != r1) goto L_0x009e
            r4.put(r3, r5)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x0085
        L_0x009e:
            java.lang.String r1 = r8.A1P()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == 0) goto L_0x0085
            r4.put(r3, r1)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x0085
        L_0x00a8:
            r5 = r4
        L_0x00a9:
            r0.A01 = r5     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x003c
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            return r0
        L_0x00ae:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00b5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5JG.parseFromJson(X.16F):X.2fN");
    }
}

package X;

/* renamed from: X.8wc  reason: invalid class name and case insensitive filesystem */
public final class C370528wc {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C370538wd parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.8wd r2 = new X.8wd     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            r2.<init>()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            r2 = 0
            return r2
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r1 == r0) goto L_0x00f9
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            r5.A1J()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            java.lang.String r0 = "oldest_cursor"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            r4 = 0
            if (r0 == 0) goto L_0x0040
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r1 == r0) goto L_0x003a
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
        L_0x003a:
            r2.A06 = r4     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
        L_0x003c:
            r5.A0z()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            goto L_0x0016
        L_0x0040:
            java.lang.String r0 = "newest_cursor"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r0 == 0) goto L_0x0057
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r1 == r0) goto L_0x0054
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
        L_0x0054:
            r2.A05 = r4     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            goto L_0x003c
        L_0x0057:
            java.lang.String r0 = "has_older"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r0 == 0) goto L_0x006a
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            r2.A04 = r0     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            goto L_0x003c
        L_0x006a:
            java.lang.String r0 = "has_newer"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r0 == 0) goto L_0x007d
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            r2.A03 = r0     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            goto L_0x003c
        L_0x007d:
            java.lang.String r0 = "items"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r0 == 0) goto L_0x00a8
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r1 != r0) goto L_0x00a5
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            r4.<init>()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
        L_0x0092:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r1 == r0) goto L_0x00a5
            r0 = 0
            X.3su r0 = X.C254703su.A00(r5, r0, r3)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r0 == 0) goto L_0x0092
            r4.add(r0)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            goto L_0x0092
        L_0x00a5:
            r2.A07 = r4     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            goto L_0x003c
        L_0x00a8:
            java.lang.String r0 = "shh_items"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r0 == 0) goto L_0x00d4
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r1 != r0) goto L_0x00d0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            r4.<init>()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
        L_0x00bd:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r1 == r0) goto L_0x00d0
            r0 = 0
            X.3su r0 = X.C254703su.A00(r5, r0, r3)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r0 == 0) goto L_0x00bd
            r4.add(r0)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            goto L_0x00bd
        L_0x00d0:
            r2.A08 = r4     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            goto L_0x003c
        L_0x00d4:
            java.lang.String r0 = "direct_story"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r0 == 0) goto L_0x00e4
            X.NHP r0 = X.OQL.parseFromJson(r5)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            r2.A02 = r0     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            goto L_0x003c
        L_0x00e4:
            java.lang.String r0 = "last_permanent_item"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            if (r0 == 0) goto L_0x00f4
            X.3su r0 = X.C254703su.A00(r5, r4, r3)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            r2.A00 = r0     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            goto L_0x003c
        L_0x00f4:
            X.C300595xT.A00(r5, r2, r1)     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            goto L_0x003c
        L_0x00f9:
            r2.A02()     // Catch:{ IOException -> 0x0104, Exception -> 0x00fd }
            return r2
        L_0x00fd:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0104:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370528wc.parseFromJson(X.16F):X.8wd");
    }
}

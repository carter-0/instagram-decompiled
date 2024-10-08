package X;

/* renamed from: X.8jj  reason: invalid class name and case insensitive filesystem */
public abstract class C363438jj {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C363448jk parseFromJson(X.16F r9) {
        /*
            r6 = 0
            X.0qQ.A0B(r9, r6)
            X.8jk r0 = new X.8jk     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            r0.<init>()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            X.16L r5 = X.16L.A0D     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r1 == r5) goto L_0x0016
            r9.A0z()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            goto L_0x00bc
        L_0x0016:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            X.16L r8 = X.16L.A09     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r1 == r8) goto L_0x00bd
            java.lang.String r2 = r9.A0q()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            r9.A1J()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            java.lang.String r1 = "status"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            r7 = 0
            if (r1 == 0) goto L_0x0043
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r2 == r1) goto L_0x003a
            java.lang.String r7 = r9.A1P()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
        L_0x003a:
            X.0qQ.A0B(r7, r6)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            r0.A01 = r7     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
        L_0x003f:
            r9.A0z()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            goto L_0x0016
        L_0x0043:
            java.lang.String r1 = "identity_mapping"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r1 == 0) goto L_0x0070
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r2 != r1) goto L_0x006a
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            r7.<init>()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
        L_0x0058:
            X.16L r2 = r9.A1J()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r2 == r1) goto L_0x006a
            X.8jm r1 = X.C363458jl.parseFromJson(r9)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r1 == 0) goto L_0x0058
            r7.add(r1)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            goto L_0x0058
        L_0x006a:
            X.0qQ.A0B(r7, r6)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            r0.A03 = r7     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            goto L_0x003f
        L_0x0070:
            java.lang.String r1 = "custom_data"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r1 == 0) goto L_0x00ad
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r1 != r5) goto L_0x00a7
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            r4.<init>()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
        L_0x0083:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r1 == r8) goto L_0x00a6
            java.lang.String r3 = r9.A1P()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            r9.A1J()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r2 != r1) goto L_0x009c
            r4.put(r3, r7)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            goto L_0x0083
        L_0x009c:
            java.lang.String r1 = r9.A1P()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r1 == 0) goto L_0x0083
            r4.put(r3, r1)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            goto L_0x0083
        L_0x00a6:
            r7 = r4
        L_0x00a7:
            X.0qQ.A0B(r7, r6)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            r0.A02 = r7     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            goto L_0x003f
        L_0x00ad:
            java.lang.String r1 = "last_update_time_ms"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            if (r1 == 0) goto L_0x003f
            long r1 = r9.A0y()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            r0.A00 = r1     // Catch:{ IOException -> 0x00c5, Exception -> 0x00be }
            goto L_0x003f
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            return r0
        L_0x00be:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00c5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363438jj.parseFromJson(X.16F):X.8jk");
    }
}

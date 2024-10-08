package X;

/* renamed from: X.5lj  reason: invalid class name and case insensitive filesystem */
public abstract class C294025lj {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.5lk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C294035lk parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.5lk r0 = new X.5lk     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            r0.<init>()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x0110
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r2 == r1) goto L_0x0111
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            r4.A1J()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            java.lang.String r1 = "user_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            r3 = 0
            if (r1 == 0) goto L_0x0040
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r2 == r1) goto L_0x003a
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
        L_0x003a:
            r0.A04 = r3     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
        L_0x003c:
            r4.A0z()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x0016
        L_0x0040:
            java.lang.String r1 = "last_activity_at_ms"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r1 == 0) goto L_0x004f
            long r1 = r4.A0y()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            r0.A01 = r1     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x003c
        L_0x004f:
            java.lang.String r1 = "is_active"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r1 == 0) goto L_0x005e
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            r0.A08 = r1     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x003c
        L_0x005e:
            java.lang.String r1 = "app_title"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r1 == 0) goto L_0x0075
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r2 == r1) goto L_0x0072
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
        L_0x0072:
            r0.A02 = r3     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x003c
        L_0x0075:
            java.lang.String r1 = "copresence_enabled"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r1 == 0) goto L_0x0084
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            r0.A07 = r1     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x003c
        L_0x0084:
            java.lang.String r1 = "capabilities"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r1 == 0) goto L_0x0093
            long r1 = r4.A0y()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            r0.A00 = r1     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x003c
        L_0x0093:
            java.lang.String r1 = "correlation_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r1 == 0) goto L_0x00aa
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r2 == r1) goto L_0x00a7
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
        L_0x00a7:
            r0.A03 = r3     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x003c
        L_0x00aa:
            java.lang.String r1 = "thread_copresence_payloads"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r1 == 0) goto L_0x00d5
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r2 != r1) goto L_0x00d1
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            r3.<init>()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
        L_0x00bf:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r2 == r1) goto L_0x00d1
            X.ViK r1 = X.VFM.parseFromJson(r4)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r1 == 0) goto L_0x00bf
            r3.add(r1)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x00bf
        L_0x00d1:
            r0.A06 = r3     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x003c
        L_0x00d5:
            java.lang.String r1 = "reels_together_copresence_payloads"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r1 == 0) goto L_0x0100
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r2 != r1) goto L_0x00fc
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            r3.<init>()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
        L_0x00ea:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r2 == r1) goto L_0x00fc
            X.ViJ r1 = X.VFL.parseFromJson(r4)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r1 == 0) goto L_0x00ea
            r3.add(r1)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x00ea
        L_0x00fc:
            r0.A05 = r3     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x003c
        L_0x0100:
            java.lang.String r1 = "is_close_friend"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            if (r1 == 0) goto L_0x003c
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            r0.A09 = r1     // Catch:{ IOException -> 0x0119, Exception -> 0x0112 }
            goto L_0x003c
        L_0x0110:
            r0 = 0
        L_0x0111:
            return r0
        L_0x0112:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0119:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294025lj.parseFromJson(X.16F):X.5lk");
    }
}

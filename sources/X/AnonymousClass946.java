package X;

/* renamed from: X.946  reason: invalid class name */
public final class AnonymousClass946 {
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass945 parseFromJson(X.16F r9) {
        /*
            r5 = 0
            X.0qQ.A0B(r9, r5)
            X.945 r0 = new X.945     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            r0.<init>()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            X.16L r4 = X.16L.A0D     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            if (r1 == r4) goto L_0x0016
            r9.A0z()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            goto L_0x00a0
        L_0x0016:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            X.16L r8 = X.16L.A09     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            if (r1 == r8) goto L_0x00a1
            java.lang.String r2 = r9.A0q()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            r9.A1J()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            java.lang.String r1 = "user_presence"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            r3 = 0
            if (r1 == 0) goto L_0x0063
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            if (r1 != r4) goto L_0x005d
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            r7.<init>()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
        L_0x0039:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            if (r1 == r8) goto L_0x005c
            java.lang.String r6 = r9.A1P()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            r9.A1J()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            if (r2 != r1) goto L_0x0052
            r7.put(r6, r3)     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            goto L_0x0039
        L_0x0052:
            X.5lk r1 = X.C294025lj.parseFromJson(r9)     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            if (r1 == 0) goto L_0x0039
            r7.put(r6, r1)     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            goto L_0x0039
        L_0x005c:
            r3 = r7
        L_0x005d:
            X.0qQ.A0B(r3, r5)     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            r0.A00 = r3     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            goto L_0x009b
        L_0x0063:
            java.lang.String r1 = "user_ids"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            if (r1 == 0) goto L_0x0092
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            if (r2 != r1) goto L_0x0096
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            r3.<init>()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
        L_0x0078:
            X.16L r2 = r9.A1J()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            if (r2 == r1) goto L_0x0096
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            if (r2 == r1) goto L_0x0078
            java.lang.String r1 = r9.A1P()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            if (r1 == 0) goto L_0x0078
            r3.add(r1)     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            goto L_0x0078
        L_0x0092:
            X.1XY.A01(r9, r0, r2)     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            goto L_0x009b
        L_0x0096:
            X.0qQ.A0B(r3, r5)     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            r0.A01 = r3     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
        L_0x009b:
            r9.A0z()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2 }
            goto L_0x0016
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            return r0
        L_0x00a2:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00a9:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass946.parseFromJson(X.16F):X.945");
    }
}

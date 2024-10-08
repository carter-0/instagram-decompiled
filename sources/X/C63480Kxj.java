package X;

/* renamed from: X.Kxj  reason: case insensitive filesystem */
public abstract class C63480Kxj {
    /* JADX WARNING: type inference failed for: r7v0, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r6v6, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C61070Jw8 parseFromJson(X.16F r9) {
        /*
            r4 = 0
            X.0qQ.A0B(r9, r4)
            X.Jw8 r0 = new X.Jw8     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            r0.<init>()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            X.16L r3 = X.16L.A0D     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r1 == r3) goto L_0x0016
            r9.A0z()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            goto L_0x00be
        L_0x0016:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            X.16L r8 = X.16L.A09     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r1 == r8) goto L_0x00bf
            java.lang.String r2 = X.AnonymousClass7TE.A17(r9)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            java.lang.String r1 = "supporters_in_comments"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            r6 = 0
            if (r1 == 0) goto L_0x0045
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r1 != r3) goto L_0x003f
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
        L_0x0035:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r1 == r8) goto L_0x003f
            X.C41847B3o.A1M(r9, r6)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            goto L_0x0035
        L_0x003f:
            X.0qQ.A0B(r6, r4)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            r0.A01 = r6     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            goto L_0x00b9
        L_0x0045:
            java.lang.String r1 = "supporters_in_comments_v2"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r1 == 0) goto L_0x007c
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r1 != r3) goto L_0x00b4
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
        L_0x0057:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r1 == r8) goto L_0x007a
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            r9.A1J()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r2 != r1) goto L_0x0070
            r7.put(r5, r6)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            goto L_0x0057
        L_0x0070:
            X.Jvq r1 = X.C63478Kxh.parseFromJson(r9)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r1 == 0) goto L_0x0057
            r7.put(r5, r1)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            goto L_0x0057
        L_0x007a:
            r6 = r7
            goto L_0x00b4
        L_0x007c:
            java.lang.String r1 = "new_supporters"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r1 == 0) goto L_0x00a5
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r2 != r1) goto L_0x00a2
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
        L_0x0090:
            X.16L r2 = r9.A1J()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r2 == r1) goto L_0x00a2
            X.M0T r1 = X.C63475Kxe.parseFromJson(r9)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r1 == 0) goto L_0x0090
            r6.add(r1)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            goto L_0x0090
        L_0x00a2:
            r0.A00 = r6     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            goto L_0x00b9
        L_0x00a5:
            java.lang.String r1 = "new_supporters_next_min_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            if (r1 == 0) goto L_0x00b9
            java.lang.String r1 = X.AnonymousClass7TG.A0l(r9)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            r0.A03 = r1     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            goto L_0x00b9
        L_0x00b4:
            X.0qQ.A0B(r6, r4)     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            r0.A02 = r6     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
        L_0x00b9:
            r9.A0z()     // Catch:{ IOException -> 0x00c6, Exception -> 0x00c0 }
            goto L_0x0016
        L_0x00be:
            r0 = 0
        L_0x00bf:
            return r0
        L_0x00c0:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x00c6:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63480Kxj.parseFromJson(X.16F):X.Jw8");
    }
}
